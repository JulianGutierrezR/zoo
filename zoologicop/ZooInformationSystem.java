package zoologicop;

import model.Zoo;
import controller.ZooController;
import view.ZooView;

public class ZooInformationSystem {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoológico de Cali", "Cali", "Colombia", 15000, 2000000);
        ZooController controller = new ZooController(zoo);
        new ZooView(controller);
    }
}
