package cine;

import java.sql.*;

public class PoblarCineDatabase {
    public static void main(String[] args) {
        Connection conexion = null;
        Statement statemnt = null;

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine", "root", "");
            //create an array of sentencias
            String[] sentencias = new String[100];

            sentencias[0] = "Drop table if exists peliculas";
            sentencias[1] = "CREATE TABLE IF NOT EXISTS peliculas (id INT NOT NULL, titulo VARCHAR(255) NOT NULL, director VARCHAR(255) NOT NULL, año INT NOT NULL, duracion INT NOT NULL, categoria VARCHAR(255) NOT NULL, PRIMARY KEY (id))";
            sentencias[2] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El padrino', 'Francis Ford Coppola', 1972, 175, 'Drama')";
            sentencias[3] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('Nemo', 'Andrew Stanton', 2003, 100, 'Animación')";
            sentencias[4] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El señor de los anillos', 'Peter Jackson', 2001, 178, 'Fantasía')";
            sentencias[5] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El club de la lucha', 'David Fincher', 1999, 139, 'Drama')";
            sentencias[6] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El pianista', 'Roman Polanski', 2002, 150, 'Drama')";
            sentencias[7] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El silencio de los corderos', 'Jonathan Demme', 1991, 118, 'Drama')";
            sentencias[8] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El sexto sentido', 'M. Night Shyamalan', 1999, 107, 'Drama')";
            sentencias[9] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El laberinto del fauno', 'Guillermo del Toro', 2006, 118, 'Fantasía')";
            sentencias[10] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El gran Lebowski', 'Joel Coen', 1998, 117, 'Comedia')";
            sentencias[11] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El club de la lucha', 'David Fincher', 1999, 139, 'Drama')";
            sentencias[12] = "INSERT INTO cine.peliculas (id, titulo, director, año, duracion, categoria) VALUES ('El pianista', 'Roman Polanski', 2002, 150, 'Drama')";

            statemnt = conexion.createStatement();
            statemnt.executeUpdate(sentencias[0]);
            statemnt.executeUpdate(sentencias[1]);
            System.out.println("Tabla creada");

            for (int i = 2; i <= 12; i++) {
                statemnt.executeUpdate(sentencias[i]);
            }
            conexion.close();
            statemnt.close();
            System.exit(0);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}