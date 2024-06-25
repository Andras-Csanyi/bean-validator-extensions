package com.andrascsanyi.beanvalidationextensions.trimmednotempty;

import com.andrascsanyi.beanvalidationextensions.TrimmedNotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomGroupEntity {
    
    @TrimmedNotEmpty(groups = CustomGroup.class)
    private String id;
}
