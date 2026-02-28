import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.lpu.config.MyConfig;
public class MyWebAppInitializer 
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { MyConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}