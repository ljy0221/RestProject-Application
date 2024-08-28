package heart.project.repository.emotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmotionUpdateApiDto {

    @JsonProperty("afterEmotion") // JSON 필드명 설정
    private String afterEmotion;

    public EmotionUpdateApiDto() {
    }

    public EmotionUpdateApiDto(String afterEmotion) {
        this.afterEmotion = afterEmotion;
    }
}