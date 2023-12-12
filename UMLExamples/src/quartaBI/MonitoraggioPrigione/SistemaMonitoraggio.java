package quartaBI.MonitoraggioPrigione;

public class SistemaMonitoraggio implements Accendibile {
    private Sensore[] sensori;

    @Override
    public void accendi() {
        for (int i = 0; i < sensori.length; i++) {
            sensori[i].accendi();
        }
    }

    @Override
    public void spegni() {
        //spegni tutti i sensori
        for (int i = 0; i < sensori.length; i++) {
            sensori[i].spegni();
        }
    }

    public void elaboraStatistiche(){

    }

    public void aggiungiSensore(Sensore sensore){}
    public void rimuoviSensore(Sensore sensore){}
}
