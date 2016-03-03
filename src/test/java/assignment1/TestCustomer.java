package assignment1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/03.
 */
public class TestCustomer
{
    Customer cust;

    @BeforeMethod
    public void setUp() throws Exception {
        cust = new Customer();
        cust.setName("Edmund");
        cust.setSurname("Simons");
    }

    @Test
    public void testCustomer() throws Exception {

        Assert.assertEquals("Edmund", cust.getName());
        Assert.assertEquals("Simons", cust.getSurname());
    }

    @AfterMethod
    public void tearDown() throws Exception {


    }
}
