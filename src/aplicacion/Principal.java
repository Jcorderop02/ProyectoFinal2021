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
package aplicacion;

import interfaz.Interfaz;

public class Principal {
    /**
     * Método que inicializa el programa
     *
     * @param args argumentos que se pasan
     */
    public static void main(String[] args) {
        String sentencia = "";
        for (String arg : args) {
            sentencia += arg + " ";
        }
        Interfaz.procesarPeticion(sentencia);
    }
}

