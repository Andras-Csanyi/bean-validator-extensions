package com.andrascsanyi.beanvalidatorextensions.trimmedsize;

import com.andrascsanyi.encyclopediagalactica.common.validation.TrimmedSize;
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
public class DefaultGroupEntity {
    
    @TrimmedSize(min = 3, max = 5)
    private String value;
}
