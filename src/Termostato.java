public class Termostato {
    private double temperaturaActual;
    private String modoOperacion;

    public Termostato(double temperaturaActual, String modoOperacion) {
        this.modoOperacion = modoOperacion;
        setTemperatura(temperaturaActual);
    }

    public void setTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= 15 && nuevaTemperatura <= 30) {
            temperaturaActual = nuevaTemperatura;
            System.out.println("Temperatura actualizada.");
        } else {
            System.out.println("Advertencia: la temperatura debe estar entre 15 y 30 grados.");
        }
    }

    public double getTemperatura() {
        return temperaturaActual;
    }

    public void mostrarEstado() {
        System.out.println("Modo: " + modoOperacion);
        System.out.println("Temperatura: " + temperaturaActual + " grados");
    }
}