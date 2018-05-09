package vn.com.daos;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import vn.com.beans.GioBao;
import vn.com.beans.HoaDon;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:47
 */
public class ThanhToanDAO {
private JdbcTemplate template;
	
	private BaoDAO daobao;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public ThanhToanDAO(){

	}
	public int thanhToan(String maKH, Date ngaylap, BigDecimal total) {
		
		String sql = "insert into HoaDon ( MaKH, NgayLapHD, TongTienHD, TrangThaiHD, MaNguoiDuyet) values ('"
				+ maKH +
				"','"
				+ ngaylap+
				"',"
				+total+
				", 0 , NULL)";
		return template.update(sql);
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param hoadon
	 * @param listGioBao
	 */
	public boolean thanhToan(HoaDon hoadon, List<GioBao> listGioBao){
		
		return false;
	}
	public BigDecimal TinhTienBao(BigDecimal donGia, int thoiGianDatBao , int soLuong) {
	
		BigDecimal thoiGianDatBaoBD = BigDecimal.valueOf(thoiGianDatBao).movePointLeft(2);
		BigDecimal soLuongBD = BigDecimal.valueOf(soLuong).movePointLeft(2);
		BigDecimal thanhtien = donGia.multiply(soLuongBD).multiply(thoiGianDatBaoBD) ;
		return thanhtien;
	}

}