package com.challenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Code2 {
	
	public static void main(String[] args) {
		// 1. non public class - User �����ϱ�
		// User��� ��ü �����ϼ���. id, pw, name, age�� �����ϴ� ��ü �����ϱ�
		//  -> ��ü ����� �ش� �ڵ� ���� �Ʒ��� �����ϼ���. // �̸� Ʋ ��������ϴ�. 
		
		// ���� 1.private�� ������� �����ϰ�, getter, setter �����ϱ�.
		// ���� 2.�����ڴ� �⺻���� 4���� ���� ��� �ʱ�ȭ�ϴ� ��ü �����ϱ�
		// ���� 3.toString ����ϱ�
		// -> �Ϸ�!

		// 2. ��ü �����ϰ� ����ϱ�
		// ���� �ٸ� 2���� instance(��ü)�� �����غ�����.
		// �⺻ ������ ���� 4���� ���� �ʱ�ȭ �ϴ� �����ڷ� �����ϼ���. 
		// ������ ���� sysout���� ������ּ���.
		User user1 = new User();
		user1.setId("test1");
		user1.setPw("1234");
		user1.setName("�ֱ浿");
		user1.setAge(31);
		User user2 = new User("test1", "1234", "ȫ�浿", 31);
		
		System.out.println(user1);
		System.out.println(user2.toString());

		// 3. ��ü �迭 ����ϱ�
		// ID, �̸� ��� �ٸ� ����ڸ� 10���� �����Ͽ� �迭�� �������ּ���.
		// ���̴� 2�� �ٸ��� �������ּ���. (ȫ�浿1 - 20, ȫ�浿2 - 20  ȫ�浿3 - 25 ... ) 
		// �׸��� �迭�� ��ȸ�Ͽ� 10�� ��� ����ϼ���.
		User[] uArray = new User[10];
		int count = 0;
		uArray[count++] = new User("test1", "1234", "ȫ�浿1", 20);
		uArray[count++] = new User("test2", "1234", "ȫ�浿2", 20);
		uArray[count++] = new User("test3", "1234", "ȫ�浿3", 21);
		uArray[count++] = new User("test4", "1234", "ȫ�浿4", 21);
		uArray[count++] = new User("test5", "1234", "ȫ�浿5", 31);
		uArray[count++] = new User("test6", "1234", "ȫ�浿6", 31);
		uArray[count++] = new User("test7", "1234", "ȫ�浿7", 41);
		uArray[count++] = new User("test8", "1234", "ȫ�浿8", 41);
		uArray[count++] = new User("test9", "1234", "ȫ�浿9", 25);
		uArray[count++] = new User("test10", "1234", "ȫ�浿10", 25);
		
		
		// ����
		for(int i = 0; i< uArray.length; i++) {
			System.out.println(uArray[i]);
		}
		System.out.println("----------------------------------------------");
		
		
		
		// ��� ���̾�
		for(User u : uArray) {
			System.out.println(u);
		}
		System.out.println("----------------------------------------------");
			
		
		
		// 4. ��ü �迭 ��ȸ�ϱ�
		// ID/PW�� �Է¹ް�, 10���� ������ �� �����ϴ��� ID�� Ȯ���ϰ�, �α��� �������� Ȯ�����ּ���.
		String id = "test1";
		String pw = "1234";
		
		boolean isLogin = false;
		for(User u : uArray) {
			if(u.getId().equals(id)) {
				if(u.getPw().equals(pw)) {
					isLogin = true;
				}
				break;
			}
		}
		System.out.println(isLogin == true ? "�α��ο� �����Ͽ����ϴ�." : "�α��ο� �����Ͽ����ϴ�.");
		System.out.println("----------------------------------------------------");
		
		// 5. ��ü �迭 �����ϱ�
		// ID�� �̸��� �Է¹ް� ID�� �����ϸ� �̸��� ������ �ݴϴ�.
		id = "test1";
		String name = "�ڱ浿1";
		
		User tempUser = null;
		for(User u : uArray) {
			if(u.getId().equals(id)) {
				tempUser = u;
				u.setName(name);
				break;
			}
		}
		System.out.println(tempUser != null ? "�̸� ������ : "+ tempUser.getName() : "�̸� ���濡 �����Ͽ����ϴ�.");
		System.out.println("----------------------------------------------------");

		// 6. ��ü �迭 �� �����ϰ� ��� null ���Բ� �����. -> ������ Skip ����
		// ID�� �Է¹ް�, �迭���� ID�� Ž������ �ʵ��� �����մϴ�. 
		// �� Null error�� �߻����� �ʵ��� ��ü�� ����ֽð�, ����� �����ϼ���.
		id = "test5";
		int index = -1;
		for(int i = 0; i < uArray.length; i++) {
			if(uArray[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(int i = index; i < uArray.length - 1; i++) {
				uArray[i] = uArray[i+1];
			}
			uArray = Arrays.copyOf(uArray, uArray.length - 1);
			System.out.println(Arrays.toString(uArray).replace("],", "],\n"));
			System.out.println("���� �Ϸ�!");
		}else {
			System.out.println("Ž���� �����Ͽ����ϴ�.");
		}
		System.out.println("----------------------------------------------------");

		// �÷��� ����
		// 7. List �迭�� �����ϰ� �ռ� ���� �迭�� �ʱ�ȭ ���ּ���.
		List<User> list = new ArrayList<>(Arrays.asList(uArray));
		List<User> list2 = new ArrayList<>();
		for(User u : uArray) {
			list2.add(u);
		}
		System.out.println(list);
		System.out.println(list2);
		
		// 8. List�� ���ο� ���̵� 10���� �� �߰��ϼ���. �� ID�� �ߺ����� �ʽ��ϴ�.
		list.add(new User("test11", "1234", "�ֱ浿11", 30));
		list.add(new User("test12", "1234", "�ֱ浿12", 30));
		list.add(new User("test13", "1234", "�ֱ浿13", 33));
		list.add(new User("test14", "1234", "�ֱ浿14", 33));
		list.add(new User("test15", "1234", "�ֱ浿15", 34));
		list.add(new User("test16", "1234", "�ֱ浿16", 34));
		list.add(new User("test17", "1234", "�ֱ浿17", 23));
		list.add(new User("test18", "1234", "�ֱ浿18", 23));
		list.add(new User("test19", "1234", "�ֱ浿19", 21));
		list.add(new User("test20", "1234", "�ֱ浿20", 21));
		
		// 9. ������ ID �ϳ��� Ž���ϼ���.
		id = "test13";
		User temp = null;
		for(User u : list) {
			if(u.equals(id)) {
				temp = u;
				break;
			}
		}
		
		if(temp != null) {
			System.out.println("Ž�� ���� : " + temp);
		}else {
			System.out.println("Ž�� ����");
		}
		
		// 10. Ž���� ID�� ���켼��.
		list.remove(temp); // ��ü�� Ž���Ǿ�����
//		index = 5;
//		list.remove(index); // index�� Ž���Ǿ�����
		
		// 11. �� �տ� ���ο� ID�� �����ؼ� ��������.
		list.add(0, new User("test21", "1234", "�ֱ浿21", 31));
		
		// 12. List�� ������ �������� ��������. Hint : Collections Ȱ��
		Collections.shuffle(list);
		System.out.println(list);
		
		// 13. ��ü�� Comparable�� �����Ͽ� ID �������� �����ϼ���.
		Collections.sort(list);
		System.out.println(list);
		
		// 14. ��ü�� Comparator�� �͸� Ŭ���� �����Ͽ� ����-�̸� �� �����ϼ���.
		list.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				int result = Integer.compare(o1.getAge(), o2.getAge());
				if(result == 0) {	
					result = o1.getName().compareTo(o2.getName());
				}
				return result;
			}
		});
		
		// 15. List ���� �ٽ� �����ϰ�, ���� ����Ʈ �����͸� 2�� �ݺ��ؼ� �Է��ϼ���.
		//     (2���� �Է��Ͽ� �ߺ��� ������ּ���!)
		List<User> newList = new ArrayList<User>();
		newList.addAll(list);
		newList.addAll(list);
		System.out.println("newList");
		System.out.println(newList);
		
		// 16. ID�� �ߺ��� �����ϴ� List�� Set�� ���� �����ϰ�, �ٽ� ID ������ �����ϼ���.
		Set<User> set = new TreeSet<User>();
		set.addAll(newList);
		System.out.println("SET!!");
		System.out.println(set);

		// 17. List�� ���� Ž���� ���� Map�� �����ϼ���. Map�� Key��ID , Value�� User�� �����ϼ���.
		Map<String,User> map = new HashMap<>();
		
		// 18. Map�� List�� �־��ּ���. �� 15���� ������ �ߺ��� List�� Ȱ���ϼ���.
		for(User u : newList) {
			map.put(u.getId(), u);
		}
		
		// 19. ���� ID�� Map���� Ž���ϼ���. �� �������� �ʴ� ��� '�������� �ʴ´�'�� ����Ʈ���ּ���.
		id = "test11";
		System.out.println("MAP");
		System.out.println(map.get(id));
		
		// 20. Map�� Key�� ��� ����ϼ���.
		System.out.println(map.keySet());
		
		// 21. ���ο� ��ü�� 2�� �����Ͽ� Map�� �־��ִµ�, ID�� �ߺ��� ��ü, �ߺ����� �ʴ� ��ü�� �����ϼ���.
		User user3 = new User("test1", "1234", "ȫ�浿", 31);
		User user4 = new User("test41", "1234", "ȫ�浿", 31);
		map.put(user3.getId(), user3);
		map.put(user4.getId(), user4);
		
		// 22. Map�� ���� ������ ��ü�� �����ϼ���.
		map.remove(user3.getId());// key�� ����!!
		map.remove(user4.getId());// key�� ����!!
		
		// File
		
		// 23. List�� ����� ��ü�� �ٽ� �迭�� ��ȯ�ϰ�, Objectä �����ϼ���.
		//     �� ����) ��ü�� Serializable�� �����Ͽ� ����ϼ���.
		
		User[] uArray2 = list.toArray(uArray);
		System.out.println(Arrays.toString(uArray2));
		
		try(FileOutputStream fos = new FileOutputStream(".test");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			oos.writeObject(uArray2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 24. ����� ��ü�� �ٽ� �о�ͼ� ����Ʈ���ּ���.
		try (FileInputStream fis = new FileInputStream(".test");
			ObjectInputStream ois = new ObjectInputStream(fis);
				){
			User[] uArray3 = (User[])ois.readObject();
			System.out.println("-------------------------------------");
			System.out.println(Arrays.toString(uArray3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 25. ����� File�� �������ּ���.
		new File(".test").delete();
		
		// API
		
		String str = "���̵� : test, �̸� : ȫ�浿, ���� : 23, ��й�ȣ : 1234 / ���̵� : test2, �̸� : ��浿, ���� : 32, ��й�ȣ : 1234";
		// 26. �ռ� ����� ���ڿ��� 'ȫ�浿'�� ã���ּ���.
		System.out.println("-------------------------------------");
		System.out.println(str.indexOf("ȫ�浿"));
		
		// 27. �ռ� ����� ���ڿ��� '�̸�'�� �ε����� ��� ����ϼ���.
		System.out.println("-------------------------------------");
		index = 0;
		while(true) {
			index = str.indexOf("�̸�", index);
			if(index == -1) {
				break;
			}
			System.out.println(index);
			index += "�̸�".length();
		}
		
		
		// 28. �ռ� ����� ���ڿ��� 'ȫ�浿'�� '�ֱ浿'���� �ٲ��ּ���.
		System.out.println(str.replace("ȫ�浿", "�ֱ浿"));
		
		// 29. �ռ� ����� ���ڿ��� '/' �������� �߶��ּ���.
		System.out.println(Arrays.toString(str.split("/")));
	
		// 30. �ռ� ����� ���ڿ��� �Ľ��Ͽ� ��ü�� �����ϼ���.
		//     ex) User Ȱ���Ͽ� ��ü 2���� ����.
		List<User> list5 = new ArrayList<>();
		String[] array1 = str.split("/");
		for(String objStr : array1) {
			String[] array2 = objStr.split(",");
			User user = new User();
			for(String dataStr : array2) {
				String[] array3 = dataStr.split(":");
				System.out.println("array3[0] : '"+ array3[0]+"'");
				System.out.println("array3[1] : '"+ array3[1]+"'");
				
				if(array3[0].strip().equals("���̵�")) {
					user.setId(array3[1].strip());
				}else if(array3[0].strip().equals("�̸�")){
					user.setName(array3[1].strip());
				}else if(array3[0].strip().equals("����")){
					user.setAge(Integer.parseInt(array3[1].strip()));
				}else if(array3[0].strip().equals("��й�ȣ")){
					user.setPw(array3[1].strip());
				}
			}
			list5.add(user);
		}
		System.out.println("String");
		System.out.println(list5);
		// Date
		
		// 31. ���� ��¥�� ����ϼ���.
		System.out.println(new Date());
		
		// 32. ���� ��¥�� '2021�� 9�� 18��, ���� 5�� 10��'���� ����ϼ���.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��, aa HH�� mm��");
		System.out.println(sdf.format(new Date()));
	}
}

class User implements Comparable<User>, Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String pw;
	private String name;
	private int age;

	public User() {
		super();
	}

	public User(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public int compareTo(User o) {
		return this.id.compareTo(o.id);
	}

}
