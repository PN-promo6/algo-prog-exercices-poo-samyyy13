class Playground {
public static void main(String[ ] args){
  Client newClient = new Client("Louisette", 12537);
  ClientPro newClientPro = new ClientPro ("Momo", 878688, 1980);
  System.out.println(newClient.name + "" + newClient.accountNumber);
System.out.println(newClientPro.name + "" + newClientPro.accountNumber + "" + newClientPro.siret);

  ;
  }
}

class Client{
  String name;
  int accountNumber;

  Client(String name, int accountNumber) {
    this.name= name;
    this.accountNumber=accountNumber;
  }
}

class ClientPro extends Client{
  int siret;

  ClientPro(String name, int accountNumber,int siret){
    super(name, accountNumber);
    this.siret=siret;
  }
}
