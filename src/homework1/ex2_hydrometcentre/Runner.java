package homework1.ex2_hydrometcentre;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 Гидрометцентр
        //Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
        //Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
        //Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
        //Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
        //Запрещено использовать массивы.

        ArrayList<Integer> januaryTemperature = new ArrayList<>(List.of(0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,
                -5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1));
        ArrayList<Integer> februaryTemperature =  new ArrayList<>(List.of(-8,-10,-12,-13,-15,-16,-12,-7,-8,
                -10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1));

        ArrayList<Integer> totalTemperature = new ArrayList<>();
        totalTemperature.addAll(januaryTemperature);
        totalTemperature.addAll(februaryTemperature);

        double sumTemperature = 0;
        for (int i = 0; i < totalTemperature.size(); i++) {
            sumTemperature += totalTemperature.get(i);
        }

        double averageDailyTemperature = sumTemperature / totalTemperature.size();
        System.out.printf("Среднесуточная температура воздуха за два месяца: " + "%.1f", averageDailyTemperature);
    }
}