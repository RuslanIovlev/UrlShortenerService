package faang.school.urlshortenerservice.dto;

import lombok.Builder;
import org.hibernate.validator.constraints.URL;

@Builder
public record UrlDto(@URL
                     String url) {
}
