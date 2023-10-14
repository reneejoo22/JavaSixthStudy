//컴퓨터공학, 2271135, 주희연

import java.util.Scanner;

class Account{
	private String accountNum;	//계좌번호
	private int balance;	//잔고
	
	//생성자
	public Account(String accountNum, int balance) {	
        this.accountNum = accountNum;
        this.balance = balance;
    }
	
	//입금 메소드
	public void deposit(int amount){ //입금 할 금액의 값을 인자(amount)로 받는다 

		balance += amount;	//잔고에 입금할 금액을 더한다
	}
	
	//출금 메소드
	public void withdraw(int amount){	
		
		if (balance >= amount) {	//출금하려는 금액이 잔고보다 작거나 같을시 수행
            balance -= amount;	//출금 금액을 잔고에서 뺀다
        } else {	//출금하려는 금액이 잔고보다 클시
            System.out.println("잔액이 부족합니다.");
        }
	}
	
	//잔액확인, 잔액 값 돌려보냄
	public int balanceCheck(){	
		return balance;
	}
	
	//계좌번호 확인, 계좌번호 값 돌려보냄
	public String accountNumCheck(){	
			return accountNum;
		}
}


class ATM{
	private String machineInfo; //기기번호 정보
	
	//생성자
	public ATM(String machineInfo) {
		
		this.machineInfo = machineInfo;
	}
	
	//계좌확인 메소드
	public boolean accountVerify(Account account, String accountNum){	
		
		return account.accountNumCheck() == (accountNum);
		//입력받은 account의 객체의 계좌번호와 String으로 받은 계좌번호가 맞는지 확인
	}
	
	//메뉴 메소드
	public void atmMenu(Account account){	
	   
		System.out.println(machineInfo + "번: 1.현금입금, 2.현금출금, 3.취소");
	    
	    Scanner scanner = new Scanner(System.in); //메뉴를 입력 받을 수 있도록 스캐너 사용
		System.out.print("번호 입력: ");
	    int choice = scanner.nextInt();	//choice에서 메뉴 숫자를 선택
		
	    //1.현금입금
	    if(choice == 1) {	
	    	
            System.out.print("입금액을 입력하세요.: ");
            int depositAmount = scanner.nextInt();//입금할 금액을 depositAmount에 저장
            
            System.out.println("###입금 전###");
            System.out.println("계좌번호: " + account.accountNumCheck());
            System.out.println("현재 잔액: " + account.balanceCheck());
            
            account.deposit(depositAmount);	//deposit 메소드 실행
            
            System.out.println("###입금 후###");
            System.out.println("계좌번호: " + account.accountNumCheck());
            System.out.println("현재 잔액: " + account.balanceCheck());
	    }
	    
	    //2.현금출금
	    else if(choice == 2) {	
	    	
	    	System.out.print("출금액을 입력하세요.: ");
            int withdrawAmount = scanner.nextInt();//출금할 금액을 depositAmount에 저장
            
            System.out.println("###출금 전###");
            System.out.println("계좌번호: " + account.accountNumCheck());
            System.out.println("현재 잔액: " + account.balanceCheck());
            
            account.withdraw(withdrawAmount); //withdraw 메소드 실행
            
            System.out.println("###출금 후###");
            System.out.println("계좌번호: " + account.accountNumCheck());
            System.out.println("현재 잔액: " + account.balanceCheck());
        }
	    
	    //3.취소
	    else if(choice == 3) {	
	    	
            System.out.println("종료됩니다");
	    	return;
	    }
	    
	    //1,2,3 이외의 것이 입력됐으면 실행
	    else System.out.println("없는 기능입니다");	
	    
	    }
}
	


public class OopHw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("339201", 400000); //계좌1 생성
		Account acc2 = new Account("718420", 350000); //계좌2 생성
		Account acc3 = new Account("105891", 200000); //계좌3 생성
		
		ATM atm1 = new ATM("atm1"); //ATM기 1번 생성
		ATM atm2 = new ATM("atm2"); //ATM기 2번 생성
		
		if (atm1.accountVerify(acc1, "339201")) //ATM기 1번 사용. 계좌 확인 후 맞으면
		atm1.atmMenu(acc1); //메뉴 출력
		else
		System.out .println("계좌번호가 잘못되었습니다.");
		System.out .println();
		
		if (atm2.accountVerify(acc2, "718420")) //계좌 확인 후 맞으면
		atm2.atmMenu(acc2); //메뉴 출력
		else
		System.out .println("계좌번호가 잘못되었습니다.");
		System.out .println();
		
		if (atm1.accountVerify(acc3, "105891")) //계좌 확인 후 맞으면
		atm1.atmMenu(acc3); //메뉴 출력
		else
		System.out .println("계좌번호가 잘못되었습니다.");
		System.out .println();
		
		if (atm2.accountVerify(acc2, "718421")) //계좌 확인 후 맞으면
		atm2.atmMenu(acc2); //메뉴 출력
		else
		System.out .println("계좌번호가 잘못되었습니다.");
		System.out .println();
	}

}

