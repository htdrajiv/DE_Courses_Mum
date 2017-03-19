package composite;

/**
 * Created by Rajiv on 3/19/2017.
 */
public class File implements FileSystem {
    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public void showDetails() {
        System.out.println("-- file " +this.name+" size ="+computeSize()+" bytes");
    }

    @Override
    public int computeSize() {
        return this.sizeInBytes;
    }
}
