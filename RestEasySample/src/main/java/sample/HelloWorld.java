/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import javax.ws.rs.*;
 
@Path("tutorial")
public class HelloWorld
{
 
    @GET
    @Path("helloworld")
    public String helloworld() {
        return "Hello World!";
    }
}
