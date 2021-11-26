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

public class Television {
    private String nombre;
    private String modelo;
    private String marca;
    private int pulgadas;

    /**
     * Constructor sin parámetros
     */
    public Television() {
        nombre = "";
        modelo = "";
        marca = "";
        pulgadas = 0;
    }

    /**
     * Constructor que establece el nombre, modelo, marca y pulgadas
     *
     * @param nombre   Es el nombre de la televisión
     * @param modelo   Es el modelo de la televisión
     * @param marca    Es la marca de la televisión
     * @param pulgadas Son las pulgadas de la televisión
     */
    public Television(String nombre, String modelo, String marca, int pulgadas) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    /**
     * Método para obtener el nombre de la televisión
     *
     * @return nombre de la televisión
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de la televisión
     *
     * @param nombre nuevo de la televisión
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la marca de la televisión
     *
     * @return marca de la televisión
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca de la televisión
     *
     * @param marca nuevo de la televisión
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el modelo de la televisión
     *
     * @return modelo de la televisión
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo de la televisión
     *
     * @param modelo nuevo modelo de la televisión
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener el número de pulgadas de la televisión
     *
     * @return pulgadas que tiene la televisión
     */
    public int getPulgadas() {
        return pulgadas;
    }

    /**
     * Método para establecer las pulgadas de la televisión
     *
     * @param pulgadas nuevas pulgadas del televisor
     */
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    /**
     * Método para devolver la información de la clase en formato String
     * @return información en formato string
     */
    public String toString() {
        return "Marca: " + marca + "\n" + "Nombre: " + nombre + "\n" +
                "Modelo: " + modelo + "\n" + "Pulgadas: " + pulgadas;
    }
}


