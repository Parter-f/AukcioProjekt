import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }

    public String getFesto(){
        return this.festo;
    }
    public String getStilus(){
        return this.stilus;
    }
    public int getLicitekSzama(){
        return this.licitekSzama;
    }
    public int getLegmagasabbLicit(){
        return this.legmagasabbLicit;
    }
    public LocalDateTime getLegutolsoLicitIdeje(){
        return this.legutolsoLicitIdeje;
    }
    public boolean getElkelt(){
        return this.elkelt;
    }

    public  void  setElkelt(boolean elkelt){
        this.elkelt = elkelt;
    }

    public void licit(){
        if (this.elkelt == true){
            System.out.println("A Festmény már elkelt");
            return;
        } else if (this.licitekSzama == 0) {
            this.legmagasabbLicit = this.legmagasabbLicit+100;
            this.licitekSzama ++;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        } else if (this.licitekSzama >= 1) {
            this.legmagasabbLicit = (int)(this.legmagasabbLicit * 1.1);
            
        }
    }
    public void licit(int mertek){
        if (mertek < 10 || mertek > 100){
            System.out.println("A szám nem megfelelő");
            return;
        }

        if (this.elkelt == true){
            System.out.println("A Festmény már elkelt");
            return;
        } else if (this.licitekSzama == 0) {
            this.legmagasabbLicit = this.legmagasabbLicit+100;
            this.licitekSzama ++;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        } else if (this.licitekSzama >= 1) {
            this.legmagasabbLicit = (int)(this.legmagasabbLicit * (1+(mertek/100.0)));
        }
    }

    @Override
    public String toString() {
        String DATE_FORMATTER = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        return String.format("%s : %s (%s)\n" +
                (elkelt ? "elkelt\n" : "nem kelt el\n") +
                        "%d - %s"
                , this.festo , this.cim , this.stilus , this.legmagasabbLicit , this.getLegutolsoLicitIdeje().format(formatter));
    }
}
