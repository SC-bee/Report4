public class Main {
    public static void main(String[] args) {
        try {
            String str = "百二十三";
            int val = Integer.parseInt(str);
            System.out.println(val);
        } catch (NullPointerException n) {
            System.out.println("NullPointerExceptionエラーが発生しました。");
            System.out.println(n.getMessage());
        }
    }
}


