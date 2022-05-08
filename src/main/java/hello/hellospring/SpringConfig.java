package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Service, @Repository 어노테이션을 붙이지 않고 직접 @Bean 으로 스프링빈에 등록 시키는 방법

@Configuration
public class SpringConfig {

//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
// 직접 등록 하면 장점은 => DB를 교체할때 MemoryMemberRepository() => DbMemberRepository() 로만 교체해주면 된다.
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
