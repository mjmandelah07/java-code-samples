enum People {
    Girl,
    Boy,
    Man,
    Woman
}

public class LoopThroughEnum {
    public static void main(String[] args) {
        for(People myPeople: People.values()) {
            System.out.println(myPeople);
        }
    }
}
