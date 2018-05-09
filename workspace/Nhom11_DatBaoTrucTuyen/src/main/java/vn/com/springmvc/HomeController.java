package vn.com.springmvc;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.com.beans.Bao;
import vn.com.beans.ChiTietHoaDon;
import vn.com.beans.GioBao;
import vn.com.beans.HoaDon;
import vn.com.daos.BaoDAO;
import vn.com.daos.GioBaoDAO;
import vn.com.daos.PheDuyetDAO;
import vn.com.daos.ThanhToanDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	BaoDAO baodao;
	GioBaoDAO gbdao = new GioBaoDAO();
	@Autowired
	GioBao giobao;
	ThanhToanDAO ttdao;
	

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListGioBao();
		return new ModelAndView("index", "listbao", listbao);
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public ModelAndView index(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListGioBao();
		return new ModelAndView("index", "listbao", listbao);
	}

	@RequestMapping(value = "xemchitiet/index", method = RequestMethod.GET)
	public ModelAndView xemchitietindex(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListGioBao();
		return new ModelAndView("index", "listbao", listbao);
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "giobao", method = RequestMethod.GET)
	public ModelAndView giobao(Locale locale, Model model, HttpSession session) {
		ModelAndView mav = new ModelAndView("giobao");
		List<GioBao> listgb = (List<GioBao>) session.getAttribute("sessiongioBao");
		mav.addObject("listGioBao", listgb);

		return mav;
	}

	/*
	 * @RequestMapping(value = "/xemchitiet/themgiobao", method =
	 * RequestMethod.POST) public String themGioBao(@ModelAttribute("gioBao") GioBao
	 * gioBao,HttpSession session) { System.out.println(gioBao.getThoiGianDatBao());
	 * System.out.println(gioBao.getSoLuong()); System.out.println(bao.getDonGia());
	 * //BigDecimal tinhTienBao = ttdao.TinhTienBao(bao.getDonGia(),
	 * gioBao.getThoiGianDatBao(), gioBao.getSoLuong()); //GioBao gb = new
	 * GioBao(bao.getMaBao(),maKH, gioBao.getSoLuong(), tinhTienBao,
	 * gioBao.getThoiGianDatBao()); BigDecimal tinhTienBao =
	 * gioBao.TinhTienBao(bao.getDonGia()); gioBao.setThanhTien(tinhTienBao); GioBao
	 * gb = new GioBao(bao.getMaBao(),maKH, gioBao.getSoLuong(),
	 * gioBao.getThanhTien(), gioBao.getThoiGianDatBao()); gbdao.themGioBao(gb);
	 * List<GioBao> listgb = gbdao.getListGioBao(); session.setAttribute("listgb",
	 * listgb); return "giobao"; }
	 */

	@RequestMapping(value = "amthuc", method = RequestMethod.GET)
	public ModelAndView amthuc(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListTheLoai(1);
		return new ModelAndView("amthuc", "listbao", listbao);
	}

	@RequestMapping(value = "doanhnhan", method = RequestMethod.GET)
	public ModelAndView doanhnhan(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListTheLoai(2);
		return new ModelAndView("doanhnhan", "listbao", listbao);
	}

	@RequestMapping(value = "thethao", method = RequestMethod.GET)
	public ModelAndView thethao(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListTheLoai(3);
		return new ModelAndView("thethao", "listbao", listbao);
	}

	@RequestMapping(value = "doisong", method = RequestMethod.GET)
	public ModelAndView doisong(Locale locale, Model model) {

		List<Bao> listbao = baodao.getListTheLoai(4);
		return new ModelAndView("doisong", "listbao", listbao);
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	
}
