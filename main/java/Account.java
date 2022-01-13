public class Account {

    private String name;

    public Account(String name) {this.name = name;}

    public boolean checkNameToEmboss() {
        String newName = name.replace(" ", "");
        boolean result;
        if (name.length() >= 3 && name.length() <= 19 && name.equals(name.trim()) && name.length() - newName.length() == 1) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
        }
    }
