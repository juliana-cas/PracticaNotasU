package mapper.mappers;

import domain.models.Grades;

import java.util.List;

public class GradesMapper {
    public static GradesDto mapFrom(Grades source) {
        return new GradesDto(source.getId(),
                source.getStudent(),
                source.getSubject(),
                source.getGrade(),
                source.getCorte());
    }

    public static Grades mapFrom(GradesDto source){
        return new Grades(source.gradesId(),
                source.student(),
                source.subject(),
                source.grade()
    }

    public static List<GradesDto> mapFrom(List<Grades> sources){
        return sources.parallelStream().map(e-> mapFrom(e)).toList();
    }
}
