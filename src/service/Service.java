package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.Custom;
import model.Aeropuertos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Service {
    private List<Aeropuertos> aero = new ArrayList<>();

    File file = new File("archi.json");

    public void openFile() {
        ObjectMapper mapper = new ObjectMapper();
       // List<Aeropuertos> aero = new ArrayList<>();
        {
            try {
                aero = mapper.readValue(file, new TypeReference<List<Aeropuertos>>() {
                });
              //  System.out.println(aero.toString());
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public ArrayList capMin(Integer cap) throws Custom {
        ArrayList<Aeropuertos> minAero = new ArrayList<>();
        Integer s = 0;
        Aeropuertos ar;
        System.out.println(this.aero.toString());
        try{
            for (Aeropuertos a : this.aero) {
                System.out.println("asd1");
                if (a.getCapacidad() > cap) {
                    minAero.add(a);
                } else {
                    throw new Custom(""+a.getCapacidad());
                }

            }
        } catch (Custom e) {
            throw new RuntimeException(e);
        }



        return minAero;
    }
}
