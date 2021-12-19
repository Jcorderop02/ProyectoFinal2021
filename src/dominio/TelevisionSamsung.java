package dominio;

public class TelevisionSamsung extends Television {
    private String precio;

    //Constructor con los parametros modelo, tipoDePantalla, pulgadas, preecio y año.
    public TelevisionSamsung(String modelo, String tipoDePantalla, int pulgadas, int precio, int anno) {
        super(tipoDePantalla, pulgadas, precio, anno);
        super.getModelo() = "Samsung";
        this.precio = precio;
    }

    /**
     * Metodo getter que sirve para devolver el valor del atributo a quien lo solicite
     *
     * @return precio  Indica la garantia
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Metodo setter que sirve para asignar un valor a una variable precio
     *
     * @param precio Indica la garantia
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Anula el metodo principal toString de Television para asi poder usar uno más especifico
    @Override
    public String toString() {
        return "Modelo: " + getModelo() + " " + "Pulgadas: " + getPulgadas() + "Precio:" + precio + " " + "Año: " + getAnno() + "\n";
    }

    @Override
    public String toCSV() {
        return "Modelo: " + getModelo() + " " + "Pulgadas: " + getPulgadas() + "Precio:" + precio + " " + "Año: " + getAnno() + "\n";
    }
}