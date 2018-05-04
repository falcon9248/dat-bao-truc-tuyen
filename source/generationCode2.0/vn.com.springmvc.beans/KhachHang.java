package vn.com.springmvc.beans;

import vn.com.springmvc.dao.QLKhachHangDAO;

/**
 * @author FALCON
 * @version 1.0
 * @created 03-May-2018 23:48:21
 */
public class KhachHang {

	private char diaChi;
	private int maTaiKhoan;
	private int sdt;
	private char tenKhachHang;
	public HoaDon m_HoaDon;
	public QLKhachHangDAO m_QLKhachHangDAO;

	public KhachHang(){

	}

	public void finalize() throws Throwable {

	}

}