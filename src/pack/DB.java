package pack;

import java.util.Scanner;

public class DB implements Option {
	String[] nameList = { "", "MABORO", "MIX", "HITS", "FEELGOOD", "FILITE", "CASS", "ABSOLUT", "Toothbrush", "Soap",
			"Razor", };
	String[] barcodeList = { "", "33345678", "22345678", "12345678", "76746863", "12843755", "40763673", "77199663",
			"52542770", "14112475", "60310088", };
	int[] priceList = { 0, 4500, 4500, 4500, 1600, 1600, 2500, 30900, 1500, 2000, 2800, };
	String[] originList = { "", "USA", "Korea", "Korea", "Korea", "Korea", "Korea", "Sweden", "Greenland",
			"Philippines", "China", };
	String[] disuseList = { "", "2030.5.19", "2037.8.9", "2036.4.5", "2025.6.8", "2029.12.1", "2035.7.16", "2028.9.10",
			"2039.6.4", "2027.1.15", "2040.4.4", };
	boolean[] adultList = { false, true, true, true, true, true, true, true, false, false, false, };
	int[] countList = { 0, 50, 50, 50, 50, 50, 50, 10, 100, 100, 100, };
	Scanner scanner = new Scanner(System.in);

	@Override
	public void inventory() {
		// TODO Auto-generated method stub
		for (int i = 1; i < nameList.length; ++i) {
			System.out.println(nameList[i] + " " + countList[i] + "개");
			scanner = new Scanner(System.in);
		}
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("1. MABORO 2. MIX 3. HITS 4. FEELGOOD"
						+ " 5. FILITE 6. CASS 7. ABSOLUT 8. Toothbrush 9. Soap 10. Razor");
				int select = scanner.nextInt();
				if (select == 1) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					} else {
						System.out.println("미성년자는 구매가 불가능합니다.");
						break;
					}
				} else if (select == 2) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 3) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 4) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 5) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 6) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 7) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("나이를 입력하세요.");
					int age = scanner.nextInt();
					if (age >= 20) {
						System.out.println("1. 카드결제 2. 현금결제");
						int card = scanner.nextInt();
						if (card == 1) {
							System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							break;
						} else if (card == 2) {
							System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
							int count = scanner.nextInt();
							System.out.println("지불할 금액을 입력하세요.");
							int money = scanner.nextInt();
							if (money >= priceList[select]) {
								System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
								countList[select] = countList[select] - count;
								System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
								break;
							} else {
								System.out.println("지불한 금액이 모자랍니다.");
								System.out.println("메뉴로 돌아갑니다.");
								break;
							}
						} else {
							System.out.println("미성년자는 구매가 불가능합니다.");
							break;
						}
					}
				} else if (select == 8) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("1. 카드결제 2. 현금결제");
					int card = scanner.nextInt();
					if (card == 1) {
						System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
						countList[select] = countList[select] - count;
						break;
					} else if (card == 2) {
						System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println("지불할 금액을 입력하세요.");
						int money = scanner.nextInt();
						if (money >= priceList[select]) {
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
							break;
						} else {
							System.out.println("지불한 금액이 모자랍니다.");
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					} else {
						System.out.println("물품 선택으로 돌아갑니다.");
					}
				} else if (select == 9) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("1. 카드결제 2. 현금결제");
					int card = scanner.nextInt();
					if (card == 1) {
						System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
						countList[select] = countList[select] - count;
						break;
					} else if (card == 2) {
						System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println("지불할 금액을 입력하세요.");
						int money = scanner.nextInt();
						if (money >= priceList[select]) {
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
							break;
						} else {
							System.out.println("지불한 금액이 모자랍니다.");
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					} else {
						System.out.println("물품 선택으로 돌아갑니다.");
					}
				} else if (select == 10) {
					System.out.println(nameList[select] + " " + barcodeList[select] + " " + priceList[select]);
					System.out.println("1. 카드결제 2. 현금결제");
					int card = scanner.nextInt();
					if (card == 1) {
						System.out.println("카드로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
						countList[select] = countList[select] - count;
						break;
					} else if (card == 2) {
						System.out.println("현금으로 결제합니다 구입할 갯수를 입력하세요.");
						int count = scanner.nextInt();
						System.out.println("지불할 금액을 입력하세요.");
						int money = scanner.nextInt();
						if (money >= priceList[select]) {
							System.out.println(nameList[select] + "가 " + count + "개 판매되었습니다.");
							countList[select] = countList[select] - count;
							System.out.println("거스름돈은 " + (money - (priceList[select] * count)) + "원입니다.");
							break;
						} else {
							System.out.println("지불한 금액이 모자랍니다.");
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					} else {
						System.out.println("물품 선택으로 돌아갑니다.");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" - 잘못된 값 입력 - 물품 선택으로 돌아갑니다.");
				scanner = new Scanner(System.in);
			}
		}
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("검색할 물품의 이름을 입력하세요.");
				String looking = scanner.next();
				if (looking.equals("MARBORO") || looking.equals("33345678")) {
					System.out.println("이름: " + nameList[1] + "\n" + "바코드: " + barcodeList[1] + "\n" + "가격: "
							+ priceList[1] + "\n" + "생산지: " + originList[1] + "\n" + "파기날짜: " + disuseList[1] + "\n"
							+ "성인용 유무: " + adultList[1] + "\n" + "재고:" + countList[1] + "\n");
					break;
				} else if (looking.equals("MIX") || looking.equals("22345678")) {
					System.out.println("이름: " + nameList[2] + "\n" + "바코드: " + barcodeList[2] + "\n" + "가격: "
							+ priceList[2] + "\n" + "생산지: " + originList[2] + "\n" + "파기날짜: " + disuseList[2] + "\n"
							+ "성인용 유무: " + adultList[2] + "\n" + "재고:" + countList[2] + "\n");
					break;
				} else if (looking.equals("HITS") || looking.equals("12345678")) {
					System.out.println("이름: " + nameList[3] + "\n" + "바코드: " + barcodeList[3] + "\n" + "가격: "
							+ priceList[3] + "\n" + "생산지: " + originList[3] + "\n" + "파기날짜: " + disuseList[3] + "\n"
							+ "성인용 유무: " + adultList[3] + "\n" + "재고:" + countList[3] + "\n");
					break;
				} else if (looking.equals("FEELGOOD") || looking.equals("76746863")) {
					System.out.println("이름: " + nameList[4] + "\n" + "바코드: " + barcodeList[4] + "\n" + "가격: "
							+ priceList[4] + "\n" + "생산지: " + originList[4] + "\n" + "파기날짜: " + disuseList[4] + "\n"
							+ "성인용 유무: " + adultList[4] + "\n" + "재고:" + countList[4] + "\n");
					break;
				} else if (looking.equals("FILITE") || looking.equals("12843755")) {
					System.out.println("이름: " + nameList[5] + "\n" + "바코드: " + barcodeList[5] + "\n" + "가격: "
							+ priceList[5] + "\n" + "생산지: " + originList[5] + "\n" + "파기날짜: " + disuseList[5] + "\n"
							+ "성인용 유무: " + adultList[5] + "\n" + "재고:" + countList[5] + "\n");
					break;
				} else if (looking.equals("CASS") || looking.equals("40763673")) {
					System.out.println("이름: " + nameList[6] + "\n" + "바코드: " + barcodeList[6] + "\n" + "가격: "
							+ priceList[6] + "\n" + "생산지: " + originList[6] + "\n" + "파기날짜: " + disuseList[6] + "\n"
							+ "성인용 유무: " + adultList[6] + "\n" + "재고:" + countList[6] + "\n");
					break;
				} else if (looking.equals("ABSOLUT") || looking.equals("77199663")) {
					System.out.println("이름: " + nameList[7] + "\n" + "바코드: " + barcodeList[7] + "\n" + "가격: "
							+ priceList[7] + "\n" + "생산지: " + originList[7] + "\n" + "파기날짜: " + disuseList[7] + "\n"
							+ "성인용 유무: " + adultList[7] + "\n" + "재고:" + countList[7] + "\n");
					break;
				} else if (looking.equals("Toothbrush") || looking.equals("52542770")) {
					System.out.println("이름: " + nameList[8] + "\n" + "바코드: " + barcodeList[8] + "\n" + "가격: "
							+ priceList[8] + "\n" + "생산지: " + originList[8] + "\n" + "파기날짜: " + disuseList[8] + "\n"
							+ "성인용 유무: " + adultList[8] + "\n" + "재고:" + countList[8] + "\n");
					break;
				} else if (looking.equals("Soap") || looking.equals("14112475")) {
					System.out.println("이름: " + nameList[9] + "\n" + "바코드: " + barcodeList[9] + "\n" + "가격: "
							+ priceList[9] + "\n" + "생산지: " + originList[9] + "\n" + "파기날짜: " + disuseList[9] + "\n"
							+ "성인용 유무: " + adultList[9] + "\n" + "재고:" + countList[9] + "\n");
					break;
				} else if (looking.equals("Razor") || looking.equals("60310088")) {
					System.out.println("이름: " + nameList[10] + "\n" + "바코드: " + barcodeList[10] + "\n" + "가격: "
							+ priceList[10] + "\n" + "생산지: " + originList[10] + "\n" + "파기날짜: " + disuseList[10] + "\n"
							+ "성인용 유무: " + adultList[10] + "\n" + "재고:" + countList[10] + "\n");
					break;
				} else {
					System.out.println("물품 검색으로 돌아갑니다.");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" - 잘못된 값 입력 - 물품 검색으로 돌아갑니다.");
				scanner = new Scanner(System.in);
			}
		}
	}
}
