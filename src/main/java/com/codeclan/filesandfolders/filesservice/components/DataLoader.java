package com.codeclan.filesandfolders.filesservice.components;


import com.codeclan.filesandfolders.filesservice.models.File;
import com.codeclan.filesandfolders.filesservice.models.Folder;
import com.codeclan.filesandfolders.filesservice.models.Person;
import com.codeclan.filesandfolders.filesservice.repositories.FileRepository;
import com.codeclan.filesandfolders.filesservice.repositories.FolderRepository;
import com.codeclan.filesandfolders.filesservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person person = new Person("Yer man");
        personRepository.save(person);
        Person person2 = new Person("Joobs");
        personRepository.save(person2);
        Person person3 = new Person("Guy");
        personRepository.save(person3);
        Folder folder1 = new Folder("Woooork", person);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Giffs", person);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Peecs", person2);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Downloads", person3);
        folderRepository.save(folder4);
        File file1 = new File("FilenameWan", "txt", 1, folder1);
        fileRepository.save(file1);
        File file2 = new File("FilenameTwo", "exe", 3, folder2);
        fileRepository.save(file2);
        File file3 = new File("RedDeadSpeedRun", "mp4", 8, folder3);
        fileRepository.save(file3);
        File file4 = new File("So What", "mp3", 120, folder4);
        fileRepository.save(file4);
    }
}
