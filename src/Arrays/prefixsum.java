package Arrays;

public class prefixsum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[]prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(prefix[i]+" ");
            //-------------------------------------------------------------------------------------------------------
            int L=1;
            int R=3;
            int sum;
            if(L==0){
                sum=prefix[R];
            }
            else{
                sum=prefix[R] - prefix[L-1];
            }
            System.out.println("sum of range from index 1 to 3 is:"+sum);
        }

    }

}
