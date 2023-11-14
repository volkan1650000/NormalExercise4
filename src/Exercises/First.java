package Exercises;

//A method to print the pattern of a butterfly with the length in its body being the size;

public class First {
    public static void main(String[] args) {
        butterfly(21);
    }
    public static void butterfly(int length){
        if(length%2==0){
            System.out.println("Butterfly length can not be even, since the butterfly would not have a body");
        }else{
            int width = length+1;
            int mid = width/2;
            int x;
            int y;

            for(int i = 1; i<=length; i++){
                x = Math.abs(mid-i)*2;
                y = (width-x)/2;
                for(int j = 0; j<y; j++){
                    System.out.print("* ");
                }
                for(int j = 0; j<x; j++){
                    System.out.print("  ");
                }
                for(int j = 0; j<y; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
