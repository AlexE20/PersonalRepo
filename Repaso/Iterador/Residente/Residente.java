package Residente;

public class Residente {
    private String nombre;
    private String apellido;
    private int numeroApartamento;
    private double saldoDeudor;
    private String telefono;
    private String email;

    public Residente() {}

    public Residente(String nombre, String apellido, int numeroApartamento, double saldoDeudor, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroApartamento = numeroApartamento;
        this.saldoDeudor = saldoDeudor;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    public void setSaldoDeudor(double saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
