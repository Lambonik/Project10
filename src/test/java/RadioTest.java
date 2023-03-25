import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void setUserQuantityStation() {
        Radio rad = new Radio(25);
        int expected = 24;
        int actual = rad.getMaxNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumStation() {
        rad.setCurrentNumStation(9);
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentNumStationAboveMax() {
        rad.setCurrentNumStation(15);
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentNumStationBelowMin() {
        rad.setCurrentNumStation(-15);
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        rad.setCurrentNumStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAboveMax() {
        rad.setCurrentNumStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        rad.setCurrentNumStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevBelowMin() {
        rad.setCurrentNumStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 11;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
