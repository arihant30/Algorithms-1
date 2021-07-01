class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        long mul=1;
        for(long nums: arr){
            mul=(mul*nums)%mod;
        }
        return mul;
    }
}
