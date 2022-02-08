
package Package1;
/**
 * Representa la clase Career compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
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
    /**
     * Muestra el parametro programs
     * @param programs
     */
    public void setPrograms(ArrayList<String> programs) {
        this.programs = programs;
    }

    public String getFaculty() {
        return faculty;
    }
    /**
     * Muestra el parametro faculty
     * @param faculty
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    /**
     * Muestra el parametro studentNumber
     * @param studentNumber
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
}
