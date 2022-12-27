class PilaEnteros{
    private vec:number[]=[];

    insertar(x: number){
        this.vec.push(x);
    }

    extraer(){
        if(this.vec.length>0)
            return this.vec.pop();
        else 
            return null;
    }
}

class PilaStrings{
    private vec:string[]=[];

    insertar(x:string){
        this.vec.push(x);
    }

    extraer(){
        if(this.vec.length>0)
            return this.vec.pop();
        else
            return null;
    }
}

let pila1 = new PilaEnteros();
pila1.insertar(7);
pila1.insertar(17);
pila1.insertar(18);
console.log(pila1.extraer());

let pila2 = new PilaStrings();
pila2.insertar('Alfredo');
pila2.insertar('Etzael');
pila2.insertar('Ramos');
console.log(pila2.extraer());