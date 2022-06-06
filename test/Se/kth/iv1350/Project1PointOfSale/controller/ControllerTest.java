package Se.kth.iv1350.Project1PointOfSale.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Se.kth.iv1350.Project1PointOfSale.integration.*;
import Se.kth.iv1350.Project1PointOfSale.model.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ControllerTest {
    private ByteArrayOutputStream printout;
    private PrintStream original;
    private Controller instance;
    @BeforeEach
    void setUp() {
        original= System.out;
        printout = new ByteArrayOutputStream();
        instance = new Controller(new Creator(),
                new Printer(),new StorDTO());
        instance.startNewSale();
    }

    @AfterEach
    void tearDown() {
        instance = null;
        printout = null;
        System.setOut(original);
    }

    @Test
    public void testStartSale() {
        instance.startNewSale();
    }

    @Test
    public void testScanItemIsTrue() {
        String itemId = "Chips";
        int quantity = 1;
        String actualResult = instance.scanItem(itemId, quantity);
        String expResult = itemId + quantity;
        assertFalse(actualResult.contains(expResult));
    }

    @Test
    public void testScanItemIsNotExist() {
        String itemId = "Popcorn";
        int quantity = 2;
        String actual = instance.scanItem(itemId, quantity);
        String expected = itemId + quantity;
        assertFalse(actual.contains(expected));
    }
}