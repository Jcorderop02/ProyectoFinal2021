package dominio;

public class TelevisionPhilips extends Television{
    private String garantia;
    //Constructor con los parametros modelo, tipoDePantalla, pulgadas, garantia y año.
    public TelevisionPhilips(String modelo, String tipoDePantalla, int pulgadas, String garantia, int anno){
        super(tipoDePantalla, pulgadas, garantia, anno);
        super.getModelo() = "Philips";
        this.garantia = garantia;
    }
    /**
     * Metodo getter que sirve para devolver el valor del atributo a quien lo solicite
     * @return garantia  Indica la garantia
     */
    public String getGarantia() {
        return garantia;
    }
    /**
     * Metodo setter que sirve para asignar un valor a una variable garantia
     * @param garantia  Indica la garantia
     */
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    //Anula el metodo principal toString de Television para asi poder usar uno más especifico
    @Override
    public String toString() {
        return "Modelo: " + getModelo() + " " + "Pulgadas: " + getPulgadas() + "Garantía" + garantia + " " + "Año: " + getAnno() + "\n";
    }

    @Override
    public String toCSV() {
        return "Modelo: " + getModelo() + " " + "Pulgadas: " + getPulgadas() + "Garantia:" + garantia + " " + "Año: " + getAnno() + "\n";
    }
}
