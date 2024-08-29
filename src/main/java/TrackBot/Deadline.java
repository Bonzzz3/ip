package TrackBot;

public class Deadline extends Task {
    protected String by;
//    protected LocalDate date;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
        this.by = Parser.checkDateFormat(by);
//        date = TrackBot.TrackBot.Parser.checkDateFormat(by);
    }
    @Override
    public String toStorageFormat() {
        return "D | " + (isDone ? "1" : "0") + " | " + desc + " | " + by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
