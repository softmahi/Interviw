
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("Entered");
			if(i==2){
				try {
					System.out.println("Tried 2");
					String s = null;
					
					s.toUpperCase();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}

}
