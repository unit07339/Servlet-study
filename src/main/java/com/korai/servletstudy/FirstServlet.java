package com.korai.servletstudy;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
// ctrl f5
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("FirstServlet 초기화"); // 서블릿 처음 시작 시 실행
    }

    @Override // get일 때만
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET요청 들어옴"); // GET 요청이 올 때마다 서버 콘솔에 출력

        resp.setStatus(400); // HTTP 응답 상태 코드를 400(Bad Request)으로 설정, 기본값 200
        resp.setContentType("text/plain"); // 응답 데이터의 종류를 일반 텍스트로 지정
        resp.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지를 위한 인코딩 설정
        resp.getWriter().println("응답데이터"); // 클라이언트(브라우저)로 "응답데이터" 문자열을 전송
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("서비스 호출");
//        System.out.println(req.getMethod());
//        if (req.getMethod().equalsIgnoreCase("GET")) {
//            System.out.println("GET요청 들어옴");
//        }
//    } // service 랑 doGet 같이 있으면 service가 우선순위가 높음 / service는 모든 요청을 다 받을 때만 쓰고 안씀

}
