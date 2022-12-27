interface Vuelo {
    volar(): void;
}

class Avion implements Vuelo{
    constructor(private km: number, private inicio: string, private destino: string ){}
    volar() {
        console.log(`El avión voló ${this.km} km de ${this.inicio} a ${this.destino}`);
    }
}

class Helicoptero implements Vuelo{
    constructor(private hrs: number, private inicio: string, private destino: string ){}
    volar() {
        console.log(`El avión voló ${this.hrs} horas de ${this.inicio} a ${this.destino}`);
    }
}

let vueloAvion: Avion;
vueloAvion = new Avion(100, "Guadalajara", "Queretaro");
vueloAvion.volar();

let vueloHelicoptero: Helicoptero;
vueloHelicoptero = new Helicoptero(5, "Mérida", "Jalisco");
vueloHelicoptero.volar();