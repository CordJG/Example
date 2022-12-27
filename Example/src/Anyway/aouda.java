package Anyway;

public class aouda {
    public static void main(String[] args) {
        wjrmffldgl w=new wjrmffldgl();
        w.story();

        w.story(135,76);

        System.out.println("\n1+1은 이것입니다 "+wjrmffldgl.i);

        w.story(10);
        w.story();


    }
}

class wjrmffldgl{
    static int i = 2;
        public void story(){
            System.out.println("내 인생은 아름답진 않았다");
        }
        int story(int i){
            int result = i*2;
            return result;
        }
        void story(int x,int y){
        System.out.printf("나의 아이큐는 %s, 나의 몸무게는 %s",x,y);
    }

}
