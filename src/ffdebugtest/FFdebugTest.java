package ffdebugtest;
import static ffdebugtest.FFdebugCalc.findMin;
import java.util.Scanner;

public class FFdebugTest
        //claire = caca
{
    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    public FFdebugTest(int[] par)
    {
        myArray = par;
    }
    
    public static void main(String[] args)
    {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.print(FFdebugCalc.findMin(debug.myArray));

        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.findMax(debug.myArray));
        
    }

    public static void getValue(int[] array)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
}
