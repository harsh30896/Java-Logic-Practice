package LogicalCoding;

public class SpecialPythagorasTriplet
{
    public static void main(String[] args) {
        int PERIMETER = 1000;

        for (int a = 1; a < PERIMETER; a++) {
            for (int b = a + 1; b < PERIMETER; b++) {
                int c = PERIMETER - a - b;
                if (a * a + b * b == c * c) {
                    // It is now implied that b < c, because we have a > 0
                    System.out.println(a+" "+b+" "

                            +c);
                    System.out.println(a*b*c);

                }
            }
        }
        }
    }

