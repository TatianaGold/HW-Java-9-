package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(7);

        int expected = 7;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAbove() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioBelow() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioMinus() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(8);

        int expected = 8;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() {
        Radio vol = new Radio();
        vol.setCurrentVolume(11);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDown() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMinus() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextRadioSwitch() {
        Radio station = new Radio();
        station.setCurrentRadio(8);
        station.next();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioSwitchLast() {
        Radio station = new Radio();
        station.setCurrentRadio(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioSwitchAbove() {
        Radio station = new Radio();
        station.setCurrentRadio(10);
        station.next();

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioSwitch() {
        Radio station = new Radio();
        station.setCurrentRadio(8);
        station.prev();

        int expected = 7;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioSwitchFirst() {
        Radio station = new Radio();
        station.setCurrentRadio(0);
        station.prev();

        int expected = 9;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioSwitchLast() {
        Radio station = new Radio();
        station.setCurrentRadio(9);
        station.prev();

        int expected = 8;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void changeIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(8);
        volume.increaseVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeIncreaseVolumeAbove() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeReductionVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(3);
        volume.reductionVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeReductionVolumeBelow() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reductionVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

