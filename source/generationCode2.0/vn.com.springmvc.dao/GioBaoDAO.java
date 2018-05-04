package vn.com.springmvc.dao;

import vn.com.springmvc.beans.HoaDon;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:46
 */
public class GioBaoDAO {

	public HoaDon m_HoaDon;

	public GioBaoDAO(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param maTaiKhoan
	 */
	public List<GioBao> getDSSessionGioBao(int maTaiKhoan){
		return null;
	}

	/**
	 * 
	 * @param giobao
	 */
	public boolean suaDatBao(GioBao giobao){
		return false;
	}

	/**
	 * 
	 * @param hoadon
	 * @param listGioBao
	 */
	public boolean thanhToan(HoaDon hoadon, list<GioBao> listGioBao){
		return false;
	}

	/**
	 * 
	 * @param giobao
	 */
	public boolean themSessionGioBao(GioBao giobao){
		return false;
	}

	/**
	 * 
	 * @param IdBao
	 */
	public boolean xoaGioBaoTheoId(String IdBao){
		return false;
	}

	/**
	 * 
	 * @param listGioBao
	 */
	public boolean xoaListGioBao(List<GioBao> listGioBao){
		return false;
	}

}