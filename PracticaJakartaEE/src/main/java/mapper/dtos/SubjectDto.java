package mapper.dtos;



import domain.models.Teacher;
import lombok.Builder;
import lombok.Data;

@Builder
public record SubjectDto (
        Long subjectId,
        String subjectName,
        Teacher teacher){
    public SubjectDto(Long subjectId, String subjectName) {
        this(subjectId, subjectName, null);
    }
}
