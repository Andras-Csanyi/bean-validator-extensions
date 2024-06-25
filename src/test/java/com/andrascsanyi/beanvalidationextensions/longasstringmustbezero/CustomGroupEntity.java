package com.andrascsanyi.beanvalidationextensions.longasstringmustbezero;

import com.andrascsanyi.beanvalidationextensions.LongAsStringMustBeZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomGroupEntity {
    
    @LongAsStringMustBeZero(groups = {CustomGroup.class})
    private String id;
}
