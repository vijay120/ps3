public class Course {
    
    private String name;
    private int id;
    private String semester;

    public Course () {
	name = "";
	id = 0;
    semester = "";
    }

    public String getName () {
	return name;
    }
    public int getID () {
	return id;
    }
    public String getSemester() {
        return semester;
    }

    public void setName (String name) {
	this.name = name;
    }
    public void setID (int id) {
    	this.id = id;
    }
    public void setSemester (String semester) {
        this.semester = semester;
    }

    public String toString( ) {

        return name + " " + id + " " + semester;

    }


}