package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",  //탐색할 패키지의 시작위치 지정. 이 패키지를 포함해서 하위 패키지를 모두 탐색
        //디폴트 : @ComponentScan 이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)  // 자동 등록 제외(AppConfig 등록 방지)
)
public class AutoAppConfig {

}
