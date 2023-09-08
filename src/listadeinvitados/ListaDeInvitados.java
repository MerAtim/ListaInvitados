package listadeinvitados;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import listadeinvitados.entidades.Invitado;
import listadeinvitados.repositorio.InvitadosRepositorio;

public class ListaDeInvitados {

    public static void main(String[] args) {

        InvitadosRepositorio repositorio = new InvitadosRepositorio();
        /*
        Invitado invitado1 = new Invitado("Nelson", "Rios", 123456, "nel@hotmail.com", Boolean.TRUE);
        Invitado invitado2 = new Invitado("Fatima", "Rios", 123456, "fati@hotmail.com", Boolean.TRUE);
        Invitado invitado3 = new Invitado("Jose", "Rios", 123456, "jose@hotmail.com", Boolean.TRUE);
        Invitado invitado4 = new Invitado("Hector", "Rios", 123456, "epi@hotmail.com", Boolean.TRUE);

        List<Invitado> invitados = Arrays.asList(invitado1, invitado2, invitado3, invitado4);

        invitados.forEach(invitado -> repositorio.agregarInvitado(invitado));
         */
//        System.out.println(repositorio.obtenerInvitados());
        List<Invitado> invitados = repositorio.obtenerInvitados();
                                        
        //invitados.forEach(inv -> System.out.println(inv + "\n")); // Expresion lambda (la que esta dentro del parentesis)
        
        for (Invitado invitado : invitados) {
            System.out.println(invitado + "\n");
        }
    }

}
