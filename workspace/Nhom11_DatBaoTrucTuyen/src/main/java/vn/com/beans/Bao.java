package vn.com.beans;

import java.math.BigDecimal;

public class Bao {

	private String maBao;
	private String tenBao;
	private String AnhBao;
	private BigDecimal donGia;
	private String chiTietBao;
	private String nhaXuatBan;
	private int theLoai;
	private int trangThai;
	public Bao(String maBao, String tenBao, String anhBao, BigDecimal donGia, String chiTietBao, String nhaXuatBan,
			int theLoai, int trangThai) {
		super();
		this.maBao = maBao;
		this.tenBao = tenBao;
		AnhBao = anhBao;
		this.donGia = donGia;
		this.chiTietBao = chiTietBao;
		this.nhaXuatBan = nhaXuatBan;
		this.theLoai = theLoai;
		this.trangThai = trangThai;
	}
	public Bao() {
		super();
	}
	public String getMaBao() {
		return maBao;
	}
	public void setMaBao(String maBao) {
		this.maBao = maBao;
	}
	public String getTenBao() {
		return tenBao;
	}
	public void setTenBao(String tenBao) {
		this.tenBao = tenBao;
	}
	public String getAnhBao() {
		return AnhBao;
	}
	public void setAnhBao(String anhBao) {
		AnhBao = anhBao;
	}
	public BigDecimal getDonGia() {
		return donGia;
	}
	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}
	public String getChiTietBao() {
		return chiTietBao;
	}
	public void setChiTietBao(String chiTietBao) {
		this.chiTietBao = chiTietBao;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public int getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(int theLoai) {
		this.theLoai = theLoai;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
}