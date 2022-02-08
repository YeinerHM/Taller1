
package Package1;
/**
 * Representa la clase Career compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
import java.util.ArrayList;

public class Career {
    /**
     * Atributos de la clase Career
     */
    public ArrayList<String> programs;
    private String faculty;
    protected int studentNumber;
    /**
     * Metodo constructor de la clase career
     * @param programs primer parametro.
     * @param faculty segundo parametro.
     * @param studentNumber tercer parametro.
     */
    public Career(ArrayList<String> programs, String faculty, int studentNumber) {
        this.programs = programs;
        this.faculty = faculty;
        this.studentNumber = studentNumber;
    }
    /**
     * Modifica el parametro programs
     * @return retorna un ArrayList de programs
     */
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
    /**
     * Modifica el parametro faculty
     * @return retorna un String de faculty
     */
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
    /**
     * Modifica el parametro studentNumber
     * @return retorna un int de studentNumber
     */
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
