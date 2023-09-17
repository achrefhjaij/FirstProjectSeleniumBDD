@login
Feature: je souhaite tester la page de la connexion de l appliquation swag labs
  EtQ utilisateur je souhaite tester la page de la conecion de l application swag labs
  I want to use this template for my feature file

  @login_caspassant
  Scenario: Je souhaite tester la page connexion un cas passant
    Given Je me connecte a l appli sawg labs
    When Je saisis le username "standard_user"
    And Je saisis le password"secret_sauce"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home"Products"
