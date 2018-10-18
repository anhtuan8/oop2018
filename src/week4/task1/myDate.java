package week4.task1;

import java.util.Arrays;

public class myDate {
    private int year,month,day;

    public void setYear(int year) {
        if(year > 0)
            this.year = year;
        else{
            System.out.println("Inappropriate year.");
        }
    }

    public void setDay(int day) {
        try {
            if (day > 31 || day <1)
                System.out.println("Inappropriate day.");
            else {
                Integer[] month30day = {4, 6, 9, 11};
                if (this.month == 2 && day > 29) {
                    throw new IllegalArgumentException();
                }
                if (Arrays.asList(month30day).contains(this.month) && day > 30) {
                    throw new IllegalArgumentException();
                } else {
                    this.day = day;
                }
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Inappropriate day.");
        }

    }

    public void setMonth(int month) {
        if(month > 12 || month <1)
            System.out.println("Inappropriate month.");
        else
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean isLaterthan(myDate date){
        if(this.year > date.year)
            return true;
        else{
            if (this.year < date.year)
                return false;
            else{
                if(this.month > date.month)
                    return true;
                else{
                    if(this.month < date.month)
                        return false;
                    else {
                        if (this.day > date.day)
                            return true;
                        else{
                            if (this.day < date.day)
                                return false;
                            return true;
                        }
                    }
                }
            }
        }
    }

    public myDate(int year, int month, int day){
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public void printDate(){
        try{
            System.out.println(this.day + "/" +this.month + "/" + this.year );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
