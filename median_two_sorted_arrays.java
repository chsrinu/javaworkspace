public class MyClass {
    public static void main(String args[]) {
        int[] ar1 = new int[]{5,6,7,8};
        int[] ar2 = new int[]{11,12};
        int[] min_arr = ar1.length<ar2.length?ar1:ar2;
        int[] max_arr = ar1.length>ar2.length?ar1:ar2;
        int low=0, high=min_arr.length;
        int x=min_arr.length,y=max_arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            int mid2=((x+y+1)/2)-mid;
            
            int min_low = mid-1>=0?min_arr[mid-1]:Integer.MIN_VALUE;
            int min_high= mid<min_arr.length?min_arr[mid]:Integer.MAX_VALUE;
            
            int max_low=mid2-1>=0?max_arr[mid2-1]:Integer.MIN_VALUE;
            int max_high = mid2<max_arr.length?max_arr[mid2]:Integer.MAX_VALUE;
            
            if(min_low<=max_high && max_low<=min_high){
                if((x+y)%2==0)
                    System.out.println((Math.max(min_low,max_low)+Math.min(min_high,max_high))/2f);
                else
                    System.out.println(Math.max(min_low,max_low));
                break;
            }else if(min_low>max_high){
                high=mid-1;
            }else
                low=mid+1;
        }
    }
}