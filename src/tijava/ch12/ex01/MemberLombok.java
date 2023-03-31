package tijava.ch12.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/*
    @Data
    - @Getter/Setter
    - @EqualsAndHashCode
    - @ToString()
    - @RequiredArgsConstructor (기본은 매개변수 없는 생성자. 만약 final 이 붙어 있으면, 이 필드만 초기화시키는 생성자 포함)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberLombok {
    private int id;
    @NonNull
    private String name;
    private int age;
}
