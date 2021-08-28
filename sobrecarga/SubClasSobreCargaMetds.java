package sobrecarga;
/**
 *
 * @author galva
 */
public class SubClasSobreCargaMetds {

    String nombre;
    int edad;
    String direccion;

    SubClasSobreCargaMetds() {
        nombre = null;
        edad = 0;
        direccion = null;
    }

    SubClasSobreCargaMetds(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    SubClasSobreCargaMetds(SubClasSobreCargaMetds usr) {
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
    }

    void setNombre(String n) {
        nombre = n;
    }

    String getNombre() {
        return nombre;
    }

    void setEdad(int e) {
        edad = e;
    }

    void setEdad(float e) {
        edad = (int) e;
    }

    int getEdad() {
        return edad;
    }

    void setDireccion(String d) {
        direccion = d;
    }

    String getDireccion() {
        return direccion;
    }
}