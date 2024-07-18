public class Conditions {

    public static void main(Strings[] args) {
        int testScore = 0;

        if (testScore >= 50){
            System.out.println("Well done -  you passed");
        }

        if (testScore < 50){
            System.out.println("Sorry -  you failed");
        }

        switch (testScore) {
            case 0:
                System.out.println("Sorry -  you failed");
                break;
            case 100:
                System.out.println("Well done -  you passed");
                break;
            default:
                System.out.println("No test score provided!");
                break;
        }
    }
}
