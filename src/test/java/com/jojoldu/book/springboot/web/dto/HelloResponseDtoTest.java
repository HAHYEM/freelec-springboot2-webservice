package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        /* Junit이 아닌 assertj의 assetThat을 쓴 이유는
         CoreMatchers와 달리 추가적으로 라이브러리가 필요하지 않으며
         자동완성이 좀 더 확실하게 지원되기 때문이다.(백기선유튭: http://bit.ly/30vm9Lg) */
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
