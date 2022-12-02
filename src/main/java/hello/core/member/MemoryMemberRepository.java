package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    // 구현체
    private static Map<Long, Member> store = new HashMap<>();   // DB가 선택 되지 않아서 메모리에 저장하여 사용.  동시성 문제를 위해서 컨커러트 해시맵을 사용해야 한다

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
