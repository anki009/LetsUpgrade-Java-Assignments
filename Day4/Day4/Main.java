
public class Main{
  public static void main(String[] args){
    Avenger objArr[] = new Avenger[5];
    for(int i=0;i<5;i++)
        {
            objArr[i]=new Avenger();
            objArr[i].getDetail();
        }


        //print details
        for(int i=0;i<5;i++)
        {
            objArr[i].displayDetail();
        }


  }
}
/*
Enter name
Dr-Strange
Enter Your power
Images of Ikonn
Enter Your weapon
Eye of Agamotto
Enter your planet
Earth
Enter name
Captain America
Enter Your power
Super Solidier Serum
Enter Your weapon
Captain America's Shield
Enter your planet
Earth
Enter name
Ironman 
Enter Your power
Supersonic flight
Enter Your weapon
Iron Man's Suit
Enter your planet
Earth
Enter name
Thanos
Enter Your power
Superhuman Strength
Enter Your weapon
Double-Edged Sword
Enter your planet
Titan
Enter name
Thor
Enter Your power
Superhuman Speed
Enter Your weapon
Mjolnir
Enter your planet
Asgardia  

Welcome Dr-Strange, your power is Images of Ikonn, weapon is Eye of Agamotto and you are from Earth.
Welcome Captain America, your power is Super Solidier Serum, weapon is Captain America's Shield and you are from Earth.
Welcome Ironman , your power is Supersonic flight, weapon is Iron Man's Suit and you are from Earth.
Welcome Thanos , your power is Superhuman Strength, weapon is Double-Edged Sword and you are from Titan.
Welcome Thor , your power is Superhuman Speed, weapon is Mjolnir and you are from Asgardia.
*/