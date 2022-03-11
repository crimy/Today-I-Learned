class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
		if(digits.length == 1) {
			if( digits[0] == 10 ) {
				int[] digits_new = {1,0};
				return digits_new;
			} else {
				return digits;
			}
		}
		else {
			for( int i = digits.length-1 ; i > 0 ; i-- ) {
				if( digits[i] == 10 ) {
					digits[i] = 0; 
					digits[i-1]++;
				}
			}
			if( digits[0] == 10 ) {
				int[] digits_new = new int[digits.length+1];
			
				digits_new[0] = 1; 
				digits_new[1] = 0;
				for( int i = 2 ; i < digits_new.length ; i++ ) {
					digits_new[i] = digits[i-1];
				}
				return digits_new;
			}
			else return digits;
		}
    }
}