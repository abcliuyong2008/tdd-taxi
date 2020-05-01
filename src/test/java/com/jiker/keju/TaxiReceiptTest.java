package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TaxiReceiptTest {

    @Test
    public void test_translateToTrip() throws Exception {
        assertEquals(new TaxiReceipt().translateToTrip("testData.txt"), "收费6元\n" +
                "收费7元\n" +
                "收费13元\n" +
                "收费7元\n");
    }

    @Test
    public void test_calculatePrice() {
        assertEquals(new TaxiReceipt().calculatePrice(new Trip().initTrip("1公里,等待0分钟")), 6);
        assertEquals(new TaxiReceipt().calculatePrice(new Trip().initTrip("3公里,等待0分钟")), 7);
        assertEquals(new TaxiReceipt().calculatePrice(new Trip().initTrip("10公里,等待0分钟")), 13);
        assertEquals(new TaxiReceipt().calculatePrice(new Trip().initTrip("2公里,等待3分钟")), 7);
    }
}