package LinkListExercise;

/**
 * Created by gujarat on 29/10/16.
 */
public class LinkList {
    public Link firstLink;

    public LinkList(){
       firstLink = null;
    }


    public boolean isEmpty(){
        return (firstLink==null);
    }

    public Link insertLink(String bookName, int millionSold){
        Link newLink = new Link(bookName,millionSold);
        newLink.next = firstLink;
        firstLink = newLink;

        return newLink;
    }

    public Link removeFirst(){
        Link linkreference = firstLink;
        if(!isEmpty()){
            //remove the first link
            firstLink = firstLink.next;
        }else{
            System.out.println("Empty List");
        }

        // return the remove Link
        return linkreference;
    }

    public Link searchLink(String bookName){
        Link current = firstLink;
        if(!isEmpty()){
           while(current.next != null) {
               if(current.bookName.equals(bookName)){
                   return current;
               }else{
                   current = current.next;
               }
           }
            return null;
        }else{
            System.out.println("Empty Link List");
        }

        return null;
    }

    public Link find(String bookName){
        Link searchLink = firstLink;
        if(!isEmpty()){
            while(searchLink.bookName != bookName){
                if(searchLink.next==null){
                    return null;
                }else{
                    searchLink = searchLink.next;
                }
            }
        }else{
            System.out.println("Empty Link List");
        }

        return searchLink;

    }

    public void display(){
        Link printLink = firstLink;
        while(printLink!=null){
            printLink.display();
            printLink = printLink.next;
            System.out.println(); // give more space
        }
    }

    public Link removeLink(String bookName){
        Link previous = firstLink;
        Link deleteLink = firstLink;
        if(!isEmpty()){
           while(deleteLink != null) {
               if(deleteLink.bookName.equals(bookName)){
                   // remove found Link
                   if(deleteLink==firstLink){
                       firstLink = firstLink.next;
                   }else{
                       previous.next = deleteLink.next;
                   }
                   System.out.println("found data remove "+deleteLink.bookName);
                   System.out.println("next data "+deleteLink.next.bookName);

                   return deleteLink;
               }else{
                   previous = deleteLink;
                   deleteLink = deleteLink.next;
               }

           }
            return null;

        }else{
            System.out.println("Empty Link");
        }

        return firstLink;
    }

    public Link removeLink2(String bookName){
        Link previous = firstLink;
        Link current = firstLink;

        while(current.bookName != bookName){
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }

        if(current==firstLink){
            firstLink = firstLink.next;
        }else{
            previous.next = current.next;
        }

        return current;
    }






}
