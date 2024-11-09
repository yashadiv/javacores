package JavaCode.JavaStream.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0),
                new Order("Tablet",400.0),
                new Order("Headphones", 1300)
        );
        //группируем по продуктам и суммируем суммы каждого продукта
        Map<String, Double> ordersByProductTotalCost = orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct,
                        Collectors.summingDouble(Order::getCost)));

        //переносим все результаты обратно в лист
        List<Order> sorted = new ArrayList<>();
        for(String product :ordersByProductTotalCost.keySet())
            sorted.add(new Order(product,ordersByProductTotalCost.get(product)));

        //Сортируем список по убыванию
        sorted.sort(Comparator.comparingDouble(o -> -o.getCost()));

        //выводим первые 3 значения
        sorted.subList(0,Math.min(sorted.size(),3))//здесь Math нужен для того чтобы если в листе меньше чем 3 позиции, выводило все что есть
                .forEach((n -> System.out.println(n.getProduct() + ": " + n.getCost())));

    }
}
