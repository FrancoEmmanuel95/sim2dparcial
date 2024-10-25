import exceptions.Custom;
import model.Aeropuertos;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Custom {
        List<Aeropuertos> aero = new ArrayList<Aeropuertos>();
        Service service = new Service();
        service.openFile();
        service.capMin(30);
    }
}