public class Main {

    public static void main(String[] args) {
	//mükemmel sayi bölenlerin toplamı kendisine eşit olan sayıya denir
        int number=28;
        int x;
        int toplam=0;
        for(int i=1;i<number;i++){

            x=number%i;
            if(x==0){
                toplam=toplam+i;

            }
        }
        if(toplam==number){
            System.out.println(number+" sayisi mükemmmel sayidir");}
                    else{
            System.out.println(number+" sayisi mükemmmel değildir.");}

    }
}
