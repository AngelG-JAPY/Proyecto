package co.edu.misiontic2022.c5;

import java.util.ArrayList;

public class Figuras {

    private Integer id;
    private Integer cantidadDeLineas;

    private ArrayList <Lineas> lineasConformantes;

    private String nombre;
    private String color;

    private Double area;
    private Double perimetro;

    public Figuras(Integer id, Integer cantidadDeLineas, String nombre, String color, Double area, Double perimetro) {
        this.id = id;
        this.cantidadDeLineas = cantidadDeLineas;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;

        this.lineasConformantes = new ArrayList <Lineas>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadDeLineas() {
        return cantidadDeLineas;
    }

    public void setCantidadDeLineas(Integer cantidadDeLineas) {
        this.cantidadDeLineas = cantidadDeLineas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double calcularPerimetro() {
        
        for (Lineas lineas : lineasConformantes) {
            this.perimetro += lineas.calcularLongitud();
        }

        return this.perimetro;
    }
    
    //Suponiendo que siempre se usan poligonos regulares se puede hacer el siguiente método

    public Double calcularArea(Double apotema) {

        this.area = (this.perimetro * apotema) / 2;

        return this.area;
    }

}