Feature: Inicio de sesión

  Scenario: Login correcto
    Given el usuario ingresa "usuario" y "1234"
    When intenta iniciar sesion
    Then el acceso debe ser permitido

  Scenario Outline: Login con distintos datos
    Given el usuario ingresa "<usuario>" y "<clave>"
    When intenta iniciar sesion
    Then el resultado debe ser "<resultado>"

    Examples:
      | usuario | clave | resultado |
      | usuario | 1234  | permitido |
      | usuario | 0000  | rechazado |
      | otro    | 1234  | rechazado |