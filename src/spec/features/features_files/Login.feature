@login
Feature: je souhaite tester la page de la connexion de l appliquation swag labs
  En tant que utilisateur je souhaite tester la page de la conecion de l application swag labs

  @login_casPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant
    Given Je me connecte a l application sawg labs
    When Je saisis le username "standard_user"
    And Je saisis le password"secret_sauce"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home"Products"
