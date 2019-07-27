package com.mgchoo.security2.home.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgchoo.security2.home.entity.Home;
import com.mgchoo.security2.home.service.HomeService;
import com.mgchoo.security2.util.RandomGenerator;

/*
 * org.springframework.stereotype 패키지에 존재한다.
 * 스프링 2.5 부터 지원한다. 
 * spring MVC의 Controller 클래스 선언을 단순화시켜준다. 
 * 스프링 컨트롤러, 서블릿을 상속할 필요가 없으며, @Controller로 등록된 클래스 파일에 대한 bean을 자동으로 생성해준다.
 * Controller로 사용하고자 하는 클래스에 @Controller 지정해 주면 component-scan으로 자동 등록된다.
 */
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

     /*
      * 자바 6 및 JEE5에 추가된 것으로 어플리케이션에서 필요로 하는 자원을 자동 연결할 때 사용 한다. 
      * 스프링 2.5 부터 지원하는 어노테이션으로 스프링에서는 의존하는 빈 객체를 전달할 때 사용한다.
     * @Autowired 와 같은 기능을 하며 @Autowired와 차이점은 @Autowired는 타입으로(by type),
     * @Resource는 이름으로(by name)으로 연결시켜준다는 것이다.
     * <bean class="org.springframework.beans.factory.annotation.CommonAnnotationBeanPostProcessor"/> 클래스를 빈으로 등록시켜줘야 한다.
      * 해당 설정 대신에 <context:annotation-config> 태그를 사용해도 된다.
     */
    @Resource
    private HomeService homeService;
    
    @Resource
    private UserDetailsService userDetailsServiceImpl;
    
    /*
     * RequestMapping annotation은 url을 class 또는 method와 mapping 시켜주는 역활을 한다.
     * annotation을 쓰지 않을때 지정했던 Controller등록을 위한 url bean 설정을 생략 할 수 있다.
     * class에 하나의 url mapping을 할 경우, class위에 @RequestMapping("/url")을 지정하며, 
     * GET 또는 POST 방식 등의 옵션을 줄 수 있다. 해당되는 method가 실행된 후, 
     * return 페이지가 따로 정의되어 있지 않으면 RequestMapping("/url")에서 설정된 url로 다시 돌아간다.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info("/(home)");
        
        RandomGenerator rg = new RandomGenerator();
        Home home = new Home(rg.nextString());
        this.homeService.insert(home);
        
        return "home/home";
    }

    
    @RequestMapping(value = "/admin/admin.do", method = RequestMethod.GET)
    public String admin() {
        logger.info("/admin/admin.do");
        
        return "admin/admin";
    }

}
