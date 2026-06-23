public final class BRLClock extends Clock {

    @Override
    public Clock convert(Clock clock) {
        setMinute(clock.getMinute());
        setSecond(clock.getSecond());

        switch (clock) {
            case USClock usClock -> {
                int hour = usClock.getHour();
                if (usClock.getPeriod().equals("PM")) {
                    setHour(hour == 12 ? 12 : hour + 12);
                } else {
                    setHour(hour == 12 ? 0 : hour);
                }
            }
            case BRLClock brlClock -> setHour(brlClock.getHour());
        }
        return this;
    }
}
