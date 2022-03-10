class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
		for( int i = 0 ; i < nums.length ; i++ ) {
        	temp[i] = nums[i];
        }
		if( nums.length == k || nums.length == 1) return;

		
		for( int i = 0 ; i < nums.length ; i++ ) {
			int d = ( (k-i) % temp.length ); // 3%7 2%7
        	if( i-k < 0 ) {
        		nums[i] = temp[(temp.length-d)%temp.length];
        	} else {
        		nums[i] = temp[i-k];

        	}
        	       	
        }
    }
}