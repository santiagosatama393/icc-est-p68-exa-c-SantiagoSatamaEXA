package models;



public class Tournament {
private String name;
private Club[] clubs;
public Tournament(String name, Club[] clubs) {
  this.name = name;
  this.clubs = clubs;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public Club[] getClubs() {
  return clubs;
}
public void setClubs(Club[] clubs) {
  this.clubs = clubs;
}
@Override
public String toString() {
  return "Tournament []";
}
public int getTotalStarterPoints() {
    int suma = 0;
    for(Club club : clubs  ){
      for(Athlete at : club.getAthletes()){
        if(at.isStarter()){
          suma += at.getPoints();
        }
      }
    }
    return suma;
}

}
