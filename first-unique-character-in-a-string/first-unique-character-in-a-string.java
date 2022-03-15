class Solution {
    public int firstUniqChar(String s) {
        String[] array = new String[s.length()];
		int v = Integer.MAX_VALUE;
        if( s.length() == 1 ) return 0; 
		for( int i = 0 ; i < s.length() ; i++ ) {
			array[i] = Character.toString(s.charAt(i));			
		}		
		Arrays.sort(array);
		if( !array[0].equals(array[1]) ) {
			v = s.indexOf( array[0] );
			System.out.println("0 , " +v);
		}
		for( int i = 1; i < array.length-1 ; i++ ) {
			if( !array[i].equals(array[i-1]) && !array[i].equals(array[i+1]) ) {
				if( s.indexOf(array[i]) < v ) {
					v = s.indexOf(array[i]);
					System.out.println(i+" , " +v);
				}				
			}
		}
		
		if( !array[array.length-2].equals(array[array.length-1]) ) {
			if( s.indexOf(array[array.length-1]) < v ) {
				v = s.indexOf(array[array.length-1]);
			}
		}
		if( v == Integer.MAX_VALUE ) return -1;	
		return v;
    }
}