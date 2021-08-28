package sobrecarga;
/**
 *
 * @author galva
 */
public class SobreCargaMetds {

    void imprimeUsuario(SubClasSobreCargaMetds usr) {

        System.out.println("\nNombre: " + usr.nombre);
        System.out.println("Edad: " + usr.getEdad());
        System.out.println("Direccion: " + usr.getDireccion() + "\n");
    }

    public static void main(String args[]) {
        SobreCargaMetds prog = new SobreCargaMetds();
        SubClasSobreCargaMetds usr1, usr2;

        usr1 = new SubClasSobreCargaMetds();
        prog.imprimeUsuario(usr1);

        usr2 = new SubClasSobreCargaMetds("Gerardo", 21, "Guatemala");
        prog.imprimeUsuario(usr2);

        usr1 = new SubClasSobreCargaMetds(usr2);

        usr1.setEdad(24);
        usr2.setEdad(28.45f);

        prog.imprimeUsuario(usr1);
        prog.imprimeUsuario(usr2);
    }
}