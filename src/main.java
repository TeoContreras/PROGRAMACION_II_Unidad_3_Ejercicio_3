public class main {
    public static void main(String[] args) {
        Termostato termostato = new Termostato(22, "Automatico");
        termostato.setTemperatura(25);
        termostato.setTemperatura(35);
        termostato.setTemperatura(10);
        termostato.mostrarEstado();
    }
}