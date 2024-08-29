package TrackBot.commands;

import TrackBot.TrackBotStorage;
import TrackBot.TrackList;
import TrackBot.Ui;

public class ExitCommand extends Command {
    @Override
    public void execute(TrackList trackList, Ui ui, TrackBotStorage storage) {
        ui.showBye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}