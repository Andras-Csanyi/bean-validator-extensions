package com.andrascsanyi.beanvalidatorextensions.longvaluemustbe;

import com.andrascsanyi.beanvalidatorextensions.LongValueMustBe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefaultGroupEntity {
    
    @LongValueMustBe(mustBe = 0)
    private Long value;
}
