package strukture.stabla;

public class StabloGenerator {

	public static void napraviStablo_3(CvorStabla koren){
		koren.podatak = 1;
		
		koren.levo = new CvorStabla(5);
		koren.desno = new CvorStabla(10);
		
//      44
//      /\
//     /  \
//    /    \
//   13    15 
		
	}
	
	public static void napraviStablo_7(CvorStabla koren){
		
		koren.podatak = 1;
		
		koren.levo = new CvorStabla(null, null, 13);
		koren.levo.levo = new CvorStabla(78);
		koren.levo.desno = new CvorStabla(130);
		koren.desno = new CvorStabla(null, null, 15);
		koren.desno.levo = new CvorStabla(26);
		koren.desno.desno = new CvorStabla(26);
		
//                 1
//     	           /\
//                /  \
//              /      \
//             /	    \
//           13          15 
//          / \          / \
//         /   \        /   \
//        78   130      26   26
	
	
	}
	
	public static void napraviStablo_13(CvorStabla koren){
		
		koren.podatak = 1;
		
		koren.levo = new CvorStabla(null, null, 13);
		koren.levo.levo = new CvorStabla(78);
		koren.levo.desno = new CvorStabla(130);
		koren.levo.levo.levo = new CvorStabla(56);
		koren.levo.levo.desno = new CvorStabla(110);
		koren.levo.desno.levo = new CvorStabla(200);
		koren.levo.desno.desno = new CvorStabla(235);
		
		koren.desno = new CvorStabla(null, null, 15);
		koren.desno.levo = new CvorStabla(26);
		koren.desno.levo.levo = new CvorStabla(99);
		koren.desno.levo.desno = new CvorStabla(17);
		koren.desno.desno = new CvorStabla(26);
		koren.desno.desno.levo = new CvorStabla(53);
		koren.desno.desno.desno = new CvorStabla(10);
		
//		                        1
//		                     	/\
//		                       /  \
//		                     /      \
//		                    /		 \
//		                  13          15 
//		                 / \          / \
//		                /   \        /   \
//		              78   130      26   26
//		             / \     /\      /\    /\
//		            /   \   /  \    /  \  /  \
//		          56   110 200 235  99 17 53  10
  	}
	
	public static void napraviStablo_17(CvorStabla koren){
		
		koren.podatak = 1;
		
		koren.levo = new CvorStabla(null, null, 13);
		koren.levo.levo = new CvorStabla(78);
		koren.levo.desno = new CvorStabla(130);
		koren.levo.levo.levo = new CvorStabla(56);
		koren.levo.levo.desno = new CvorStabla(110);
		koren.levo.desno.levo = new CvorStabla(200);
		koren.levo.desno.desno = new CvorStabla(235);
		
		koren.desno = new CvorStabla(null, null, 15);
		koren.desno.levo = new CvorStabla(26);
		koren.desno.levo.levo = new CvorStabla(99);
		koren.desno.levo.desno = new CvorStabla(17);
		koren.desno.desno = new CvorStabla(26);
		koren.desno.desno.levo = new CvorStabla(53);
		koren.desno.desno.desno = new CvorStabla(10);
		
		koren.levo.levo.levo.levo = new CvorStabla(2);
		koren.levo.levo.levo.desno = new CvorStabla(5);
		koren.levo.levo.desno.levo = new CvorStabla(66);
		koren.levo.levo.desno.desno = new CvorStabla(9);
		koren.levo.desno.levo.levo = new CvorStabla(1);
		koren.levo.desno.levo.desno = new CvorStabla(3);
		koren.levo.desno.desno.levo = new CvorStabla(75);
		koren.levo.desno.desno.desno = new CvorStabla(312);
		
		
//		                        1
//		                     	/\
//		                       /  \
//		                     /      \
//		                    /		 \
//		                  13          15 
//		                 / \          / \
//		                /   \        /   \
//		              78   130      26   26
//		             / \     /\      /\    /\
//		            /   \   /  \    /  \  /  \
//		          56   110 200 235  99 17 53  10
//		          /\    /\   /\  /\
//		         / \    /\   /\  / \
//		        / \    / \   /\  /  \
//		       /  \    / \   /\   /  \
//		      2    5  66  9 1  3 75  312
    	}
	
	public static void napraviStablo_BezDesneGrane(CvorStabla koren){
		koren.podatak = 15;
		
		koren.levo = new CvorStabla(11);
		koren.levo.levo = new CvorStabla(99);
		koren.levo.levo.levo = new CvorStabla(75);
		koren.levo.levo.levo.levo = new CvorStabla(2);
		koren.levo.levo.levo.levo.levo = new CvorStabla(36);
		
//							15
//							/
//						   11
//						  /
//						 99
//						/
//					   75
//					  /
//					 2
//					/
//				   36
		
	}
	
	public static void napraviStablo_BezLeveGrane(CvorStabla koren){
		koren.podatak = 9;
		
		koren.desno = new CvorStabla(176);
		koren.desno.desno = new CvorStabla(113);
		koren.desno.desno.desno = new CvorStabla(31);
		koren.desno.desno.desno.desno = new CvorStabla(12);
		koren.desno.desno.desno.desno.desno = new CvorStabla(200);
		koren.desno.desno.desno.desno.desno.desno = new CvorStabla(74);
		
//						9
//						 \
//						 176
//						   \
//						   	113
//						     \
//						      31
//						       \
//						        12
//						         \
//						         200
//						           \
//						           74
		
		
	}
	
	public static void napraviStablo_BST(CvorStabla koren){
		koren.podatak = 56;
		
		koren.levo = new CvorStabla(null, null, 27);
		koren.levo.levo = new CvorStabla(13);
		koren.levo.desno = new CvorStabla(39);
		koren.levo.levo.levo = new CvorStabla(10);
		koren.levo.levo.desno = new CvorStabla(22);
		koren.levo.desno.levo = new CvorStabla(32);
		koren.levo.desno.desno = new CvorStabla(47);
		
		koren.desno = new CvorStabla(null, null, 156);
		koren.desno.levo = new CvorStabla(57);
		koren.desno.levo.desno = new CvorStabla(117);
		koren.desno.desno = new CvorStabla(200);
		koren.desno.desno.levo = new CvorStabla(173);
		koren.desno.desno.desno = new CvorStabla(256);
		
		koren.levo.levo.levo.levo = new CvorStabla(2);
		koren.levo.levo.levo.desno = new CvorStabla(12);
		koren.levo.levo.desno.levo = new CvorStabla(15);
		koren.levo.levo.desno.desno = new CvorStabla(25);
		koren.levo.desno.levo.levo = new CvorStabla(29);
		koren.levo.desno.levo.desno = new CvorStabla(35);
		koren.levo.desno.desno.levo = new CvorStabla(42);
		koren.levo.desno.desno.desno = new CvorStabla(54);
		
		
//				        56
// 				    	/\
//       			   /  \
//     				  /    \
//    				/		 \
//  			  27          156 
//               / \          / \
//              /   \        /   \
//			  13    39      57   200
//			/ \     /\       \    /\
//         /   \   /  \      \   /  \
//       10    22 32  47    117 173  256
//      /\    /\   /\  /\
//     / \    /\   /\  / \
//    /  \   / \   /\  /  \
//   /   \   / \   /\   /  \
//  2    12 15 25 29 35 42  54

}

	}
	
	

