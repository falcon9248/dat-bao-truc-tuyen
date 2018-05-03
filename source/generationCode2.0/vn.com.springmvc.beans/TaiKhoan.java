package vn.com.springmvc.beans;

import vn.com.springmvc.dao.QLKhachHangDAO;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 03-May-2018 23:48:21
 */
public class TaiKhoan {

	private char email;
	private char matKhau;
	private boolean thuocTinh;
	public KhachHang m_KhachHang;
	public QLKhachHangDAO m_QLKhachHangDAO;

	public TaiKhoan(){

	}

	public void finalize() throws Throwable {

	}

	public boolean kiemTraHopLe(){
		return false;
	}

}