package com.trial;
import org.testng.annotations.Test;

public class parallel00 {
	@Test
	private void tc00() {
		System.out.println("TC00 "+Thread.currentThread().getId());

	}
	@Test
	private void tc01() {
		System.out.println("TC01 "+Thread.currentThread().getId());

	}
	@Test
	private void tc02() {
		System.out.println("TC02 "+Thread.currentThread().getId());

	}
	@Test
	private void tc03() {
		System.out.println("TC03 "+Thread.currentThread().getId());

	}
}
