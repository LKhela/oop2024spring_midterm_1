package midterm.luka_khelashvili_2.task3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SouvenirStoreSystem {
    private List<Souvenir> souvenirs;

    public SouvenirStoreSystem() {
        souvenirs = new ArrayList<>();
    }

    public void addSouvenir(Souvenir souvenir) {
        souvenirs.add(souvenir);
        System.out.println("Added " + souvenir.getName() + " to the store.");
    }

    public void removeSouvenir(Souvenir souvenir) {
        for (Iterator<Souvenir> iterator = souvenirs.iterator(); iterator.hasNext();) {
            Souvenir s = iterator.next();
            if (s.getName().equals(souvenir.getName())) {
                iterator.remove();
                System.out.println("Removed " + s.getName() + " from the store.");
                return;  
            }
        }
        System.out.println(souvenir.getName() + " is not in the store.");
    }
    


    public void printSouvenirsInfo() {
        if (souvenirs.isEmpty()) {
            System.out.println("No souvenirs in the store.");
        } else {
            for (Souvenir souvenir : souvenirs) {
                System.out.println("Name: " + souvenir.getName());
                System.out.println("Description: " + souvenir.getDescription());
                System.out.println("Price: " + souvenir.getPrice());
            }
        }
    }
}
