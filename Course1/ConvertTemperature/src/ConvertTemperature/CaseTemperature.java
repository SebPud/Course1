package ConvertTemperature;

public class CaseTemperature {

    private double tempCelcjusza;
    private double tempKelvina;
    private double tempFahrenheita;

    public void setTempCelcjusza(double tempCelcjusza) {
        this.tempCelcjusza = tempCelcjusza;
    }

    public void setTempKelvina(double tempKelvina) {
        this.tempKelvina = tempKelvina;
    }

    public void setTempFahrenheita(double tempFahrenheita) {
        this.tempFahrenheita = tempFahrenheita;
    }


    public double getTempCelcjusza() {
        return tempCelcjusza;
    }

    public double getTempKelvina() {
        return tempKelvina;
    }

    public double getTempFahrenheita() {
        return tempFahrenheita;
    }


    public double cToK(double c){
        return  c+273.15;
    }

    public double cToF(double c){
        return  (c*1.8)+32;
    }


    public double kToC(double k){
        return  k-273.15;
    }

    public double kToF(double k){
        return  (k*1.8)-459.67;
    }


    public double fToC(double f){
        return  (f-32)/1.8;
    }

    public double fToK(double f){
        return  (f+459.67)*(5/9);
    }


}

