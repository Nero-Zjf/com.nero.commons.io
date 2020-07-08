package com.nero.common.io.demo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * org.apache.commons.io.LineIterator类为处理基于行的文件提供了一种灵活的方法。实例可以直接创建，也可以通过FileUtils或IOUtils上的工厂方法创建。
 * @created zjf
 * @date 2019/7/22 17:20
 */
public class LineIteratorDemo {
    /**
     *
     * @throws IOException
     */
    public void lineIterator() throws IOException, URISyntaxException {
        File file = new File(this.getClass().getClassLoader().getResource("application.properties").toURI());
        LineIterator it = FileUtils.lineIterator(file, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println(line);
                /// do something with line
            }
        } finally {
            LineIterator.closeQuietly(it);
        }
    }
}

