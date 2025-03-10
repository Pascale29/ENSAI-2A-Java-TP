package fr.ensai.library;

/**
 * Represents a student.
 */

public class Student extends Person{

    // Attributes
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new student object.
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate ;
    }

    // Getter for academicYear
    public int getAcademicYear() {
        return academicYear;
    }

    // Setter for academicYear
    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    // Getter for isClassDelegate
    public boolean getIsClassDelegate() {
        return isClassDelegate;
    }

    // Setter for isClassDelegate
    public void setIsClassDelegate(boolean isClassDelegate) {
        this.isClassDelegate = isClassDelegate;
    }

    
}
