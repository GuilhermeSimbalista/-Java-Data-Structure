package Aula06;

public class ordenarFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	        String STR = "UNIVERSIDADEDOCONTESTADO"; 
	        char[] StringtoChar = STR.toCharArray();
	        for(int i=0; i<(StringtoChar.length-1); i++)
	        {
	            for(int j=i + 1; j>0; j--)
	            {
	                if(StringtoChar[j] < StringtoChar[j-1])
	                {
	                    char Temp = StringtoChar[j-1];
	                    StringtoChar[j-1] = StringtoChar[j];
	                    StringtoChar[j] = Temp;
	                }
	            }
	        }
	        String SortedString = new String(StringtoChar);
	        System.out.println("Palavra normal: " + STR); 
	        System.out.println("Palavra na ordem alfabetica : " + SortedString);
	    }


}
