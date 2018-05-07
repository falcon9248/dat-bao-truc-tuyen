package vn.com.daos;

import vn.com.springmvc.XuLyTaiKhoanController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.beans.KhachHang;
import vn.com.beans.TaiKhoan;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:47
 */

@Repository
public class XuLyTaiKhoanDAO {

	JdbcTemplate jdbcTemplate;
	public TaiKhoan m_TaiKhoan;
	public XuLyTaiKhoanController m_XuLyTaiKhoanController;

	public XuLyTaiKhoanDAO(){

	}

	public void finalize() throws Throwable {

	}
	
	public JdbcTemplate getTemplate() {
		return jdbcTemplate;
	}

	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}
	
	public TaiKhoan timTenTaiKhoan(String tenDangNhap) {
		TaiKhoan tk ;
		String query="select * from taikhoan where tendangnhap=?";
		try {
			tk =   jdbcTemplate.queryForObject(query, new Object[] {tenDangNhap}, 
					new BeanPropertyRowMapper<TaiKhoan>(TaiKhoan.class));
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			return null;
			
		}
		return tk;
		
	}
	
	public int taoTaiKhoan(String tenDangNhap, String matKhau, int phanQuyen) {
		
		String sql = "insert into taikhoan (tenDangNhap,matKhau,phanQuyen) values ('"
				+ tenDangNhap+
				"','"
				+ matKhau+
				"',"
				+phanQuyen+
				")";
		
		return jdbcTemplate.update(sql);
		
	}
	
	public int doiMatKhauTaiKhoan(String tenDangNhap, String matKhau){  
	    String query="update taiKhoan set matKhau='"
	    		+ matKhau+
	    		"' where tenDangNhap='"
	    		+tenDangNhap+
	    		"'";
	    
	    return jdbcTemplate.update(query);  
	}
	
	public int doiPhanQuyenTaiKhoan(String tenDangNhap, int phanQuyen){  
	    String query="update taiKhoan set phanQuyen='"
	    		+ phanQuyen+
	    		"' where tenDangNhap='"
	    		+tenDangNhap+
	    		"'";
	    
	    return jdbcTemplate.update(query);  
	}
	
	
	
	
	/**
	 * 
	 * @param email
	 * @param matkhau
	 */
	public boolean kiemTraDangNhap(String tenDangNhap, String matkhau){
		
		
		return false;
	}

	public int phanQuyen(){
		return 0;
	}

}