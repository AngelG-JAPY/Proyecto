package co.edu.misiontic2022.c5;

public class Planos {

    private Integer id;
    private Integer cantidadArquitectos;
    private String fechaEntrega;
    private Figuras dibujoDeFiguras;
    
    public Planos(Integer id, Integer cantidadArquitectos, String fechaEntrega, Figuras dibujoDeFiguras) {
        this.id = id;
        this.cantidadArquitectos = cantidadArquitectos;
        this.fechaEntrega = fechaEntrega;
        this.dibujoDeFiguras = dibujoDeFiguras;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadArquitectos() {
        return cantidadArquitectos;
    }

    public void setCantidadArquitectos(Integer cantidadArquitectos) {
        this.cantidadArquitectos = cantidadArquitectos;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Figuras getDibujoDeFiguras() {
        return dibujoDeFiguras;
    }

    public void setDibujoDeFiguras(Figuras dibujoDeFiguras) {
        this.dibujoDeFiguras = dibujoDeFiguras;
    }

    @Override
    public String toString() {
        return "Planos [cantidadArquitectos=" + cantidadArquitectos + ", dibujoDeFiguras=" + dibujoDeFiguras
                + ", fechaEntrega=" + fechaEntrega + ", id=" + id + "]";
    }

}