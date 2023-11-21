package Ristorante;

public abstract class Piatto implements Cucinabile {
    private String nome;
    private String ricetta;

    public Piatto(String nome, String ricetta) {
        this.nome = nome;
        this.ricetta = ricetta;
    }

    //TODO: getter e setter
}
