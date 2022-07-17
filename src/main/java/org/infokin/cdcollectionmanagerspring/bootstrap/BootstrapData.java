package org.infokin.cdcollectionmanagerspring.bootstrap;

import org.infokin.cdcollectionmanagerspring.models.Album;
import org.infokin.cdcollectionmanagerspring.models.Band;
import org.infokin.cdcollectionmanagerspring.repositories.AlbumRepository;
import org.infokin.cdcollectionmanagerspring.repositories.BandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

  private final AlbumRepository albumRepository;
  private final BandRepository bandRepository;

  public BootstrapData(AlbumRepository albumRepository, BandRepository bandRepository) {
    this.albumRepository = albumRepository;
    this.bandRepository = bandRepository;
  }

  @Override
  public void run(String... args) {

    System.out.println("Bootstrap data..");

    Band whiteScreen = new Band("The White Screen");
    Album sexDrugsPalestine = new Album("Sex, Drugs & Palestine");
    sexDrugsPalestine.setBand(whiteScreen);
    whiteScreen.getAlbums().add(sexDrugsPalestine);

    bandRepository.save(whiteScreen);
    albumRepository.save(sexDrugsPalestine);

    Band connor = new Band("Sinéad O'Connor");
    Album universalMother = new Album("Universal Mother");
    universalMother.setBand(connor);
    connor.getAlbums().add(universalMother);

    bandRepository.save(connor);
    albumRepository.save(universalMother);

    System.out.println("Albums: " + albumRepository.count());
    System.out.println("Bands: " + bandRepository.count());

  }

}
