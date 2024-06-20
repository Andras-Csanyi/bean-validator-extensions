package com.andrascsanyi.beanvalidatorextensions.longvaluemustbeequalorgreaterto;

import com.andrascsanyi.encyclopediagalactica.common.validation.LongValueMustBeGreaterOrEqualTo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultGroupEntity {
    
    @LongValueMustBeGreaterOrEqualTo(mustBeGreaterOrEqualTo = 1)
    private Long value;
}
