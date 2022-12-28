import java.util.Random;

public class Game implements lotto {
    private final int[] winnerNums;
    int number;

    public Game() {
        this.winnerNums = new int[5];
        number=generateRandomNumber();
        lottery();
    }

    public void lottery(){
        for( int i = 0;i<5;i++){

            while (isInArray(winnerNums, number)){
                number=generateRandomNumber();

            }
            winnerNums[i]=number;
        }
    for(int num:winnerNums)
        System.out.println(num);
    }


    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(91);
    }

    public boolean isInArray(int[] winnerNums, int number) {
        for (int num : winnerNums) {
            if (num == number)
                return true;

        }
        return false;
    }

}
