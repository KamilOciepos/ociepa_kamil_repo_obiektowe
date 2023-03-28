//zad 1

const oblicz=(a:number, b:number) => (console.log("Zadanie 1\n"),console.log(a+b), console.log(a-b), console.log(a*b), console.log(a/b));


//zad 2
function bezwzgledna(a:number){
    console.log("Zadanie 2\n");
    if(a<0){
        a=a*(-1);
    }
    console.log(a);
}


//zad 3
function filtrowanie(){
    console.log("Zadanie 3\n");
    const numery = [2,4,7,11,14,19,21,100];
    const parzyste = numery.filter(numery=>numery%2==0);
    const nieparzyste = numery.filter(numery=>numery%2!=0);
    console.log(parzyste+"\n");
    console.log(nieparzyste);
}



//zad 4
const osoby=["Marcin","Jan","Beta","Tadeusz","Teresa"];
function imiona(osoby:String[]){
    console.log("Zadanie 4\n");
    console.log(osoby[Math.floor(Math.random() * osoby.length)]);
}


//zad 5
function losowanie(amount?: number): number[] {
    if( amount == null) {
        amount = 100;
    }
    const losowanieStu: number[] = [];
    for (let i = 0; i < amount; i++) {
        losowanieStu.push(Math.ceil(Math.random() * 100));
    }
    console.log(losowanieStu);
 
    return losowanieStu;
}


function podzielne(tab: number[]): number[] {
    const nTab: number[] = []; 
    for(let j = 0; j < tab.length; j++) {
        if( tab[j] % 5 == 0 ){
            nTab.push(tab[j]);
        } 
    }
    console.log(nTab);
    return nTab;
}


function obliczenia(tab1: number[], tab2:number[]) {
    tab1.sort();
    const procent = tab2.length / tab1.length * 100;
    console.log("Otrzymałem tablice z " + tab1.length + " gdzie najmniejsza liczba to " + tab1[0] + " a  największa to " + tab1[tab1.length - 1]);
    console.log("W tym liczby podzielne przez 5: " + tab2 + " czyli " + procent + "% wszystkich liczb");
}


function wyswietl(){
    const tablica = losowanie(10);
    obliczenia(tablica, podzielne(tablica));
}


