abstract class People {
   String name;
   int speed; 
}
class Sportsman extends People {
    public Sportsman(String name, int speed) {
        super.name = name;
        super.speed = speed;
      }

}