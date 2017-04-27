public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        int z;
        z = mult(x,y);
        System.out.println(z);
    }


    public static int mult(int x, int y)
    {
        if (y == 1)
        {
            return x;
        }
        else
        {
            return x + mult(x,y-1);
        }
    }
}
