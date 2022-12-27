public class StaticFieldTest {

        public static void main(String[] args) {
            StaticField staticField1 = new StaticField(); // 객체 생성
            StaticField staticField2 = new StaticField();

            staticField2.num1 = 1000;

            staticField1.num1 = 100;


            System.out.println(staticField1.num1);
            System.out.println(staticField2.num1);

            staticField1.num2 = 150;
            staticField2.num2 = 1500;
            System.out.println(staticField1.num2);
            System.out.println(staticField2.num2);
            staticField1.area();

        }
    }

    class StaticField {
        int num1 = 10;
        static int num2 = 15;
        public void area(){
            System.out.println(num2);
        }
    }

