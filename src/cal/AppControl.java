package cal;

/**
 * Created by US20280 on 2/16/2017.
 */
public class AppControl {
    public String OutputString;
    public String indicator ="";
    model model = new model();
    private int inputA;
    private int inputB;
    private String numComb = "";
    private int flag = 0;

    public String ValDistributor(String CalVal){
            if (CalVal.equals("aa")){
                    inputA = 0;
                    numComb = "";
                    flag = 0;
                    inputB = 0;
                    indicator = "";
                    OutputString = model.OutputText("clear", CalVal, 0);
            }else if (model.CharacterCheck(CalVal)){
                if (flag == 0){
                    if (indicator.equals("=")){
                        indicator = CalVal;
                        OutputString = model.OutputText("sign", CalVal, 0);
                        flag = 1;
                    }else {
                        inputA = Integer.parseInt(numComb);
                        numComb = "";
                        indicator = CalVal;
                        flag = 1;
                        OutputString = model.OutputText("sign", CalVal, 0);
                    }
                }else{
                    switch (CalVal){
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            inputB = Integer.parseInt(numComb);
                            int e = model.calculation(inputA, inputB, indicator);
                            OutputString = model.OutputText("final", CalVal, e);
                            indicator = CalVal;
                            inputA = e;
                            numComb = "";
                            break;
                        case "=":
                            inputB = Integer.parseInt(numComb);
                            int f = model.calculation(inputA, inputB, indicator);
                            OutputString = model.OutputText("=", CalVal, f);
                            indicator = CalVal;
                            inputA = f;
                            numComb = "";
                            flag = 0;
                            break;
                    }
                }
            } else {
                switch (CalVal) {
                    case "1":
                        numComb += "1";
                        OutputString = model.OutputText("num","1", 0);
                        break;
                    case "2":
                        numComb += "2";
                        OutputString = model.OutputText("num","2", 0);
                        break;
                    case "3":
                        numComb += "3";
                        OutputString = model.OutputText("num","3", 0);
                        break;
                    case "4":
                        numComb += "4";
                        OutputString = model.OutputText("num","4", 0);
                        break;
                    case "5":
                        numComb += "5";
                        OutputString = model.OutputText("num","5", 0);
                        break;
                    case "6":
                        numComb += "6";
                        OutputString = model.OutputText("num","6", 0);
                        break;
                    case "7":
                        numComb += "7";
                        OutputString = model.OutputText("num","7", 0);
                        break;
                    case "8":
                        numComb += "8";
                        OutputString = model.OutputText("num","8", 0);
                        break;
                    case "9":
                        numComb += "9";
                        OutputString = model.OutputText("num","9", 0);
                        break;
                    case "0":
                        numComb += "0";
                        OutputString = model.OutputText("num","0", 0);
                        break;
                }
            }


        return OutputString;
    }
}
