package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.mycompany.productapp.ProductApp.ProductCalculations;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500);
        // 15% of 3500 = 525
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500);
        // 3500 + 525 + 175 = 4200
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
}