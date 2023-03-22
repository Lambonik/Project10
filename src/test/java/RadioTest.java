import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentNumStation() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(9);
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentNumStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(15);
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentNumStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(-15);
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentNumStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 11;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
