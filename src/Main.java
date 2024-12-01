import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1) Создайте массив из 10 целых чисел и заполните его числами от 1 до 10. Выведите массив на экран.
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + "  ");
        }

        System.out.println();
        //2) Найдите сумму элементов массива. Создайте массив из 5 элементов и вычислите сумму всех чисел в массиве.

        int[] arr = new int[]{22, 33, 44, 5, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Summa = " + sum);
        System.out.println();
        //3) Найдите максимальный элемент массива. Создайте массив из 10 целых чисел и найдите максимальное значение.

        int[] arr2 = new int[]{22, 66, 16, 21, 39, 1, 32, 41, 9, 17,99};

        int max = 1;
        for (int i = 0; i < arr2.length; i++) {

            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.print("Max :" + max);
        System.out.println();


        //4) Найдите минимальный элемент массива. Создайте массив из 10 целых чисел и найдите минимальное значение.
        //5) Посчитайте количество чётных чисел в массиве.
        int[] arr3 = new int[]{10, 20, 30, 40, 50,77,13,66,42};
        int count = 0;//chetchik cetn.cisel
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] % 2 == 0) {
                count++;
            }

        }


        System.out.print("Average: "+count);

        System.out.println();
//6) Посчитайте количество нечётных чисел в массиве.
int[] arr4 = new int[]{10, 20, 30, 40, 50,77,13,66,42};
int count1 = 0;//chetchik necetn.cisel
        for (int i = 0; i < arr4.length; i++) {

        if (arr4[i] % 2 != 0) {
count1++;
        }

        }

        System.out.print("the numbers of odd numbers : "+count1);


System.out.println();

//7) Посчитайте среднее арифметическое всех элементов массива.

        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        int sum1 = 0;
        for (int i2 = 0; i2 < arr1.length; i2++) {
           sum1 = sum1 + arr1[i2];
        }
        System.out.print("Average: " + (sum1 / arr1.length));

        System.out.println();


        //8) Выведите все элементы массива в обратном порядке.
         int[] nums1 = new int[10];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = 10-i ;
            System.out.print(nums1[i] + "  ");
        }

        //9) Заполните массив случайными числами от 1 до 100 и выведите его на экран.
       int[] arr5 = new int[100];
        Random random=new Random();
        for(int i=0; i<arr5.length;i++){
            arr5[i]=random.nextInt(100)+1;
            System.out.print(arr5[i] +" ");
        }
        System.out.println();
        //10)Поменяйте местами первый и последний элементы массива.

        int[]arr6={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int tmp = arr6[0];
        arr6[0]= arr6[arr6.length-1];
        arr6[arr6.length-1]=tmp;

           for (int i=0;i<arr6.length;i++){
            System.out.print(arr6[i] +" ");
        }

    System.out.println();
        //11)Найдите разницу между максимальным и минимальным элементами массива.
        int[]arr7={1,22,33,4,5,6,75,8,9,10,11,12,13,14,15};
        int max1=arr7[0];
        int min =arr7[0];
        for (int i=0; i < arr7.length;i++){
            System.out.print(arr7[i] + " ");
            if (max1 < arr7[i]) {
                max1 = arr7[i];}
            if (min > arr7[i]) {
                min = arr7[i];} }
        System.out.println();
            System.out.println("Max"+max1);
            System.out.println("Min"+min);
            int razn1 =max1-min;
            System.out.println("Raznica"+razn1);


        //12)Посчитайте количество элементов, больше среднего арифметического.
        int[] arr8 = new int[]{10, 20, 30, 40, 50};
        int sum3 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum3 = sum3 + arr8[i];
        }
        double average =(double) sum3/arr8.length;
        int count2 =0;
        for (int i=0;i<arr8.length;i++){
            if (arr8[i]>average){
                count2++;
            }
        }
        System.out.print("Average: " + average);
        System.out.println();
        System.out.print("Count of elements"+count2);

System.out.println();
        //13)Создайте массив и заполните его квадратами чисел от 1 до 10.
        int[]arr9={1,2,3,4,5,6,7,8,9,10,};
        for (int i = 0; i < arr9.length; i++) {
            arr9[i]  = arr9[i]*arr9[i];
            System.out.print(arr9[i] +" ,");}




    }}