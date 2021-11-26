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

import dominio.*;

public class Principal {
    /**
     * Método que inicializa el programa
     * @param args argumentos que se pasan
     */
    public static void main(String[] args) {
        Television television = new Television();
        television.setNombre("TV Q95TD 189 cm 4K Smart TV (2021)");
        television.setMarca("Samsung");
        television.setPulgadas(80);
        television.setModelo("QLED");

        Television television2 = new Television();
        television2.setNombre("TV Q95TD 129 cm 8K Smart TV (2022)");
        television2.setMarca("Samsung");
        television2.setPulgadas(60);
        television2.setModelo("NEOLED");

        Tienda tienda = new Tienda();
        tienda.annadirTelevision(television);
        tienda.annadirTelevision(television2);

        System.out.println(tienda);
    }
}
