public class FourOperations {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int substract(int a,int b)
    {
        return a-b;
    }
    public int multiple(int a,int b)
    {
        return a*b;
    }
    public float divide(float a,float b)
    {
        float c=0;
        try{
            c=a/b;

        }catch(Exception e)
        {
            System.out.println("Sıfıra bölünemez");
        }
        return c;
    }
}
