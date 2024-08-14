package example.board.web.member;

import example.board.domain.member.Member;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/register")
    public String registerMemberForm(Model model) {
        model.addAttribute("member", Member.builder().build());
        return "register/registerForm";
    }

    @PostMapping("/register")
    public String registerMember(@Valid @ModelAttribute("member") MemberSaveForm member,
        BindingResult bindingResult) {
        log.info("member = {}", member);

        if (bindingResult.hasErrors()) {
            log.info("입력 오류 검사 pre errors={}", bindingResult);
            return "/register/registerForm";
        }

        memberService.register(member, bindingResult);

        if (bindingResult.hasErrors()) {
            log.info("데이터 오류 검사 post errors={}", bindingResult);
            return "/register/registerForm";
        }

        return "/register/welcome";
    }
}
