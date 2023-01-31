package project.domain.member.presentation;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberAPI {
    

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", "lmc");
        map.put("userNm", "이명철");
        map.put("authCd", "9999");
        map.put("authNm", "Master");
        
        System.out.println(map.toString());
      
        return new ObjectMapper().writeValueAsString(map);
    }
}