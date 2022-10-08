public class Caneta {
    public static void main(String[] args) {
        // Instanciando objeto caneta 1.
        Pen c1 = new Pen();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
//        c1.carga = 80;
//        c1.tampada = false;
        c1.destampar();
//        c1.status();
        c1.escrever();

        System.out.println("");

        Pen c2 = new Pen();
        c2.modelo = "Faber Castel";
        c2.cor = "Vermelha";
        c2.tampar();
        c2.status();
        c2.escrever();
    }
}
