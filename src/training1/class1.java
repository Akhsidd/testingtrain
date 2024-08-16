package training1;

public class class1 {

    public static void main(String[] args) {
        //----------PRIMITIVE TYPES-----------------
        int a = 992;
        char c = 'x';
        double b = 1450.00;
        float d = 5.55f;
        long e = 100000L;
        short f = 656;
        byte g = 12;
        
        //---------------------ARRAY ---------------
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Array values: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        //-----------------------STRING-------------
        String str = "Learning";
        System.out.print("String: ");
        for (int i = 0; i < str.length(); i++) 
        { 
            System.out.print(str.charAt(i));
        }
        System.out.println("\n");
        //-----------------------------------------
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);
        System.out.println("char value: " + c);
        System.out.println("float value: " + d);
        System.out.println("long value: " + e);
        System.out.println("short value: " + f);
        System.out.println("byte value: " + g);
       
       
    }
}
