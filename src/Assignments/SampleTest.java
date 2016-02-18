package Assignments; 

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
   @Test
   public void testPrintMessage() {
      Assert.assertEquals("Hello World", "Hello World");
   }
}