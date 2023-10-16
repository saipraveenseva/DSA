import java.math.BigDecimal;

public class HandleFractions{
    public static void main(String[] args) {
        String d1="39.13";
        String d2="100";
        String sAvg=String.valueOf(getAverageMethodA(d1,d2));
        String sAvg2=String.valueOf(getAverageMethodB(d1,d2));
        String sAvg3=String.valueOf(getAverageMethodC(d1,d2));
        System.out.println(sAvg+"----"+sAvg2+"-----"+sAvg3);
    }

    private static BigDecimal getAverageMethodA(String d1, String d2){
        BigDecimal num1=new BigDecimal(d1);
        BigDecimal num2=new BigDecimal(d1);
        BigDecimal num3=new BigDecimal(d1);
        return num3;
    }

    private static double getAverageMethodB(String d1, String d2){
        double num1=Double.valueOf(d1);
        double num2=Double.valueOf(d2);

        return num1/num2;

    }

    private static float getAverageMethodC(String d1, String d2){
        float num1=Float.valueOf(d1);
        float num2=Float.valueOf(d2);
        return num1/num2;
    }
}

/*
Java
Q1 c
Q2 d
Q3 Compilation will fail
Q5 Compilation error
Q7 COmpilation
Q8 d
Q9 b
Q10 b


 */