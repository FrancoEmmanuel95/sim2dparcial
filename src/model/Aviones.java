package model;

public class Aviones {
    private Integer id;
    private String piloto;
    private Integer capacidad_pasajeros;

    public Aviones() {
    }

    public Aviones(Integer id, String piloto, Integer capacidad_pasajeros) {
        this.id = id;
        this.piloto = piloto;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Integer getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(Integer capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public String toString() {
        return "Aviones{" +
                "id=" + id +
                ", piloto='" + piloto + '\'' +
                ", capacidad_pasajeros=" + capacidad_pasajeros +
                '}';
    }
}
