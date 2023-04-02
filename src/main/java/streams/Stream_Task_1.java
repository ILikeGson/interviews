package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Stream_Task_1 {
    public static void main(String[] args) {
        task_1_imperative();
        task_1_declarative();
    }

    private static void task_1_imperative() {
        List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"),
                new BigDecimal("30"),
                new BigDecimal("17"),
                new BigDecimal("20"),
                new BigDecimal("15"),
                new BigDecimal("18"),
                new BigDecimal("45"),
                new BigDecimal("12"));

        // В магазине на товары с ценой выше 20 долларов распространяется скидка 10%.
        // Найти сумму всех цен, к которым была применина скидка
        // Ниже приведен пример решения этой задачи в императивном стиле
        // Необходимо решить задачу в декларативном стиле и сравнить данные подходы

        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices =
                        totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }

    private static void task_1_declarative() {
        // Решение.........
    }
}
