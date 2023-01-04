public class RunMyProgram {
    public static void main(String[] args) {
        RunMyProgram m = new RunMyProgram();
        System.out.println(m.factroial(5));
        System.out.println(m.fibonacci(9));
    }

    public int factroial(int n)
    {
        int fac =1;
        if(n==1){
            fac= 1;
        }
        else {
            fac = n * factroial(n - 1);
        }
        System.out.println(fac);
        return fac;
    }


    public int fibonacci(int f)
    {
        if ((f == 0 || (f == 1)))
            return f;
        else
            return fibonacci(f-1) + fibonacci(f-2);

    }
}
