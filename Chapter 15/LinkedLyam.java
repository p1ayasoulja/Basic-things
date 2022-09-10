interface Link{
    String hello(String s);
}
class Linked{
    /*static*/ String strRev(String s){
        String rev="";
        for(int i=s.length()-1;i>-1;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}
public class LinkedLyam {
    static String meth(Link sf,String s){
        return sf.hello(s);
    }
    public static void main(String[] args) {
        String st="Start";
        String fi;
      //  fi=meth(Linked::strRev,st);
        System.out.println("St = "+st);

        Linked stry= new Linked();
        fi=meth(stry::strRev,st);
        System.out.println("Fi = "+fi);

    }
}
