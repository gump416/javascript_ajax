<%@ page contentType="application/json; charset=UTF-8" %> <%-- MIME 타입 바꿔주는게 첫번째 작업 --%>
<%-- DB로부터 교재리스트 수신하여 JSON 데이터로 변환 --%>
{
  "page" : 5,
    "list" : 
      [
        {
          "title" : "금붕어 메세지1",
          "autor" : "이능문1",
          "publisher" : "무한 생각 출판사1",
          "price" : 9000,
          "kind" : "소설1"
        },  
        {
          "title" : "금붕어 메세지2",
          "autor" : "이능문2",
          "publisher" : "무한 생각 출판사2",
          "price" : 9000,
          "kind" : "소설2"
        },  
        {
          "title" : "금붕어 메세지3",
          "autor" : "이능문",
          "publisher" : "무한 생각 출판사3",
          "price" : 9000,
          "kind" : "소설3"
        }
     ]
}