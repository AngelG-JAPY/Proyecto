package co.edu.misiontic2022.c5;

public class JefeProyecto {
    
    private String nombre;
    private String direccion;
    private Integer codigo;
    private Integer telefono;
    private Proyecto proyecto;
    
    public JefeProyecto(String nombre, String direccion, Integer codigo, Integer telefono, Proyecto proyecto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigo = codigo;
        this.telefono = telefono;
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "JefeProyecto [codigo=" + codigo + ", direccion=" + direccion + ", nombre=" + nombre + ", proyecto="
                + proyecto + ", telefono=" + telefono + "]";
    }

    public Boolean nombreDiferente(JefeProyecto jefe) {
        return this.nombre != jefe.getNombre();
    }


}
