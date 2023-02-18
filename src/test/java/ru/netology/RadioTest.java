package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void countRadio () {
        Radio radio = new Radio(50);

        Assertions.assertEquals(49,radio.getMaxRadioLevel());
        Assertions.assertEquals(0, radio.getMinRadioLevel());

    }
    @Test
    public void countRadioDefault () {
        Radio radio = new Radio();

        Assertions.assertEquals(9,radio.getMaxRadioLevel());
        Assertions.assertEquals(0, radio.getMinRadioLevel());

    }
    @Test
    public void setCurrentRadio () {
        Radio radio = new Radio(30);
        radio.setCurrentRadio(7);

        Assertions.assertEquals(29,radio.getMaxRadioLevel());
        Assertions.assertEquals(7,radio.getCurrentRadio());

    }
    @Test
    public void setCurrentRadioAbove(){
        Radio radio = new Radio(30);
        radio.setCurrentRadio(30);

        Assertions.assertEquals(29,radio.getMaxRadioLevel());
        Assertions.assertEquals(0,radio.getCurrentRadio());
    }
    @Test
    public void setCurrentVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(58);

        Assertions.assertEquals(58, vol.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeAbove(){
        Radio vol = new Radio();
        vol.setCurrentVolume(110);

        Assertions.assertEquals(100, vol.getCurrentVolume());
    }
    @Test
    public void nextRadioLast(){
        Radio station = new Radio();
        station.setCurrentRadio(9);
        station.next();

        Assertions.assertEquals(0, station.getCurrentRadio());
    }
    @Test
    public void nextRadioFirst(){
        Radio station = new Radio();
        station.setCurrentRadio(0);
        station.next();

        Assertions.assertEquals(1, station.getCurrentRadio());
    }
    @Test
    public void prevRadioFirst(){
        Radio station = new Radio();
        station.setCurrentRadio(0);
        station.prev();

        Assertions.assertEquals(9, station.getCurrentRadio());
    }
    @Test
    public void prevRadioLast(){
        Radio station = new Radio();
        station.setCurrentRadio(9);
        station.prev();

        Assertions.assertEquals(8, station.getCurrentRadio());
    }
    @Test
    public void increaseVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(78);
        vol.increaseVolume();

        Assertions.assertEquals(79, vol.getCurrentVolume());
    }
    @Test
    public void increaseVolumeUp(){
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        Assertions.assertEquals(100, vol.getCurrentVolume());
    }
    @Test
    public void reductionVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(17);
        vol.reductionVolume();

        Assertions.assertEquals(16, vol.getCurrentVolume());
    }
    @Test
    public void reductionVolumeDown() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.reductionVolume();

        Assertions.assertEquals(0, vol.getCurrentVolume());
    }
}

