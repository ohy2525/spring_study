package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();  //싱글톤

    public static MemberRepository getInstance() {
        return instance;
    }
    private MemberRepository() {   //싱글톤일 경우 아무나 생성하지 못하도록 private 생성자 필요
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());   //store 의 모든 값을 새로운 ArrayList 에 (store 의 값에 영향을 주지 않기 위해)
    }

    public void clearStore() {
        store.clear();
    }
}
