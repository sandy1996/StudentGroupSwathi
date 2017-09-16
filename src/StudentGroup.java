import java.util.Date;
import java.util.Arrays;
import java.util.Calendar;

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
		Student[] result = new Student[students.length+1];
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
		if(index<0||index>=students.length)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else {
		Student[] studentsnew = new Student[students.length];
		studentsnew=students;
		 int i = 0;
		    int x = 0;
		    while(i < students.length)
		    {
		        if(studentsnew[i] == students[index])
		        	i++;

		        studentsnew[x] = students[i];
		        i++;
		        x++;
		    }
		   /* if(studentsnew.equals(students))
		    {
		    	 throw new IllegalArgumentException( "Student not exist");
		    }*/
		    students = Arrays.copyOf(studentsnew, studentsnew.length);
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
		{
			 throw new IllegalArgumentException( "exception");
		}
		else
		{
		Student[] studentsnew = new Student[students.length];
		studentsnew=students;
		int count=0;
		for(Student stud:studentsnew) 
		{if(stud==student)
		{	
		if(count==1)
			break;
		count++;
		}
		}
		if(count==0)
		{
			 throw new IllegalArgumentException( "Student does not exist");
		}
		int i = 0;
	    int x = 0;
	    while(i < students.length)
	    {
	        if(studentsnew[i] == student )
	        	i++;

	        studentsnew[x] = students[i];
	        i++;
	        x++;
	    }
	    students = Arrays.copyOf(studentsnew, studentsnew.length);
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student[] studentsnew = new Student[students.length];
		if(index<0||index>=students.length)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			for(int i=0; ;i++)
			{
				
				if(i==index)break;
				studentsnew[i]=students[i];
				
			}
		}
		students = Arrays.copyOf(studentsnew, studentsnew.length);
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		Student[] studentsnew = new Student[students.length];
		if(student==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			for(int i=0; ;i++)
			{
				
				if(students[i]==student)break;
				studentsnew[i]=students[i];
				
			}
		}
		students = Arrays.copyOf(studentsnew, studentsnew.length);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Student[] studentsnew = new Student[students.length];
		if(index<0||index>=students.length)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			for(int i=0;i<students.length ; i++)
			{
				if(i>index)
				studentsnew[i]=students[i];
			}
			students = Arrays.copyOf(studentsnew, studentsnew.length);
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int k=0;
		Student[] studentsnew = new Student[students.length];
		if(student==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			for(int i=0;i<students.length ; i++)
			{
				if(student==students[i])
				{
					for(int j=i;j<students.length;j++)
					{
				studentsnew[k]=students[j];
				k++;
					}
				}
			}
			students = Arrays.copyOf(studentsnew, studentsnew.length);
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		 boolean noChange = true; // stop when a pass causes no change
         for(int i = students.length; i > 0; i--)
         {
              noChange = true;
              for(int j = 1; j < i; j++)
              {
                   if(students[j].compareTo(students[j - 1]) < 0)
                   {
                        StudentGroup.swap(students, j, j - 1);
                        noChange = false;
                   }
              } 
              if (noChange)
                   return; // sorted--no need to continue
         }
	}
	static void swap(Student[] array, int index1, int index2)
    {
         Student temp = array[index1];
         array[index1] = array[index2];
         array[index2] = temp;
    } 

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student[] studentsnew = new Student[students.length];
		if(date==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
		for(int i=0;i<students.length;i++)
		{if(students[i].getBirthDate().before(date)||students[i].getBirthDate().equals(date))
		{
			studentsnew[i]=students[i];
		}
			
		
		}
		return studentsnew;
	}
	}
	

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] studentsnew = new Student[students.length];
		if(firstDate==null||lastDate==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{
			for(int i=0;i<students.length;i++)
			{if(students[i].getBirthDate().before(lastDate)||students[i].getBirthDate().after(firstDate))
			{
				studentsnew[i]=students[i];
			}
				
			
			}
			return studentsnew;
	}
	}
	
	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		Calendar c = Calendar.getInstance(); 
		Student[] studentsnew = new Student[students.length];
		if(date==null)
		{
			throw new IllegalArgumentException("illegal expression");
		}
		else
		{//Calendar c = Calendar.getInstance(); 
		c.setTime(date);
		c.add(Calendar.DATE, 5);
		date=c.getTime();
			for(int i=0;i<students.length;i++)
			{if(students[i].getBirthDate().equals(date)||students[i].getBirthDate().before(date))
			{
				studentsnew[i]=students[i];
			}
				
			
			}
			return studentsnew;
		}
		//return null;
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
