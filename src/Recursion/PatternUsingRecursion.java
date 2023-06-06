package Recursion;

public class PatternUsingRecursion
{
    public static void main(String[] args) {
        triagle(4,0);
    }
    static void triagle(int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triagle(r,c+1);
        }else{
            System.out.println();
            triagle(r-1,0);
        }
    }
}
