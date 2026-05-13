class RadioPlayer implements Player {

    public boolean onOff;
    public double[] stationList;
    public int volume;
    public double station;
    public int stationOrder;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
        this.stationOrder = 0;
    }

    public void start() {
        this.onOff = true;
        station = stationList[0];
    }

    public void stop() {
        this.onOff = false;
        station = 0;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 2;
    }

    public void volumeDown() {
        this.volume -= 2;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        stationOrder += 1;
        this.station = stationList[stationOrder];
    }

    public void previous() {
        stationOrder -= 1;
        this.station = stationList[stationOrder];
    }

    public double getStation() {
        return this.station;
    }

}