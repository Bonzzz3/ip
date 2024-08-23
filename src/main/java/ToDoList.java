import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    List<Task> list = new ArrayList<Task>();

    public void addToList(Task task) throws TrackBotException {
        if (task == null) {
            throw new TrackBotException("No task found.");
        }
        list.add(task);
        System.out.println("````````````````````````````````````````````````````````````");
        System.out.println("Successfully added this task:\n  " + task.toString());
        System.out.println("Now you have " + list.size() + " tasks in the list.");
        System.out.println("````````````````````````````````````````````````````````````");
    }

    public void markTask(int num) throws TrackBotException {
        if (num < 0 || num > list.size() - 1) {
            throw new TrackBotException("Invalid task number.");
        }
        list.get(num).mark();
        System.out.println("````````````````````````````````````````````````````````````");
        System.out.println("Successfully marked task " + (num + 1) + " as done.");
        System.out.println("  " + list.get(num).toString());
        System.out.println("````````````````````````````````````````````````````````````");

    }

    public void unmarkTask(int num) throws TrackBotException {
        if (num < 0 || num > list.size() - 1) {
            throw new TrackBotException("Invalid task number.");
        }
        list.get(num).unmark();
        System.out.println("````````````````````````````````````````````````````````````");
        System.out.println("Successfully marked task " + (num + 1) + " as not done yet.");
        System.out.println("  " + list.get(num).toString());
        System.out.println("````````````````````````````````````````````````````````````");
    }

    public void listToString() throws TrackBotException {
        if (list.isEmpty()) {
            throw new TrackBotException("The list is currently empty.");
        }
        System.out.println("````````````````````````````````````````````````````````````\n" + "List:");
        int i = 1;
        for (Task item : list) {
            System.out.print(i + ". " + item.toString() + "\n");
            i++;
        }
        System.out.println("````````````````````````````````````````````````````````````");
    }

//       public String deleteFromList(String str) {
//        if (list.contains(str)) {
//            list.remove(str);
//            return "Successfully deleted " + str + " from list.";
//        } else {
//            return "Failed to delete " + str + " from list.";
//        }
//    }
}
