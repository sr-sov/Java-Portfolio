public class Animal {
    private String description = "Fauna";

    public static String Bark() {
        return "Woof!\n";
    }

    public void changeDescription(String description){
        this.description = description;
        printDescription();

    }

    public String getDescription(){
        return this.description;
    }

    //private methods
    private void printDescription(){
        System.out.println("New Description: "+ this.description);
    }
}
