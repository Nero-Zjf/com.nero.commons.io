package com.nero.common.io.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * FileUtils-文件操作工具类-实例demo
 * FileUtils类包含处理文件对象的实用程序方法。这些包括读取、写入、复制和比较文件。
 * @created zjf
 * @date 2019/7/22 16:37
 */
public class FileUtilsDemo {
    /**
     * 读取文件内容为List<String>
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File(FileUtilsDemo.class.getClassLoader().getResource("application.properties").toURI());
        List lines = FileUtils.readLines(file, "utf-8");
//        List lines = FileUtils.readLines(file, "UTF-8");
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}
