package vn.com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nimbusds.oauth2.sdk.ResponseType.Value;

import vn.com.beans.TaiKhoan;
import vn.com.daos.XuLyTaiKhoanDAO;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:47:23
 */

@Controller
public class XuLyTaiKhoanController {
	@Autowired
	XuLyTaiKhoanDAO tkDao;
	

	public XuLyTaiKhoanController(){

	}

	public void finalize() throws Throwable {

	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(Model model) {
		
		
		if(!model.containsAttribute("taiKhoan")) {
			model.addAttribute("taiKhoan", new TaiKhoan());
		}
		
		return "login";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan,
			RedirectAttributes redir) {
		
		ModelAndView mav = new ModelAndView();
		TaiKhoan tk = tkDao.timTenTaiKhoan(taiKhoan.getTenDangNhap());
		
		if(tk!=null) {
			if(taiKhoan.getMatKhau().equals(tk.getMatKhau())) {
				mav.setViewName("redirect:/");
				redir.addFlashAttribute("taiKhoan", taiKhoan);
				redir.addFlashAttribute("login", true);
				return mav;
				
			}
		}
			// tai khoan == null (khong co trong CSDL) quay lai trang login
			mav.setViewName("login");
			mav.addObject("loginFalse", true);
			
				
		return mav;
		
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logout(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan,
			RedirectAttributes redir) {
		
		ModelAndView mav = new ModelAndView();
		
				mav.setViewName("redirect:/");
				redir.addFlashAttribute("login", false);
				
		return mav;
		
	}
	
	
	
	
	
	

}