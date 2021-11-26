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
package dominio;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Television> coleccionTelevisores = new ArrayList<>();

    /**
     * Método para añadir un producto a la tienda
     *
     * @param television television a añadir
     */
    public void annadirTelevision(Television television) {
        coleccionTelevisores.add(television);
    }

    /**
     * Método para obtener los televisores de la ArrayList
     *
     * @return coleccionTelevisores nombre de los televisores
     */
    public ArrayList<Television> getColeccionTelevisores() {
        return coleccionTelevisores;
    }

    /**
     * Método para establecer televisores en la ArrayList
     *
     * @param coleccionTelevisores nuevos nombres de los televisores
     */
    public void setColeccionTelevisores(ArrayList<Television> coleccionTelevisores) {
        this.coleccionTelevisores = coleccionTelevisores;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Television television : coleccionTelevisores) {
            sb.append(television);
        }
        return sb.toString();
    }
}
