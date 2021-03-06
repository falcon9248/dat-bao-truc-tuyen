package vn.com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vn.com.springmvc.beans.Bao;

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
					b.setMaBao(rs.getString(1));
					b.setTenBao(rs.getString(2));
					b.setChuKyXuatBan(rs.getInt(3));
					b.setDonGia(rs.getInt(4));
					b.setMaNhaXuatBan(rs.getString(5));
					b.setImgBao(rs.getString(6));
					
				return b;
			}
		});
	}
	
public List<Bao> getListTheLoai(String theloai) {
		
		return template.query("select * from Bao where chuKyXuatBan='"+theloai+"'", new RowMapper<Bao>() {
			public Bao mapRow(ResultSet rs,int row) throws SQLException {
				Bao b =new Bao();
					b.setMaBao(rs.getString(1));
					b.setTenBao(rs.getString(2));
					b.setChuKyXuatBan(rs.getInt(3));
					b.setDonGia(rs.getInt(4));
					b.setMaNhaXuatBan(rs.getString(5));
					b.setImgBao(rs.getString(6));
					
				return b;
			}
		});
	}
}
