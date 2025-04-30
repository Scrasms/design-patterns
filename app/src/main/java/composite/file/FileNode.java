package composite.file;

// Leaf Component Class
public class FileNode implements FileSystemNode {
    private String name;

    public FileNode(String name) {
        this.name = name;
    }

    public String inOrderTraversal() {
        return name;
    }
}
