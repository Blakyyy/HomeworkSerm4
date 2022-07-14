import java.util.ArrayList;

public class Team {
    public String title;
    public ArrayList<Sportsman> t;
    
    public String getTitle() {
        return title;
      }
    
    public Team(String teamName, Sportsman... teams) {
    title = teamName;
    t = new ArrayList<>();
    int i = 0;
    for (Sportsman sportsman : teams) {
      t.add(sportsman);
      i++;
      if (i == 4)
        break;
    }
  }
    public void add(Sportsman sp) {
    if (t.size() < 4) {
      t.add(sp);
    }
  }
  public String getInfo() {
    String result = "";
    Integer i = 1;
    for (Sportsman sportsman : t) {
      result += i.toString() + " " + sportsman.getInfo() + "\n";
      i++;
    }
    return result;
  }
}
    
