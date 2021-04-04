import java.util.ArrayList;
import java.util.Random;

public class RandomNums {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        ArrayList<Integer> randomArray = new ArrayList<>();

        boolean repeat = true;
        for (int i = 0; i < 4; i++) {
            int randomVal = random.nextInt((10 - 1) + 1) + 1;
            for (int j = 0; j < randomArray.size(); j++) {
                while(repeat) {
                    if (randomVal == randomArray.get(i)) {
                        randomVal = random.nextInt((10 - 1) + 1) + 1;
                    } else {
                        randomArray.add(randomVal);
                        repeat = false;
                        break;
                    }
                }
                repeat = true;
            }
            //System.out.println(randomVal);
        }

        for (int i = 0; i < randomArray.size(); i++) {
            System.out.println(randomArray.get(i));
        }
    }
}
