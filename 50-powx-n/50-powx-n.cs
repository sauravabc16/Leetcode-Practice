public class Solution {
    public double MyPow1(double N, int R) {
        if(N==0) return 0;
        if(R==0) return 1;
        
        double s=MyPow1(N,R/2);
        double even = (s*s)%1000000007;
        
        
        if(R%2 == 0) return even;
        else return (N*even) %1000000007;
    }
    public double MyPow(double N, int R){
        if(R<0){
            return 1/MyPow1(N,R);
        } 
        else return MyPow1(N,R);
    }
}