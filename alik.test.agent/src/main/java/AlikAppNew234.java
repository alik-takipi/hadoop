import org.apache.hadoop.fs.CreateFlag;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class AlikAppNew234
{
    public String getGreeting() throws Exception
    {
//        return "Hello world.";
        throw new AlikExceptionNew234();
    }
    
    public static void main(String[] args) throws InterruptedException {
//        new File("/home/alik/Downloads/src").renameTo(new File("/home/alik/Downloads/target"));
        while(true) {
            try {
                System.out.println((char)0);
                System.out.println("About to send exception...");
//                System.out.println(new AlikAppNew234().getGreeting());
                CreateFlag.validate(null);
            } catch (Exception e) {
//                throw Exceptions.rethrowUnchecked(e);
                System.out.println(e.getMessage());
            }
            Thread.sleep(5000);
        }
    }
}
