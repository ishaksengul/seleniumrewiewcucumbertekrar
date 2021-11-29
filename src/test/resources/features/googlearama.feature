@googleArama
Feature: Google arama

  Background: kullanici google sayfasina gier
    Given kullanici google sayfasina gier

  @techproeducationArama
  Scenario: TC01_kullanici googlea techproeducation aramasi yapar
    And arama kutusuna techproeducation yazar
    Then arama sonuclari sayfasinin basligini kontrol eder

  @seleniumArama
  Scenario: TC02_Kullanici googleda selenium aramasi yapar
    And arama kutusuna selenium yazar
    Then arama sonuclari sayfasinin sonuc sayisimi kontrol eder