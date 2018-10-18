package week4.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<HoaQua> hoaqua = new ArrayList<>();
        HoaQua mng = new HoaQua();
        Tao tao = new Tao();
        tao.setPricepkg(20); tao.setQuantitykg(100);
        hoaqua.add(tao);
        hoaqua.add(new HoaQua(50,200));
        hoaqua.add(new HoaQua(70,150));
        hoaqua.add(new HoaQua(15,50));
        hoaqua.add(new HoaQua(30,220));

        ArrayList<CamSanh> CamSanh = new ArrayList<>();
        ArrayList<CamCaoPhong> CamCaoPhong = new ArrayList<>();
        ArrayList<Tao> Tao = new ArrayList<>();
        ArrayList<Cam> Cam = new ArrayList<>();

        CamSanh camsanh1 = new CamSanh(false,new myDate(2019,11,30));
        camsanh1.setPricepkg(25); camsanh1.setQuantitykg(150); camsanh1.setChua(false);
        CamSanh camsanh2 = new CamSanh(true,new myDate(2018,12,12));
        camsanh2.setPricepkg(50); camsanh2.setQuantitykg(10); camsanh2.setChua(true);
        CamCaoPhong camCaoPhong1 = new CamCaoPhong("ABC");
        camCaoPhong1.setPricepkg(30); camCaoPhong1.setQuantitykg(50); camCaoPhong1.setChua(false);

        mng.sortbyPrice(hoaqua);

//        HoaQua.sortbyQuan(hoaqua);
        for(HoaQua fruit: hoaqua){
            System.out.println(fruit.getPricepkg() + "\t"+ fruit.getQuantitykg());
        }

        System.out.println(camsanh1.toString());

    }
}
