package data;

import model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorDatos {

    public static List<Registrable> cargarPersonasDesdeArchivo(String rutaArchivo) {
        List<Registrable> listaCargada = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                // Separar datos por coma
                String[] datos = linea.split(",");
                String tipo = datos[0];
                String rut = datos[1];
                String nombre = datos[2];

                // Composición de Dirección
                Direccion dir = new Direccion(datos[3], datos[4], datos[5]);

                if (tipo.equalsIgnoreCase("CLIENTE")) {
                    String tipoCliente = datos[6];
                    listaCargada.add(new Cliente(rut, nombre, dir, tipoCliente));
                } else if (tipo.equalsIgnoreCase("GUIA")) {
                    String idioma = datos[6];
                    listaCargada.add(new Guia(rut, nombre, dir, idioma));
                }
            }
        } catch (IOException e) {
            System.err.println("Error crítico al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error de validación en líneas de datos: " + e.getMessage());
        }

        return listaCargada;
    }
}
