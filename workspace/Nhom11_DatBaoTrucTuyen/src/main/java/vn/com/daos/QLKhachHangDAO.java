package vn.com.daos;

import vn.com.springmvc.QLKhachHangController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import vn.com.beans.KhachHang;
import vn.com.beans.TaiKhoan;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:47
 */
public class QLKhachHangDAO {
	JdbcTemplate jdbcTemplate;
	XuLyTaiKhoanDAO tkDAO = new XuLyTaiKhoanDAO();
	

	public QLKhachHangController m_QLKhachHangController;
	

	public QLKhachHangDAO(){

	}

	
	public JdbcTemplate getTemplate() {
		return jdbcTemplate;
	}
	
	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}
	
	
	/**
	 * 
	 * @param maKhachHang
	 */
	public KhachHang timKhachHang(String tenKhachHang){
		KhachHang kh ;
		String query="select * from khachHang where tendangnhap=?";
		try {
			kh =   jdbcTemplate.queryForObject(query, new Object[] {tenKhachHang}, 
					new BeanPropertyRowMapper<KhachHang>(KhachHang.class));
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			return null;
			
		}
		return kh;
		
	}
	
	
	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param maKhachHang
	 */
	public boolean suaKhachHang(String maKhachHang){
		
		
		return false;
	}

	public int themNguoiDung(String tenDangNhap, String matKhau, int phanQuyen, String tenKH, String sdt,String diaChi,Date ngaySinh,String cmnd,int maTK){
		
		String sql="insert into khachHang (tenKH,dienThoai,diaChi,ngaySinh,cmnd,maTK) values ('"
				+ tenKH+
				"','"
				+sdt+
				"','"
				+diaChi+
				"','"
				+ngaySinh.toString()+
				","
				+cmnd+
				","
				+maTK+")";
		
		if(tkDAO.taoTaiKhoan(tenDangNhap, matKhau, phanQuyen)>=1) 
			return jdbcTemplate.update(sql);
		
		return 0;
		
	}

	

	/**
	 * 
	 * @param maKhachHang
	 */
	public boolean xoaKhachHang(String maKhachHang){
		return false;
	}

}