class Form0 {
    public void crOptimize(int row,int colume) {
        for(int i = 0; i < row; i++ ) {
            for(int j = 0; j < colume; j++) {
                System.out.print("("+i+","+j+")");
            }
        System.out.println();
        }
    }
}
class FormOptimize {
    public static void main(String[] arge) { 
        Form0 form = new Form0();
        form.crOptimize(10,10);
        }
}