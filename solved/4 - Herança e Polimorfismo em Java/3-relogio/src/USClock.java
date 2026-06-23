public final class USClock extends Clock {

    private String period = "AM";

    @Override
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        if (hour == 0) {
            this.period = "AM";
            this.hour = 12;
        } else if (hour < 12) {
            this.period = "AM";
            this.hour = hour;
        } else if (hour == 12) {
            this.period = "PM";
            this.hour = 12;
        } else {
            this.period = "PM";
            this.hour = hour - 12;
        }
    }

    public String getPeriod() {
        return period;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + period;
    }

    @Override
    public Clock convert(Clock clock) {
        setMinute(clock.getMinute());
        setSecond(clock.getSecond());

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.period = usClock.getPeriod();
            }
            case BRLClock brlClock -> setHour(brlClock.getHour());
        }
        return this;
    }
}
