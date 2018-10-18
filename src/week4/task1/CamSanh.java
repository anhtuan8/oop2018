package week4.task1;

import java.util.ArrayList;
import java.util.Collections;

public class CamSanh extends Cam {
    myDate GoodsIssueDate;
    boolean forExport;

    public boolean isForExport() {
        return forExport;
    }

    public void setGoodsIssueDate(myDate goodsIssueDate) {
        GoodsIssueDate = goodsIssueDate;
    }

    public void setForExport(boolean forExport) {
        this.forExport = forExport;
    }

    public myDate getGoodsIssueDate() {
        return GoodsIssueDate;
    }

    public CamSanh(boolean forExport, myDate goodsIssueDate){
        this.setGoodsIssueDate(goodsIssueDate);
        this.setForExport(forExport);
    }

    /**
     * In danh sach thong tin cam xuat khau: Ngay roi kho, gia, so luong
     * @param cams
     */
    public void printExport(ArrayList<CamSanh> cams){
        try {
            for (CamSanh cam : cams) {
                if (cam.isForExport())
                    cam.getGoodsIssueDate().printDate();
                    System.out.println("\t" + cam.getPricepkg() + "\t" + cam.getQuantitykg());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param cams
     * @return Mang cam xuat khau da sap xep ngay xuat kho tu som -> muon
     */
    public ArrayList<CamSanh> sortExportIssueDate(ArrayList<CamSanh> cams){
        try{
            ArrayList<CamSanh> result = new ArrayList<>();
            for(CamSanh cam: cams){
                if(cam.isForExport())
                    result.add(cam);
            }
            int n = result.size();
            for (int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++){
                    if ( result.get(j).GoodsIssueDate.isLaterthan( result.get(j+1).GoodsIssueDate )) {
                        Collections.swap(result,j,j+1);
                    }
                }
            }
            return result;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
