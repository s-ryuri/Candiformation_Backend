package we_won.hackerton.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import we_won.hackerton.constant.UserRole;
import we_won.hackerton.entity.User_;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserFormDTO {

    @NotBlank(message = "아이디는 필수로 작성해야 합니다.")
    private String username;

    private String password;

    private String nickname;

    private final UserRole role = UserRole.USER;

    public User_ toEntity(){
        return User_.builder()
                .username(this.username)
                .password(this.password)
                .role(this.role)
                .nickname(this.nickname)
                .build();
    }
}
