package vn.com.springmvc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vn.com.beans.Bao;
import vn.com.beans.GioBao;
import vn.com.daos.BaoDAO;
import vn.com.daos.GioBaoDAO;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:47:18
 */
@Controller
@Scope("session")
public class DatBaoController {
	String maKH = "KH0001";
	public GioBaoDAO m_GioBaoDAO;
	private String maBaoHienTai = null;
	@Autowired
	BaoDAO baodao;
	public DatBaoController(){

	}

	public void finalize() throws Throwable {

	}
	@RequestMapping(value = "xemchitiet")

	public ModelAndView xemChiTiet(@RequestParam String maBao, Model model) {
		if (!model.containsAttribute("gioBao")) {
			model.addAttribute("gioBao", new GioBao());
		}
		Bao ctbao = baodao.getBaoTheoMa(maBao);
		maBaoHienTai = maBao;
		return new ModelAndView("chitietbao", "ctbao", ctbao);
	}
	@RequestMapping(value = "themgiobao", method = RequestMethod.POST)
	public ModelAndView themGioBao(@RequestParam int thoiGianDatBao, @RequestParam int soLuong, HttpSession session) {
		System.out.println(thoiGianDatBao);
		System.out.println(soLuong);
		// System.out.println(bao.getDonGia());
		ModelAndView mav = new ModelAndView("giobao");
		Bao bao = baodao.getBaoTheoMa(maBaoHienTai);
		GioBao gb = new GioBao();
		List<GioBao> listgb = (List<GioBao>) session.getAttribute("sessiongioBao");
		// List<Cart> list = (List<Cart>) session.getAttribute("cart");
		if (listgb == null) {
			listgb = new ArrayList<GioBao>();
		}
		if (gb != null) {
			gb.themGioHang(bao, maKH, soLuong, thoiGianDatBao);
			BigDecimal tinhTienBao = gb.TinhTienBao(bao.getDonGia());
			BigDecimal total = tinhtongTien(listgb, gb);
			System.out.println("tong tien" + total);
			System.out.println("tong tien" + tinhTienBao);
			mav.addObject("total", total);
			session.setAttribute("sessiongioBao", listgb);
		}
		mav.addObject("listGioBao", listgb);
		return mav;
	}

	private BigDecimal tinhtongTien(List<GioBao> listgb, GioBao giobao) {
		BigDecimal total = new BigDecimal(0);
		boolean isExit = false;
		for (GioBao c : listgb) {
			if (c.equals(giobao)) {
				c.setSoLuong(c.getSoLuong() + 1);
				isExit = true;
			}
			total = total.add(c.getThanhTien().multiply(new BigDecimal(c.getSoLuong())));
		}
		if (isExit == false) {
			listgb.add(giobao);
			total = total.add(giobao.getThanhTien().multiply(new BigDecimal(giobao.getSoLuong())));
		}
		return total;
	}
}