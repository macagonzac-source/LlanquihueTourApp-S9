package app;

import data.LectorDatos;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO AL SISTEMA DE GESTIÓN LLANQUIHUE TOUR ===");
        System.out.println("-------------------------------------------------------");

        // 1. Listas Polimórficas (List<Registrable>)
        List<Registrable> registroGeneral = LectorDatos.cargarPersonasDesdeArchivo("personas.txt");

        // Ejecución de métodos polimórficos e interfaces
        System.out.println("\n--- Procesando Registro de Personas ---");
        for (Registrable r : registroGeneral) {
            r.registrar(); // Comportamiento específico de cada clase hija
        }

        // 2. HashMap para almacenar Paquetes Turísticos
        Map<String, PaqueteTuristico> mapaPaquetes = new HashMap<>();
        mapaPaquetes.put("TOUR-01", new PaqueteTuristico("TOUR-01", "Ruta Cultural Llanquihue", 45000));
        mapaPaquetes.put("TOUR-02", new PaqueteTuristico("TOUR-02", "Paseo Lacustre Frutillar", 60000));

        // 3. Filtrado Avanzado utilizando el operador 'instanceof'
        System.out.println("\n--- Reporte Exclusivo de Guías Turísticos ---");
        for (Registrable r : registroGeneral) {
            if (r instanceof Guia) {
                Guia guiaEncontrado = (Guia) r;
                System.out.println(guiaEncontrado);
            }
        }

        System.out.println("\n--- Reporte Exclusivo de Clientes ---");
        for (Registrable r : registroGeneral) {
            if (r instanceof Cliente) {
                System.out.println(r.obtenerResumen());
            }
        }

        // 4. Búsqueda directa en Colecciones estructuradas (Map)
        System.out.println("\n--- Búsqueda de Paquete Turístico ---");
        String codigoBuscar = "TOUR-01";
        if (mapaPaquetes.containsKey(codigoBuscar)) {
            System.out.println("¡Paquete Encontrado! -> " + mapaPaquetes.get(codigoBuscar));
        } else {
            System.out.println("El paquete solicitado no se encuentra en el catálogo.");
        }

        System.out.println("\n-------------------------------------------------------");
        System.out.println("Prototipo de Software finalizado con éxito.");
    }
}
