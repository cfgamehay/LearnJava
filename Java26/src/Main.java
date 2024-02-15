public class Main {
    //    public static void main(String[] args) { unlabeled
//        int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;//neu in >10 thì thoát vòng lặp
//			}
//            System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//    }

//    public static void main(String[] args) { labeled
//        int out, in = 0;
//        outer: for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in > 10)
//                    break outer;//khi in > 10 thì sẽ thoát vòng lặp có label outer.
//            }
//            System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//        }
//        System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//    }
//
//	public static void main(String[] args) { unlabeled
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);//in bỏ qua nếu i < 50
//		}
//	}
//    	public static void main(String[] args) {
//		outer: for(int i=2; i<=9; i++) {
//			for(int j=1; j<=10; j++) {
//				if(j>5)// nếu i nhân dến 5 thì skip vòng lặp outer hiện thời
//                {
//                    System.out.println();
//                    continue outer;
//                }
//				System.out.println(i+" x "+j +" = "+(i*j));
//			}
//
//		}
//	}

    public static void main(String[] args) {
        outer: for(int i=2; i<=9; i++) {
            for(int j=1; j<=10; j++) {
                if(j>5)// nếu i nhân dến 5 thì skip vòng lặp outer hiện thời
                {
                    System.out.println();
                    return;// ngưng luôn phương thức main (chương trình) -> trả về void
                }
                System.out.println(i+" x "+j +" = "+(i*j));
            }

        }
    }
}
