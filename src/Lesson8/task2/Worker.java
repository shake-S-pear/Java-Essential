package Lesson8.task2;

import java.util.Comparator;

public class Worker {

    String nameSurname;
    String jobTitle;
    int yearOfStartWorking;

    public Worker(String nameSurname, String jobTitle, int yearOfStartWorking) {
        this.nameSurname = nameSurname;
        this.jobTitle = jobTitle;
        this.yearOfStartWorking = yearOfStartWorking;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearOfStartWorking() {
        return yearOfStartWorking;
    }
}

class SortWorkersByName implements Comparator<Worker>
{

    public int compare(Worker a, Worker b)
    {
        return a.nameSurname.compareTo(b.nameSurname);
    }
}
