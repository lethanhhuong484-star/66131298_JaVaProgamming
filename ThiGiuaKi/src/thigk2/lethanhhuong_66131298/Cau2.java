package thigk2.lethanhhuong_66131298;

import java.util.Scanner;

public class Cau2 {
	class sinhvien {
		private String ten;
		private int tuoi;
		private double namsinh;
		
		public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public int getTuoi() {
			return tuoi;
		}

		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}

		public double getNamsinh() {
			return namsinh;
		}

		public void setNamsinh(double namsinh) {
			this.namsinh = namsinh;
		}

		public sinhvien(String ten, int tuoi, double namsinh) {
			this.ten = ten;
			this.tuoi = tuoi;
			this.namsinh = namsinh;
		}

		public sinhvien() {
	      super();
		}
		
	}
}
