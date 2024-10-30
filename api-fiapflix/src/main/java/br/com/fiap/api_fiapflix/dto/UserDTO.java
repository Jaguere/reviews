package br.com.fiap.api_fiapflix.dto;

import br.com.fiap.api_fiapflix.model.Role;
import br.com.fiap.api_fiapflix.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDTO {

    private Long id;
    @NotBlank(message = "Campo Obrigatorio")
    private String name;
    @Email(message = "Favor entrar com e-mail valido")
    private String email;
    // private String password;

    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        // password = entity.getPassword();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }
}
