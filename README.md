# JPAValentinEnvers

Para visualizar correctamente el uso de envers, debemos descomentar toda la parte inicial del codigo y comentar la parte de
//Actualizamos un dato de alguna factura,
ya que sino, nos tira un error por el metodo "find", debido a que la factura que queremos modificar se encuentra declarada 
anteriormete en el main, por lo q el metodo find no tiene sentido
Luego de ejecutar el programa, con las modificaciones anteriormente comentadas, debemos comentar la parte inicial y descomentar la //Actualizamos un dato de alguna factura, para poder visualizar en H2 en efecto la modificacion del dato 
