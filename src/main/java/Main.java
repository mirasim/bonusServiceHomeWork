public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonusUmberLimitRegisrered = service.calculate(1000_60, true);
        System.out.println(bonusUmberLimitRegisrered);

        long bonusUmberLimitNotRegistered = service.calculate(5478_14, false);
        System.out.println(bonusUmberLimitNotRegistered);

        long bonusAbovelLimitNotRegistered = service.calculate(10_000_000_50, false);
        System.out.println(bonusAbovelLimitNotRegistered);

        long bonusZeroLimitRegistered = service.calculate(1000_60, true);
        System.out.println(bonusZeroLimitRegistered);
    }



}