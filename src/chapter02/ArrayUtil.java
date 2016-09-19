package chapter02;

public class ArrayUtil {
	public static double[] intToDouble( int[] a ){
		if( a == null ){
			return null;
		}
		int length = a.length;
		double[] result = new double[ length ];
		
		for( int i = 0; i < length ; i++){
			result[i] = a[i];
		}
		
		return result;
	}
	
	public static int[] doubleToInt( double[] a ){
		if( a == null ){
			return null;
		}
		int length = a.length;
		int[] result = new int [ length ];
		
		for(int i = 0; i < length ; i++){
			result[i] = (int)a[i];
		}
		return result;
	}
	
	public static int[] concat( int a[], int b[]){
		
		int length1 = ( a == null ) ? 0 : a.length;
		int length2 = ( b == null ) ? 0 : b.length;
		
		int length = length1 + length2;
		int[] result = new int[ length ];
		
		int index = 0;
		for(int i = 0; i < length1; i++){
			result[ index ]  = a[i];
			index++;
		}
		
		for(int i = 0; i < length2; i++){
			result [ index ] = b[i];
			index++;
		}
		return result;
		
		
		
		
//		if( a == null && b == null ){
//			return null;
//		}else if( a == null ){
//			return b;
//		}else if( b == null ){
//			return a;
//		}else{
//			int length = a.length + b.length;
//			int[] result = new int[length];
//			
//			for( int i = 0; i < a.length; i++ ){
//				result[i] = a[i];
//			}
//			for( int j = a.length ; j < length ; j++){
//				result[j] = b[j - a.length];
//			}
//			return result;
//		}
		
	}
}
