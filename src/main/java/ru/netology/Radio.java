package ru.netology;

public class Radio {
    private int currentRadio;
    private int countRadio = 10;
    private int minRadioLevel = 0;
    private int maxRadioLevel = 9;
    private int currentVolume;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;
    
    public Radio(int countRadio) {
        this.maxRadioLevel = countRadio - 1;
    }

    public Radio() {
        this.countRadio = countRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMinRadioLevel() {
        return minRadioLevel;
    }

    public int getMaxRadioLevel() {
        return maxRadioLevel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > maxRadioLevel) {
            newCurrentRadio = 0;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadio == maxRadioLevel) {
            currentRadio = 0;
        } else {
            currentRadio++;
        }
    }

    public void prev() {
        if (currentRadio == minRadioLevel) {
            currentRadio = maxRadioLevel;
        } else {
            currentRadio--;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxVolumeLevel) {
            return;
        }
        this.currentVolume++;
    }

    public void reductionVolume() {
        if (currentVolume == minVolumeLevel) {
            return;
        }
        this.currentVolume--;
    }
}
