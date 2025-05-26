package entity;

import java.time.LocalDate;

public class Alumno {
    private int id;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Alumno(int id, String nombre, LocalDate fechaDeNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
