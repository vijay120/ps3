public class Student {
    
    private String name;
    private String addr;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private int id;
    private String major;
    private int gpa;

    public Student () {
	name = "";
	addr = "";
	city = "";
	state = "";
	zip = "";
	phone = "";
	id = 0;
	major = "";
	gpa = 0;
    }

    public String getName () {
	return name;
    }
    public String getAddr () {
	return addr;
    }
    public String getCity () {
	return city;
    }
    public String getState () {
	return state;
    }
    public String getZip () {
	return zip;
    }
    public String getPhone () {
	return phone;
    }
    public int getID () {
	return id;
    }
    public String getMajor () {
	return major;
    }
    public int getGPA () {
	return gpa;
    }

    public void setName (String name) {
	this.name = name;
    }
    public void setAddr (String addr) {
	this.addr = addr;
    }
    public void setCity (String city) {
	this.city = city;
    }
    public void setState (String state) {
	this.state = state;
    }
    public void setZip (String zip) {
	this.zip = zip;
    }
    public void setPhone (String phone) {
	this.phone = phone;
    }
    public void setID (int id) {
    	this.id = id;
    }
    public void setMajor (String major) {
	this.major = major;
    }
    public void setGPA (int gpa) {
	this.gpa = gpa;
    }

    public String toString( ) {

        return name + " " + id + " " + major + " " + Integer.toString(gpa); 

    }




}