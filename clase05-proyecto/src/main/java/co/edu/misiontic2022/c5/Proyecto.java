package co.edu.misiontic2022.c5;

public class Proyecto {

    private String nombre;
    private Integer codigo;
    private JefeProyecto jefeDeProyecto;

    public Proyecto(String nombre, Integer codigo, JefeProyecto jefeDeProyecto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.jefeDeProyecto = jefeDeProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public JefeProyecto getJefeDeProyecto() {
        return jefeDeProyecto;
    }

    public void setJefeDeProyecto(JefeProyecto jefeDeProyecto) {
        this.jefeDeProyecto = jefeDeProyecto;
    }

    @Override
    public String toString() {
        return "Proyecto [codigo=" + codigo + ", jefeDeProyecto=" + jefeDeProyecto + ", nombre=" + nombre + "]";
    }

}
