package Research_assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {

    private List<Candidate> candidates;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate{
        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content{
        private List<Part> parts;

        public List<Part> getParts() {
            return parts;
        }

        public void setParts(List<Part> parts) {
            this.parts = parts;
        }
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part{
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        private String text;
    }
}
