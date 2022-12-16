package cine.Utilities;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.swagger.v3.core.util.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JsonCreator {
    public static void main(String[] args) {
        //preguntar al usuario que quiere crear, peliculas o salas, y cuantas

        //ejecutar el metodo correspondiente
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to create? (1 for movies, 2 for cinema rooms)");
        int option = scanner.nextInt();
        System.out.println("How many do you want to create?");
        int num = scanner.nextInt();
        if (option == 1) {
            crearRandomJsonPelicula(num);
        } else if (option == 2) {
            crearRandomJsonSala(num);
        } else {
            System.out.println("Invalid option");
        }
    }

    public static List crearRandomJsonPelicula(int numPeliculas){
        Faker faker = new Faker();
        Gson gson = new Gson();
        List<String> elementos = new ArrayList<>();
        Map<String, String> movie = new HashMap<>();
        for (int i = 1; i <= numPeliculas; i++) {
            //la id tiene que ser de esta manera "MOV" + ****;
            movie.put("id", "MOV" + String.format("%04d", i));
            // Generar datos aleatorios
            movie.put("titulo", faker.book().title());
            movie.put("director", faker.book().author());
            movie.put("año", String.valueOf(faker.number().numberBetween(1920, 2022)));
            movie.put("duracion", String.valueOf(faker.number().numberBetween(60, 240)));
            movie.put("genero", faker.book().genre());
            //añadir pelicula a la lista
            elementos.add(gson.toJson(movie));
        }
        return elementos;
    }

    public static List crearRandomJsonSala(int numSalas){
        Faker faker = new Faker();
        Gson gson = new Gson();
        List<String> elementos = new ArrayList<>();
        Map<String, String> salas = new HashMap<>();
        for (int i = 1; i <= numSalas; i++) {
            //la id tiene que ser de esta manera "ROOM" + ****;
            salas.put("id", "ROOM" + String.format("%04d", i));
            // Generar datos aleatorios
            salas.put("capacidad", String.valueOf(faker.number().numberBetween(50, 500)));
            salas.put("nombre", faker.ancient().god());
            salas.put("ubicacion", faker.address().streetName() + " " + faker.number().numberBetween(1, 100));
            //añadir sala a la lista
            elementos.add(gson.toJson(salas));
        }
        return elementos;
    }

    public void crearRandomJsonDebugMode(){
        Faker faker = new Faker();
        Gson gson = new Gson();
        List<String> elements = new ArrayList<>();
        int auxGenerator = 0;

        System.out.println("1. Pelicula");
        System.out.println("2. Sala");
        System.out.print("Que elemento quieres crear: ");
        int opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1 -> {
                Map<String, String> movie = new HashMap<>();
                System.out.print("¿Cuántas elemetos quieres crear?: ");
                auxGenerator = new Scanner(System.in).nextInt();
                for (int i = 1; i <= auxGenerator; i++) {
                    //la id tiene que ser de esta manera "MOV" + ****;
                    movie.put("id", "MOV" + String.format("%04d", i));
                    // Generar datos aleatorios
                    movie.put("titulo", faker.book().title());
                    movie.put("director", faker.book().author());
                    movie.put("año", String.valueOf(faker.number().numberBetween(1920, 2022)));
                    movie.put("duracion", String.valueOf(faker.number().numberBetween(60, 240)));
                    movie.put("genero", faker.book().genre());
                    //añadir pelicula a la lista
                    elements.add(gson.toJson(movie));
                }
                for (String element : elements) {
                    System.out.println(element);
                }
            }
            case 2 -> {
                Map<String, String> room = new HashMap<>();
                System.out.print("¿Cuántas elemetos quieres crear?: ");
                auxGenerator = new Scanner(System.in).nextInt();
                for (int i = 1; i <= auxGenerator; i++) {
                    //id
                    room.put("id", String.valueOf(i));
                    // Generar datos aleatorios
                    room.put("capacidad", String.valueOf(faker.number().numberBetween(50, 500)));
                    room.put("nombre", faker.ancient().god());
                    room.put("ubicacion", faker.address().streetName() + " " + faker.number().numberBetween(1, 100));

                    //añadir pelicula a la lista
                    elements.add(gson.toJson(room));
                }
                //recorrer 'room' y mostar por pantalla
                for (String element : elements) {
                    System.out.println(element);
                }
            }
            default -> System.out.println("Opción no válida");
        }
    }
}