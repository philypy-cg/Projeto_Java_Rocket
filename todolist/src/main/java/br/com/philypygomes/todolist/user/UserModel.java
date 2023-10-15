package br.com.philypygomes.todolist.user;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
  
  private String username;
  private String name;
  private String password;

 



  // Metodos: getters  ( Todos atributo quando a gente for querer buscar informações dentro dele a gente usa o metodo getters e assim conseguimos recuperar a informação ) e setters ( E quando agente quer atualizar, inserir, definir uma valor privado para uma classe, usamos o setters? 

}
