package fp_06;

public class ExampleFor2 {

	public static void main(String[] args) {
		
		//Imprimir los numeros multiplos de 5 entre el 100 y el 200
		//nums = {100...200}
		for(int nums=100;nums<=200;nums++) {
			if(nums%5==0)
			{
				System.out.println(nums);
			}
		}

	}

}
