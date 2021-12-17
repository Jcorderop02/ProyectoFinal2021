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
 * Clase que contiene la ArrayList de las televisiones con sus respectivos métodos para añadir las televisiones a la tienda
 *
 * @author Juan Cordero
 * @author Javier Martinez
 * @version 1.0 25/11/21
 */
package dominio;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Television> coleccionTelevisores = new ArrayList<>();

    /**
     * Método para añadir una televisión a la tienda
     *
     * @param television Television a añadir
     */
    public void annadirTelevision(Television television) {
        coleccionTelevisores.add(television);
    }

    /**
     * Método para borrar una television de la tienda
     *
     * @param televisionABorrar Televisión a borrar
     */
    public void borrarTelevision(Television televisionABorrar) {
        boolean borrado = false;
        for (int i = coleccionTelevisores.size() - 1; i >= 0; i--) {
            if (coleccionTelevisores.get(i).toString().equals(televisionABorrar.toString())) {
                coleccionTelevisores.remove(i);
                borrado = true;
            }
        }
        if (borrado) {
            System.out.println(televisionABorrar.toString() + " se ha borrado");
        } else {
            System.out.println(televisionABorrar.toString() + " no existe ese producto en la lista");
        }
    }

    /**
     * Método para obtener los televisores de la ArrayList
     *
     * @return Nombre de los televisores
     */
    public ArrayList<Television> getColeccionTelevisores() {
        return coleccionTelevisores;
    }

    /**
     * Método para establecer televisores en la ArrayList
     *
     * @param coleccionTelevisores Nuevos nombres de los televisores
     */
    public void setColeccionTelevisores(ArrayList<Television> coleccionTelevisores) {
        this.coleccionTelevisores = coleccionTelevisores;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Television television : coleccionTelevisores) {
            sb.append(television.toString() + "\n");
        }
        return sb.toString();
    }
}
