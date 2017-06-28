package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела

«Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
«Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
«Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
«Ожирение: 30 или больше» — если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            Double indexmass = weight / (height * height);

            System.out.println(indexmass < 18.5 ? "Недовес: меньше чем 18.5":
                    (indexmass >= 18.5 && indexmass <= 24.9) ? "Нормальный: между 18.5 и 24.9":
                            (indexmass > 24.9 && indexmass <= 29.9) ? "Избыточный вес: между 25 и 29.9":
                                    (indexmass > 29.9) ? "Ожирение: 30 или больше" : "");
        }
    }
}
