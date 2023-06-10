package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void shouldDoTestSimple() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestSimpleNo() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Поиск");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestMeeting() {
        Meeting meeting = new Meeting(3, "one", "two", "december");

        boolean actual = meeting.matches("one");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestMeeting1() {
        Meeting meeting = new Meeting(3, "one", "two", "december");

        boolean actual = meeting.matches("two");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestMeetingNo() {
        Meeting meeting = new Meeting(3, "one", "two", "december");

        boolean actual = meeting.matches("december");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestMeetingNo1() {
        Meeting meeting = new Meeting(3, "one", "two", "december");

        boolean actual = meeting.matches("3");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestMeetingNo2() {
        Meeting meeting = new Meeting(3, "one", "two", "december");

        boolean actual = meeting.matches("topic");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestEpic() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestEpic1() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestEpic2() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDoTestEpicNo() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Булка");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
