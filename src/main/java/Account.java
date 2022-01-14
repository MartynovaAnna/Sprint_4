public class Account {

    private final String name;

    public Account(String name) {this.name = name;}

    public boolean checkNameToEmboss() {
        if (name == null) {return false;}

        String newName = name.replace(" ", "");
        return (name.length() >= 3 && name.length() <= 19 && name.equals(name.trim()) && name.length() - newName.length() == 1);
    }
}
