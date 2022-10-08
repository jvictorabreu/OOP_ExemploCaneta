// Criando os atributos e métodos da classe Pen.
public class Pen {
    public String modelo;
    public String cor;
    private float ponta;
    private float carga = 100;
    private boolean tampada;


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
//        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }

    public void escrever(){
        if (this.tampada) {
            System.out.println("ERRO!! A caneta " + this.cor + " está tampada.");
        } else if (this.carga <= 0) {
            System.out.println("ERRO!! A caneta " + this.cor + " está sem tinta.");
        } else {
            System.out.println("Escrevendo com a caneta " + this.cor + ".");
            carga = (int) (carga - carga * 0.05);
            System.out.println("Carga atual da caneta: "+ this.cor +" é de " + this.carga);
        }
    }

    public void tampar(){
        System.out.println("Tampando a caneta " + this.cor + ".");
        this.tampada = true;
    }

    public void destampar(){
        System.out.println("Destampando a caneta " + this.cor + ".");
        this.tampada = false;
    }
}
