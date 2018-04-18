/*
 * 파일명: RandomWalk.java
 * 작성일: 2018.03.27-03.31
 * 작성자: 전승익
 * 내용:  랜덤상수, 2차원 배열, 조건문, 반복문을 사용한 랜덤워크 프로그램
 */


public class RandomWalk {

	public static void main(String[] args) {
		System.out.println("hw4_2: 전승익");
		String[][] room = new String[5][5]; //5*5형식의 2차원 배열지정

		int x = 0; //세로 이동
		int y = 0; //가로 이동
		int count=0; //이동수
		int n = (int)(Math.random()*5); //랜덤상수를 사용 
		int s = (int)(Math.random()*5); //랜덤상수를 사용 

		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				room[i][a]=".";
			}
		}
		room[0][0]="S"; //시작지점 (0,0) S로 고정
		room[n][s]="G"; //목표지점 구하기 그리고 목표지점은 G로 표시

		System.out.println("\n출발 = (0, 0) ");
		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				if(room[i][a]=="G") {
					System.out.println("도착 = (" + i + ", " + a + ")"); //목표지점의 좌표 뽑아서 출력
				}
			}
		}
		System.out.print("이동경로 = (0,0) ");
		for(int i=0; i<20; i++) {
			int a=(int)(Math.random()*4);
			if(x==n && y==s)
				break; //목표지점일때 멈춘다.
			else if(a==0) {
				x--;
				x = (x == -1)? 0 : x;
				count++;
			} //위로 움직인다
			else if(a==1) {
				x++;
				x = (x == 5)? 4 : x;
				count++;
			} //아래로 움직인다
			else if(a==2) {
				y--;
				y = (y==-1)? 0 : y;
				count++;
			} //왼쪽으로 움직인다
			else {
				y++;
				y = (y==5)? 4 : y;
				count++;
			} //오른쪽으로 움직인다
			room[x][y]="#"; //이동경로는 #으로 표시
			if(x==0 && y==0) 
				room[x][y]="S"; //출발지일 경우는 S로 고정
			else if(x==n && y==s)
				room[x][y]="G"; //도착지일 경우는 G로 고정
			else
				room[x][y]="#"; //이동경로는 #
 			System.out.print("(" +x+ "," +y +") "); //이동경로 출력
		}
		System.out.println(" ");
		System.out.println("---------");

		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				System.out.print(room[i][a]+" "); //출발지 이동경로 도착지 배열로 표현
			}
			System.out.println();
		}
		System.out.println("---------");
		if(count<21) {
			System.out.println("성공");
			System.out.println("총 시도 횟수: " + count);
		}
		else
			System.out.println("실패");

	}
}

