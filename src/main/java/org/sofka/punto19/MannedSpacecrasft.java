package org.sofka.punto19;

/**
 * MannedSpacecrasft
 */
public class MannedSpacecrasft extends Ship implements Ifuel {

  private String descriptionMannedSpacecrasft = "\nThe purpose of the TRIPULATED SPACE SHIPS " +
      "\nis to send human beings into space for repair, " +
      "\nmaintenance or research tasks, " +
      "\nin missions where the skill and decision making of people is required," +
      "\nto the detriment of machines.";

  // ASCII(92) = \
  char a = 92;
  // ASCII(39) = '
  char b = 39;
  private String imageTxt = "" +
      "\n            /" + a + "            " +
      "\n           /  " + a + "           " +
      "\n          /    " + a + "          " +
      "\n         /  " + b + b + "  " + a + "         " +
      "\n        /        " + a + "        " +
      "\n        |   ||   |        " +
      "\n        |   ||   |        " +
      "\n       /|        |" + a + "        " +
      "\n      / |        | " + a + "       " +
      "\n     /  |        |  " + a + "      " +
      "\n    /   |        |   " + a + "     " +
      "\n   /    |    |   |    " + a + "    " +
      "\n  /     |    |   |     " + a + "   " +
      "\n /______| _  | _ |______" + a + "  " +
      "\n        " + a + "________/         " +
      "\n          ' '  '           " +
      "\n           '  '            ";

  private int capabilityPeople;

  private String nameFuel = new String();

  MannedSpacecrasft(String name, float weigh, float height, int tonsThrus,
      int capabilityPeople, String nameFuel) {
    super(name, weigh, height, tonsThrus);
    this.capabilityPeople = capabilityPeople;
    this.setNameFuel(nameFuel);
  }

  @Override
  public void printShip() {
    System.out.println(getDescriptionMannedSpacecrasft());
    System.out.println(getImageTxt());
    super.printShip();
    System.out.println("Capability People: " + getCapabilityPeople());
    System.out.println("Type Fuel: " + getNameFuel());
  }

  // Getters and Setters

  public int getCapabilityPeople() {
    return this.capabilityPeople;
  }

  public String getDescriptionMannedSpacecrasft() {
    return this.descriptionMannedSpacecrasft;
  }

  public String getImageTxt() {
    return this.imageTxt;
  }

  @Override
  public String getNameFuel() {
    return this.nameFuel;
  }

  @Override
  public void setNameFuel(String nameFuel) {
    this.nameFuel = nameFuel;
  }
}
