public class Question4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 1, 2, 1, 3, 5, 4, 9};
        int num = 2;


        int occ =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== num)occ++;
            if(occ==2){
                System.out.println("the occurence of "+num+" at second time is at " + (i+1) +" position");
                return;
            }
        }
        if(occ<2){
            System.out.println("number not occured two times");
        }
    }
}
