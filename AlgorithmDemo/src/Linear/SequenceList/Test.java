package Linear.SequenceList;

public class Test {
    public static void main(String[] args) throws Exception {
        SequenceList<String> squence = new SequenceList<>(5);
        //测试遍历
        squence.insert(0, "姚明");
        squence.insert(1, "科比");
        squence.insert(2, "麦迪");
        squence.insert(3, "艾佛森");
        squence.insert(4, "卡特");
        System.out.println(squence.capacity());
        squence.insert(5, "aa");
        System.out.println(squence.capacity());
        System.out.println(squence.length());
        squence.insert(5, "aa");
        squence.insert(5, "aa");
        squence.insert(5, "aa");
        squence.insert(5, "aa");
        squence.insert(5, "aa");
        System.out.println(squence.capacity());
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        System.out.println(squence.capacity());
    }
}
