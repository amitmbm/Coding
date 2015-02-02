

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGAnnotations {
    
	@Test
	public static void main(){
		TestNGAnnotations testNGAnnotations = new TestNGAnnotations();
		Assert.assertNotNull(testNGAnnotations, "i am  testing this feature");
	}

	
}
