package vn.com.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import vn.com.springmvc.beans.GioBao;



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
