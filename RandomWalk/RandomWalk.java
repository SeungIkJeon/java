/*
 * ���ϸ�: RandomWalk.java
 * �ۼ���: 2018.03.27-03.31
 * �ۼ���: ������
 * ����:  �������, 2���� �迭, ���ǹ�, �ݺ����� ����� ������ũ ���α׷�
 */


public class RandomWalk {

	public static void main(String[] args) {
		System.out.println("hw4_2: ������");
		String[][] room = new String[5][5]; //5*5������ 2���� �迭����

		int x = 0; //���� �̵�
		int y = 0; //���� �̵�
		int count=0; //�̵���
		int n = (int)(Math.random()*5); //��������� ��� 
		int s = (int)(Math.random()*5); //��������� ��� 

		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				room[i][a]=".";
			}
		}
		room[0][0]="S"; //�������� (0,0) S�� ����
		room[n][s]="G"; //��ǥ���� ���ϱ� �׸��� ��ǥ������ G�� ǥ��

		System.out.println("\n��� = (0, 0) ");
		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				if(room[i][a]=="G") {
					System.out.println("���� = (" + i + ", " + a + ")"); //��ǥ������ ��ǥ �̾Ƽ� ���
				}
			}
		}
		System.out.print("�̵���� = (0,0) ");
		for(int i=0; i<20; i++) {
			int a=(int)(Math.random()*4);
			if(x==n && y==s)
				break; //��ǥ�����϶� �����.
			else if(a==0) {
				x--;
				x = (x == -1)? 0 : x;
				count++;
			} //���� �����δ�
			else if(a==1) {
				x++;
				x = (x == 5)? 4 : x;
				count++;
			} //�Ʒ��� �����δ�
			else if(a==2) {
				y--;
				y = (y==-1)? 0 : y;
				count++;
			} //�������� �����δ�
			else {
				y++;
				y = (y==5)? 4 : y;
				count++;
			} //���������� �����δ�
			room[x][y]="#"; //�̵���δ� #���� ǥ��
			if(x==0 && y==0) 
				room[x][y]="S"; //������� ���� S�� ����
			else if(x==n && y==s)
				room[x][y]="G"; //�������� ���� G�� ����
			else
				room[x][y]="#"; //�̵���δ� #
 			System.out.print("(" +x+ "," +y +") "); //�̵���� ���
		}
		System.out.println(" ");
		System.out.println("---------");

		for(int i=0; i<room.length; i++) {
			for(int a=0; a<room[i].length; a++) {
				System.out.print(room[i][a]+" "); //����� �̵���� ������ �迭�� ǥ��
			}
			System.out.println();
		}
		System.out.println("---------");
		if(count<21) {
			System.out.println("����");
			System.out.println("�� �õ� Ƚ��: " + count);
		}
		else
			System.out.println("����");

	}
}

