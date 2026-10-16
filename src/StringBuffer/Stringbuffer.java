package StringBuffer;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringbuffer = new StringBuffer("Karthikeyan ");
		System.out.println(stringbuffer.capacity());
		System.out.println(stringbuffer);
		int length = stringbuffer.length();
		System.out.println(length);
		StringBuffer appendName = stringbuffer.append("Sitheswaran");
		System.out.println(appendName);
		System.out.println(stringbuffer.charAt(5));
		System.out.println(stringbuffer.equals(appendName));
		//System.out.println(stringbuffer.lastIndexOf(null));
		//System.out.println(stringbuffer.reverse());
		System.out.println(stringbuffer.hashCode());
		System.out.println(stringbuffer.getClass());
		System.out.println(stringbuffer.substring(0,10));
		System.out.println(stringbuffer.delete(0, 4));
		System.out.println(stringbuffer.deleteCharAt(3));
	}

}
