package junit_lab;

public class Date {

    final int year, month, date;
    

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    
        public int daysTo(Date dates1){
            int numDatesTotal = 0;
            
            int dateDifference = 0;
            
            numDatesTotal = this.year * 365;
            
            
            return dateDifference;
        }
    
    public int convertDays(Date dates){
        int numDatesTotal = 0;
        
        numDatesTotal = dates.year * 365;
        numDatesTotal += (dates.month * 30);
        numDatesTotal += dates.date;
        
        return numDatesTotal;
    }
  

    /*public static int daysTo(Date startDate, Date endDate) {
        int yearDiff = 0;
        int monthDiff = 0;
        int dateDiff = 0;
        
        int result = 0;
        
        yearDiff = endDate.year - startDate.year;
        
        if (yearDiff > 1){
            result = yearDiff * 365;
        }
        
        monthDiff = endDate.month - startDate.month;
        
        if (monthDiff > 1){
            result = result + monthDiff * 30;
        }
        
        dateDiff = endDate.date - startDate.date;
        
        if (endDate.date < startDate.date){
            dateDiff += 30;
        }
        
        result = result + dateDiff;
        
        return result;*/
      
    }

