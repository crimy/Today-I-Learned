class Solution {
    public void reverseString(char[] s) {
        char[] temp = s.clone();
		for(int i = 0 ; i < s.length ; i++ ) {			
			s[i] = temp[s.length-i-1];		
		}
    }
}