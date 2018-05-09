package vn.com.springmvc;

import java.util.List;
import java.util.Locale;

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
import vn.com.daos.QLDSDonHangDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	BaoDAO baodao;
	GioBaoDAO gbdao;
	@Autowired
	PheDuyetDAO pddao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
		Điều hướng trang
	*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListGioBao();
		return new ModelAndView("index", "listbao",listbao);
	}
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public ModelAndView index(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListGioBao();
		return new ModelAndView("index", "listbao",listbao);
	}

	@RequestMapping(value = "amthuc", method = RequestMethod.GET)
	public ModelAndView amthuc(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListTheLoai(1);
		return new ModelAndView("amthuc", "listbao",listbao);
	}
	
	@RequestMapping(value = "doanhnhan", method = RequestMethod.GET)
	public ModelAndView doanhnhan(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListTheLoai(2);
		return new ModelAndView("doanhnhan", "listbao",listbao);
	}
	
	@RequestMapping(value = "thethao", method = RequestMethod.GET)
	public ModelAndView thethao(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListTheLoai(3);
		return new ModelAndView("thethao", "listbao",listbao);
	}
	
	@RequestMapping(value = "doisong", method = RequestMethod.GET)
	public ModelAndView doisong(Locale locale, Model model) {
		
		List<Bao> listbao =  baodao.getListTheLoai(4);
		return new ModelAndView("doisong", "listbao",listbao);
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "duyethd", method = RequestMethod.GET)
	public ModelAndView duyethd(Locale locale, Model model) {
		
		List<HoaDon> listhd = pddao.getListHoaDon();
		return new ModelAndView("duyethd", "listhd", listhd);
	}
	
	@RequestMapping(value = "duyethd", method = RequestMethod.POST)
	public ModelAndView checkhd(Locale locale, Model model) {
		
		
		List<HoaDon> listhd = pddao.getListHoaDon();
		return new ModelAndView("duyethd", "listhd", listhd);
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "hoadon/{maHD}", method = RequestMethod.GET)
	public ModelAndView hoadonchitiet(@PathVariable String maHD) {
		List<ChiTietHoaDon> chitiet=pddao.getListChiTiet(maHD);
		return new ModelAndView("chitietHD", "chitiet", chitiet);
	}
	
	@RequestMapping(value = "hoadon/quaylai", method = RequestMethod.GET)
	public ModelAndView quaylaiduyet() {
		return new ModelAndView("redirect:/duyethd");
	}	
	
	@RequestMapping(value = "/giobao", method = RequestMethod.GET)
	public ModelAndView giobao(Locale locale, Model model) {
		
		List<GioBao> listgb =  gbdao.getListGioBao();
		return new ModelAndView("giobao", "listgb",listgb);
	}
}
