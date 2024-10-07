class book{
    String title,author;
    int numofpages;
    public book(String t,String a,int np){
    title=t;
    author=a;
    numofpages=np;
}
public String getAuthor(){
    return author;
}
public String gettitle(){
    return title;
}
public int getpages(){
    return numofpages;
}
}
class A{
    public static void main(String[] args){
        book a1=new book("thenewera","cz",197);
        System.out.println(a1.getAuthor());
    }
}