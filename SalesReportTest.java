package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.mycompany.salesreport.SalesReport.Product;
import org.junit.jupiter.api.Test;

public class SalesReportTest {
    String[] names = {"COZY Nights Monarch mattress", "Restonic Barbabos Mattress", "Sealy Phuket Mattress"};
    int[][] sales = {{25, 18, 20}, {25, 10, 12}, {18, 15, 20}};
    
    @Test
    public void GetTotalProductSold_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(names, sales);
        assertEquals(153, product.GetTotalProductsSold());
    }
    
    @Test
    public void GetAverageProductSold_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(names, sales);
        assertEquals(17.0, product.GetAverageProductSold(),0.01);
    }
    
}
