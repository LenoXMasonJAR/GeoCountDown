package project1;

import org.junit.Test;

import static org.junit.Assert.*;

/***********************************************************
 *This is a J-unit that tests the GeoCountDownTimer program
 *
 *@author Mason Mahoney
 *@version 9/14/2016
 *
 **********************************************************/
public class TestGeoCountDownTimer {


    @Test
    public void testConstructor1() {
        GeoCountDownTimer s = new GeoCountDownTimer(5, 10, 2015);
        assertEquals(s.toDateString(), "5/10/2015");

        GeoCountDownTimer s2 = new GeoCountDownTimer("1/2/2016");
        assertTrue(s2.getYear() == 2016);
        assertTrue(s2.getMonth() == 1);
        assertTrue(s2.getDay() == 2);

        // create many more test

    }

    // @Tests to see if the dates are equal
    @Test
    public void testConstructor2() {
        GeoCountDownTimer s = new GeoCountDownTimer("5/10/2015");
        assertTrue(s.toDateString().equals("5/10/2015"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor4() {
        GeoCountDownTimer s = new GeoCountDownTimer("12/17/2578");
        assertTrue(s.toDateString().equals("12/17/2578"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor5() {
        GeoCountDownTimer s = new GeoCountDownTimer("5/10/2015");
        assertTrue(s.toDateString().equals("5/10/2015"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor6() {
        GeoCountDownTimer s = new GeoCountDownTimer("3/7/3222");
        assertTrue(s.toDateString().equals("3/7/3222"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor7() {
        GeoCountDownTimer s = new GeoCountDownTimer("9/23/2123");
        assertTrue(s.toDateString().equals("9/23/2123"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor8() {
        GeoCountDownTimer s = new GeoCountDownTimer("6/30/2034");
        assertTrue(s.toDateString().equals("6/30/2034"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor9() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2016");
        assertTrue(s.toDateString().equals("2/29/2016"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor10() {
        GeoCountDownTimer s = new GeoCountDownTimer("7/29/4011");
        assertTrue(s.toDateString().equals("7/29/4011"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructo11() {
        GeoCountDownTimer s = new GeoCountDownTimer("1/1/45555");
        assertTrue(s.toDateString().equals("1/1/45555"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructo12() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2020");
        assertTrue(s.toDateString().equals("2/29/2020"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor13() {
        GeoCountDownTimer s = new GeoCountDownTimer("9/23/2789");
        assertTrue(s.toDateString().equals("9/23/2789"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor14() {
        GeoCountDownTimer s = new GeoCountDownTimer("10/8/2891");
        assertTrue(s.toDateString().equals("10/8/2891"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor15() {
        GeoCountDownTimer s = new GeoCountDownTimer("10/29/9087");
        assertTrue(s.toDateString().equals("10/29/9087"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor16() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2016456");
        assertTrue(s.toDateString().equals("2/29/2016456"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor17() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2016");
        assertTrue(s.toDateString().equals("2/29/2016"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor18() {
        GeoCountDownTimer s = new GeoCountDownTimer("7/8/50000000");
        assertTrue(s.toDateString().equals("7/8/50000000"));
    }

    // Tests to see if its a leap year
    @Test
    public void testConstructor41() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2020");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor42() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2024");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor43() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2028");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor44() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2032");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor45() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2036");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor46() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2040");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor47() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2400");
       
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor48() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2164");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor49() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2304");
        
    }
    
 // Tests to see if it's a leap year
    @Test
    public void testConstructor50() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/6400");
        
    }
    
 // Tests to see if the dates are equal
    @Test
    public void testConstructor19() {
        GeoCountDownTimer s = new GeoCountDownTimer("5/2/201690876");
        assertTrue(s.toDateString().equals("5/2/201690876"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor20() {
        GeoCountDownTimer s = new GeoCountDownTimer("11/30/3896");
        assertTrue(s.toDateString().equals("11/30/3896"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor21() {
        GeoCountDownTimer s = new GeoCountDownTimer("8/6/201634");
        assertTrue(s.toDateString().equals("8/6/201634"));
    }

    // Tests to see if the dates are equal
    @Test
    public void testConstructor22() {
        GeoCountDownTimer s = new GeoCountDownTimer("4/17/2090");
        assertTrue(s.toDateString().equals("4/17/2090"));
    }
    
 // Tests to see if the dates are equal with extra spaces
    @Test
    public void testConstructor51() {
        GeoCountDownTimer s = new GeoCountDownTimer("4     /      17/     2090");
        assertTrue(s.toDateString().equals("4/17/2090"));
    }

    // tests for NOT a Leap year
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor3() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/2015");
        

        // Create more, many more tests

    }

    // tests to see if an IllegalArgumetnException is thrown - Negative number
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/-29/2015");
        

    }

    // tests to see if an IllegalArgumetnException is thrown -Letters
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException2() {
        GeoCountDownTimer s = new GeoCountDownTimer("AA/29/2015");
        

    }
    
    // tests to see if an IllegalArgumetnException is thrown - dashes
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptione() {
        GeoCountDownTimer s = new GeoCountDownTimer("2-2-2015");
        

    }

    // tests to see if NumberFormatException is thrown - years too high
    @Test(expected = NumberFormatException.class)
    public void testConstructorException3() {
        GeoCountDownTimer s = new GeoCountDownTimer("2/29/50000000000");
        

    }

    // tests to see if NumberFormatException is thrown - month too high
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException4() {
        GeoCountDownTimer s = new GeoCountDownTimer("13/29/2016");
        

    }

    // tests to see if NumberFormatException is thrown - month too low
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException5() {
        GeoCountDownTimer s = new GeoCountDownTimer("0/29/2016");
        

    }
    // this tests to see if incremetn is working
    @Test
    public void testIncMethod() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(5, 10, 2015);
        s1.inc(365);
       
        assertTrue(s1.toDateString().equals("5/9/2016"));

        s1 = new GeoCountDownTimer(5, 10, 2016);

        for (int i = 0; i < 365; i++)
            s1.inc();
       
        assertTrue(s1.toDateString().equals("5/10/2017"));

        s1 = new GeoCountDownTimer(5, 10, 2016);
  
        for (int i = 0; i < 31665; i++)
            s1.inc();
      
        for (int i = 0; i < 31665; i++)
            s1.dec();

    }
    // This tests to see if decrement is working
    @Test
    public void testDecMethod() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(5, 10, 2016);
        s1.dec(365);
        assertTrue(s1.toDateString().equals("5/11/2015"));

        s1 = new GeoCountDownTimer(5, 10, 2016);

        for (int i = 0; i < 365; i++)
            s1.dec();
        System.out.println(s1);
        assertTrue(s1.toDateString().equals("5/11/2015"));

        s1 = new GeoCountDownTimer(5, 10, 2016);

        System.out.println("Start:" + s1);
        for (int i = 0; i < 31665; i++)
            s1.dec();
        System.out.println("Middle:" + s1);

        for (int i = 0; i < 31665; i++)
            s1.dec();
        System.out.println("End: " + s1);

    }

    // Test to make sure negative numbers can't be used
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor1() {
        new GeoCountDownTimer(2, -3, -3);
    }
    // Test to make sure no negatives or commas
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor2() {
        new GeoCountDownTimer("2,-3/-3");

    }
    
    // Test to make sure no negatives or illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor32() {
        new GeoCountDownTimer("2&-3$-3");

    }
    
    // Test to make sure no illegal characters can be used
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor30() {
        new GeoCountDownTimer("2,23/3000");

    }
    
 // Test to make sure no illegal characters can be used
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor33() {
        new GeoCountDownTimer("2/23*3000");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor34() {
        new GeoCountDownTimer("2$3&3*");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor35() {
        new GeoCountDownTimer("2/3^3000");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor36() {
        new GeoCountDownTimer("2/3%2015");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor37() {
        new GeoCountDownTimer("2/3/2015*");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor38() {
        new GeoCountDownTimer("2/3@3000");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor39() {
        new GeoCountDownTimer("2/3/3000#");

    }
    
 // Test to make sure no illegal characters
    @Test(expected = IllegalArgumentException.class)
    public void testContuctor40() {
        new GeoCountDownTimer("2/3/3000!");

    }
    // tests the equal method
    @Test
    public void testEqual() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(5, 9, 3000);
        GeoCountDownTimer s2 = new GeoCountDownTimer(6, 1, 2015);
        GeoCountDownTimer s3 = new GeoCountDownTimer(5, 5, 2015);
        GeoCountDownTimer s4 = new GeoCountDownTimer(5, 9, 3000);

        assertFalse(s1.equals(s2));
        assertTrue(s1.equals(s4));

    }
 // tests the equal method
    @Test
    public void testEqual2() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(12, 31, 5789);
        GeoCountDownTimer s2 = new GeoCountDownTimer(7, 23, 2885);
        GeoCountDownTimer s3 = new GeoCountDownTimer(8, 25, 2415);
        GeoCountDownTimer s4 = new GeoCountDownTimer(12, 31, 5789);

        assertFalse(s1.equals(s2));
        assertTrue(s1.equals(s4));
        

    }
    
 // tests the equal method
    @Test
    public void testEqual3() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(11, 20, 2789);
        GeoCountDownTimer s2 = new GeoCountDownTimer(4, 3, 2043);
        GeoCountDownTimer s3 = new GeoCountDownTimer(4, 3, 2043);
        GeoCountDownTimer s4 = new GeoCountDownTimer(11, 20, 2789);

        assertFalse(s1.equals(s2));
        assertTrue(s1.equals(s4));
        assertTrue(s3.equals(s2));

    }
    
    
    // tests the compare to method
    @Test
    public void testCompareTo() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(5, 9, 2015);
        GeoCountDownTimer s2 = new GeoCountDownTimer(6, 01, 2015);
        GeoCountDownTimer s3 = new GeoCountDownTimer(5, 8, 2015);
        GeoCountDownTimer s4 = new GeoCountDownTimer(5, 9, 2015);

        assertTrue(s2.compareTo(s1) > 0);
        assertTrue(s3.compareTo(s1) < 0);
        assertTrue(s1.compareTo(s4) == 0);

    }
    
 // tests the compare to method
    @Test
    public void testCompareTo2() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(7, 29, 2017);
        GeoCountDownTimer s2 = new GeoCountDownTimer(7, 29, 2015);
        GeoCountDownTimer s3 = new GeoCountDownTimer(6, 28, 2412);
        GeoCountDownTimer s4 = new GeoCountDownTimer(5, 9, 2015);

        assertTrue(s2.compareTo(s1) < 0);
        assertTrue(s3.compareTo(s1) > 0);
        assertTrue(s1.compareTo(s4) > 0);

    }
    
 // tests the compare to method
    @Test
    public void testCompareTo3() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(3,12, 2015);
        GeoCountDownTimer s2 = new GeoCountDownTimer(3, 11, 2015);
        GeoCountDownTimer s3 = new GeoCountDownTimer(2, 29, 2016);
        GeoCountDownTimer s4 = new GeoCountDownTimer(2, 29, 2016);

        assertTrue(s2.compareTo(s1) < 0);
        assertTrue(s3.compareTo(s1) > 0);
        assertTrue(s1.compareTo(s4) < 0);

    }
    // tests the load and save
    @Test
    public void testLoadSave() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(5, 9, 2015);
        GeoCountDownTimer s2 = new GeoCountDownTimer(5, 9, 2015);

        s1.save("file1");
        s1 = new GeoCountDownTimer(1, 1, 2014); // resets to zero
        s1.load("file1");
        assertTrue(s2.equals(s1));

    }
    
 // tests the load and save
    @Test
    public void testLoadSave2() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(1, 25, 4566);
        GeoCountDownTimer s2 = new GeoCountDownTimer(1, 25, 4566);

        s1.save("date");
        s1 = new GeoCountDownTimer(4, 12, 2016); // resets to zero
        s1.load("date");
        assertTrue(s2.equals(s1));

    }
    
 // tests the load and save
    @Test
    public void testLoadSave3() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(6, 12, 3000);
        GeoCountDownTimer s2 = new GeoCountDownTimer(6, 12, 3000);

        s1.save("Fraternity");
        s1 = new GeoCountDownTimer(4, 12, 2016); // resets to zero
        s1.load("Fraternity");
        assertTrue(s2.equals(s1));

    }
 // tests days from the dates given
    @Test
    public void testDaysToGo() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(2, 9, 2015);
        assertTrue(s1.daysToGo("2/1/2015") == 8);
        assertTrue(s1.daysToGo("2/8/2015") == 1);
        assertTrue(s1.daysToGo("2/9/2015") == 0);

        s1 = new GeoCountDownTimer(2, 9, 5015);
        System.out.println(s1.daysToGo("2/9/2015"));
    }
    // tests days from the dates given
    @Test
    public void testDaysToGo2() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(7, 29, 2015);
        assertTrue(s1.daysToGo("7/18/2015") == 11);
        assertTrue(s1.daysToGo("7/9/2015") == 20);
        assertTrue(s1.daysToGo("7/29/2015") == 0);

        s1 = new GeoCountDownTimer(7, 29, 5015);
        System.out.println(s1.daysToGo("7/29/2015"));
    }
    
 // tests days from the dates given
    @Test
    public void testDaysToGo3() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(1, 31, 2015);
        assertTrue(s1.daysToGo("1/18/2015") == 13);
        assertTrue(s1.daysToGo("1/9/2015") == 22);
        assertTrue(s1.daysToGo("1/31/2015") == 0);

        s1 = new GeoCountDownTimer(1, 1, 4515);
        System.out.println(s1.daysToGo("1/1/2015"));
    }
    
 // tests days from the dates given
    @Test
    public void testDaysToGo6() {
        GeoCountDownTimer s1 = new GeoCountDownTimer(6, 20, 2017);
        assertTrue(s1.daysToGo("1/18/2015") == 884);
        assertTrue(s1.daysToGo("1/9/2015") == 893);
        assertTrue(s1.daysToGo("1/31/2015") == 871);

       
    }
    
 // tests days from the dates given - date too low
    @Test (expected = IllegalArgumentException.class)
    public void testDaysToGo4() {
        GeoCountDownTimer s1 = new GeoCountDownTimer("9, 5, 2013");
        s1.daysToGo("9, 5, 2013");
    }
    
 // tests days from the dates given - date too high
    @Test (expected = IllegalArgumentException.class)
    public void testDaysToGo5() {
        GeoCountDownTimer s1 = new GeoCountDownTimer("9, 5, 500000000");
        s1.daysToGo("9, 5, 500000000");
    }

}