import javax.print.DocFlavor.STRING;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd (int int1){
		if (int1%2 == 0 && int1 != 0 ){
			return "Even" ;
		}
		else if (int1%2 != 0 && int1 != 0){
			return "Odd" ;
		}
		return "Zero" ;
	}
    public static String positiveOrNegative (int int1){
		if (int1 >0){
			return "Positive" ;
		}
		else if (int1 <0 ){
			return "Negative" ;
		}
		return "Zero" ;
	}

	public static String pluralize(String v1){
		if (v1.endsWith("ey") || v1.endsWith("Ey") || v1.endsWith("eY") || v1.endsWith("EY")){
			return "eys" ;
		}
		else if (v1.endsWith("y") || v1.endsWith("Y") ){
			return "ies" ;
		}
		
		else if ( v1.endsWith("ife")|| v1.endsWith("iFe")|| v1.endsWith("iFE")|| v1.endsWith("IFE")|| v1.endsWith("ifE")|| v1.endsWith("IfE")|| v1.endsWith("IFe")){
			return "ives" ;
		}
		else
			return "s" ;

	}

}
