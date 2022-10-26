package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow)
            System.out.println("number to skip is bugger then the last");
        else if (lastInRow < 0)
            System.out.println("last number in row is negative");
        else {
            int countedSum = 0, skippedSum = 0;
            for (int i = 0; i <= lastInRow; i++){
                countedSum += i;
                if (i == numberToSkip)
                    skippedSum = countedSum;
            }
            countedSum -= skippedSum;
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
