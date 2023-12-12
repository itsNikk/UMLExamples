package quartaBI.MonitoraggioPrigione;

public abstract class Sensore implements Accendibile {
    private int ID;
    private String marca;
    private String modello;

    public abstract void eseguiDiagnostica();

}
