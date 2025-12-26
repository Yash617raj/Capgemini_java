class Fifth {
    //Q. WAJP to print all the numbers from the range 1 to 1000 without using any loop

    public static void main(){
        solve(1);
    }  

    public static void solve (int start){
        if(start>1000) return;
        
        System.out.println(start);
        solve(start+1);
    }
}
