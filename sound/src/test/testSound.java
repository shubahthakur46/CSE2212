package test;

import main.Sound;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSound {

	@Test
	void test() {
		
		Sound sound = new Sound();
		float x = sound.calculate();
		assertEquals(x, 7920);
	}

}
