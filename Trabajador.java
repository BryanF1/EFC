
public abstract class Trabajador{

    protected String nombres;

    protected String apellidos;

    protected int dni;

    protected String tipo;

    public Trabajador(String nombres, String apellidos, int dni, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipo=tipo;
    }

    protected String getNombres() {
        return nombres;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected int getDni() {
        return dni;
    }

    protected String getTipo() {
        return tipo;
    }

}