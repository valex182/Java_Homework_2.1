public class Main {
    public static void main(String[] args) {

        int ticketPrice = 500;

        int mileCost = 20;
        int amountMiles = ticketPrice / mileCost;
        System.out.println("Вам будет начислено " + amountMiles + " бесплатных миль");
    }
}