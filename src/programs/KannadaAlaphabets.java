package programs;
//unicode universal char encoding it defines individual char represented in text,webpages, docs
public class KannadaAlaphabets {
    public static void main(String[] args) {
        for (char c=0x0c80;c<=0xcff;c++) {
            if(c!=' ')
                System.out.print(c + " ");
        }
    }
}

