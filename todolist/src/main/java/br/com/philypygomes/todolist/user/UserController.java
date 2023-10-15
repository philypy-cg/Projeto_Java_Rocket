package br.com.philypygomes.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 *  (Tipos de acesso para as pessoas acessar)
 * Modificador
 * Public
 * Private
 * Protected
 * 
*/



@RestController
@RequestMapping("/users")
public class UserController {


    /**
     * 
     * String (texto)
     * Integer ou int (Numero Inteiros)
     * Double (Números com casas decimais ex: 0.001,094)
     * Float (Números menores)
     * char (Um caracter a c d )
     * Date (datas)
     * void ( quando não queremos nenhum retorno do nosso metodo só que alguma logica seja criada ou informada )
     */

     /**
      *  Body ( Quando usar o SpringBoot precisa solicitar uma requisição dentro do Body EX a baixo:@RequestBody )
      * 
      */
    @PostMapping("/")
    public void creat (@RequestBody UserModel userModel) {

        System.out.println(userModel.getUsername());

    }
    
}
