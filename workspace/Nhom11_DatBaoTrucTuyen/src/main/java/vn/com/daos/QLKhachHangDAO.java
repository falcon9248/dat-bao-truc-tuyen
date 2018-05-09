package vn.com.daos;

import vn.com.springmvc.QLKhachHangController;
import vn.com.beans.KhachHang;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:50:47
 */
public class QLKhachHangDAO {

	public QLKhachHangController m_QLKhachHangController;

	public QLKhachHangDAO(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param maKhachHang
	 */
	public boolean suaKhachHang(String maKhachHang){
		return false;
	}

	public int themNguoiDung(){
		return 0;
	}

	/**
	 * 
	 * @param maKhachHang
	 */
	public KhachHang timKhachHang(String maKhachHang){
		return null;
	}

	/**
	 * 
	 * @param maKhachHang
	 */
	public boolean xoaKhachHang(String maKhachHang){
		return false;
	}

}