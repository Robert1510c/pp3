public class Euro {
    public static void main(String[] args){
        double EuroBuy = 4.5940;
        double EuroSell = 4.6250;
        double Spread = EuroSell - EuroBuy;
        System.out.printf("Bank buys Euro: %f\nBank sells Euro: %f\nSpread: %f\n", EuroBuy, EuroSell, Spread);
    }
}
