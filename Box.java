public class Box {
int size = 0;

public Box() {} // constructor with no return type 

public static void main(String[] args) {
       Box objBox = new Box();
              objBox.size = 5;
         objBox.printBox('c');  // printing character 'c' instead of *
			}		
        public void printBox(char printingVar) {
		    final int noOfRows= 5;
			 for (int i = 1; i<= noOfRows; i++)
			     {
				 for (int j = 1; j <= size; j++)
				 {
				  System.out.print(printingVar);
					}
					System.out.println();
				}
			}
		
}
