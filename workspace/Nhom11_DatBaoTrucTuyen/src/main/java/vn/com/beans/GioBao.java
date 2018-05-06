package vn.com.beans;
<<<<<<< HEAD
import java.math.BigDecimal; 
=======
import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
>>>>>>> design
/**
 * @author PuppyDRyuki
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */
<<<<<<< HEAD
public class GioBao {
	
	private String mabao;

=======

public class GioBao {

	private String mabao;
	
>>>>>>> design
	private String maKhachHang;
	
	private int soLuong;
	
<<<<<<< HEAD
	private BigDecimal ThanhTien;
=======
	private BigDecimal thanhTien;
>>>>>>> design

	private int thoiGianDatBao;
	
	

<<<<<<< HEAD
=======
	
>>>>>>> design
	public GioBao(String mabao, String maKhachHang, int soLuong, BigDecimal thanhTien, int thoiGianDatBao) {
		super();
		this.mabao = mabao;
		this.maKhachHang = maKhachHang;
		this.soLuong = soLuong;
<<<<<<< HEAD
		ThanhTien = thanhTien;
		this.thoiGianDatBao = thoiGianDatBao;
	}

=======
		thanhTien = thanhTien;
		this.thoiGianDatBao = thoiGianDatBao;
	}


>>>>>>> design
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
<<<<<<< HEAD
		return ThanhTien;
=======
		return thanhTien;
>>>>>>> design
	}

	public void setThanhTien(BigDecimal thanhTien) {
		
<<<<<<< HEAD
		ThanhTien = thanhTien;
=======
		thanhTien = thanhTien;
>>>>>>> design
	}

	public int getThoiGianDatBao() {
		return thoiGianDatBao;
	}

	public void setThoiGianDatBao(int thoiGianDatBao) {
		this.thoiGianDatBao = thoiGianDatBao;
	}

	public BigDecimal TinhTienBao(BigDecimal donGia) {
		
<<<<<<< HEAD
		BigDecimal thoiGianDatBaoBD = BigDecimal.valueOf(thoiGianDatBao).movePointLeft(2);
		BigDecimal soLuongBD = BigDecimal.valueOf(soLuong).movePointLeft(2);
		BigDecimal thanhtien = donGia.multiply(soLuongBD).multiply(thoiGianDatBaoBD) ;
		return thanhtien;
	}

=======
		BigDecimal thoiGianDatBaoBD = BigDecimal.valueOf(thoiGianDatBao);
		BigDecimal soLuongBD = BigDecimal.valueOf(soLuong);
		BigDecimal thanhtien = donGia.multiply(soLuongBD).multiply(thoiGianDatBaoBD) ;
		return thanhtien;
	}
	public void themGioHang(Bao bao, String maKhachHang, int soLuong, int thoiGianDatBao) {
		this.mabao = bao.getMaBao();
		this.maKhachHang = maKhachHang;
		this.soLuong = soLuong;
		this.thoiGianDatBao = thoiGianDatBao;
		thanhTien = TinhTienBao(bao.getDonGia());
    }
	@Override
    public boolean equals(Object obj) {
        return this.getMabao() == ((GioBao) obj).getMabao();
    }
>>>>>>> design
}