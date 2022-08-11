package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB db = new DB();
		boolean run = true;
		String password = "1234";
		while (run) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("ID:");
				String user = scanner.next();
				if (user.equals("이재린") || user.equals("dlwofls") || user.equals("DLWOFLS")) {
					System.out.println("PASSWORD:");
					String pw = scanner.next();
					if (pw.equals(password)) {
						System.out.println(user + " 안녕하세요.");
						// break;
					} else {
						System.out.println(" - 잘못된 값 입력 - 로그인 화면으로 돌아갑니다.");
						continue;
					}
				} else {
					System.out.println(" - 잘못된 값 입력 - 로그인 화면으로 돌아갑니다.");
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" - 잘못된 값 입력 - 로그인 화면으로 돌아갑니다.");
				continue;
			}
			long startTime1 = System.currentTimeMillis();
			long startTime2 = System.nanoTime();
			while (run) {
				try {
					Scanner scanner = new Scanner(System.in);
					System.out.println("\n메뉴를 선택하세요.");
					System.out.println("1. 재로그인 2. 재고 파악 3. 판매\n4. 물품 찾기 " + "5. 나의 예상 급료 6. 암호변경\n7. 종료");
					int num = scanner.nextInt();
					if (num == 1) {
						break;
					} else if (num == 2) {
						db.inventory();
					} else if (num == 3) {
						db.sell();
					} else if (num == 4) {
						db.search();
					} else if (num == 5) {
						long middleTime = System.nanoTime();
						System.out.println("예상급료: " + (middleTime - startTime2) / 1000000000 / 30 * 9800 + "원");
					} else if (num == 6) {
						System.out.println("변경할 암호를 입력하세요.");
						String pw = scanner.next();
						password = pw;
						System.out.println("다시 로그인해주세요.");
						break;
					} else if (num == 7) {
						long endTime = System.currentTimeMillis();
						System.out.println((endTime - startTime1) / 1000 / 30 + "시간근무" + "\n일급: "
								+ (endTime - startTime1) / 1000 / 30 * 9800 + "원");
						System.out.println("오늘 하루도 수고하셨습니다.");
						run = false;
					} else {
						System.out.println(" - 잘못된 값 입력 - 메뉴로 돌아갑니다.");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(" - 잘못된 값 입력 - 메뉴로 돌아갑니다.");
				}
			}
		}
	}
}