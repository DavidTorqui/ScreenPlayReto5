#language:es
#Author: your.email@your.domain.com

@tag
Característica: Realizar la consulta por Bancos en la pagina Amarilla WEB y verificar para el listado
								de los 10 bancos que la pagina web sea la esperada.
  @tag1
  Escenario: 
    Dado que quiero realizar la consulta de diez bancos
    Cuando se despliega la informacion de estos  
    Entonces verifico que el link de la pagina web lleve al banco correspondiente
    | banco 											 | 								
    |https://www.caminoreal.com.co/|
    |http://www.banrep.gov.co/|
    |http://www.bancow.com.co/|
    |http://www.gfcobranzasjuridicas.com.co/|
    |https://www.grupobancolombia.com/wps/portal/personas| 
    |https://www.grupogersas.com/site/|
    |http://www.cobelen.com.co/|
    |http://www.avalbienes.com.co/|
    |http://www.cityplazacc.com/|
    |http://ccaventura.com/|
    |https://www.paginasamarillas.com.co/medellin/servicios/bancos|
    
    
 