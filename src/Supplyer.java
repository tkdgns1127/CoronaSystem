	
public class Supplyer {
		
		static int sv1 = 100; //공급자가 가진 화이자 //
		static int sv2 = 100; //공급자가 가진 모더나
		
		public void supply(Hospital01 hospital, int inputV1, int inputV2) {
			sv1 -=  inputV1;
			sv2 -=	inputV2;
			
			hospital.add(inputV1, inputV2);
		}
	}