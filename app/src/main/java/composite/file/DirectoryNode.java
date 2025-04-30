package composite.file;

import java.util.List;

// Composite Component Class
public class DirectoryNode implements FileSystemNode {
    private String name;
    private List<FileSystemNode> children;

    // We could have addNode and removeNode methods in Composite class but
    // then we can't use the FileSystemNode interface since it doesn't provide
    // those methods. We would have to instantiate DirectoryNode and FileNode separately.
    // Alternatively, you could declare addNode and removeNode in the interface, but that breaks LSP for
    // leaf nodes. The best way in my opinion is to make the client pass in the children themselves.
    public DirectoryNode(String name, List<FileSystemNode> children) {
        this.name = name;
        this.children = children;
    }

    public String inOrderTraversal() {
        // Map list of children to list of path names, reduce all path names into one string
        return children.stream()
                       .map(FileSystemNode::inOrderTraversal)
                       .reduce(name, (acc, curr) -> acc + "/" + curr);
    }
}
