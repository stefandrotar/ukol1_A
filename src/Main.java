public class Main {
    public static void main(String[] args) {

        // input form user
        var oktet1 = 1;
        var oktet2 = 1;
        var oktet3 = 1;
        var oktet4 = 1;

        CarrotSeller seller1 = new CarrotSeller("Stefan", "Drotar",12,4.5,"Kosice",
            new SPZ("SK","KE","123BC"),6.5,new IPv4(192,168,1,1));

        CarrotSeller seller2 = new CarrotSeller("Jan", "Kamen",114,25.5,"Bratislava",
            new SPZ("SK","BA","555FG"),10.5,new IPv4(10,10,10,1));

        double sumOfCarrotsTons = seller1.getSoldCarrotsInTons() + seller2.getSoldCarrotsInTons();
        int sumAgreedContracts = seller1.getAgreedContracts() + seller2.getAgreedContracts();

        System.out.println("prumerne mnozstvi prodane mrkve na 1 smlouvu: " + sumAgreedContracts/sumOfCarrotsTons);

    }
}