package InterviewQuestion;

public class first {
    static{//static block runs when java class loads
        System.out.println("static block");
    }
    {// instance block when object is created
        System.out.println("Empty block");
    }

    public static void main(String[] args) {
        //first obj = new first();
        System.out.println("Main block");
    }
}
