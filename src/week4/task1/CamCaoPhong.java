package week4.task1;

import java.util.ArrayList;

public class CamCaoPhong extends Cam {
    boolean ordered = false;
    String customer = "";

    /**
     * getter,setter cho cac thuoc tinh
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public String getCustomer() {
        return customer;
    }

    public CamCaoPhong(String customer){
        this.setCustomer(customer);
        this.setOrdered(true);
    }

    public CamCaoPhong(){
        this.setCustomer("");
        this.setOrdered(false);
    }

    /**
     * In danh sach cam cao phong da duoc dat hang
     * @param cams
     */
    public void printOrdered(ArrayList<CamCaoPhong> cams){
        try {
            for (CamCaoPhong cam : cams) {
                if (cam.isOrdered())
                    System.out.println(cam.getCustomer() + "\t" + cam.getPricepkg() + "\t" + cam.getQuantitykg());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param cam
     * @return Phi van chuyen/km ( 0->30:5k , 30->50 : 7k , >50:10k)
     */
    public int deliveryChargePkm(CamCaoPhong cam){
        try {
            int charge ;
            if (cam.getQuantitykg() > 50)
                charge = 10;
            else if (cam.getQuantitykg() > 30)
                charge = 7;
            else
                charge = 5;
            return charge;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
