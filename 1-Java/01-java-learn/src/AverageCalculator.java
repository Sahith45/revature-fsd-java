
public class AverageCalculator {

	public static void main(String[] args) {
		//int scores[] = {23 ,43, 54,34,12};
		int scores[]=new int[4];
		scores[0] = 23;
		scores[1] = 34;
		scores[2] = 44;
		scores[3] = 45;
          float average = (scores[0] + scores[1] + scores[2] + scores[3]) /4.0f;
        // float average = (scores[0] + scores[1] + scores[2] + scores[3]) / (float) scores.length;
         System.out.println("average " + average );
	}

}
