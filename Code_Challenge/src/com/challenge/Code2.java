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
		// 1. non public class - User 선언하기
		// User라는 객체 생성하세요. id, pw, name, age를 저장하는 객체 선언하기
		//  -> 객체 선언시 해당 코드 가장 아래에 생성하세요. // 미리 틀 만들었습니다. 
		
		// 제약 1.private로 멤버변수 한정하고, getter, setter 생성하기.
		// 제약 2.생성자는 기본형과 4가지 인자 모두 초기화하는 객체 선언하기
		// 제약 3.toString 사용하기
		// -> 완료!

		// 2. 객체 생성하고 출력하기
		// 각자 다른 2가지 instance(객체)를 생성해보세요.
		// 기본 생성자 사용과 4가지 인자 초기화 하는 생성자로 생성하세요. 
		// 생성한 값을 sysout으로 출력해주세요.
		User user1 = new User();
		user1.setId("test1");
		user1.setPw("1234");
		user1.setName("최길동");
		user1.setAge(31);
		User user2 = new User("test1", "1234", "홍길동", 31);
		
		System.out.println(user1);
		System.out.println(user2.toString());

		// 3. 객체 배열 사용하기
		// ID, 이름 모두 다른 사용자를 10명을 생성하여 배열로 저장해주세요.
		// 나이는 2명씩 다르게 생성해주세요. (홍길동1 - 20, 홍길동2 - 20  홍길동3 - 25 ... ) 
		// 그리고 배열을 순회하여 10명 모두 출력하세요.
		User[] uArray = new User[10];
		int count = 0;
		uArray[count++] = new User("test1", "1234", "홍길동1", 20);
		uArray[count++] = new User("test2", "1234", "홍길동2", 20);
		uArray[count++] = new User("test3", "1234", "홍길동3", 21);
		uArray[count++] = new User("test4", "1234", "홍길동4", 21);
		uArray[count++] = new User("test5", "1234", "홍길동5", 31);
		uArray[count++] = new User("test6", "1234", "홍길동6", 31);
		uArray[count++] = new User("test7", "1234", "홍길동7", 41);
		uArray[count++] = new User("test8", "1234", "홍길동8", 41);
		uArray[count++] = new User("test9", "1234", "홍길동9", 25);
		uArray[count++] = new User("test10", "1234", "홍길동10", 25);
		
		
		// 고전
		for(int i = 0; i< uArray.length; i++) {
			System.out.println(uArray[i]);
		}
		System.out.println("----------------------------------------------");
		
		
		
		// 요새 많이씀
		for(User u : uArray) {
			System.out.println(u);
		}
		System.out.println("----------------------------------------------");
			
		
		
		// 4. 객체 배열 순회하기
		// ID/PW를 입력받고, 10개에 데이터 중 존재하는지 ID로 확인하고, 로그인 가능한지 확인해주세요.
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
		System.out.println(isLogin == true ? "로그인에 성공하였습니다." : "로그인에 실패하였습니다.");
		System.out.println("----------------------------------------------------");
		
		// 5. 객체 배열 변경하기
		// ID와 이름을 입력받고 ID가 존재하면 이름을 변경해 줍니다.
		id = "test1";
		String name = "박길동1";
		
		User tempUser = null;
		for(User u : uArray) {
			if(u.getId().equals(id)) {
				tempUser = u;
				u.setName(name);
				break;
			}
		}
		System.out.println(tempUser != null ? "이름 변경함 : "+ tempUser.getName() : "이름 변경에 실패하였습니다.");
		System.out.println("----------------------------------------------------");

		// 6. 객체 배열 값 삭제하고 가운데 null 없게끔 만들기. -> 어려우면 Skip 가능
		// ID를 입력받고, 배열에서 ID가 탐색되지 않도록 삭제합니다. 
		// 단 Null error가 발생하지 않도록 객체를 당겨주시고, 사이즈를 조절하세요.
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
			System.out.println("삭제 완료!");
		}else {
			System.out.println("탐색에 실패하였습니다.");
		}
		System.out.println("----------------------------------------------------");

		// 컬랙션 문제
		// 7. List 계열을 생성하고 앞서 만든 배열로 초기화 해주세요.
		List<User> list = new ArrayList<>(Arrays.asList(uArray));
		List<User> list2 = new ArrayList<>();
		for(User u : uArray) {
			list2.add(u);
		}
		System.out.println(list);
		System.out.println(list2);
		
		// 8. List에 새로운 아이디 10개를 더 추가하세요. 단 ID는 중복되지 않습니다.
		list.add(new User("test11", "1234", "최길동11", 30));
		list.add(new User("test12", "1234", "최길동12", 30));
		list.add(new User("test13", "1234", "최길동13", 33));
		list.add(new User("test14", "1234", "최길동14", 33));
		list.add(new User("test15", "1234", "최길동15", 34));
		list.add(new User("test16", "1234", "최길동16", 34));
		list.add(new User("test17", "1234", "최길동17", 23));
		list.add(new User("test18", "1234", "최길동18", 23));
		list.add(new User("test19", "1234", "최길동19", 21));
		list.add(new User("test20", "1234", "최길동20", 21));
		
		// 9. 임의의 ID 하나를 탐색하세요.
		id = "test13";
		User temp = null;
		for(User u : list) {
			if(u.equals(id)) {
				temp = u;
				break;
			}
		}
		
		if(temp != null) {
			System.out.println("탐색 성공 : " + temp);
		}else {
			System.out.println("탐색 실패");
		}
		
		// 10. 탐색된 ID를 지우세요.
		list.remove(temp); // 객체로 탐색되었을때
//		index = 5;
//		list.remove(index); // index로 탐색되었을때
		
		// 11. 맨 앞에 새로운 ID를 생성해서 넣으세요.
		list.add(0, new User("test21", "1234", "최길동21", 31));
		
		// 12. List의 순서를 랜덤으로 섞으세요. Hint : Collections 활용
		Collections.shuffle(list);
		System.out.println(list);
		
		// 13. 객체에 Comparable를 구현하여 ID 기준으로 정렬하세요.
		Collections.sort(list);
		System.out.println(list);
		
		// 14. 객체에 Comparator를 익명 클래스 구현하여 나이-이름 순 정렬하세요.
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
		
		// 15. List 새로 다시 생성하고, 기존 리스트 데이터를 2번 반복해서 입력하세요.
		//     (2번씩 입력하여 중복을 만들어주세요!)
		List<User> newList = new ArrayList<User>();
		newList.addAll(list);
		newList.addAll(list);
		System.out.println("newList");
		System.out.println(newList);
		
		// 16. ID의 중복이 존재하는 List를 Set을 통해 제거하고, 다시 ID 순으로 정렬하세요.
		Set<User> set = new TreeSet<User>();
		set.addAll(newList);
		System.out.println("SET!!");
		System.out.println(set);

		// 17. List의 빠른 탐색을 위해 Map을 생성하세요. Map에 Key는ID , Value는 User로 선언하세요.
		Map<String,User> map = new HashMap<>();
		
		// 18. Map에 List를 넣어주세요. 단 15번에 생성된 중복된 List를 활용하세요.
		for(User u : newList) {
			map.put(u.getId(), u);
		}
		
		// 19. 임의 ID를 Map으로 탐색하세요. 단 존재하지 않는 경우 '존재하지 않는다'로 프린트해주세요.
		id = "test11";
		System.out.println("MAP");
		System.out.println(map.get(id));
		
		// 20. Map의 Key를 모두 출력하세요.
		System.out.println(map.keySet());
		
		// 21. 새로운 객체를 2개 생성하여 Map에 넣어주는데, ID가 중복된 객체, 중복하지 않는 객체를 생성하세요.
		User user3 = new User("test1", "1234", "홍길동", 31);
		User user4 = new User("test41", "1234", "홍길동", 31);
		map.put(user3.getId(), user3);
		map.put(user4.getId(), user4);
		
		// 22. Map에 새로 생성된 객체를 삭제하세요.
		map.remove(user3.getId());// key로 삭제!!
		map.remove(user4.getId());// key로 삭제!!
		
		// File
		
		// 23. List로 저장된 객체를 다시 배열로 변환하고, Object채 저장하세요.
		//     ※ 주의) 객체에 Serializable을 구현하여 사용하세요.
		
		User[] uArray2 = list.toArray(uArray);
		System.out.println(Arrays.toString(uArray2));
		
		try(FileOutputStream fos = new FileOutputStream(".test");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			oos.writeObject(uArray2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 24. 저장된 객체를 다시 읽어와서 프린트해주세요.
		try (FileInputStream fis = new FileInputStream(".test");
			ObjectInputStream ois = new ObjectInputStream(fis);
				){
			User[] uArray3 = (User[])ois.readObject();
			System.out.println("-------------------------------------");
			System.out.println(Arrays.toString(uArray3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 25. 저장된 File을 삭제해주세요.
		new File(".test").delete();
		
		// API
		
		String str = "아이디 : test, 이름 : 홍길동, 나이 : 23, 비밀번호 : 1234 / 아이디 : test2, 이름 : 김길동, 나이 : 32, 비밀번호 : 1234";
		// 26. 앞서 선언된 문자열에 '홍길동'을 찾아주세요.
		System.out.println("-------------------------------------");
		System.out.println(str.indexOf("홍길동"));
		
		// 27. 앞서 선언된 문자열에 '이름'의 인덱스를 모두 출력하세요.
		System.out.println("-------------------------------------");
		index = 0;
		while(true) {
			index = str.indexOf("이름", index);
			if(index == -1) {
				break;
			}
			System.out.println(index);
			index += "이름".length();
		}
		
		
		// 28. 앞서 선언된 문자열에 '홍길동'을 '최길동'으로 바꿔주세요.
		System.out.println(str.replace("홍길동", "최길동"));
		
		// 29. 앞서 선언된 문자열을 '/' 기준으로 잘라주세요.
		System.out.println(Arrays.toString(str.split("/")));
	
		// 30. 앞서 선언된 문자열을 파싱하여 객체로 저장하세요.
		//     ex) User 활용하여 객체 2개로 생성.
		List<User> list5 = new ArrayList<>();
		String[] array1 = str.split("/");
		for(String objStr : array1) {
			String[] array2 = objStr.split(",");
			User user = new User();
			for(String dataStr : array2) {
				String[] array3 = dataStr.split(":");
				System.out.println("array3[0] : '"+ array3[0]+"'");
				System.out.println("array3[1] : '"+ array3[1]+"'");
				
				if(array3[0].strip().equals("아이디")) {
					user.setId(array3[1].strip());
				}else if(array3[0].strip().equals("이름")){
					user.setName(array3[1].strip());
				}else if(array3[0].strip().equals("나이")){
					user.setAge(Integer.parseInt(array3[1].strip()));
				}else if(array3[0].strip().equals("비밀번호")){
					user.setPw(array3[1].strip());
				}
			}
			list5.add(user);
		}
		System.out.println("String");
		System.out.println(list5);
		// Date
		
		// 31. 오늘 날짜를 출력하세요.
		System.out.println(new Date());
		
		// 32. 오늘 날짜를 '2021년 9월 18일, 오후 5시 10분'으로 출력하세요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일, aa HH시 mm분");
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
