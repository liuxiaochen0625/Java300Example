package chapter3;

public class EncryptAndDecrypt {
	public static void main(String []args){
		String str = "I am a programmer";
		char []ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
//			ch[i] = (char)(ch[i]^20000);
			System.out.println(ch[i]);
//		System.out.println(new String(ch));
		byte []strByte = str.getBytes();
		for(byte b:strByte)
			System.out.println(b);
		
	}
}
