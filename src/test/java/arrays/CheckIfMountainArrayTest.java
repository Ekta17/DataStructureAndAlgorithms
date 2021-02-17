package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfMountainArrayTest {

	CheckIfMountainArray validMountainArray = new CheckIfMountainArray();

	@Test
	public void testValidMountainArray_1(){
		int[] arr = {2,1};
		assertFalse(validMountainArray.validMountainArray(arr));
	}

	@Test
	public void testValidMountainArray_2(){
		int[] arr = {3,5,5};
		assertFalse(validMountainArray.validMountainArray(arr));
	}

	@Test
	public void testValidMountainArray_3(){
		int[] arr = {0,3,2,1};
		assertTrue(validMountainArray.validMountainArray(arr));
	}

	@Test
	public void testValidMountainArray_4(){
		int[] arr = {4,3,2,1};
		assertFalse(validMountainArray.validMountainArray(arr));
	}

	@Test
	public void testValidMountainArray_5(){
		int[] arr = {1,2,3,4};
		assertFalse(validMountainArray.validMountainArray(arr));
	}

}