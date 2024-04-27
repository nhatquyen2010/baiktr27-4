package b1;

public class HamDeQuy {
	public static int dequy(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return dequy(n - 1) + dequy(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 8; n++) {
    		System.out.println("gia tri cua f(8) la:" + dequy(n));
        }
    }
		
}
