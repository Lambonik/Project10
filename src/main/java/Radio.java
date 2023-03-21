public class Radio {
    public int currentNumStation;
    public int currentVolume;

    public void setCurrentNumStation(int newCurrentNumStation) {
        if (newCurrentNumStation < 0 || newCurrentNumStation > 9) {
            return;
        }
        currentNumStation = newCurrentNumStation;
    }

    public void next() {
        int target;
        if (currentNumStation == 9) {
            target = 0;
        } else {
            target = currentNumStation + 1;
        }
        setCurrentNumStation(target);
    }

    public void prev() {
        int target;
        if (currentNumStation == 0) {
            target = 9;
        } else {
            target = currentNumStation - 1;
        }
        setCurrentNumStation(target);
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
