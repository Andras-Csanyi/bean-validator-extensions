package com.andrascsanyi.beanvalidationextensions.longasstringmustbegreaterorequaltoone;

import com.andrascsanyi.beanvalidationextensions.LongAsStringMustBeGreaterOrEqualToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomGroupEntity {
    
    @LongAsStringMustBeGreaterOrEqualToOne(groups = {CustomGroup.class})
    private String id;
}
