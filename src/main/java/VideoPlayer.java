public class VideoPlayer implements Player {
    
    public boolean onOff;
    public String videoString;
    public String video;
    public int currentTime;
    public int volume;


    public VideoPlayer (String video) {
        this.video = video;
        this.onOff = false;
        this.currentTime = 0;
        this.volume = 0;
    }

    public void start() {
        this.onOff = true;
    }

    public void stop() {
        this.onOff = false;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 5;
    }

    public void volumeDown() {
        this.volume -= 5;
    }

    public int getVolume() {
        return this.volume;
    }

    public void fastForward() {
        this.currentTime += 5;
    }

    public void rewind() {
        this.currentTime -=5;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

}
