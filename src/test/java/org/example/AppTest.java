package org.example;


import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test(priority = 1)
    void openBrowser(){
        System.out.println("openBrowser");
    }
    @Test(priority = 2)
    void clickUMS(){
        System.out.println("clickUMS");
    }
    @Test(priority = 3)
    void openHomePage(){
        System.out.println("openHomePage");
    }
    @Test(priority = 4,enabled = false)
    void closeUMS(){
        System.out.println("closeUMS");
    }
    @Test(priority = 5)
    void closeBrowser(){
        System.out.println("closeBrowser");
    }

}
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//   // public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    //public static Test suite()
//    {
//       // return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
