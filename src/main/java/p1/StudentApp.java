package p1;

public class StudentApp {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("anshu");
		s1.setRoll("117");
		
		HibernateManager hbm=new HibernateManager();
		hbm.saveObj(s1);
	}
}
