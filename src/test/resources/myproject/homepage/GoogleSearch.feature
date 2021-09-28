@only
Feature: Prueba Técnica probando Google Map

Scenario: Markers are added in Map
  Given I navigate to technical test URL
  And  I see map instanciated
  When  I fill up search input
  Then I see 2 markers in map


