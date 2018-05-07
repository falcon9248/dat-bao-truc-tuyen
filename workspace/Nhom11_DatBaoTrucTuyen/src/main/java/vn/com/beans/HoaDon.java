package vn.com.beans;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author FALCON
 * @version 1.0
 * @created 05-May-2018 9:18:31 AM
 */
public class HoaDon {

	private int maHD;
	private int maKH;
	private Date ngayLapHD;
	private BigDecimal tongTienHD;
	private int trangThaiHD;
	private String maNguoiDuyet;

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public HoaDon(int maHD, int maKH, Date ngayLapHD, BigDecimal tongTienHD, int trangThaiHD, String maNguoiDuyet) {
		super();
		this.maHD = maHD;
		this.maKH = maKH;
		this.ngayLapHD = ngayLapHD;
		this.tongTienHD = tongTienHD;
		this.trangThaiHD = trangThaiHD;
		this.maNguoiDuyet = maNguoiDuyet;
	}

	public HoaDon() {
		super();
	}

	public Date getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(Date ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public BigDecimal getTongTienHD() {
		return tongTienHD;
	}

	public void setTongTienHD(BigDecimal tongTienHD) {
		this.tongTienHD = tongTienHD;
	}

	public int getTrangThaiHD() {
		return trangThaiHD;
	}

	public void setTrangThaiHD(int trangThaiHD) {
		this.trangThaiHD = trangThaiHD;
	}

	public String getMaNguoiDuyet() {
		return maNguoiDuyet;
	}

	public void setMaNguoiDuyet(String maNguoiDuyet) {
		this.maNguoiDuyet = maNguoiDuyet;
	}

}