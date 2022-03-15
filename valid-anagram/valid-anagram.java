class Solution {
    public boolean isAnagram(String s, String t) {
        String[] array1 = new String[s.length()];
		String[] array2 = new String[t.length()];
		if( s.length() != t.length() ) return false;
        
		for( int i = 0 ; i < s.length(); i++ ) {
			array1[i] = Character.toString(s.charAt(i));
			array2[i] = Character.toString(t.charAt(i));
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		for( int i = 0 ; i < s.length(); i++ ) {
			if( !array1[i].equals( array2[i] ) ) return false;
		}
		return true;
    }
}