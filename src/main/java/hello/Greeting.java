package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public static void Hello() {
    		System.out.println("Hello World!");
    }

    public static void HelloContent(String [] arguments) {
        int index=0;
        for (String s: arguments) System.out.printf("args %d: %s\n", index++, s );
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}