import java.util.Scanner;

public class Input {
    private
    String _answer_for_branch;
    Scanner input = new Scanner(System.in);
    public Input(String branch){
        set_answer_for_branch(branch);
    }
    void set_answer_for_branch(String branch) {
        _answer_for_branch = branch;
    }

    String get_answer_for_branch(){
        return _answer_for_branch;
    }
}
