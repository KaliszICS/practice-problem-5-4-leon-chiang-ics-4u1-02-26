class MusicPlayer implements Player {

    public boolean onOff;
    public String[] musicList;
    public String currentSong;
    public int volume;
    public int song;

    public MusicPlayer (String[] musicList) {
        this.onOff = false;
        this.musicList = musicList;
        this.currentSong = "";
        this.volume = 0;
        this.song = 0;
    }

    public void start() {
        this.onOff = true;
        this.song = 0;
        this.currentSong = musicList[0];
    }

    public void stop() {
        this.song = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        this.song++;
        this.currentSong = musicList[song];

    }

    public void previous() {
        this.song--;
        this.currentSong = musicList[song];
    }

    public String getCurrentSong() {
        return this.currentSong;
    }

    

}