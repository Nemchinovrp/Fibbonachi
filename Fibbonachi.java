public class Fibbonachi {

	int[] fib = new int[20];
	
	public void compute(){
		for(int i=2; i<fib.length; i++){
			fib[0] = 0;
			fib[1]=1;
			fib[i]= fib[i-1]+fib[i-2];	
		}

	}
	public void input(){
		for(int i=0; i<fib.length; i++){
			int elem=0;
			elem=fib[i] ;
			System.out.println(elem);
		}
	}
	
	public static void main(String[] args) {
		Fibbonachi object = new Fibbonachi();
		object.compute();
		object.input();
	}

}
