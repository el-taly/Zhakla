package JAVA_PROJECT.JAVAsem5;

import java.util.logging.Logger;

public class Main {



    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        EducationGroup group = GroupController.newGroup();

        logger.info("-- CREATE --");
        logger.info(group.toString());
        logger.info(group.getTeacher().toString());
        logger.info(group.getStudents().toString());

        logger.info("-- SAVE --");
        GroupController.saveGroup("group1.txt", group);

        logger.info("-- LOAD --");
        EducationGroup newGroup = GroupController.readGroup("group1.txt");

        logger.info(newGroup.toString());
        logger.info(newGroup.getTeacher().toString());
        logger.info(newGroup.getStudents().toString());
    }
}

