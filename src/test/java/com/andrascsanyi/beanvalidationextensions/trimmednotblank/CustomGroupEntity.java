package com.andrascsanyi.beanvalidationextensions.trimmednotblank;

import com.andrascsanyi.beanvalidationextensions.TrimmedNotBlank;
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
    
    @TrimmedNotBlank(groups = {CustomGroup.class})
    private String id;
}
