package javaCC.Assignment_1;
class Q6_inft221101072{
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println('a' + "\t" + 'b' + "\t" + "pow(a, b)");

        for(int i = 1;  i <= 5 ; i++ ) {
            
            int power = (int)  Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + power);
            a++;
            b++;

        }
    }
}