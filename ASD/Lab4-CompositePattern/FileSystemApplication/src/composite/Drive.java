package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class Drive implements FileSystem {
    private String name;

    public Drive(String name){
        this.name = name;
    }
    List<FileSystem> driveContents = new ArrayList();

    public void addContent(FileSystem newFileSystem){
        driveContents.add(newFileSystem);
    }

    @Override
    public int computeSize(){
        int sizeInBytes=0;
        for(FileSystem components : driveContents){
            sizeInBytes += components.computeSize();
        }
        return sizeInBytes;
    }

    public void removeContent(FileSystem fileSystem) {
        int index = this.driveContents.indexOf(fileSystem);
        this.driveContents.remove(index);
    }

    @Override
    public void showDetails() {
        System.out.println("-- drive " +this.name);
        for(FileSystem system : driveContents){
            system.showDetails();
        }
    }
}
