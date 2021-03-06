import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ProductTest {

	@Test
	public void testSetProduct() {
		Product product1 = new Product();
		product1.setProduct("P001","iphoneSE",17500);
		assertEquals(product1.getProductId(),"P001");
		assertEquals(product1.getProductName(),"iphoneSE");
		assertEquals(product1.getProductPrice(),17500);
	}
	
	@Test(timeout=1000)
	public void testInsertProdeuct(){
		Product product2 = new Product();
		//product2.insertProduct("P004","Galaxy A",26000);
		assertEquals(product2.queryProductId("P004"),"P004");
		assertEquals(product2.queryProductName("P004"),"Note7");
		assertEquals(product2.queryProductPrice("P004"),29000);
	}

}
