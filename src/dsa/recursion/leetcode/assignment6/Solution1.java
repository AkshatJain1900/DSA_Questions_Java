package dsa.recursion.leetcode.assignment6;

public class Solution1 {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        
        if(n == 0 || n == -1){
            return false;
        }
        
        if(n%3 != 0){
            return false;
        }
        
        return isPowerOfThree(n/3);
    }
}
