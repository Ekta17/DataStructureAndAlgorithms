package arrays;

import java.util.ArrayList;

public class UnionAndIntersection {

	/**
	 * Given two sorted arrays find the union and intersection of the arrays
	 * We can achieve this using merge step of MergeSort
	 * <p>
	 * Time complexity: O(n), where n is the size of larger array
	 */

	public int[][] findUnionAndIntersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> union = new ArrayList<>();
		ArrayList<Integer> intersection = new ArrayList<>();

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j])
				union.add(nums1[i++]);
			else if (nums1[i] > nums2[j])
				union.add(nums2[j++]);
			else { //add in intersection and union
				intersection.add(nums1[i++]);
				union.add(nums2[j++]);
			}
		}

		while (i < nums1.length)
			union.add(nums1[i++]);

		while (j < nums2.length)
			union.add(nums2[j++]);

		System.out.println("Union array =" + union);
		System.out.println("Intersection array=" + intersection);

		int[][] result = new int[2][];
		result[0] = union.stream().mapToInt(x -> x).toArray();
		result[1] = intersection.stream().mapToInt(x -> x).toArray();

		return result;
	}


}
