

public class Supplyer {
		
		static int sv1 = 100; //�����ڰ� ���� ȭ���� //
		static int sv2 = 100; //�����ڰ� ���� �����
		
		public void supply(Hospital01 hospital, int inputV1, int inputV2) {
			sv1 -=  inputV1;
			sv2 -=	inputV2;
			
			hospital.add(inputV1, inputV2);
		}
	}