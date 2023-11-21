package quartaAI.Ristorante2;

public class Ristorante {
    private String nome;
    private Menu menu;
    private Cuoco[] cuochi;

    public boolean richiediPiatto(Piatto piatto){
        return false;
    }

    public String getNome(){
        return this.nome;
    }
}
