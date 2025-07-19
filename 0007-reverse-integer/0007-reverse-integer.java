class Solution {
    public int reverse(int x) {
        
        int rev=0;
        int temp=x;
        while(x!=0){
            int rem=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Positive overflow
}
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                    return 0; // Negative overflow
}

            rev=rev*10+rem;
            x/=10;
        }
        return rev;
    }
}