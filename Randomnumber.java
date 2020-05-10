public class Randomnumber {
    public static void main(String[] arg) {
        int[] lottery = new int[6];
        int randomNum;
        c1:
            for (int i = 0; i < 6; i++) {
                randomNum = (int) (Math.random() * 50); // Random number created here.
                if(randomNum == 0) {
                    continue c1;
                }   
                for (int x = 0; x < i; x++) {
                    if (lottery[x] == randomNum ) //  code checks if same random number generated before.
                    {
                        randomNum = (int) (Math.random() * 50);// If random number is same, another number generated.
                        x = -1; // restart the loop
                    }
    
                }
                lottery[i] = randomNum;
            }
    
        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");
    
    }
}