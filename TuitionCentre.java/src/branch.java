import java.util.List;
import java.util.ArrayList;

enum branchname{
    BATUGAJAH, DESAPINGGIRANPUTRA, SEMENYIH, BATUPAHAT
}
public class branch {
    private
    Integer _branchname;
    public branch(Integer branch){
        set_branchname(branch);

    }
    void set_branchname(Integer branch){_branchname = branch;}
    Integer get_branchname(){return _branchname;}



}
