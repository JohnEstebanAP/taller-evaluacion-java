package org.sofka.punto19;

/**
 * UnmannedSpacecraft
 */
public class UnmannedSpacecraft extends Ship implements ItypeEnergy {

  String description = "\nunmanned spacecraft are those that have no human crew" +
      "\nand are mostly orbital satellites that perform tasks automatically, " +
      "\nsuch as space exploration or planetary exploration. " +
      "\nunmanned spacecraft do not require fuel - satellites usually employ " +
      "\nphotovoltaic cells and travel at approximately 12000 km/h.";

  // name of type Energy 1
  public String nameEnergy1 = "";

  // name of type energy 2

  public String nameEnergy2 = "";
  char a = 92;

  String imageTxt = "" +
      "\n       /" + a + "    " +
      "\n  ___ /  " + a + "   " +
      "\n |   /    " + a + "  " +
      "\n |  (  -o |  " +
      "\n |___" + a + "    /  " +
      "\n    /|" + a + "  /   " +
      "\n   / | " + a + "/    " +
      "\n  /  |       " +
      "\n /   |       " +
      "\n             ";

  // number of engines on the unmanned spacecraft
  public int motors = 0;

  UnmannedSpacecraft(String name, float weigh, float height, float tonsThrus, int motors, String energy1,
      String energy2) {
    super(name, weigh, height, tonsThrus);

    this.setNameEnergy1(energy1);
    this.setNameEnergy2(energy2);
    this.motors = motors;
  }

  @Override
  public void printShip() {
    System.out.println(getDescription());
    System.out.println(getImageTxt());
    super.printShip();
    System.out.println("Motors: " + this.motors);
    System.out.println("Type Energy 1: " + getNameEnergy1());
    System.out.println("Type Energy 2: " + getNameEnergy2());
  }

  // getters and setters
  public String getDescription(){
    return this.description;
  }

  @Override
  public void setNameEnergy1(String energy1) {
    this.nameEnergy1 = energy1;
  }

  @Override
  public void setNameEnergy2(String energy2) {
    this.nameEnergy2 = energy2;
  }

  @Override
  public String getNameEnergy1() {
    return this.nameEnergy1;
  }

  @Override
  public String getNameEnergy2() {
    return this.nameEnergy2;
  }

  public String getImageTxt() {
    return this.imageTxt;
  }
}
