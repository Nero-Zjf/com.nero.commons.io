package com.nero.common.io.demo;

import org.apache.commons.io.FileSystemUtils;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @created zjf
 * @date 2019/7/22 16:06
 */
public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        LineIteratorDemo demo = new LineIteratorDemo();
        demo.lineIterator();
    }
}
