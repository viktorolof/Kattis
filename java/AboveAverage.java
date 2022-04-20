import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.format;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDatasets = scanner.nextInt();

        for(int i = 0; i < numberOfDatasets; i++){

            /*The number of poeople in this class*/
            int numOfPeopleInClass = scanner.nextInt();
            float numOfAboveAverageScores = 0;

            /*Store the scores read so we can calc the num of above average scores later*/
            ArrayList<Float> scores = new ArrayList<>(numOfPeopleInClass);

            float total = 0;
            float average;

            /*Sum up scores and add them to the scores list*/
            for(int j = 0; j < numOfPeopleInClass; j++){
                float score = 0;

                if(scanner.hasNextInt()){
                    score = scanner.nextInt();
                }

                total += score;
                scores.add(score);
            }

            /*Calc average score*/
            average = total / numOfPeopleInClass;

            /*Calc percentage of scores in score list that are above average*/
            for(float s : scores){
                if(s > average){
                    numOfAboveAverageScores += 1;
                }
            }

            String res = format("%.3f", (numOfAboveAverageScores / numOfPeopleInClass) * 100);
            res = res.concat("%");

            System.out.println(res);
        }
        scanner.close();
    }
}
