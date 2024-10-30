package br.com.fiap.api_fiapflix.dto;

import br.com.fiap.api_fiapflix.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class RoleDTO {

    private Long id;
    private String authority;

    public RoleDTO(Role role){
        id = role.getId();
        authority = role.getAuthority();
    }
}
