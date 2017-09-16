import java.util.Date;
import java.util.Arrays;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		
		return students;
		
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			this.students=students;
		}
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if(index<0||index>=students.length)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			return students[index];
		}
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0||index>=students.length||students==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
        Student[] students1=new Student[students.length+1];
        students1[0]=student;
        for(int i=1;i<students.length+1;i++)
        	students1[i]=students[i];
		 students = Arrays.copyOf(students1, students.length + 1);
		 }
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
		students = Arrays.copyOf(students, students.length + 1);
		students[students.length]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0||index>=students.length||students==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
		Student[] result = new Student[students.length];
	    for(int i = 0; i < index; i++)
	        result[i] = students[i];
	    result[index] = student;
	    for(int i = index + 1; i < students.length; i++)
	        result[i] = students[i - 1];
	    students = Arrays.copyOf(result, students.length + 1);
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		//students = ArrayUtils.remove(students, index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}