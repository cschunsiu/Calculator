package cal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.text.html.parser.Parser;
import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by US20280 on 2/21/2017.
 */
public class model {
    String[] characters = new String[]{"+","-","*","/","cc","="};

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

}
