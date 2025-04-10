public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void canalTrocar () {
        canal = 5;
    }

    public void aumentarVolume () {
        volume = ++volume;
    }

    public void dimunuirVolume () {
        volume = ++volume;
    }

    public void subirCanal () {
        canal = ++canal;
    }

    public void descerCanal () {
        if (canal == 1) {
            canal = 1;
        }
        else
            canal = --canal;
    }
}
