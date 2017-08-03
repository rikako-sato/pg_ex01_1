package pg_ex01_1;

public class PG_ex01_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int i = 1 ; i <= 100; i++){
			//３と４の公倍数の時、"◆"を表示する
			if (i%12 ==0){
				System.out.print("◆"+" ");

			}else if (i % 4 ==0 ){
				//４の倍数の時、"□"を表示する
				System.out.print("□"+" ");

			}else if (i%3 ==0 ){
				//３の倍数の時、"△"を表示する
				System.out.print("△"+" ");

			}else{
				//３と４の倍数以外の時、該当の数字を表示する
				System.out.print(i+" ");
			}
		}

	}

}
