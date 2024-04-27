package b2;

import java.util.Arrays;

public class mangsonguyen {
	
	//cau A
	public static int sochan (int[] arr) {
		int count = 0;
		for (int num : arr ) {
			if ( num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	 //cau B
	 public static boolean sapxep(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                return false;
	            }
	        }
	        return true;
	    }

	 //cau C
	 public static int demsokhoang(int[] arr, int start, int end) {
	        int count = 0;
	        for (int num : arr) {
	            if (num >= start && num <= end) {
	                count++;
	            }
	        }
	        return count;
	    }
	 
	 //cau D
	 public static int tinhtong(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }
	 
	 //cau e
	 public static int tinhgtle(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                sum += num;
	            }
	        }
	        return sum;
	    }
	 //cau f
	 public static void tangdan(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	 
	 //cau G
	 public static int timmax(int[] arr) {
	        int max = Integer.MIN_VALUE;
	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int[] array = {1, 3, 5, 6, 7, 8, 10, 12, 15, 18};
	        
	        //cau A
	        System.out.println("So phan tu trong mang : " + sochan(array));

	        //Cau B
	        System.out.println("Mảng có được sắp xếp tăng dần không: " + sapxep(array));

	        System.out.println("Số phần tử trong khoảng từ 4 đến 12: " + demsokhoang(array, 4, 12));
	        
	        //cau d
	        System.out.println("Tổng các phần tử của mảng: " + tinhtong(array));
	        
	        //cau e
	        System.out.println("Tổng các phần tử có giá trị lẻ: " + tinhgtle(array));
	        
	        //cau f
	        tangdan(array);
	        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(array));
	        
	        //cau g
	        System.out.println("Giá trị lớn nhất của mảng: " + timmax(array));
		
	}

}
