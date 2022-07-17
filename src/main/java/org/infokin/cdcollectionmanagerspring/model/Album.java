package org.infokin.cdcollectionmanagerspring.model;

public class Album {

  private String name;
  private Band band;

  public Album() {
  }

  public Album(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Band getBand() {
    return band;
  }

  public void setBand(Band band) {
    this.band = band;
  }

}
