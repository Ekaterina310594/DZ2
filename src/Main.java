//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();

        int ticketPrice = 3000;

        System.out.println("Стоимость билета" + " " + ticketPrice + " " + "руб.");
        System.out.println("У нас работает бонусная программа, по которой за каждые 20 рублей, потраченные на билет, начисляется 1 миля");

        int valueOfMile = 20;

        int bonusMiles = ticketPrice / valueOfMile;

        System.out.println("Ваш бонус" + " " + bonusMiles + " " + "миль");



    }
}