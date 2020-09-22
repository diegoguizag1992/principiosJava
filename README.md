# principiosJava

Principios de la programación orientada a objetos.

<h1>Inyección de dependencia </h1> 

<h2>¿Que es inyección de dependencia? </h2> 

La inyección de dependencias nos permiten modelos no acoplados o independientes a otros. Lo que se traduce en que los componentes usan las 
funcionalidades definidas en las interfaces.

<h2> ¿Por qué es útil? </h2> 
La inyección de dependencias nos permite cambiar fácilmente el comportamiento de tu aplicación al cambiar los componentes que implementaste 
en las interfaces (elimina acoplamiento entre componentes). También resulta en componentes que son más fáciles de aislar para la prueba unitaria.

<h2> ¿Como es usado? </h2> 
Existen dos variantes inyección de dependencias para constructor o uso de propiedades
 
<h2> ¿Existe alguna limitación con su uso? </h2> 
La principal limitación es que las clases declaran su uso de los servicios como argumentos de constructor, que puede dar como resultado constructores cuya 
única función es recibir dependencias y asignarlas a la instancia campos.


<h2> ¿Existe alternativa? </h2> 
No tienes que usar inyección de dependencias en tu código pero es muy conocer como funciona por que es utilizado en MVC para proveer utilidades a los developers.


<h1> ABIERTO O CERRADO </h1> 

<h2> Historia </h2> 
Se considera que Bertrand Meyer fue quien utilizó por primera vez la expresión principio abierto-cerrado en su obra Object-Oriented Software Construction en 1988. En la época en que Meyer escribió esto, añadir campos o funciones a una librería implicaba, inevitablemente, modificar todos los programas clientes de esa librería. En vista del trabajo y las complicaciones que esto acarreaba, Meyer propuso este principio como una posible solución. 

<h2> OCP: Principio Abierto-Cerrado </h2> 
Entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para su extensión, pero cerradas para su modificación.

<h2> Descripción </h2> 
Los módulos que cumplen con el principio abierto-cerrado tienen dos características principales. Estos son

<h2> “Abiertos para la extensión” </h2> 
Esto significa que el comportamiento del módulo puede ser extendido. Cuando los requerimientos de la aplicación cambian, debemos ser capaces de extender el módulo con estos nuevos comportamientos que satisfagan esos cambios. En otras palabras, debemos ser capaces de cambiar lo que el módulo hace.


<h2> “Cerrado para la modificación” </h2> 
Esto significa que extender el comportamiento de un módulo no debería tener como resultado cambiar el código fuente, es decir, el código original debe permanecer sin cambios. 

A simple vista da la impresión de que ambas características se contradicen. El camino normal para extender el comportamiento de una clase es cambiando su código fuente. ¿Cómo es posible que el comportamiento de una clase pueda ser modificado sin cambiar su código original? ¿cómo podemos cambiar lo que la clase hace, sin cambiarla?

<h2> La Abstracción es la clave </h2> 
En Java o cualquier otro lenguaje orientado a objetos es posible crear abstracciones que sean fijas y, aun así, representen un grupo ilimitado de posibles comportamientos. Estas abstracciones son clases base, y el grupo ilimitado de posibles comportamientos será representado por todas las clases derivadas de esta clase base.  

Es posible para una clase manipular una abstracción. Dicha clase entonces estará cerrada para su modificación ya que depende de una abstracción que es fija. Y además el comportamiento puede ser extendido creando nuevas clases derivadas de la abstracción. 

Antes de que escribamos código que cumpla con el principio abierto-cerrado, veamos las consecuencias que nos puede traer violar este principio.
