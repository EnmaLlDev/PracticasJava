package Utilidades;

import ClassPractice.ClassPersona;
import java.util.*;

public class Driver_List {

    public static void main(String[] args) {
        System.out.println("Manejo de listas en JAVA");
        List<String> lista1 = new ArrayList<>();
        lista1.add("Enmnauel");
        lista1.add("Paula");
        lista1.add("Adriana");
        lista1.add("FEDERICO");

        System.out.println("1er Recorrido de lista:");
        for (String nombre : lista1) {
            System.out.println("Nombre: " + nombre);
        }

        System.out.println("Longitud de la lista es: " + lista1.size());

        System.out.println("Posicion 0 de lista: " + lista1.get(0));

        System.out.println("Borrar posicion 0 de la lista: " + lista1.remove(0));

        System.out.println("Posicion 0 de lista: " + lista1.get(0));

        System.out.println("2do Recorrido de lista:");
        for (String nombre : lista1) {
            System.out.println("Nombre: " + nombre);
        }

        ClassPersona PERSONA = new ClassPersona("Alberto", "Peron", 26, "Politico");
        System.out.println(PERSONA.toString());

        List<ClassPersona> lista_invitados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ClassPersona invitado = new ClassPersona();
            invitado.setNombre(i+".- Juan");
            invitado.setApelilido(i+".-Perez");
            invitado.setEdad(5*i);
            invitado.setProfesion("Oficial "+i);
            lista_invitados.add(invitado);
        }
        
        for (ClassPersona per:lista_invitados){
            System.out.println("Datos: "+ per.toString());
            System.out.println("");
        }
    }
}
