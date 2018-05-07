package vn.com.beans;

import java.util.Date;

/**
 * @author FALCON
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */
public class KhachHang {
	private int maKH;
	private String tenKH;
	private String dienThoai;
	private String diaChi;
	private Date ngaySinh;
	private String cmnd;
	private int maTK;
	public KhachHang(int maKH, String tenKH, String dienThoai, String diaChi, Date ngaySinh, String cmnd, int maTK) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.maTK = maTK;
	}
	public KhachHang() {
		super();
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public int getMaTK() {
		return maTK;
	}
	public void setMaTK(int maTK) {
		this.maTK = maTK;
	}
}