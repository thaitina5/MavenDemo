import static org.junit.Assert.*;

import org.junit.Test;

import model.MayTinh;

public class TestMayTinh {

	@Test
	public void testCong() {
		assertEquals(15, MayTinh.cong(10, 5), 0.01);
	}
	
	@Test
	public void testTru() {
		assertEquals(10, MayTinh.tru(15, 5), 0.01);
	}

}
