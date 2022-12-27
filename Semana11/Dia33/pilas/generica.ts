class PilaGenerica<T>{
    private vec:T[]=[];

    insertar(x: T){
        this.vec.push(x);
    }

    extraer(){
        if(this.vec.length>0)
            return this.vec.pop();
        else
            return null;
    }
}

let pila3: PilaGenerica<number>;
pila3 = new PilaGenerica<number>();
pila3.insertar(7);
pila3.insertar(17);
pila3.insertar(18);
console.log(pila3.extraer());

let pila4: PilaGenerica<string>;
pila4 = new PilaGenerica<string>();
pila4.insertar('Alfredo');
pila4.insertar('Etzael');
pila4.insertar('Ramos');
console.log(pila4.extraer());
