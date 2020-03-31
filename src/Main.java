public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 0;
        int b = 5;
        int Summa1, Summa2;
        int number_of_array = 5;
        int[] array1,array2;
        array1 = new int[number_of_array];
        array2 = new int[number_of_array];
        for(int i = 0; i < number_of_array; i++){
            array1[i] = a + (int)(Math.random()*b);
            array2[i] = a + (int)(Math.random()*b);
        }
        Print_masive(array1,number_of_array);
        Summa1 = Sum_masive(array1,number_of_array);
        Print_masive(array2, number_of_array);
        Summa2 = Sum_masive(array2,number_of_array);
        if (Summa1 < Summa2){
            System.out.println("The sum of array 2 is greater than array 1 ---->" + Summa2 + " > " + Summa1);
        }else if (Summa1 > Summa2){
            System.out.println("The sum of array 1 is greater than array 2 ---->" + Summa1 + " > " + Summa2);
        }else{
            System.out.println("The sum of array 1 is the same with the sum of array 2 ---->" + Summa1 + " = " + Summa2);
        }


    }
    public static void Print_masive(int[] array, int number_of_array){
        for (int i = 0;i < number_of_array; i++){
            System.out.print(array[i]);
        }
    }
    public static int Sum_masive(int[] array, int number_of_array){
        int result=0;
        for (int i = 0;i < number_of_array; i++){
            result = result + array[i];
        }
        System.out.println("    sum the number of array " + result);
        return result;
    }

}
