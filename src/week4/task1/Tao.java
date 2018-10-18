package week4.task1;

import java.util.ArrayList;
import java.util.Collections;

public class Tao extends HoaQua{
    /**Khai bao thuoc tinh
     *
     */
    String xuatxu;
    myDate ngaynhap;

    /**getter,setter cho cac thuoc tinh
     *
     */
    public myDate getNgaynhap() {
        return ngaynhap;
    }

    public String getXuatxu(){
        return xuatxu;
    }

    public void setNgaynhap(myDate ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    /**
     * Sap xep lai mang theo ngay nhap tu som -> muon
     * @param taos
     */
    public void sortbyNgaynhap(ArrayList<Tao> taos){
        try{
            int n = taos.size();
            for (int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++){
                    if ( taos.get(j).ngaynhap.isLaterthan( taos.get(j+1).ngaynhap )) {
                        Collections.swap(taos,j,j+1);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Tao> from(String xuatxu,ArrayList<Tao> taos){
        ArrayList<Tao> result = new ArrayList<>();
        for(Tao tao: taos){
            if(tao.xuatxu.equalsIgnoreCase(xuatxu))
                result.add(tao);
        }
        return result;
    }
}
