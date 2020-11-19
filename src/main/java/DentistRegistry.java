import java.lang.reflect.Array;
import java.util.ArrayList;

public class DentistRegistry {
    public static ArrayList<Dentist> Dentists = new ArrayList<>();

    public DentistRegistry(ArrayList<Dentist> dentists) {
        Dentists = dentists;
    }

    public static ArrayList<Dentist> getDentists() {
        return Dentists;
    }

    public static void setDentists(ArrayList<Dentist> dentists) {
        Dentists = dentists;
    }

    @Override
    public String toString() {
        return "DentistRegistry{}";
    }
}
