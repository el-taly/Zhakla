package JAVA_PROJECT.JAVAsem5;

public interface IGroupService {
    String saveGroupToTxt(String fileName, EducationGroup group);

    EducationGroup loadGroupFromTxt(String fileName);
}

