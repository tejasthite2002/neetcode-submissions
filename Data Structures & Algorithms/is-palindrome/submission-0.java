class Solution {
    public boolean isPalindrome(String s) {
        String ss=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int l=0,r=ss.length()-1;
        System.out.println(ss);
        while(l<r){
            if(ss.charAt(l)!=ss.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
