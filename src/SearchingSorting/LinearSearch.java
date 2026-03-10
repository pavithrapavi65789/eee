package SearchingSorting;

public class LinearSearch {
    static int LinearSearch(int key,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main() {
        int[] arr={10,20,30,40,50};
        int key=60;
        int result=LinearSearch(key, arr);
        if (result !=-1){
            System.out.println("found the element at:"+result);
        }
        else{
            System.out.println("element not found!");

        }

    }
}
