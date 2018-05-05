package vn.com.daos;

import vn.com.beans.HoaDon;
import vn.com.springmvc.QLDSDonHangController;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:47
 */
public class QLDSDonHangDAO {

	public HoaDon m_HoaDon;
	public QLDSDonHangController m_QLDSDonHangController;

	public QLDSDonHangDAO(){

	}

	public void finalize() throws Throwable {

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