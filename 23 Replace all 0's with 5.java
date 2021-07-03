class GfG {
    int convertfive(int num) {
        int temp=num;
        int nums;
        int total=0;
        int power=1;
        while(temp>0){
            nums=temp%10;
            if(nums==0){
                total=total+5*power;
            }
            else{
                total=total+nums*power;
            }
            power*=10;
            temp/=10;
        }
        return total;
    }
}
