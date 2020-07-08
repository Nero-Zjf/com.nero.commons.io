package com.nero.common.io.demo;

import org.apache.commons.io.FileSystemUtils;

import java.io.IOException;

/**
 * FileSystemUtils-文件系统操作工具类-demo
 * FileSystemUtils类包含一些实用程序方法，用于处理文件系统以访问JDK不支持的功能。目前，唯一的方法是获得驱动器上的空闲空间。注意，这里使用的是命令行，而不是本机代码。
 *
 * @created zjf
 * @date 2019/7/22 17:02
 */
public class FileSystemUtilsDemo {
    /**
     * 要找到驱动器上的空闲空间
     * @throws IOException
     */
    public void getFreeSpace() throws IOException {
        long freeSpace = FileSystemUtils.freeSpaceKb("C:/");
        System.out.println(freeSpace/1024/1024+"GB");
    }
}
