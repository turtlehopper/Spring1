package hello.core.member;

public interface MemberService {
    // 1.회원 가입 & 2.회원 조회
    void join(Member member);

    Member findMember(Long memberId);

}
