import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<ObjA> listA = new ArrayList<>();
        ObjA objA = new ObjA(1, new ArrayList<>());
        listA.add(objA);

        List<ObjB> listB = new ArrayList<>();
        ObjB objB1 = new ObjB(1, "1");
        ObjB objB2 = new ObjB(1, "2");
        ObjB objB3 = new ObjB(3, "1");
        listB.add(objB1);
        listB.add(objB2);
        listB.add(objB3);
        System.out.println("ListA Before: " + listA);
        System.out.println("ListB: " + listB);
        listA.forEach(a -> {
            listB.forEach(b -> {
                if (a.getId().intValue() == b.getId().intValue()) {
                    a.getListArr().add(b);
                }
            });
        });

        System.out.println("ListA After: " + listA);
    }
}
