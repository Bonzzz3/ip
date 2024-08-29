package TrackBot.commands;

import TrackBot.Task;
import TrackBot.TrackBotException;
import TrackBot.TrackBotStorage;
import TrackBot.TrackList;
import TrackBot.Ui;

public class AddCommand extends Command {
    private final Task task;

    public AddCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute(TrackList trackList, Ui ui, TrackBotStorage storage) throws TrackBotException {
        trackList.addToList(task);
    }
}
