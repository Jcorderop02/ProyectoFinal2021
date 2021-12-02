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
 * @author Juan Cordero
 * @author Javier Martinez
 * @version 1.0 25/11/21
 */
package interfaz;

import dominio.*;

import java.io.FileWriter;

public class Interfaz {

    private static String FICHERO_TXT = "tienda.txt";

    /**
     * Metodo estático que inicializa el archivo txt
     *
     * @param tienda Importa la tienda para annadirlo luego en el archivo txt
     */
    private static void inicializarFichero(Tienda tienda) {
        try {
            FileWriter fw = new FileWriter(FICHERO_TXT);
            fw.write(tienda.toString());
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
        Tienda tienda = new Tienda();
        try {
            if (args[0].equals("help")) {
                printHelp();
            } else if (args[0].equals("list")) {

            } else if (args[0].equals("add")) {
                Television tele = new Television(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                tienda.annadirTelevision(tele);
                inicializarFichero(tienda);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
        }
    }

    /**
     * Método que contiene las instrucciones de como usar la tienda
     */
    public static void printHelp() {
        System.out.println("De esta forma se añaden una television a la tienda: java -jar tienda.jar add modelo tipoDePantalla pulgadas año \r\n"
                + "\r\n"
                + "De esta forma se ve la tienda: java -jar tienda.jar list\r\n"
                + "\r\n"
                + "De esta forma se muestra la ayuda: java -jar tienda.jar help\r\n"
                + "");
    }
}
