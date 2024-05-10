package com.makingdevs.apirest2.config
import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.ContextLoaderListener
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext
import javax.servlet.ServletRegistration

class WebServletConfiguration implements WebApplicationInitializer{
    void onStartup(ServletContext ctx){
        println "-"*50
        println "STARTUP"
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext()
        webContext.register(SpringConfig)
//        webContext.setServletContext(ctx)
        ctx.addListener(new ContextLoaderListener(webContext))
        ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcherServlet", new DispatcherServlet(webContext))
        servlet.setLoadOnStartup(1)
        servlet.addMapping("/")
    }
}
