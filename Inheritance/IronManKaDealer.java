package Inheritance;

 public class IronManKaDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IronManV1 suit2 = new IronManV1();
//		suit2.canFly();
//		IronManV2 suit = new IronManV2();
//		System.out.println(suit.helmet);
//		System.out.println(suit.arcReactor);
//		suit.canFly();
//		suit.repulsorsBlast();
		
		//Referance(Left) - Instance(Right) cases 
		//Case 1
		IronManV1 suit1 = new IronManV1();
		suit1.canFly();
		suit1.flameThrower();
		System.out.println("**************************");
		//Case 2
		//Ref - Parent , Object - Child
		IronManV1 suit2 = new IronManV2();
		suit2.canFly();//Override
		((IronManV2)suit2).repulsorsBlast();
		System.out.println(suit2.arcReactor);
		System.out.println("**************************");
		//Case 3
//		IronManV2 suit3 = new IronManV1();
//		suit3.repulsorsBlast();
		//suit3.canFly();
		
		//Case 4
		IronManV2 suit4 = new IronManV2();
		suit4.canFly();//override
		suit4.repulsorsBlast();
		System.out.println(suit4.arcReactor);
	}

}
