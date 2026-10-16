package Stringbuilder;

public class stringBuilder extends Object {
	static String name = "Karthikeyan";
	static StringBuilder builder = new StringBuilder(name);

	static void hash() {
		System.out.println(builder.hashCode());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "Karthikeyan";
		// 01234567891011
		System.out.println(name.length());
		StringBuilder builder = new StringBuilder(name);
		System.out.println(builder);
//		StringBuilder reverse = builder.reverse();
//		System.out.println("Reversing the given string : " + reverse);
		StringBuilder addString = builder.append(" Sitheswaran");
		System.out.println("Adding the new String one : " + addString);
		String name1 = "Tamil";
		StringBuilder builder1 = new StringBuilder(name1);
		StringBuilder addString1 = builder1.append(" Selvan");
		System.out.println("Adding the new string two : " + addString1);
		int nameLength = builder.length();
		System.out.println("Length of the first string : " + nameLength);
		int name1Capcity = builder1.capacity();
		System.out.println("Capacity of the second string : " + name1Capcity);
		boolean flag = builder.isEmpty();
		System.out.println("checking the given string is empty or not : " + flag);
		String substring = builder.substring(0, 7);
		System.out.println(substring);
		System.out.println(builder.subSequence(0, 7));
		System.out.println(builder1.subSequence(6, 12));
		hash();
		StringBuilder sb = builder1.deleteCharAt(5);
		System.out.println("Afer deleting the exact index : " + sb);
		System.out.println(name1);
		String n1 = "Loga";
		n1 = n1.concat("nanth");
		System.out.println(n1);
		System.out.println(name.equals(n1));
	}

}
