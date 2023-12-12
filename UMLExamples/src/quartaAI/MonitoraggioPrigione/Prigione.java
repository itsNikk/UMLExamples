package quartaAI.MonitoraggioPrigione;

public class Prigione {
    private String nome;
    private String indirizzo;
    private SistemaMonitoraggio[] sistemiMonitoraggio;

    public Prigione(SistemaMonitoraggio[] sistemiMonitoraggio){
        this.sistemiMonitoraggio = sistemiMonitoraggio;
    }

    public void aggiungiSistema(SistemaMonitoraggio sistema){
        //impl
    }

    public void rivmuoviSistema(SistemaMonitoraggio sistema){
        //impl
    }
}
