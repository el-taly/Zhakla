package JAVA_PROJECT.JAVAsem5;


import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private static final EducationGroupService service = new EducationGroupService();

    public static EducationGroup newGroup(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivanov", "12.10.2000", 1));
        students.add(new Student("Petrov", "12.10.2000", 2));
        students.add(new Student("Sidorov", "12.10.2000", 3));
        students.add(new Student("Kovaleva", "12.10.2000", 4));
        students.add(new Student("Zotova", "12.10.2000", 5));

        return new EducationGroup(1, "gr-1", new Teacher("Pavlov", "14.05.1990",1, "teacher"), students);
    }

    public static EducationGroup readGroup(String fileName){
        return service.loadGroupFromTxt(fileName);
    }

    public static void saveGroup(String fileName, EducationGroup group){
        service.saveGroupToTxt(fileName, group);
    }

}

