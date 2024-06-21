package com.andrascsanyi.beanvalidatorextensions.longvaluemustbeequalorgreaterto;

import com.andrascsanyi.beanvalidatorextensions.LongValueMustBeGreaterOrEqualTo;
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
public class CustomGroupEntity {
    
    @LongValueMustBeGreaterOrEqualTo(mustBeGreaterOrEqualTo = 1,
        groups = {CustomGroup.class})
    private Long value;
}
