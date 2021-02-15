package broadcom.hw;

public interface ITerminal {

    void listFiles();
    void listRecursiveFiles();
    long countFolderSize();

    void listFilesStartWith(String filter);
    void listFilesEndWith(String filter);
    void listFilesContains(String filter);
    void listFilesByType(String filter);
    void listFilesGreaterThanSize(String filter);


    void listRecursiveFilesStartWith(String filter);
    void listRecursiveFilesEndWith(String filter);
    void listRecursiveFilesContains(String filter);
    void listRecursiveFilesByType(String filter);
    void listRecursiveFilesGreaterThanSize(String filter);

    void cd(String absolute);

    void pwd();

    IFile createFile(String name, long size);

    IFile createFolder(String folderName);

    IFile createSymbolicLink(String name, IFile file);


}
