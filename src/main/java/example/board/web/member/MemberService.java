package example.board.web.member;

import example.board.domain.member.Member;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void register(MemberSaveForm memberForm, BindingResult bindingResult) {
        Optional<Member> foundUserByEmail = memberRepository.findByEmail(memberForm.getEmail());
        log.info("foundUserByEmail = {}", foundUserByEmail);

        if (foundUserByEmail.isPresent()) {
            bindingResult.addError(new FieldError("member", "email", "중복된 이메일 입니다."));
            return;
        }

        Member newMember = Member.builder()
            .email(memberForm.getEmail())
            .password(memberForm.getPassword())
            .name(memberForm.getName())
            .phoneNumber(memberForm.getPhoneNumber())
            .birthday(memberForm.getBirthday())
            .build();

        memberRepository.save(newMember);
    }
}
