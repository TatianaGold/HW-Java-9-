package ru.netology;

public class Radio {
    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0 || newCurrentRadio > 9) {
            newCurrentRadio = 0;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10 || newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadio == 9) {
            currentRadio = 0;
        } else {
                currentRadio++;
        }
    }

    public void prev() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
