package mydatemain;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MyDateMain {
    public static void main(String[] args) {
        MyDateClass date = new MyDateClass();


        System.out.print("Year: " + date.getYear());
        System.out.print(" Month: " + date.getMonth());
        System.out.println(" Day: " + date.getDay());
        
        date = new MyDateClass(561555550000L);


        System.out.print("Year: " + date.getYear());
        System.out.print(" Month: " + date.getMonth());
        System.out.println(" Day: " + date.getDay());


        date = new MyDateClass(2017, 1, 25);


        System.out.print("Year: " + date.getYear());
        System.out.print(" Month: " + date.getMonth());
        System.out.println(" Day: " + date.getDay());


        date.setYear(1987);
        date.setMonth(1);
        date.setDay(5);


        System.out.print("Year: " + date.getYear());
        System.out.print(" Month: " + date.getMonth());
        System.out.println(" Day: " + date.getDay());


  }
}


class MyDateClass{
    int year;
    int month;
    int day;
    
    //Default constuctor, gets m/y/d from gregorian calander class
    MyDateClass(){
        GregorianCalendar today = new GregorianCalendar();
        
        year = today.get(today.YEAR);
        month = today.get(today.MONTH);
        day = today.get(today.DAY_OF_MONTH);
    }
    
    //Takes a long time, creates a Date class based on that long, and sets our calanders time to that long, then gets the days.
    MyDateClass(long time){
        GregorianCalendar ourCalendar = new GregorianCalendar();
        Date ourTime = new Date(time);
        
        ourCalendar.setTime(ourTime);
        
        year = ourCalendar.get(ourCalendar.YEAR);
        month = ourCalendar.get(ourCalendar.MONTH);
        day = ourCalendar.get(ourCalendar.DAY_OF_MONTH);
    }
    
    //Sets y/m/d to user given values.
    MyDateClass(int inYear, int inMonth, int inDay){
        year = inYear;
        month = inMonth;
        day = inDay;
    }
    
    //Get functions
    int getYear(){
        return year;
    }
    
    int getMonthInt(){
        return month;
    }
    
    String getMonth(){
        String monthString = "";
        
        switch(month){
            case 0: monthString = "January";
                break;
            case 1: monthString = "Febuary";
                break;
            case 2: monthString = "March";
                break;
            case 3: monthString = "April";
                break;
            case 4: monthString = "May";
                break;
            case 5: monthString = "June";
                break;
            case 6: monthString = "July";
                break;
            case 7: monthString = "August";
                break;
            case 8: monthString = "September";
                break;
            case 9: monthString = "October";
                break;
            case 10: monthString = "November";
                break;
            case 11: monthString = "December";
                break;
        }
        
        return monthString;
    }
    
    int getDay(){
        return day;
    }
    
    //Set functions
    void setYear(int newYear){
        year = newYear;
    }
    
    void setMonth(int newMonth){
        month = newMonth;
    }
    
    void setDay(int newDay){
        day = newDay;
    }
}
