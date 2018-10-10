package week4.task1;

public class HoaQua {
    //Khai bao thuoc tinh: gia/kg va so luong(don vi kg)
    private int pricepkg = -1, quantitykg = -1;

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

    //Sap xep theo gia ban tang dan
    void sortbyPrice(HoaQua[] fruits){
        try{
            int n = fruits.length;
            for (int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++){
                    if(fruits[i].getPricepkg() > fruits[i+1].getPricepkg()){
                        HoaQua tmp = new HoaQua();
                        tmp = fruits[i];
                        fruits[i]  = fruits[i+1];
                        fruits[i+1] = tmp;
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
