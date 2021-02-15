package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArrayTest {

	MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();

	@Test
	public void testMergeTwoSortedArray_1(){
		int nums1[] = {1,2,5,0,0,0};
		int nums2[] = {1,2,3};

		mergeTwoSortedArray.merge(nums1, 3, nums2, nums2.length);
		assertArrayEquals(new int[]{1,1,2,2,3,5}, nums1);
	}

	@Test
	public void testMergeTwoSortedArray_2(){
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {1,2,5};

		mergeTwoSortedArray.merge(nums1, 3, nums2, nums2.length);
		assertArrayEquals(new int[]{1,1,2,2,3,5}, nums1);
	}

	@Test
	public void testMergeTwoSortedArray_3(){
		int nums1[] = {0,3,4,0,0,0};
		int nums2[] = {1,2,5};

		mergeTwoSortedArray.merge(nums1, 3, nums2, nums2.length);
		assertArrayEquals(new int[]{0,1,2,3,4,5}, nums1);
	}

	@Test
	public void testMergeTwoSortedArray_4(){
		int nums1[] = {0};
		int nums2[] = {1};

		mergeTwoSortedArray.merge(nums1, 0, nums2, nums2.length);
		assertArrayEquals(new int[]{1}, nums1);
	}

	@Test
	public void testMergeTwoSortedArray_5(){
		int nums1[] = {2,0};
		int nums2[] = {1};

		mergeTwoSortedArray.merge(nums1, 1, nums2, nums2.length);
		assertArrayEquals(new int[]{1,2}, nums1);
	}

}