package Cuong.dev;

public class JavaOOP {
	public static void main(String [] agrs) {
    	final String arrName[]= {"van tung","van thai","van son","van hoa","van vinh"};
    	final double arrdiemtoan[]= {7.5,8,8,9,10};
    	final double arrdiemly[]= {7,8,9,7,6};
    	final double arrdiemhoa[]= {8,6,8,8,10};
    	SinhVien arrSinhVien[]= new SinhVien[arrName.length];
    	for(int i=0;i<arrSinhVien.length;i++) {
    		SinhVien sv= new SinhVien(arrName[i],arrdiemtoan[i],arrdiemly[i],arrdiemhoa[i]);
    		arrSinhVien[i]=sv;
    	}
    	for(int i=0;i<arrSinhVien.length;i++) {
    		if(arrSinhVien[i].diemTrungBinh(arrdiemtoan[i],arrdiemly[i],arrdiemhoa[i])>8) {
    			arrSinhVien[i].show();
    		}
    	}
    }
}
