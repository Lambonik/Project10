public class Radio {
    private int currentNumStation;
    private int maxNumStation;
    private int currentVolume;
    private int quantityStation;
    private int defaultQuantityStation = 10;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.maxNumStation = quantityStation - 1;
    }

    public Radio() {
        maxNumStation = defaultQuantityStation - 1;
    }

    public int getCurrentNumStation() {
        return currentNumStation;
    }

    public int getMaxNumStation() {
        return maxNumStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumStation(int newCurrentNumStation) {
        if (newCurrentNumStation < 0 || newCurrentNumStation > maxNumStation) {
            return;
        }
        currentNumStation = newCurrentNumStation;
    }

    public void next() {
        int target;
        if (currentNumStation == maxNumStation) {
            target = 0;
        } else {
            target = currentNumStation + 1;
        }
        setCurrentNumStation(target);
    }

    public void prev() {
        int target;
        if (currentNumStation == 0) {
            target = maxNumStation;
        } else {
            target = currentNumStation - 1;
        }
        setCurrentNumStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
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
