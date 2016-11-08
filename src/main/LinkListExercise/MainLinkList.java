package LinkListExercise;

/**
 * Created by gujarat on 30/10/16.
 */
public class MainLinkList {
    public static void main(String [] args){
        LinkList linkList = new LinkList();

        linkList.insertLink("Book1",400);
        linkList.insertLink("Book2",502);
        linkList.insertLink("Book3",605);

        //Link found = linkList.searchLink("Book3");
        //System.out.println("data found = "+found.bookName);

        //linkList.display();
        //linkList.removeLink("Book3");
        //linkList.removeLink2("Book3");
        //linkList.display();
        Link link = new Link("as",123);
        link.array();
        //System.out.println("result "+link.solution(9090090));
        System.out.println(5%2);

    }
}
