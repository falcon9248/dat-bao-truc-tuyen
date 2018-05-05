package vn.com.beans;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */
public class GioBao {

	private String mabao;
	private String maKhachHang;
	private int soLuong;
	private int ThanhTien;
	private int thoiGianDatBao;
	
	public GioBao(String mabao, String maKhachHang, int soLuong, int thanhTien, int thoiGianDatBao) {
		super();
		this.mabao = mabao;
		this.maKhachHang = maKhachHang;
		this.soLuong = soLuong;
		ThanhTien = thanhTien;
		this.thoiGianDatBao = thoiGianDatBao;
	}

	public GioBao(){

	}

	public String getMabao() {
		return mabao;
	}

	public void setMabao(String mabao) {
		this.mabao = mabao;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getThanhTien() {
		return ThanhTien;
	}

	public void setThanhTien(int thanhTien) {
		ThanhTien = thanhTien;
	}

	public int getThoiGianDatBao() {
		return thoiGianDatBao;
	}

	public void setThoiGianDatBao(int thoiGianDatBao) {
		this.thoiGianDatBao = thoiGianDatBao;
	}

	

}