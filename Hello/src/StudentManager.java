import java.util.Scanner;

public class StudentManager {
	
	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray; //학생객체를 담을 수 있는 배열
	private int currentNumber; //현재 몇명의 학생이 등록되어 있는지 변수
	
	public StudentManager() {
		studentArray = new Student[MAX_PEOPLE];
		currentNumber = 0;
	}
	
	public StudentManager(int size)
	{
		studentArray = new Student[size];
		currentNumber = 0;
	}
	
	public void addStudent()
	{
		if(studentArray.length == currentNumber)
		{
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("학생의 정보를 입력해 주세요.");
		

		//1. 학생 하나를 먼저 생성
		Student student = new Student();
		
		//2. 학생 정보를 입력 받아서 
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 이름:");
		String name = scan.next();
		student.setName(name);
		
		System.out.print("학생의 나이:");
		int age = scan.nextInt();
		student.setAge(age);
		
		System.out.print("학생의 성별(M 또는 F):");
		String gender = scan.next();
		if(gender.equals("M"))
		{
			student.setMan(true);
		}else {
			student.setMan(false);
		}

		System.out.print("학생의 폰번호:");
		String phone = scan.next();
		student.setPhone(phone);
		
		System.out.print("학생의 주소:");
		String address = scan.next();
		student.setAddress(address);
		
		System.out.println("입력이 완료 되었습니다.");
		//배열에 학생객체를 대입
		studentArray[currentNumber] = student;
		currentNumber++;
		System.out.println("총 " + currentNumber +" 명 등록되어 있습니다.");
	}
	
	public void findAndPrint(String name)
	{
		//입력 받은 name과 일치하는 학생이 있는지 찾아서
		//만약 일치하는 학생이 있으면 그 학생의 정보 출력
		//없으면 일치하는 사람 없다고 출력
		for(int i=0; i<currentNumber; i++)
		{
			if(name.equals(studentArray[i].getName())) {
				studentArray[i].print();
				return;
			}
		}
		
		System.out.println(name + " 학생은 등록되어 있지 않습니다.");
	}

	public void printAll() {
		//현재 등록되어 있는 학생들의 정보 출력
		for(int i=0; i<currentNumber; i++)
		{
			System.out.println(i + "번 학생 정보");
			studentArray[i].print();
		}
	}
	
}
