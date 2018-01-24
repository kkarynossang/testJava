import java.util.Scanner;

public class StudentManager {
	
	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray; //�л���ü�� ���� �� �ִ� �迭
	private int currentNumber; //���� ����� �л��� ��ϵǾ� �ִ��� ����
	
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
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("�л��� ������ �Է��� �ּ���.");
		

		//1. �л� �ϳ��� ���� ����
		Student student = new Student();
		
		//2. �л� ������ �Է� �޾Ƽ� 
		Scanner scan = new Scanner(System.in);
		System.out.print("�л��� �̸�:");
		String name = scan.next();
		student.setName(name);
		
		System.out.print("�л��� ����:");
		int age = scan.nextInt();
		student.setAge(age);
		
		System.out.print("�л��� ����(M �Ǵ� F):");
		String gender = scan.next();
		if(gender.equals("M"))
		{
			student.setMan(true);
		}else {
			student.setMan(false);
		}

		System.out.print("�л��� ����ȣ:");
		String phone = scan.next();
		student.setPhone(phone);
		
		System.out.print("�л��� �ּ�:");
		String address = scan.next();
		student.setAddress(address);
		
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		//�迭�� �л���ü�� ����
		studentArray[currentNumber] = student;
		currentNumber++;
		System.out.println("�� " + currentNumber +" �� ��ϵǾ� �ֽ��ϴ�.");
	}
	
	public void findAndPrint(String name)
	{
		//�Է� ���� name�� ��ġ�ϴ� �л��� �ִ��� ã�Ƽ�
		//���� ��ġ�ϴ� �л��� ������ �� �л��� ���� ���
		//������ ��ġ�ϴ� ��� ���ٰ� ���
		for(int i=0; i<currentNumber; i++)
		{
			if(name.equals(studentArray[i].getName())) {
				studentArray[i].print();
				return;
			}
		}
		
		System.out.println(name + " �л��� ��ϵǾ� ���� �ʽ��ϴ�.");
	}

	public void printAll() {
		//���� ��ϵǾ� �ִ� �л����� ���� ���
		for(int i=0; i<currentNumber; i++)
		{
			System.out.println(i + "�� �л� ����");
			studentArray[i].print();
		}
	}
	
}
