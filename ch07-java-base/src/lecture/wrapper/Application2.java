package lecture.wrapper;

public class Application2 {
    public static void main(String[] args) {
        //문자열값을 기본 자료형 값으로 변경 하는 것
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");			//8L은 안됨
        float f = Float.parseFloat("4.0f");		//4.0f는 됨
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);

        // 파싱의 반대 ( 자료형 값 -> 문자열로)
    }
}