<?php
class concert {
    public $place;
    public $artist;
    public $date;
    public $price;
    public $feature;
    function __construct($place, $artist, $date, $price, $feature = null) {
        $this->place = $place;
        $this->artist = $artist;
        $this->date = $date;
        $this->price = $price;
        if (!is_null($feature)) {
            $this->feature = $feature;
        }

    }
    function htmlDetails(){
        $htmlContent= "
            <p>Nom de l'artiste : + $this->artist</p>
            <p>Ville de l'artiste : + $this->place</p>
            <p>La date du concert : + $this->date</p>
            <p>Prix de la place : + $this->price</p>"
        if (is_null($this.feature)) {
            $htmlContent = $htmlContent + "<p>Les featur de l'artiste : ${this.feature}</p>"
        }
          return $htmlContent;

    }
}
$ticket01= new concert("Paris", "PNL", "21.06", "54€");
$ticket02 = new concert("Marseille", "Soprano", "30.06", "40€", "Jul");

echo($ticket01->htmlDetails());
