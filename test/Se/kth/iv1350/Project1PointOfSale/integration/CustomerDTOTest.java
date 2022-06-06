package Se.kth.iv1350.Project1PointOfSale.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerDTOTest {
    private CustomerDTO instance;
    private String customerID;
    @BeforeEach
    public void setUp() {
        instance = new CustomerDTO();
    }
    @AfterEach
    public void tearDown(){
        instance = null;
    }
    @Test
    public void testRegisterCustomer() {
        customerID = "2";
        String expected = customerID;
        String actual = instance.registerCustomer(customerID).getCustomerID();
        assertEquals(expected, actual);
    }


    @Test
    public void testRegisterCustomerISWrong() {
        customerID = "5";
        CustomerDTO expected = null;
        CustomerDTO actual = instance.registerCustomer(customerID);
        assertEquals(expected, actual);
    }



}