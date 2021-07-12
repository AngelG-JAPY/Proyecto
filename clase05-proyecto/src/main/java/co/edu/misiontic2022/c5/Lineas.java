package co.edu.misiontic2022.c5;

public class Lineas {

    private Double coordenadaInicialX;
    private Double coordenadaInicialY;
    private Double coordenadaFinalX;
    private Double coordenadaFinalY;

    private Integer id;

    public Lineas(Double coordenadaInicialX, Double coordenadaInicialY, Double coordenadaFinalX,
                  Double coordenadaFinalY, Integer id) {

        this.coordenadaInicialX = coordenadaInicialX;
        this.coordenadaInicialY = coordenadaInicialY;
        this.coordenadaFinalX = coordenadaFinalX;
        this.coordenadaFinalY = coordenadaFinalY;
        this.id = id;
    }

    public Double getCoordenadaInicialX() {
        return coordenadaInicialX;
    }

    public void setCoordenadaInicialX(Double coordenadaInicialX) {
        this.coordenadaInicialX = coordenadaInicialX;
    }

    public Double getCoordenadaInicialY() {
        return coordenadaInicialY;
    }

    public void setCoordenadaInicialY(Double coordenadaInicialY) {
        this.coordenadaInicialY = coordenadaInicialY;
    }

    public Double getCoordenadaFinalX() {
        return coordenadaFinalX;
    }

    public void setCoordenadaFinalX(Double coordenadaFinalX) {
        this.coordenadaFinalX = coordenadaFinalX;
    }

    public Double getCoordenadaFinalY() {
        return coordenadaFinalY;
    }

    public void setCoordenadaFinalY(Double coordenadaFinalY) {
        this.coordenadaFinalY = coordenadaFinalY;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String puntoOrigen() {
        return String.format("(%f, %f)", coordenadaInicialX,coordenadaInicialY);
    }

    public String puntoFin() {
        return String.format("(%f, %f)", coordenadaFinalX,coordenadaFinalY);
    }

    public Double calcularLongitud() {
        return Math.sqrt(Math.pow((coordenadaFinalX - coordenadaInicialX), 2) + Math.pow((coordenadaFinalY - coordenadaInicialY), 2) );
    }
    

}