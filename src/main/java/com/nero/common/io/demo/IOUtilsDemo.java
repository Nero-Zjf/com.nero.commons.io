package com.nero.common.io.demo;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * IOUtils-IO操作工具类
 * IOUtils包含处理读取、写入和复制的实用方法。这些方法适用于InputStream、OutputStream、Reader和Writer。
 * @created zjf
 * @date 2019/7/22 16:32
 */
public class IOUtilsDemo {
    /**
     * 读取任意方式流为字符串
     *
     * 例如，考虑从URL读取字节并打印它们的任务。这通常是这样做的
     * 在某些应用程序域中，这种IO操作很常见，该类可以节省大量时间。您可以依赖经过良好测试的代码。
     * 对于这样的实用程序代码，灵活性和速度是最重要的。但是，您也应该了解这种方法的局限性。使用上面的技术读取一个1GB的文件将导致试图创建一个1GB的字符串对象!
     * @throws IOException
     */
    public void IOUtilsToString() throws IOException {
        //常用操作
//        InputStream in = new URL( "http://commons.apache.org" ).openStream();
//        try {
//            InputStreamReader inR = new InputStreamReader( in );
//            BufferedReader buf = new BufferedReader( inR );
//            String line;
//            while ( ( line = buf.readLine() ) != null ) {
//                System.out.println( line );
//            }
//        } finally {
//            in.close();
//        }
        //IOUtils操作
//        InputStream in = new URL("http://commons.apache.org").openStream();
//        try {
//            System.out.println(IOUtils.toString(in));
//        } finally {
//            IOUtils.closeQuietly(in);
//        }

        //IOUtils操作2
        System.out.println(IOUtils.toString(new URL("http://commons.apache.org")));
    }
}
