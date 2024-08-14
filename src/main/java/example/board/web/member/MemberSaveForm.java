package example.board.web.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;
import lombok.Data;

@Data
public class MemberSaveForm {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    @Pattern(regexp = "(^$|[0-9]{11})")
    private String phoneNumber;
    @NotNull
    @Past
    private LocalDate birthday;
}
