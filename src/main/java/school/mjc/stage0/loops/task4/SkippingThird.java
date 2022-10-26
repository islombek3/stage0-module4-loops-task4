package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted > 0){
            int n = 1;
            System.out.println(n);
            do {
                n++;
                System.out.println(n);
                n += 2;
                System.out.println(n);
            }   while(n < lastPrinted);
        }
    }
}
