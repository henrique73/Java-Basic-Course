public class ifElse {
    public static void main (String [] args){
        int age = 1;

        while(age<25) {
            if (age > 16) {
                System.out.println("Age is greater than 16");
            } else {
                System.out.println("Age is not greater than 16");
            }
            age++;
        }
    }
}
