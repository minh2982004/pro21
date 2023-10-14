
package Controller;


import Responsibility.PersonReposibility;
import view.Menu;


public class FileHandler extends Menu<String>{
    static String[] mc = {"Find person info", "Copy Text to new file", "Exit"};
    PersonReposibility program;

    public FileHandler() {
        super("\nFile Processing", mc);
        program = new PersonReposibility();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.findPersonInfo();
                break;
            case 2:
                program.copyNewFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}