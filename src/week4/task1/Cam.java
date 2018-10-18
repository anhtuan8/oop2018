package week4.task1;

import java.util.ArrayList;

public class Cam extends HoaQua {
    boolean chua = false ;
    myDate expDate;

    public boolean isChua() {
        return chua;
    }

    public void setChua(boolean chua) {
        this.chua = chua;
    }

    /**
     *
     * @param cams
     * @return Mang cam chua
     */
    public ArrayList<Cam> isChua(ArrayList<Cam> cams){
        ArrayList<Cam> camchua = new ArrayList<>(100);
        for(Cam cam: cams){
            if(cam.isChua())
                camchua.add(cam);
        }
        return camchua;
    }

    /**
     *
     * @param cams
     * @param today
     * @return Mang cam het han
     */
    public ArrayList<Cam> expired(ArrayList<Cam> cams,myDate today){
        ArrayList<Cam> expired = new ArrayList<>(100);
        for(Cam cam: cams){
            if (!cam.expDate.isLaterthan(today))
                expired.add(cam);
        }
        return expired;
    }
}
