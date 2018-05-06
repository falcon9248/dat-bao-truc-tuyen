package vn.com.beans;
import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */

public class GioBao {

	private String mabao;
	
	private String maKhachHang;
	
	private int soLuong;
	
	private BigDecimal thanhTien;

	private int thoiGianDatBao;
	
	

	
	public GioBao(String mabao, String maKhachHang, int soLuong, BigDecimal thanhTien, int thoiGianDatBao) {
		super();
		this.mabao = mabao;
		this.maKhachHang = maKhachHang;
		this.soLuong = soLuong;
		thanhTien = thanhTien;
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

	

	public BigDecimal getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(BigDecimal thanhTien) {
		
		thanhTien = thanhTien;
	}

	public int getThoiGianDatBao() {
		return thoiGianDatBao;
	}

	public void setThoiGianDatBao(int thoiGianDatBao) {
		this.thoiGianDatBao = thoiGianDatBao;
	}

	public BigDecimal TinhTienBao(BigDecimal donGia) {
		
		BigDecimal thoiGianDatBaoBD = BigDecimal.valueOf(thoiGianDatBao).movePointLeft(2);
		BigDecimal soLuongBD = BigDecimal.valueOf(soLuong).movePointLeft(2);
		BigDecimal thanhtien = donGia.multiply(soLuongBD).multiply(thoiGianDatBaoBD) ;
		return thanhtien;
	}
	public void themGioHang(Bao bao, String maKhachHang, int soLuong, int thoiGianDatBao) {
		this.mabao = bao.getMaBao();
		this.maKhachHang = maKhachHang;
		this.soLuong = soLuong;
		thanhTien = TinhTienBao(bao.getDonGia());
		this.thoiGianDatBao = thoiGianDatBao;
    }
	@Override
    public boolean equals(Object obj) {
        return this.getMabao() == ((GioBao) obj).getMabao();
    }
}