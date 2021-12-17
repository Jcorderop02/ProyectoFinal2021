# Catálogo de Televisores

_El propósito de este proyecto es poder guardar, visualizar y agregar nuevas televisiones con su nombre, modelo, marca y
pulgadas._

---

## Inicio

_Las siguientes instrucciones permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para
propósitos de desarrollo y pruebas del mismo._

### Progresos

- [x] Uso de cadenas de caracteres y de números.
- [x] Uso de al menos 3 atributos.
- [x] Alta de productos.
- [x] Lectura de los productos.
- [x] Baja de productos.
- [ ] Modificación de productos.
- [ ] Generación de una hoja de cálculo con el catálogo.

### Pre-requisitos

_Estas son las siguientes cosas que se necesitan para poder ejecutar el proyecto:_

```
Versión 11 de Open JDK
```

```
Tener make instalado
```

### Compilación del programa

Se ejecuta el comando siguiente:

```
make jar 
```

---

## Ejecutar pruebas

_Para poder ejecutar pruebas del programa, deberá seguir las siguientes instrucciones:_

- Para poder ver la lista de tiendas con sus televisiones que hay en la lista.

```
java -jar tienda.jar list
```

- Para mostrar la ayuda. Se mostrará una guía más específica de que comandos se pueden ejecutar.

```
java -jar tienda.jar help
```

- Para añadir una television cualquiera.

```
java -jar tienda.jar add <Modelo> <TipoDePantalla> <Pulgadas> <Año>
```

```
tales como,
```

```
java -jar tienda.jar add Samsung QLED 80 2021
```

- Para borrar una television cualquiera.

```
java -jar tienda.jar remove <Modelo> <TipoDePantalla> <Pulgadas> <Año>
```

```
tales como,
```

```
java -jar tienda.jar remove Samsung QLED 80 2021
```

## Notas para los desarolladores

---

### Generar Javadoc

Se ejecuta el siguiente comando:

```
make javadoc
```

### Visualización del Javadoc

Se ejecuta el siguiente comando (es necesesario tener `firefox`):

```
firefox html/index.html
```

---

## Autores ✒️

_Estos son los autores que han contribuido en el realizamiento del proyecto:_

* **[Juan Cordero Pascual](https://github.com/Jcorderop02/ProyectoFinal2021)**
* **[Javier Martinez](https://github.com/Jmartinezc-rgb)**

---

## Copyright

Se permite cualquier explotación de la obra, incluyendo una finalidad comercial, así como la creación de obras
derivadas, la distribución de las cuales también está permitida sin ninguna restricción.
![Copyright.png](Copyright.png)

