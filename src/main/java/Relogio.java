package main.java;

public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public void configHorasMinutosSegundos(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void meiaNoite() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    private int inicioHoras;
    private int inicioMinutos;
    private int inicioSegundos;

    private int fimHoras;
    private int fimMinutos;
    private int fimSegundos;

    public void inicioIntervalo(int horas, int minutos, int segundos) {
        inicioHoras = horas;
        inicioMinutos = minutos;
        inicioSegundos = segundos;
    }

    public void fimIntervalo(int horas, int minutos, int segundos) {
        fimHoras = horas;
        fimMinutos = minutos;
        fimSegundos = segundos;
    }

    public int tempoDecorrido() {
        int segundosInicio = inicioHoras * 3600 + inicioMinutos * 60 + inicioSegundos;
        int segundosFim = fimHoras * 3600 + fimMinutos * 60 + fimSegundos;
        return segundosFim - segundosInicio;
    }

    public String display24H() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    } 
    
    public String displayAMPM() {
        String ampm = (horas < 12) ? "AM" : "PM";
        int horasFormatadas = (horas < 12) ? horas : horas - 12;
        if (horasFormatadas == 0) {
            horasFormatadas = 12;
        }
        return String.format("%02d:%02d:%02d %s", horasFormatadas, minutos, segundos, ampm);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    
}
