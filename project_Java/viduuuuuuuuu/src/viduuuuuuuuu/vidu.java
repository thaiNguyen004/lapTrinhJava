package viduuuuuuuuu;


	
	import java.util.Scanner;

	public class vidu {
	    
	    public static void main(String[] args) {
	        int menu = 0;
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.println("+---------------------------------------------------+");
	            System.out.println("1. Giai phuong trinh bac nhat");
	            System.out.println("2. Giai phuong trinh bac 2");
	            System.out.println("3. Tinh tien dien");
	            System.out.println("4. Ket thuc");
	            System.out.println("+---------------------------------------------------+");
	            System.out.println("Moi chon chuc nang:");
	            menu = sc.nextInt();
	            switch (menu) {
	                case 1: {
	                    vidu vd = new vidu();
	                    vd.GiaiPTB1();
	                    break;
	                }
	                case 2: {
	                    break;
	                }
	                case 3: {
	                    break;
	                }
	                case 4: {
	                    break;
	                }
	                default: {
	                    break;
	                }

	            }

	        } while (menu != 4);
	    }

	    public void GiaiPTB1() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Giai phuong trinh bac nhat:");
	        // ax+b=0
	        float a, b, x;
	        System.out.println("Nhap vao a:");
	        a = sc.nextFloat();
	        System.out.println("Nhap vao b:");
	        b = sc.nextFloat();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh vo so nghiem");
	            } else {
	                System.out.println("Phuong trinh vo nghiem");
	            }
	        } else {
	            x = (float) -b / a;
	            System.out.println("X=" + x);
	        }
	    }

	    public void GiaiPTB2() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Giai phuong trinh bac 2");
	        // Pt : ax^2+bx+c=0
	        double a, b, c, x1, x2;
	        System.out.println("Nhap vao a:");
	        a = sc.nextDouble();
	        System.out.println("Nhap vao b:");
	        b = sc.nextDouble();
	        System.out.println("Nhap vao c:");
	        c = sc.nextDouble();
	        double detal = Math.pow(b, 2) - 4 * a * c;
	        if (detal < 0) {
	            System.out.println("Phuong trinh vo nghiem");
	        } else if (detal == 0) {
	            x1 = -b / 2 * a;
	            System.out.println("X1=X2=" + x1);
	        } else {
	            x1 = (-b + Math.sqrt(detal)) / (2 * a);
	            x2 = (-b - Math.sqrt(detal)) / (2 * a);
	            System.out.println("X1=" + x1);
	System.out.println("X2=" + x2);
	        }
	    }

	    public void tienDien() {
	        int soDien;
	        double tienDien;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhap vao so dien:");
	        soDien = sc.nextInt();
	        if (soDien < 50) {
	            tienDien = soDien * 1000;
	        } else {
	            tienDien = 50 * 1000 + (soDien - 50) * 1200;
	        }
	        System.out.println("Tien dien=" + tienDien);
	    }
	}
}
