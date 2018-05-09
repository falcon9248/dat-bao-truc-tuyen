package vn.com.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vn.com.beans.Bao;
import vn.com.beans.ChiTietHoaDon;
import vn.com.beans.HoaDon;

public class PheDuyetDAO {
	private JdbcTemplate template;
	
	private BaoDAO daobao;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<HoaDon> getListHoaDon(){
		return template.query("select * from HoaDon", new RowMapper<HoaDon>() {
			public HoaDon mapRow(ResultSet rs,int row) throws SQLException {
				HoaDon hd =new HoaDon();
				hd.setMaHD(rs.getInt(1));
				hd.setMaKH(rs.getInt(2));
				hd.setNgayLapHD(rs.getDate(3));
				hd.setTongTienHD(rs.getBigDecimal(4));
				hd.setTrangThaiHD(rs.getInt(5));
				hd.setMaNguoiDuyet(rs.getNString(6));
				return hd;
			}
		});
	}
	
	public List<ChiTietHoaDon> getListChiTiet(String maHD) {
		return template.query("select * from ChiTietHoaDon CT where MaHD = '"+maHD+"'", new RowMapper<ChiTietHoaDon>() {
			public ChiTietHoaDon mapRow(ResultSet rs,int row) throws SQLException {
				ChiTietHoaDon ct=new ChiTietHoaDon();
				ct.setMaHD(rs.getInt(1));
				Bao b=daobao.getNameById(rs.getNString(2));
				ct.setMaBao(b.getTenBao());
				//ct.setMaBao(rs.getNString(2));
				ct.setSoLuong(rs.getInt(3));
				ct.setThanhTien(rs.getBigDecimal(4));
				ct.setThoiGianDatBao(rs.getInt(5));
				return ct;
			}
		});
	}
}
