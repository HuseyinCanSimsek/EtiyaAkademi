public class Main {
    public static void main(String[] args) {
    BaseLogger[] baseLoggers=new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger()};
    for(BaseLogger b:baseLoggers)
    {
        b.log();
    }
    CustomerManager cm=new CustomerManager(new ConsoleLogger());
    cm.Add();
    }
}