package vn.com.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vn.com.beans.Bao;

public class BaoDAO {
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Bao> getListGioBao() {
		return template.query("select * from Bao", new RowMapper<Bao>() {
			public Bao mapRow(ResultSet rs,int row) throws SQLException {
				Bao b =new Bao();
					b.setMaBao(rs.getNString(1));
					b.setTenBao(rs.getNString(2));
					b.setAnhBao(rs.getNString(3));
					b.setDonGia(rs.getBigDecimal(4));
					b.setChiTietBao(rs.getNString(5));
					b.setNhaXuatBan(rs.getNString(6));
					b.setTheLoai(rs.getInt(7));
					b.setTrangThai(rs.getInt(8));
				return b;
			}
		});
	}
	
	public List<Bao> getListTheLoai(String theloai) {
		
		return template.query("select * from Bao where chuKyXuatBan='"+theloai+"'", new RowMapper<Bao>() {
			public Bao mapRow(ResultSet rs,int row) throws SQLException {
				Bao b =new Bao();
					b.setMaBao(rs.getNString(1));
					b.setTenBao(rs.getNString(2));
					b.setAnhBao(rs.getNString(3));
					b.setDonGia(rs.getBigDecimal(4));
					b.setChiTietBao(rs.getNString(5));
					b.setNhaXuatBan(rs.getNString(6));
					b.setTheLoai(rs.getInt(7));
					b.setTrangThai(rs.getInt(8));
				return b;
			}
		});
	}
}
}
