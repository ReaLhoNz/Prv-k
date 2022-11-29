class Methods {


    public double input(){

        return (Main.d  = (Main.b * Main.b) - (4 * Main.a * Main.c));
    }
    public double vypocet0(){
        if (Main.d == 0){
            return Main.x1 = -Main.b / (2* Main.a);
        }

        else if(Main.d > 0){
           return (Main.x1 = (-Main.b+Math.sqrt(Main.d) )/ (2* Main.a)) + (Main.x2 = (-Main.b-Math.sqrt(Main.d)) / (2* Main.a));


        } else{
            System.out.println("nelze v R vyřešit");
        }
        return 0;
    }


}
