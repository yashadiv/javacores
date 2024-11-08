import java.util.ArrayList;
import java.util.Arrays;

import JavaCode.JavaCollection.Task1.TaskFilter;
import JavaCode.JavaCollection.Task2.CountElements;
import JavaCode.JavaCore.Task1.MyStringBuilder;

public class Main {
    public static void main(String[] args){
        //Java Core Task
        System.out.println("Java Core");
        System.out.println("Task 1:");
        MyStringBuilder my = new MyStringBuilder();
        my.append("awe");
        my.append("31");
        System.out.println(my.getStr());
        my.undo();
        System.out.println(my.getStr());

        System.out.println("");

        //Java Collection
        System.out.println("Java Collection");
        String [] arr = {"String 1", "Integer2", "String2", "String 1", "int1", "String 1", "int1"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        //Task1
        TaskFilter taskFilter = new TaskFilter();
        taskFilter.filter(list);

        //Task2
        System.out.println("Task 2:");
        CountElements countElements = new CountElements();
        System.out.println(countElements.counters(list));
    }
}