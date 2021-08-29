class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(final int hours) {
        this.hours = hours;
    }

    public Time(final int hours, final int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(final int hours, final int minutes, final int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}