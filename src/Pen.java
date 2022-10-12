// Criando os atributos e métodos da classe Pen.
public class Pen {
    private String modelo;
    private String cor;
    private float ponta;
    private float carga = 100;
    private boolean tampada;


    // Construct Method
    public Pen(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    // Getter and setter for modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Getter and setter for cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Getter and setter for ponta
    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }


    //Getter and setter for carga
    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }


    //is? and setter for tampada
    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }


    //Method to demonstrate the pen status
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
//        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }

    //Method to write with the object Pen
    public void escrever(){
        if (this.tampada) {
            System.out.println("ERRO!! A caneta " + this.cor + " está tampada.");
        } else if (this.carga <= 0) {
            System.out.println("ERRO!! A caneta " + this.cor + " está sem tinta.");
        } else {
            System.out.println("Escrevendo com a caneta " + this.cor + ".");
            this.carga = (int) (this.carga - this.carga * 0.05);
            System.out.println("Carga atual da caneta: "+ this.cor +" é de " + this.carga);
        }
    }

    //Method to close the object Pen
    public void tampar() {
        System.out.println("Tampando a caneta " + this.cor + ".");
        this.tampada = true;
    }


    //Method to open the object Pen
    public void destampar() {
        System.out.println("Destampando a caneta " + this.cor + ".");
        this.tampada = false;
    }
}
