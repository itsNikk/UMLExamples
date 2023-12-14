package quartaAI.MonitoraggioPrigione;

public class Prigione {
    private String nome;
    private String indirizzo;
    private SistemaMonitoraggio[] sistemiMonitoraggio;

    // traduzione aggregazione
    public void aggiungiSistemaMointoraggio(SistemaMonitoraggio sistemaMonitoraggio) {
    }

    public void rimuoviSistemaMointoraggio(SistemaMonitoraggio sistemaMonitoraggio) {
    }

    //traduzione composizione
    public Prigione(SistemaMonitoraggio[] sistemi) {
        sistemiMonitoraggio = sistemi;
    }
}
