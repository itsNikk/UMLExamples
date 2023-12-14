package quartaAI.MonitoraggioPrigione;

public class SistemaMonitoraggio implements Accendibile {
    private Sensore[] sensori;

    @Override
    public void spegni() {

    }

    @Override
    public void accendi() {
        for (int i = 0; i < sensori.length; i++) {
            sensori[i].accendi();
        }
    }

    public void elaboraStatistiche(){}

    //Traduzione aggregazione
    public void aggiungiSensore(Sensore sensore){}
    public void rimuoviSensore(Sensore sensore){}
}
