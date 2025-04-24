import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCase {
	main main=new main();
	int[] x= {1,2,3,4,10,7,4};
	@Test
	void test_cast() {
		Assert.assertEquals(10, main.CastToInt(10.5));
	}
	@Test
	void test_circu() {
		Assert.assertEquals(20*Math.PI, main.circlePerimeter(20));
	}
	@Test
	void test_area() {
		Assert.assertEquals(100*Math.PI, main.circlePerimeter(20));
	}
	@Test
	void test_findMax() {
		Assert.assertEquals(10, main.findMax(x));
	}

}
