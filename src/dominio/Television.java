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
 * Clase que contiene los parámetros que tiene la television con sus constructures, getters y setters
 *
 * @author Juan Cordero
 * @author Javier Martinez
 * @version 1.0 25/11/21
 */
package dominio;

public class Television {
    private String modelo;
    private String tipoDePantalla;
    private int pulgadas;
    private int anno;

    /**
     * Constructor sin parámetros
     */
    public Television() {
        modelo = "";
        tipoDePantalla = "";
        pulgadas = 0;
        anno = 0;
    }

    /**
     * Constructor que establece el nombre, modelo, tipoDePantalla y pulgadas
     *
     * @param modelo         Es el modelo de la televisión
     * @param tipoDePantalla Es la tipoDePantalla de la televisión
     * @param pulgadas       Son las pulgadas de la televisión
     * @param anno           Año del modelo de la television
     */
    public Television(String modelo, String tipoDePantalla, int pulgadas, int anno) {
        this.modelo = modelo;
        this.tipoDePantalla = tipoDePantalla;
        this.pulgadas = pulgadas;
        this.anno = anno;
    }

    /**
     * Método para obtener el modelo de la televisión
     *
     * @return Modelo de la televisión
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo de la televisión
     *
     * @param modelo Nuevo modelo de la televisión
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener el tipoDePantalla de la televisión
     *
     * @return Tipo de pantalla de la televisión
     */
    public String getTipoDePantalla() {
        return tipoDePantalla;
    }

    /**
     * Método para establecer la marca de la televisión
     *
     * @param tipoDePantalla Nuevo de la televisión
     */
    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
    }

    /**
     * Método para obtener el número de pulgadas de la televisión
     *
     * @return Pulgadas que tiene la televisión
     */
    public int getPulgadas() {
        return pulgadas;
    }

    /**
     * Método para establecer las pulgadas de la televisión
     *
     * @param pulgadas Pulgadas del televisor
     */
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    /**
     * Método para obtener el año de la televisión
     *
     * @return Anno de la television
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Método para establecer el año del televisor
     *
     * @param anno Año del televisor
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * Método para devolver la información de la clase en formato String
     *
     * @return Información en formato string
     */
    public String toString() {
        return "Modelo: " + modelo + " " + "Tipo-De-Pantalla: "
                + tipoDePantalla + " " + "Pulgadas: " + pulgadas + " " + "Año: " + anno;
    }
}


