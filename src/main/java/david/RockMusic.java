package david;
import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{

    @Override
    public String toString() {
        return "RockMusic";
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
