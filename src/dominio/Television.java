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
 *
 * @author Juan Cordero
 * @author Javier Martinez
 * @version 1.0 25/11/21
 */
package dominio;

public class Television {
    String nombre = "";
    String modelo = "";
    int pulgadas = 0;

    /**
     * Método para obtener el nombre de la televisión
     * @return nombre de la televisión
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de la televisión
     * @param nombre nuevo de la televisión
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el modelo de la televisión
     * @return modelo de la televisión
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo de la televisión
     * @param modelo nuevo modelo de la televisión
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener el número de pulgadas de la televisión
     * @return pulgadas que tiene la televisión
     */
    public int getPulgadas() {
        return pulgadas;
    }

    /**
     * Método para establecer las pulgadas de la televisión
     * @param pulgadas nuevas pulgadas del televisor
     */
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
