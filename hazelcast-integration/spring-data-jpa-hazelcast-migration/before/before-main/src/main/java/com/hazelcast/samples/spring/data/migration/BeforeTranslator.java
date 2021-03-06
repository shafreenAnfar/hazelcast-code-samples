package com.hazelcast.samples.spring.data.migration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.Bootstrap;

/**
 * <P>Use <A HREF="https://projects.spring.io/spring-shell">Spring Shell</A>
 * for command line handling as it's more appropriate than
 * <A HREF="http://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-remote-shell.html">CRaSH</A>
 * although not as nicely integrated yet.
 * </P>
 * @see <A HREF="https://github.com/spring-projects/spring-shell/issues/34">
 * 	https://github.com/spring-projects/spring-shell/issues/34</A> 
 */
@SpringBootApplication
public class BeforeTranslator {

    public static void main(String[] args) throws Exception {
    	Bootstrap.main(args);
    }

}
