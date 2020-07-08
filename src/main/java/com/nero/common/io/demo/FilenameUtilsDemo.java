package com.nero.common.io.demo;

import org.apache.commons.io.FilenameUtils;

/**
 * FilenameUtils-文件名称操作工具类-demo
 * FilenameUtils类包含用于处理文件名而不使用File对象的实用方法。该类的目标是在Unix和Windows之间保持一致，以帮助这些环境之间的转换(例如从开发转移到生产)。
 *
 * @created zjf
 * @date 2019/7/22 16:57
 */
public class FilenameUtilsDemo {
    /**
     * 规范化文件名
     * 例如，要规范化文件名，删除双点段:
     */
    public void normalizeFilename() {
        String filename = "C:/commons/io/../lang/project.xml";
        String normalized = FilenameUtils.normalize(filename);
        System.out.println(normalized);
        // result is "C:/commons/lang/project.xml"
    }
}
