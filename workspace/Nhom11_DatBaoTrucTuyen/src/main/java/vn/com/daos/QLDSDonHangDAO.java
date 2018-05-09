package vn.com.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vn.com.beans.HoaDon;

public class QLDSDonHangDAO {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	/**
	 * 
	 * @param maDonHang
	 */
	public boolean huyDonHang(String maDonHang){
		return false;
	}

	public int suaDonHang(){
		return 0;
	}

	/**
	 * 
	 * @param maDonHang
	 */
	public HoaDon timDonHang(String maDonHang){
		return null;
	}

	/**
	 * 
	 * @param maDonHang
	 */
	public boolean xacNhanDonHang(String maDonHang){
		return false;
	}

}