public class P1 {
    int id;
    String name;

    public P1(int id, String name){
        this.id = id;
        this.name = name;
    }

    // @Override
    // public String toString(){
    //     return "[id :"+id+", name: "+name+"]";
    // }

    @Override
    public boolean equals(Object obj){
        P1 ref = (P1) obj;
        return this.id == ref.id && this.name==ref.name;
    }

    public static void main(String[] args) {
        P1 ref = new P1(1,"Mohit");

        // System.out.println(ref); it runs the .toString() method implicitly
        // System.out.println(ref.toString());

        // System.out.println(ref.hashCode());
        // System.out.println(Integer.toHexString(ref.hashCode()));

        // System.out.println(ref.getClass());
        // System.out.println(ref.getClass().getName());
        // System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));

        P1 ref1 = new P1(1, "Mohit");
        System.out.println(ref==ref1); // check the address of the object
        System.out.println(ref.equals(ref1));
    }
}
