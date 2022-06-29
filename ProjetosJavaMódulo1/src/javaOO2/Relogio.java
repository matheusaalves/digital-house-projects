package javaOO2;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        if (validaHora(hora)) {
            this.hora = hora;
        }
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public int getHora() {
        return   hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int novaHora) {
        if (validaHora(novaHora)) {
            hora = novaHora;
        }
    }

    public void setMinuto(int minuto) {
        if(validaMinutoSegundo(minuto)) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if(validaMinutoSegundo(segundo)) {
            this.segundo = segundo;
        }
    }

    public boolean validaHora(int hora) {
        if(hora >= 0 && hora <= 24) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validaMinutoSegundo(int tempo) {
        if(tempo >= 0 && tempo <= 60) {
            return true;
        } else {
            return false;
        }
    }

    public void alterarMinuto(int novoMinuto) {
        minuto = novoMinuto;
    }

    public void mostrarHoraCompleta() {
        System.out.println(
                hora + ":" +
                minuto + ":" +
                segundo);
    }
}
