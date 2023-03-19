package david;

public class ClassicalMusic implements Music{

    @Override
    public String toString() {
        return "ClassicalMusic";
    }

    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
