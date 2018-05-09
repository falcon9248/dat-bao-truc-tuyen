package vn.com.springmvc;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.com.beans.ChiTietHoaDon;
import vn.com.beans.HoaDon;
import vn.com.daos.PheDuyetDAO;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:47:21
 */
@Controller
public class QLDSDonHangController {
	@Autowired
	PheDuyetDAO pddao;
	public QLDSDonHangController(){

	}

	public void finalize() throws Throwable {

	}
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
		List<ChiTietHoaDon> chitiet = pddao.getListChiTiet(maHD);
		return new ModelAndView("chitietHD", "chitiet", chitiet);
	}

	@RequestMapping(value = "hoadon/quaylai", method = RequestMethod.GET)
	public ModelAndView quaylaiduyet() {
		return new ModelAndView("redirect:/duyethd");
	}

}