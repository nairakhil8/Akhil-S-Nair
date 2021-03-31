public class TaxAmount {
    public double calculateTaxAmount(int ctc){
        double amount = 0.0;
        if(ctc>=0 && ctc<=180000){
            amount = 0.0;
        }else if(ctc>=180001 && ctc<=300000){
            amount = (ctc*(10.0/100));
        }else if(ctc>=300001 && ctc<=500000){
            amount= (ctc*(20.0/100));
        }else if(ctc>=500001 && ctc<=1000000){
            amount = (ctc*(30.0/100));
        }

        return amount;
    }
}
