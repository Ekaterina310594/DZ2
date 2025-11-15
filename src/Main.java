//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialAmount = 300;
        int replenishmentAmount = 1200;

        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Общая сумма счета:" + " " + (initialAmount + replenishmentAmount + bonus) + " " + "руб.");
        System.out.println("Бонусы:" + " " + bonus + " " + "руб.");
    }
}