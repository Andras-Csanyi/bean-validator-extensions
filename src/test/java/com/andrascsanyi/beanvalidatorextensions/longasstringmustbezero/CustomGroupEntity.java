package com.andrascsanyi.beanvalidatorextensions.longasstringmustbezero;

import com.andrascsanyi.beanvalidatorextensions.LongAsStringMustBeZero;
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
