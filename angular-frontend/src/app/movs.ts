export class Movs {
    id!: number;
    creDate!: Date;
    creAut!: string;
    movDate!: Date;
    decPlace!: string;
    from!: string;
    to!: string;
    
    state: any;
    ref!: any;
    refType!: any;
    quantityTot!: any;
    weightTot!: any;
    label!: string;

    apType!: string;
    apRef!: string;
}

export class EntranceMov extends Movs {
    code!: string;
    //label!: string;
    //refType!: string;
    //ref!: Int16Array;
    quantity!: Int16Array;
    weight!: Float32Array;
    //quantityTot!: Int16Array;
    //weightTot!: Float32Array;
    desc!: string;
    //state!: string;
    //to = "RapidCargo CDG"
}

export class ExitMov extends Movs {
    code!: string;
    //label!: string;
    //refType!: string;
    //ref!: Int16Array;
    quantity!: Int16Array;
    weight!: Float32Array;
    //quantityTot!: Int16Array;
    //weightTot!: Float32Array;
    desc!: string;
    //state!: string;
    //apType!: string;
    //apRef!: string;
}
