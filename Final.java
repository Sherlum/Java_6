import java.util.HashSet;
//package Sem6;

public class Final {
    /**
     * @param args
     */

public static void main(String[] args) {
    int[] array = new int[1000]; // массив из 1000 элементов
    HashSet<Integer> myHashSet = new HashSet<Integer>();


    for (int i = 0; i < array.length; i++){
        array[i]=((int)(Math.random()*25)); // случайные числа от 0 до 24
        //System.out.print(array[i]);
        }

        for (int i : array){
        myHashSet.add(i); // передача массива
        }
        
        for (int i : myHashSet){
            System.out.println(i);
        }
    
        double percent;
        percent = myHashSet.size()*100/array.length; // вычисление процента уникальных чисел
        System.out.println(); //пустая строка для разделения 
        System.out.println(percent); // вывод процента уникальных чисел   
    }
}