
public class Student {
	//��� ����
	private String name;
	private int age;
	private boolean isMan;
	private String address;
	private String phone;

	//������
	public Student(String n, int num, boolean man, String add, String ph)
	{
		name = n;
		age = num;
		isMan = man;
		address = add;
		phone = ph;
	}

	public Student()
	{
	}
	
	
	//�޽��
	public void print()
	{
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		if(isMan)
		{
			System.out.println("����: ����");
		}else {
			System.out.println("����: ����");
		}
		System.out.println("�ּ�: " + address);
		System.out.println("��: " + phone);
		
	}
	
	public void print(int count)
	{
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMan() {
		return isMan;
	}
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public boolean isOlder(Student you)
	{
		if(this.age > you.getAge())
		{
			return true;
		}else {
			return false;
		}
	}
	public boolean isSameCity(Student you)
	{
		if(address.equals(you.getAddress())) {
			return true;
		}else {
			return false;
		}
	}

}
