package week4.task1;

import java.util.ArrayList;
import java.util.Collections;

public class HoaQua {
    //Khai bao thuoc tinh: gia/kg va so luong(don vi kg)
    private int pricepkg , quantitykg ;

    //getter,setter cho cac thuoc tinh
    public int getPricepkg() {
        try {
            if(pricepkg > 0)
                return pricepkg;
            else {
                System.out.println("Set price first.");
                return -1;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public void setPricepkg(int pricepkg) {
        try {
            if(pricepkg > 0)
                this.pricepkg = pricepkg;
            else
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            System.out.println("Inappropriate price.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public int getQuantitykg() {
        try {
            if(quantitykg>0)
                return quantitykg;
            else {
                System.out.println("Set quantity first");
                return -1;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public void setQuantitykg(int quantitykg) {
        try {
            if(quantitykg > 0)
                this.quantitykg = quantitykg;
            else
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            System.out.println("Inappropriate quantity.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * constructor 1
     * @param pricepkg
     * @param quantitykg
     */
    public HoaQua(int pricepkg,int quantitykg){
        this.pricepkg = pricepkg;
        this.quantitykg = quantitykg;
    }

    /**
     * constructor2
     */
    public HoaQua(){
        pricepkg = -1;
        quantitykg = -1;
    }

    /**
     * Ham sap xep mang hoa qua theo muc gia tang dan
     * @param fruits
     */
    public void sortbyPrice(ArrayList<HoaQua> fruits){
        try{
            int n = fruits.size();
            for (int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++){
                    if (fruits.get(j).getPricepkg() > fruits.get(j+1).getPricepkg()) {
                        Collections.swap(fruits,j,j+1);
                    }
                }
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("The input is not proper.");;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**Ham sap xep mang hoa qua theo so luong tang dan
     *
     * @param fruits
     */
    public void sortbyQuan(ArrayList<HoaQua> fruits){
        try{
            int n = fruits.size();
            for (int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++){
                    if (fruits.get(j).getQuantitykg() > fruits.get(j+1).getQuantitykg()) {
                        Collections.swap(fruits,j,j+1);
                    }
                }
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("The input is not proper.");;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
