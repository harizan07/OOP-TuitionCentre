import java.util.Scanner;

public class Branches {
    /* private
    Integer _batugajah, _dpp, _semenyih, _batupahat,_wronginp;

    void set_batugajah(Integer BATUGAJAH){this._batugajah = BATUGAJAH;}
    void set_dpp(Integer DPP){this._dpp = DPP;}
    void set_semenyih(Integer SEMENYIH){this._semenyih = SEMENYIH;}
    void set_batupahat(Integer BATUPAHAT){this._batupahat = BATUPAHAT;}
    void set_wronginp(Integer WRONGINPUT){this._wronginp = WRONGINPUT;}

    Integer get_answer(){
        Scanner Input = new Scanner(System.in);
        Integer _answer_for_branch = 0;

        System.out.println("Enter what branch: ");
        System.out.println("1 for batu gajah, 2 for desa pinggiran putra, 3 for semenyih and 4 for batu pahat: ");
        _answer_for_branch = Input.nextInt();

        if (_answer_for_branch == 1) {
            _batugajah+=1;
            return _batugajah;
        } else if (_answer_for_branch == 2) {
            return _dpp;
        } else if (_answer_for_branch == 3) {
            return _semenyih;
        } else if(_answer_for_branch == 4){
            return _batupahat;
        } else {System.out.println("Wrong Input!");}
    }*/

    public static void branches(){
                Scanner Input = new Scanner(System.in);
                Integer _answer_for_branch = 0;

                System.out.println("Enter what branch: ");
                System.out.println("1 for batu gajah, 2 for desa pinggiran putra, 3 for semenyih and 4 for batu pahat: ");
                _answer_for_branch = Input.nextInt();

                if (_answer_for_branch == 1) {
                    System.out.println(branchname.BATUGAJAH);
                } else if (_answer_for_branch == 2) {
                    System.out.println(branchname.DESAPINGGIRANPUTRA);
                } else if (_answer_for_branch == 3) {
                    System.out.println(branchname.SEMENYIH);
                } else if(_answer_for_branch == 4){
                    System.out.println(branchname.BATUPAHAT);
                } else {System.out.println("Wrong Input!");}
                branch first_branch = new branch(_answer_for_branch);
        }

    enum branchname{
        BATUGAJAH, DESAPINGGIRANPUTRA, SEMENYIH, BATUPAHAT
    }
}
