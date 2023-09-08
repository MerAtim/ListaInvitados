package listadeinvitados.entidades;

public class Invitado {

    private String nombre;
    private String apellido;
    private Integer telefono;
    private String mail;
    private Boolean confirmado;

    public Invitado() {
    }

    public Invitado(String nombre, String apellido, Integer telefono, String mail, Boolean confirmado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.confirmado = confirmado;
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    @Override
    public String toString() {
        return "Invitado: \n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nMail:" + mail + "\nConfirmado: " + (confirmado ? "Si" : "No");
    }
    
}
