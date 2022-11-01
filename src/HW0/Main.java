package HW0;

public class Main
{
    public static void main(String [] args )
    {

//        UndoableStringBuilder str = new UndoableStringBuilder();
//        str.append("A");
//        System.out.println(str);
//        str.append("B");
//        System.out.println(str);
//        str.append("C");
//        System.out.println(str);
//        str.append("D");
//        System.out.println(str);
//        System.out.println("-----------------------------------------------------------------------------------------------------");
//        str.undo();
//        System.out.println(str);
//        str.undo();
//        System.out.println(str);
//        str.undo();
//        System.out.println(str);
//        str.undo();
//        System.out.println(str);
//        System.out.println("done");







        //str.append("");
        //System.out.println(str);
        //str.replace(3 ,str.length() ,"eat");
        //System.out.println(str);
        //str.replace(2 ,str.length(),"");
        //System.out.println(str);
        // str.delete(2 ,str.length());
        //System.out.println(str);
        //str.insert(str.length(),"1111");
        //System.out.println(str);

        UndoableStringBuilder usb = new UndoableStringBuilder();
        usb.append("to be or not to be") ;
        System.out.println(usb) ;
        usb.replace(3, 5, "eat") ;
        System.out.println(usb) ;
        usb.replace(17, 19, "eat") ;
        System.out.println(usb) ;
        usb.reverse();
        System.out.println(usb);
        System.out.println();

        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb) ;






    }



}
