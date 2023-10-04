# luis carlos benavides
# fecha: 2 de octubre 2023
# luisca.bc123@gmail.com
# language: es


Característica: El usuario desea solicitar un credito de vehiculo(moto),
  por medio del simulador sabra que monto o valor que pedira y cuales
  son las cuotas diferidas a pagar

  @CotizacionCreditoMotoAlto
 Escenario: Usuario cotizando el credito de la moto de alto cilindraje
    Dado que el usuario ingresa a la plataforma de bancolombia al modulo de persona
    Entonces valida al modulo de financia tu sueños quieres y necesitas
    Y da click en SABER MAS
    Y da click en la pestaña vehiculos
    Y da click en SIMULAR
    Y luego diligencia el formulario
    Entonces valida y extrae los resultados obtenidos

