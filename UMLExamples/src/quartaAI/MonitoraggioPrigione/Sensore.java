package quartaAI.MonitoraggioPrigione;

public abstract class Sensore implements Accendibile {

    private String ID;
    private String marca;
    private String modello;

    public abstract void eseguiDiagnostica();

}
