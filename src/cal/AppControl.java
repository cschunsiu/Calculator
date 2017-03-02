package cal;

/**
 * Created by US20280 on 2/16/2017.
 */
public class AppControl {
    public String result;
    public String indicator;
    model model = new model();
    private int inputA;
    private int inputB;
    private String numComb = "";
    private int flag = 0;

    public String ValDistributor(String CalVal){
        if(model.CharacterCheck(CalVal)) {
            if(flag == 0){
                inputA = Integer.parseInt(numComb);
                numComb = "";
                indicator = CalVal;
                flag = 1;
            }else if(flag == 1) {
                inputB = Integer.parseInt(numComb);
                int e = model.calculation(inputA,inputB,indicator);
                indicator = CalVal;
                inputA = e;

            }
        }else{
            switch (CalVal) {
                case "1":
                    numComb += "1";
                    break;
                case "2":
                    numComb += "2";
                    break;
                case "3":
                    numComb += "3";
                    break;
                case "4":
                    numComb += "4";
                    break;
                case "5":
                    numComb += "5";
                    break;
                case "6":
                    numComb += "6";
                    break;
                case "7":
                    numComb += "7";
                    break;
                case "8":
                    numComb += "8";
                    break;
                case "9":
                    numComb += "9";
                    break;
                case "0":
                    numComb += "0";
                    break;
            }
        }


        return result;
    }
}
