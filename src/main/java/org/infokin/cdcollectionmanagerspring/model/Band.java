package org.infokin.cdcollectionmanagerspring.model;

import java.util.Set;

public class Band {

  private String name;
  private Set<Album> albums;

  public Band() {
  }

  public Band(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }

}
