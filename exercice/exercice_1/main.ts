class concert {
    public place: string;
    public artist: string;
    public date: string;
    public price: string;
    public feature: string = "";
    constructor(place: string, artist: string, date: string, price: string, feature?: string) {
        this.place = place;
        this.artist = artist;
        this.date = date;
        this.price = price;
        if (feature) {
            this.feature = feature;
        }

    }
    public htmlDetails(): string {
        let htmlContent: string = `<p>Nom de l'artiste : ${this.artist}</p>
            <p>Ville de l'artiste : ${this.place}</p>
            <p>La date du concert : ${this.date}</p>
            <p>Prix de la place : ${this.price}</p>`
        if (this.feature != "") {
            htmlContent = htmlContent + `<p>Les featur de l'artiste : ${this.feature}</p>`
        }
          return htmlContent;

    }
}
let ticket01: concert = new concert("Paris", "PNL", "21.06", "54€");
let ticket02: concert = new concert("Marseille", "Soprano", "30.06", "40€", "Jul");

console.log(ticket01.htmlDetails());
