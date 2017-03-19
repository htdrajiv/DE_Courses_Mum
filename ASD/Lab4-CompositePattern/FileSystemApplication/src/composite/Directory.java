package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class Directory implements FileSystem {
    protected String name;
    protected List<FileSystem> directoryContents = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void addContent(FileSystem content){
        this.directoryContents.add(content);
    }

    public void removeContent(FileSystem content){
        this.directoryContents.remove(content);
    }

    @Override
    public int computeSize(){
        int sizeInBytes=0;
        for(FileSystem components : directoryContents){
            sizeInBytes += components.computeSize();
        }
        return sizeInBytes;
    }

    @Override
    public void showDetails() {
        System.out.println("-- dir " +this.name+" size ="+this.computeSize()+" bytes");
        for(FileSystem system : directoryContents){
            system.showDetails();
        }
    }
}
