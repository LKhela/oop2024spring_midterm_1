package midterm.luka_khelashvili_2.task3;
public class SouvenirTester {
    public static void main(String[] args) {
        SouvenirStoreSystem storeSystem = new SouvenirStoreSystem();

        storeSystem.addSouvenir(new Souvenir("T-shirt", "Georgian flag printed t-shirt", 20.99));
        storeSystem.addSouvenir(new Souvenir("Magnet", "Magnet with a picture of Tbilisi", 5.99));

        System.out.println("Souvenirs in the store:");
        storeSystem.printSouvenirsInfo();

        storeSystem.removeSouvenir(new Souvenir("Magnet", "", 0));

        System.out.println("Souvenirs in the store after removal:");
        storeSystem.printSouvenirsInfo();
    }
}
