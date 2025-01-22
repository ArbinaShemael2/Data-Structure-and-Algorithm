public class GenericClass <Thing,Thing2>{

    Thing x;
    Thing2 y;
    GenericClass(Thing x,Thing2 y){
        this.x=x;
        this.y=y;
    }
    public Thing2 getValue(){
        return y;
    }
}
