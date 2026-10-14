class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        int n=sum;
        if( sum>9*num)return sb.toString();
        while(num>0){
            if(n>=9){
                sb.append(9);
                n-=9;
                num--;
            }
            else{
                sb.append(n);
                n=0;
                num--;
            while(num>0){sb.append(0);
             num--;} }
        }
        return sb.toString();
    }
}