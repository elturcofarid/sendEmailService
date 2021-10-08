# sendEmailService

Servicio encargado de escuchar la cola email tomar un mensaje y enviarlo al proveedor configurado.

El resultado de este consumo es dejado en la cola resposeEmail.



{
  "To":"fureche@solati.com.co",
  "HtmlBody":" Plantilla Html",
  "Subject":"Asunto",
  "From":"fureche@solati.com.co",
  "Tag":"cualquier tag",
    "data": {       
       .... Objeto que se retorna + la respuesta de la ejecución del correo
            },
  "APiToken":"token postmark"
}