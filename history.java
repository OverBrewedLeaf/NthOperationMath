public class history{
    private int one; //first number(largest)
    private int two; //second number
    private int ans; //
    private boolean answer;
    private String form; //printable
    /*
    constructor
    one is the first number
    two is the second number
    ans is the user input
    answer is if user was right or wrong
    form is a formatted readable string
    */
    public history(int one, int two, int ans, boolean answer, String sign){
        this.one = one;
        this.two = two;
        this.ans = ans;
        this.answer = answer;
        this.form = String.format("%2d%2s%3d%2s%1s%4d%1s%1s", one, sign, two, "=", " ", ans, " ", answer);
    }

    public int one(){
        return one;
    }

    public int two(){
        return two;
    }

    public int ans(){
        return ans;
    }

    public String form(){
        return form;
    }

    public boolean answer(){
        return answer;
    }
}