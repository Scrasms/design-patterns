package composite.file;

import java.util.List;

// Client class that operates on Composite nodes
public class FileSystem {
    /*             root
     *            /    \______ stuff______________
     *        code         ___/      |___         \
     *      /    \        /             |          \
     * hello.c   java  minecraft.mp4 password.txt  billy.exe
     *          /    \
     *    dumb.java bye.java
     */

    public static void main(String[] args) {
        // Create leaves
        FileSystemNode dumb = new FileNode("dumb.java");
        FileSystemNode bye = new FileNode("bye.java");
        FileSystemNode mc = new FileNode("minecraft.mp4");
        FileSystemNode pword = new FileNode("password.txt");
        FileSystemNode billy = new FileNode("billy.exe");
        FileSystemNode hello = new FileNode("hello.c");

        // Create composites
        FileSystemNode java = new DirectoryNode("java", List.of(dumb, bye));
        FileSystemNode code = new DirectoryNode("code", List.of(hello, java));
        FileSystemNode stuff = new DirectoryNode("stuff", List.of(mc, pword, billy));
        FileSystemNode root = new DirectoryNode("root", List.of(code, stuff));

        System.out.println(root.inOrderTraversal());
    }
}
