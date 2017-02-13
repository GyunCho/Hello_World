package junit_lab;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnit_Lab {

    public static int daysTo(Date startDate, Date endDate) {
        int yearDiff = 0;
        int monthDiff = 0;
        int dateDiff = 0;

        int result = 0;

        yearDiff = endDate.year - startDate.year;

        if (yearDiff > 0) {
            result = yearDiff * 365;
        }

        monthDiff = endDate.month - startDate.month;

        if (monthDiff > 0) {
            result = result + monthDiff * 30;
        } 

        dateDiff = endDate.date - startDate.date;

        if (endDate.date < startDate.date) {
            
                  
            dateDiff += 30;
        }
        
        

        result = result + dateDiff;

        return result;

    }

 
    

    public static void main(String[] args) {

        /*Date test1 = new Date(2010, 5, 15);
       Date test2 = new Date(2011, 6, 15);
        
       
       
       System.out.println(daysTo(test1, test2));*/
        //my method works fine!
        System.out.println("Project started successfully");

        Result result = JUnitCore.runClasses(junit_lab.test.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
