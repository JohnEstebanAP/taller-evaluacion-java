package org.sofka.punto19;

/**
 * ShuttleVehicles
 *
 **/
public class ShuttleVehicles extends Ship implements Ifuel {

  // ASCII(92) = \
  char a = 92;
  // ASCII(39) = '
  char b = 39;
  String imageTxt = "\n         /" + a + "    " +
      "\n        /  " + a + "    " +
      "\n       /    " + a + "    " +
      "\n      /      " + a + "    " +
      "\n     /        " + a + "    " +
      "\n    /__________" + a + "    " +
      "\n    |          |    " +
      "\n    |/" + a + "      /" + a + "|    " +
      "\n    /__" + a + "    /__" + a + "    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n    |  |    |  |    " +
      "\n   /|  |    |  |" + a + "   " +
      "\n  / |  |    |  | " + a + "  " +
      "\n /  |  |    |  |  " + a + " " +
      "\n |__|__|____|__|__| " +
      "\n      " + b + " " + b + " " + b + "   " + b + "     " +
      "\n     " + b + "  " + b + "  " + b + " " + b + " " + b + "    ";

  String descriptionShuttle = "\nis a self-propelled rocket used to launch a payload" +
      "\ninto space, usually an artificial satellite, a probe or a manned spacecraft.";

  // capacidad de carga / load capacity
  private int loadCapacity;
  // caballos de fuerza / horsepower
  private int horsepower;
  
  private String nameFuel = new String();

  ShuttleVehicles(String name, float weigh, float height, int loadCapacity, int horsepower, int tonsThrus, String nameFuel) {
    super(name, weigh, height, tonsThrus);
    this.loadCapacity = loadCapacity;
    this.horsepower = horsepower;
    this.setNameFuel(nameFuel);
  }

  @Override
  public void printShip() {
    System.out.println(getDescriptionShuttle());
    System.out.println(getImageTxt());
    super.printShip();
    System.out.println("loadCapacity: " + getLoadCapacity());
    System.out.println("Horsepower: " + getHorsepower());
    System.out.println("Type Fuel: " + getNameFuel());
  }

  // Getters and Setters
  
  public String getDescriptionShuttle(){
    return this.descriptionShuttle;
  }

  public String getImageTxt() {
    return this.imageTxt;
  }

  public int getLoadCapacity(){
    return this.loadCapacity;
  }

  public int getHorsepower(){
    return this.horsepower;
  }

  @Override
  public String getNameFuel(){
    return this.nameFuel;
  }

  @Override
  public void setNameFuel(String nameFuel){
    this.nameFuel = nameFuel; 
  }
}
