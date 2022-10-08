// Criando os atributos e métodos da classe Pen.
public class Pen {
    private String modelo;
    private String cor;
    private float ponta;
    private float carga = 100;
    private boolean tampada;

    // Criando método Construtor que deve ter o mesmo nome da Classe.
    public void Pen(){

    }

    //Setter and getter para Modelo
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    //Setter and getter para Cor
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    //Setter and getter para Ponta
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    //Setter and getter para Carga
    public float getCarga(){
        return this.carga;
    }
    public void setCarga(float ca){
        this.carga = ca;
    }

    //Setter and getter para Tampada
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(Boolean t){
        this.tampada = t;
    }

    public void status(){
        System.out.println("Modelo: " + this.getModelo());
//        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
//        System.out.println("Carga: " + this.carga);
//        System.out.println("Está tampada?: " + this.tampada);
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
