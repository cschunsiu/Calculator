package cal;


/**
 * Created by US20280 on 2/21/2017.
 */
public class model {
    String[] characters = new String[]{"+","-","*","/","=","aa"};
    String e = "";

    public boolean CharacterCheck(String host){
        for(int i = 0; i < characters.length; i++){
            if(host.contains(characters[i])){
                return true;
            }
        }
        return false;
    }

    public int calculation(int inputA, int inputB, String CalVal) {
        int result = 0;

        switch (CalVal){
            case "+":
                result = inputA + inputB;
                break;
            case "-":
                result = inputA - inputB;
                break;
            case "*":
                result = inputA * inputB;
                break;
            case "/":
                result = inputA / inputB;
                break;
        }
        return result;
    }

    public String OutputText(String signal, String input, Integer inputA){

        if(signal.equals("num")){
            e += input;
        }else if (signal.equals("sign")){
            e += " ";
            e += input;
            e += " ";
        }else if (signal.equals("final")){
            String f = Integer.toString(inputA);
            e = f + " " + input + " ";
        }else if (signal.equals("clear")){
            e = "";
        }else if (signal.equals("=")){
            e = "" + inputA;
        }

        return e;
    }
}
