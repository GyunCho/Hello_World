
package junit_lab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class test {
    
    @Test
    public void testDaysTo1(){
       Date test1 = new Date(2010, 5, 15);
       Date test2 = new Date(2010, 6, 15);
       
       
       assertEquals(29, JUnit_Lab.daysTo(test1, test2));
       
        
    }
    
    
    
    @Test
    public void testDaysTo2(){
       Date test1 = new Date(2010, 5, 15);
       Date test2 = new Date(2011, 5, 15);
       
       
       assertEquals(360, JUnit_Lab.daysTo(test1, test2));
       
        
    }
    
    @Test
    public void testDaysTo3(){
       Date test1 = new Date(2010, 5, 15);
       Date test2 = new Date(2010, 10, 15);
       
       
       assertEquals(150, JUnit_Lab.daysTo(test1, test2));
       
        
    }
    
   
    
   
    
    
}
