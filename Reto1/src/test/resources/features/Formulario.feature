#language:es
#Author: your.email@your.domain.com

@tag
Característica: Diligenciar el formulario de la pagina BlockValidation
								Como usuario
								Quiero ingresar los datos al formulario
								Para validar que quede registrado

	@tag1
  Escenario: Verificar el diligenciamiento de la pagina BlockValidation
  		Dado que david necesita ingresar a la pagina con usuario demo y contraseña demo
  		Cuando el realiza el registro del mismo en el aplicativo
  		| codigo | correo 					| contraseña | confirmarcontraseña | fecha	 		| url 									 | digitos | rango | 
  		| 123 	 | adtq15@gmail.com	| 12345678   | 12345678						 | 03-04-1997	| https://www.google.com |	789    |   7   | 
  		Entonces valida que no tenga mensaje de error



