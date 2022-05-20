package com.trial;
import org.testng.annotations.Test;

public class parallel01 {
	@Test
	private void tc10() {
		System.out.println("TC10 "+Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
		System.out.println("TC11 "+Thread.currentThread().getId());
	}
	@Test
	private void tc12() {
		System.out.println("TC12 "+Thread.currentThread().getId());
	}
	@Test
	private void tc13() {
		System.out.println("TC13 "+Thread.currentThread().getId());
	}
}
