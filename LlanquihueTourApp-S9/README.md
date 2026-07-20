# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

- **Nombre completo:** Macarena González
- **Sección:** 007A
- **Carrera:** Analista en Programación
- **Sede:** Online

## 📘 Descripción general del sistema

Sistema de gestión para la agencia **Llanquihue Tour** de la Región de Los Lagos, desarrollado en Java [1]. Este proyecto aplica principios de POO (encapsulamiento, composición, herencia, polimorfismo, interfaces) y gestiona datos mediante archivos planos `.txt`.

## 🧱 Estructura del proyecto

Organizado bajo la estructura `cl.duoc.llanquihuetour`:
*   `app/`: Main.java.
*   `model/`: Clases Persona, Cliente, Guia, Direccion, PaqueteTuristico.
*   `data/`: LectorDatos.java (persistencia).
*   `utils/`: ValidacionException.java (validaciones).

## 🛠️ Cumplimiento de Requisitos POO

1.  **Encapsulamiento:** Atributos privados con getters/setters.
2.  **Composición:** `Persona` incluye una clase `Direccion`.
3.  **Validación:** Uso de Regex en el constructor de `Persona` para el RUT.
4.  **Herencia y Polimorfismo:** `Cliente` y `Guia` heredan de `Persona`.
5.  **Interfaces:** Implementación de `Registrable`.

## ⚙️ Instrucciones de uso

1.  **Clonar:** `git clone https://github.com`
2.  **IDE:** Abrir en IntelliJ IDEA.
3.  **Datos:** Verificar `personas.txt` en la raíz.
4.  **Ejecución:** Correr `Main.java`.

---
© Duoc UC | Evaluación Final Transversal EFT
