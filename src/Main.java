public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int replenishmentAmount = 1100;
        int bonus = replenishmentAmount / 100;
        int newBalance;
        int newBonus;
        if (replenishmentAmount >= 1000) {
            newBalance = currentBalance + bonus + replenishmentAmount;
            newBonus = bonus;
        } else {
            newBalance = currentBalance + replenishmentAmount;
            newBonus = 0;
        }
        System.out.println("Ваш новый баланс = " + newBalance);
        System.out.println("Ваш бонус = " + newBonus);
    }
}