package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 7};
        for (int a = 0; a != array.length; a++)
            System.out.println(array[a]);
        System.out.println("------------------------------------------");

        int Summa = 0;
        for (int x = 0; x != array.length; x++)
            Summa += array[x];
        System.out.println("Summa: " + Summa);

        float Average = Summa / array.length;
        System.out.println("Average: " + Average);
        System.out.println("-------------------------------------------");

        int[][] array2 = new int[][]{
                {0, 5, 7, 4, 6},
                {6, 4, 6, 2, 1}
        };
        int count1 = 0;
        for (int z = 0; z != array2.length; z++)
            for (int v = 0; v != array2[z].length; v++)
                if (array2[z][v] % 2 == 0) {
                    count1++;

                }
        System.out.println("%2==0: " + count1);


        int count2 = 0;
        for (int z = 0; z != array2.length; z++)
            for (int v = 0; v != array2[z].length; v++)
                if (array2[z][v] % 2 != 0) {
                    count2++;

                }
        System.out.println("%2!=0: " + count2);

        System.out.println("------------------------------------------------------");

        String[] namesArray = new String[]{"Vasily", "Maxim", "Mihail", "Gherman", "Pedro"};
        for (int index = 0; index != namesArray.length; index++) {
            System.out.println(namesArray[index]);
        }
        System.out.println("------------------------------------------------------");
    }
}
