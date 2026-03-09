package Arrays;

public class arrydemo3 {
    public static void main(String[] args) {
        int []arr={654,755,543,987,7654,765};
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                    max=arr[i];
                }
            }
        System.out.println(max);
    }
}
