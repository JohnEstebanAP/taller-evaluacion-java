package org.sofka.punto19;

/**
 * Ship
 */
public abstract class Ship implements Iaccelerate, Iamortizer {

  private String name;
  // peso de la nave espacial / weigh of ship
  private float weigh;
  // altura de la nave espacial / height of ship
  private float height;
  // toneladas de empuje
  private float tonsThrus;

  // spacecraft accelerate speed
  public int accelerationSpeed = 0;
  // spacecraft deceleration speed
  public int decelerate = 0;

  Ship(String name, float weigh, float height, float tonsThrus) {
    this.name = name;
    this.weigh = weigh;
    this.height = height;
    this.tonsThrus = tonsThrus;
  }

  public void printShip(){
    System.out.println("Name: "+ getName());
    System.out.println("Weigh: "+ getWeigh());
    System.out.println("Height: "+ getHeight());
    System.out.println("Tons Thrus: "+ getTonsThrus());
  }

  // Getters and Setters
  public String getName() {
    return this.name;
  }

  public float getWeigh() {
    return this.weigh;
  }

  public float getHeight() {
    return this.height;
  }

  public float getTonsThrus() {
    return this.tonsThrus;
  }

  @Override
  public void accelerate(){
    this.accelerationSpeed = 10;
  }

  @Override
  public void amortizer() {
    this.decelerate = -20;
  }

}
