class Ticket{
    public static void main(String[ ] args){

        Concert ticket01= new Concert("Paris", "PNL", "21.06", "54€");
        Concert ticket02 = new Concert("Marseille", "Soprano", "30.06", "40€", "Jul");
        System.out.println(ticket01.htmlDetails());
    }
}

class Concert {
    public String place;
    public String artist;
    public String date;
    public String price;
    public String feature ="";

    public Concert(String place,String artist,String date,String price) {
        this.place = place;
        this.artist = artist;
        this.date = date;
        this.price = price;

    }

    public Concert(String place,String artist,String date,String price, String feature) {
        this.place = place;
        this.artist =artist;
        this.date = date;
        this.price = price;
        this.feature = feature;

    }
public String htmlDetails(){
        String htmlContent= " <p>Nom de l'artiste : " + this.artist + "</p>  <p>Ville de l'artiste : "+ this.place + " </p>  <p>La date du concert : "+ this.date + " </p>  <p>Prix de la place : " + this.price + "</p>" ;
        if (this.feature == "") {
            htmlContent +=  "<p>Les featur de l'artiste :" + this.feature + "</p>";
        }
          return htmlContent;

    }
}
