package Cuong.dev;

public class SinhVien {
	 private String Name;
     private double diemtoan;
     private double diemly;
     private double diemhoa;
     public SinhVien(String Name,double diemtoan,double diemly,double diemhoa){
   	  this.Name=Name;
   	  this.diemtoan=diemtoan;
   	  this.diemly=diemly;
   	  this.diemhoa=diemhoa;
     }
   	public double diemTrungBinh(double diemtoan,double diemly,double diemhoa) {
 	   return (diemtoan+diemly+diemhoa)/3;
 	  
   }
   public void show() {
 	  System.out.println(Name+":"+diemTrungBinh(diemtoan, diemly, diemhoa));
     }
}
