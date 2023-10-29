package sit.int202.int202_65130500050.Model;

import java.util.ArrayList;
import java.util.List;

public class SubjectReposity {
    private static List<Subject> subjects;

    public List<Subject> findAll(){
        return  subjects;
    }

    public SubjectReposity(){
        initialize();
    }

    private void initialize() {
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("050" , "Panipak" , 3.24));
    }


}
