package Homework.hw007.util;

import Homework.hw007.service.UserContactService;

public interface FileRecorder<T> {
    public void saveFile(UserContactService<T> contact);
}
