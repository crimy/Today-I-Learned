class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size = 0;
		int[] result;
		List<Integer> list = new ArrayList<Integer>();
		for( int i = 0 ; i < nums1.length ; i++ ) {
			for( int j = 0 ; j < nums2.length ; j++ ) {
				if( nums1[i] != -1 && nums1[i] == nums2[j] ) {
					size++;
					list.add( nums1[i] );
					nums1[i] = nums2[j] = -1;
					
				}
			}
		}
		result = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			result[i] = list.get(i);
		}
		return result;
    }
}