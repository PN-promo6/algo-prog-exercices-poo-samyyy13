class Client {
  accountNumber : string;
  name: string
  constructor (accountNumber: string, name: string){
    this.accountNumber = accountNumber;
    this.name = name;
    }
}

class ProfessionalClient extends Client {
  siret : number;

  constructor (accountNumber: string, name : string,siret: number){
    super(accountNumber, name);
    this.siret = siret;
  }
}

let newClient: Client = new Client ("FR92909", "Samo");
console.log(newClient.accountNumber, newClient.name);

let newProClient: ProfessionalClient = new ProfessionalClient("ab9769", "Lionel", 86889);
console.log(newProClient.accountNumber, newProClient.name,newProClient.siret)
