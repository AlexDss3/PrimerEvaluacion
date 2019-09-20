package Estudiante;

public class Estudiante {
    private String nombre;
    private String codigo;
    private String materia;
    private Double parcial1;
    private Double parcial2;
    private Double parcial3;
    private Double promedio;

    public void setNombre(String Nombre){ this.nombre=Nombre; }
    public String GetNombre() {
        return this.nombre;
    }
    public void setCodigo(String Codigo){ this.codigo=Codigo; }
    public String GetCodigo() {
        return this.codigo;
    }
    public void setMateria(String Materia){ this.materia=Materia; }
    public String GetMateria() {
        return this.materia;
    }
    public void setParcial1(Double Parcial1){ this.parcial1=Parcial1; }
    public Double GetParcial1() {
        return this.parcial1;
    }
    public void setParcial2(Double Parcial2){ this.parcial2=Parcial2; }
    public Double GetParcial2() {
        return this.parcial2;
    }
    public void setParcial3(Double Parcial3){ this.parcial3=Parcial3; }
    public Double GetParcial3() {
        return this.parcial3;
    }
    public void setPromedio(Double Promedio){ this.promedio=Promedio; }
    public Double GetPromedio() {
        return this.promedio;
    }
}
