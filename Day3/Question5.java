public class Question5 {
    public static void main(String[] args) {
        for (int i = 1; i <=30; i++) {
            if(i==1) {
                System.out.println(i + " is not a prime ");
                continue;
            }
           else if(i==2) {
                System.out.println(i + " is  a prime ");
                continue;
            }

            int count=0;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0)count++;

                if (count>0){
                    System.out.println(i+" is not a prime");
                    break;
                }

            }
            if(count==0)System.out.println(i + " is  a prime ");
        }
    }
}
