package com.vn.datbaotructuyen.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vn.datbaotructuyen.beans.GioBao;



public class GioBaoDAO {

	JdbcTemplate template;
	List<GioBao> lstgb = new ArrayList<GioBao>();
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<GioBao> getListGioBao() {
		
		return lstgb;
	}
}
