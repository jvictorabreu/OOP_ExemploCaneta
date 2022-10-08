public class Caneta {
    public static void main(String[] args) {
        // Instanciando objeto caneta 1.
        Pen c1 = new Pen();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
//        c1.status();
        c1.setTampada(true);
        System.out.println("Está é uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + ".");
    }
}
