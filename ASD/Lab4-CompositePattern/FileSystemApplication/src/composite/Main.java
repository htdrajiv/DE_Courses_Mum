package composite;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class Main {
    public static void main(String[] args){
        Drive cdrive = new Drive("C");
        Directory appdir = new Directory("applications");
        Directory datadir = new Directory("my data");
        Directory coursedir = new Directory("cs525");
        cdrive.addContent(appdir); cdrive.addContent(datadir); cdrive.addContent(coursedir);

        FileSystem excelfile = new File("msexcel.exe", 2353256);
        FileSystem wordfile = new File("msword.exe", 3363858);
        FileSystem studentsfile = new File("students.doc", 34252);
        datadir.addContent(studentsfile);

        appdir.addContent(excelfile); appdir.addContent(wordfile);
        datadir.addContent(studentsfile);
        cdrive.showDetails();

    }
}
