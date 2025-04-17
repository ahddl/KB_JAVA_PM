package lecture.problem;

public class Monster {

    /*
    접근 제어자
    - 클래스 혹은 클래스의 멤버(필드, 메서드)에 참조 연산자로 접근 할 수 있는 범위를 제한하기 위한 키워드
    1. public :  모든 패키지에서 접근 가능
    2. protected : 동일 패키지에 접근 가능(단, 상속 관계에 있으면 다른 패키지에서도 접근 간으
    3. default : 동일 패키지에서만 접근 허용 (작성 안하면 default)
    4. private : 해당 클래스 내부에서만 접근허용
     */
    String name;
    int hp;

    //Getter
    // 값을 인스턴스에서 꺼내기 위해 사용하는 메서드
    public String getName() {
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    //Setter
    //인스턴스의 멤버 값ㅇ르 설정하기 위해 사용하는 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        // 0 이하로 바뀌면 X
        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
}
