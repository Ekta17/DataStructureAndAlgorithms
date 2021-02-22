package systemdesign.randomnumber;

import java.util.Random;

public class GenerateRandomNumberInRanger {

	public static int getRandomNumber(int min, int max){
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	public static void main(String[] args) {
		for(int i = 0; i< 10; i++){
			System.out.println(getRandomNumber(0, 9));
		}
	}
}
