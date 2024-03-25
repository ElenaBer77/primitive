public class Main {
    public static void main(String[] args) {

        int ticket = 14009; //стоимость билета
        int oneBonus = 20; //количество рублей на одну бонусную милю
        int bonus = ticket / oneBonus; //расчетное количество бонусных миль
        System.out.println(bonus + "-бонусных миль");
    }
}
