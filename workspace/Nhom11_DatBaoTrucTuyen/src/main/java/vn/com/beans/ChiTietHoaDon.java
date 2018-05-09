package vn.com.beans;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */
public class ChiTietHoaDon {

	private int maHD;
	private String maBao;
	private int soLuong;
	private BigDecimal thanhTien;
	private int thoiGianDatBao;

	public ChiTietHoaDon(int maHD, String maBao, int soLuong, BigDecimal thanhTien, int thoiGianDatBao) {
		super();
		this.maHD = maHD;
		this.maBao = maBao;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		this.thoiGianDatBao = thoiGianDatBao;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public ChiTietHoaDon(){

	}

	public String getMaBao() {
		return maBao;
	}

	public void setMaBao(String maBao) {
		this.maBao = maBao;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(BigDecimal thanhTien) {
		this.thanhTien = thanhTien;
	}

	public int getThoiGianDatBao() {
		return thoiGianDatBao;
	}

	public void setThoiGianDatBao(int thoiGianDatBao) {
		this.thoiGianDatBao = thoiGianDatBao;
	}

	
	
}