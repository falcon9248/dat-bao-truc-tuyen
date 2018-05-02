package com.vn.datbaotructuyen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vn.datbaotructuyen.beans.Bao;

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
				Bao e =new Bao();
					/*e.setId(rs.getString(1));
					e.setName(rs.getString(2));
					e.setAddress(rs.getString(3));
					e.setDesId(rs.getString(4));*/
				return e;
			}
		});

	}
}
