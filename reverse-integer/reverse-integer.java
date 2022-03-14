class Solution {
    public int reverse(int x) {
        int flag = 0;
		if( x < 0 ) {
			x *= -1;
			flag = -1;
		}
        if( x > Integer.MAX_VALUE || x < Integer.MIN_VALUE ) return 0;
		int digit = (int) Math.log10(x);
		int digit2 = 0;
		int answer = 0;
		while( x != 0 ){
			answer += (int)( x / Math.pow(10, digit) ) * Math.pow(10, digit2);
			x -= ((int)( x / Math.pow(10, digit)) ) * Math.pow(10, digit);
			digit--;
			digit2++;
            if( answer >= Integer.MAX_VALUE || answer <= Integer.MIN_VALUE ) return 0;
		}
		if( flag == -1 ) answer *= -1;
		return answer;
    }
}