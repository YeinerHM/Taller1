
package Package1;

import java.util.ArrayList;

public class Career {
    //Atributos
    public ArrayList<String> programs;
    private String faculty;
    protected int studentNumber;
    //Metodos

    public Career(ArrayList<String> programs, String faculty, int studentNumber) {
        this.programs = programs;
        this.faculty = faculty;
        this.studentNumber = studentNumber;
    }

    public ArrayList<String> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<String> programs) {
        this.programs = programs;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
}
