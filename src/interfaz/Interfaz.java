/*Copyright [2021] [Juan Cordero, Javier Martinez]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Clase que contiene los métodos para procesar las peticiones entrantes de la terminal, la inicializacion del fichero y la lectura del fichero
 *
 * @author Juan Cordero
 * @author Javier Martinez
 * @version 1.0 25/11/21
 */
package interfaz;

import dominio.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {

    private static String FICHERO_TXT = "fichero.txt";
    private static String FICHERO_CSV = "fichero.csv";

    /**
     * Método para comprobar si los argumentos no son números
     *
     * @param aValidar Lista de argumentos
     * @return True si ninguno es un numero, false en caso contrario
     */
    private static boolean validarArgs(ArrayList<String> aValidar) {
        for (String s : aValidar) {
            try {
                Integer.parseInt(s);
                return false;
            } catch (Exception ignored) {
            }
        }
        return true;
    }

    /**
     * Método estático que inicializa el archivo txt
     *
     * @param tienda Importa la tienda para añadirlo luego en el archivo txt
     */
    private static void inicializarFichero(Tienda tienda) {
        try {
            FileWriter fw = new FileWriter(FICHERO_TXT);
            fw.write(tienda.toString());
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("No se ha podido guardar el archivo");
        }
    }

    /**
     * Método estático que genera el archivo csv
     *
     * @param tienda Importa la tienda para añadirlo en el archivo csv
     */
    private static void generarCSV(Tienda tienda) {
        try {
            FileWriter fw = new FileWriter(FICHERO_CSV);
            fw.write(tienda.toCSV());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se ha podido guardar el archivo");
        }
    }

    /**
     * Método para procesar los argumentos del comando
     *
     * @param sentencia Argumentos del main
     */
    public static void procesarPeticion(String sentencia) {
        String[] args = sentencia.split(" ");
        Tienda tienda = inicializarTienda();
        if (args[0].equals("help")) {
            if (args.length == 1) {
                printHelp();
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else if (args[0].equals("list")) {
            if (args.length == 1) {
                if (tienda.toString().equals("")) {
                    System.out.println("No hay ningún producto en la tienda");
                } else {
                    System.out.println("Esta es la lista de productos: ");
                    System.out.println(tienda);
                }
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else if (args[0].equals("csv")) {
            if (args.length == 1) {
                generarCSV(tienda);
                System.out.println("Se ha generado el CSV");
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else if (args[0].equals("add")) {
            if (args.length == 5) {
                try {
                    ArrayList<String> aValidar = new ArrayList<>();
                    aValidar.add(args[1]);
                    aValidar.add(args[2]);

                    if (validarArgs(aValidar)) {
                        Television tele = new Television(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                        tienda.annadirTelevision(tele);
                        inicializarFichero(tienda);
                        System.out.println("Se ha guardado correctamente el producto");
                    } else {
                        System.out.println("¡Alguno de los argumentos introducidos es incorrecto!");
                        System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Se ha introducido una palabra en vez de un numero en alguno de los dos últimos argumentos");
                    System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                }
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else if (args[0].equals("remove")) {
            if (args.length == 5) {
                try {
                    ArrayList<String> aValidar = new ArrayList<>();
                    aValidar.add(args[1]);
                    aValidar.add(args[2]);

                    if (validarArgs(aValidar)) {
                        Television tele = new Television(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                        tienda.borrarTelevision(tele);
                        inicializarFichero(tienda);
                    } else {
                        System.out.println("¡Alguno de los argumentos introducidos es incorrecto!");
                        System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Se ha introducido una palabra en vez de un numero en alguno de los dos últimos argumentos");
                    System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                }
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else if (args[0].equals("editar")) {
            if (args.length == 9) {
                try {
                    ArrayList<String> aValidar = new ArrayList<>();
                    aValidar.add(args[1]);
                    aValidar.add(args[2]);
                    aValidar.add(args[5]);
                    aValidar.add(args[6]);

                    if (validarArgs(aValidar)) {
                        Television teleAntigua = new Television(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                        Television teleNueva = new Television(args[5], args[6], Integer.parseInt(args[7]), Integer.parseInt(args[8]));
                        tienda.reemplazarTelevision(teleAntigua, teleNueva);
                        inicializarFichero(tienda);
                    } else {
                        System.out.println("¡Alguno de los argumentos introducidos es incorrecto!");
                        System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Se ha introducido una palabra en vez de un numero en alguno de los dos últimos argumentos");
                    System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
                }
            } else {
                System.out.println("Se ha introducido más o menos de los argumentos necesarios." + " Revisa lo que has escrito");
                System.out.println("Teclee java -jar tienda.jar help para ver los parámetros necesarios.");
            }
        } else {
            System.out.println("¡El argumento principal introducido no es correcto!");
            System.out.println("Introduzca java -jar tienda.jar help para ver los comandos disponibles");
        }
    }

    /**
     * Método para cargar los datos del fichero
     *
     * @return Objeto Tienda
     */
    private static Tienda inicializarTienda() {
        Tienda tienda = new Tienda();
        try {
            File file = new File(FICHERO_TXT);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String nombreModelo = sc.next();
                String modelo = sc.next();
                String nombreTipoDePantalla = sc.next();
                String tipoDePantalla = sc.next();
                String nombrePulgadas = sc.next();
                int pulgadas = Integer.parseInt(sc.next());
                String nombreAnno = sc.next();
                int anno = Integer.parseInt(sc.next());
                Television television = new Television(modelo, tipoDePantalla, pulgadas, anno);
                tienda.annadirTelevision(television);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            inicializarFichero(tienda);
        }
        return tienda;
    }

    /**
     * Método que contiene las instrucciones de como usar la tienda
     */
    public static void printHelp() {
        System.out.println("Los comandos que se pueden utilizar son los siguientes:" + "\n" +
                "- Para mostrar la información de todas las televisiones: java -jar tienda.jar list" + "\n" +
                "- Para añadir una television cualquiera: java -jar tienda.jar add <Modelo> <Tipo-De-Pantalla> <Pulgadas> <Año>" + "\n" +
                "- Para borrar una television: java -jar tienda.jar remove <Modelo> <Tipo-De-Pantalla> <Pulgadas> <Año>" + "\n" +
                "- Para modificar una television: java -jar tienda.jar editar <Modelo> <Tipo-De-Pantalla>" +
                " <Pulgadas> <Año> <modeloNuevo> <tipo-De-Pantalla-Nueva> <pulgadasNuevas> <nuevoAño>" + "\n" +
                "- Para generar el csv: java -jar tienda.jar csv");
    }
}
