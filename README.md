# portfolio02
##ㅇ아녕
데이터 크롤링 기반 부동산 정보 제공 서비스, 맛동산 

크롤링한 네이버 부동산의 순천지역 아파트 데이터와 국토교통부 실거래가 공공데이터를 
활용하여 사용자에게 아파트 매매에 필요한 정보를 제공합니다.
대상 아파트와 사용자의 조건을 입력하여 예상 대출금액을 계산할 수 있습니다.
JSP/Servlet 으로 웹 페이지를 구성하였고 Kakao Map API, Chart.js, Javascript 등을 활용하여 시각화하였습니다.

(사)스마트인재개발원이 주관하는 2022 K-디지털 핵심 실무인재 양성사업 - DCX기반 빅데이터 분석서비스 개발자과정에서 진행한 2차 팀프로젝트로 해당 과정에서 JSP/Servlet 과 DB 구축, 공공데이터 전처리 및 활용을 맡았습니다.

프로젝트 기간 : 2022. ~
참여인원 : 5명
사용 프로그램 : eclipse, Apache Tomcat, Visual Studio Code, Oracle DB, Jupyter Notebook (anaconda3), Excel


1. 프로젝트 기획

[ 프로젝트 주요목표 ]
순천 지역 아파트 매매에 관심이 있는 사람

- 서비스 목표 기능
1) 데이터 크롤링으로 얻은 아파트 매물 정보 제공
2) Kakaomap API를 활용하여 시각화 및 추가 정보 제공
3) 공공 데이터(아파트 실거래가)를 활용하여 추가 정보 제공
4) 예상 대출금액 계산 기능 구현

[프로젝트 설계]
- 유스케이스 명세화
- 요구사항 정의

[Oracle DB를 활용한 데이터베이스 구축]
- ERD 설계
- 5개 테이블 명세화, 구축

2. 기능구현
[ MVC Framework를 활용한 웹서버 구현 ]
- Controller, Model(DTO), View(Jsp) 활용
- 회원 관련 기능, 매물 검색, 매물 정보 제공, 건의사항 전달, 관심 매물 등록 등

[ 데이터 크롤링을 통한 아파트 정보 활용 ]
- Python 관련 라이브러리 BeautifulSoup, Selenium를 활용한 네이버 부동산 정보 데이터 크롤링으로 현재 순천에 있는 매물 정보를 가져와서 사용
- Kakaomap API를 활용하여 시각화 및 추가 정보 제공

[ 공공데이터를 활용한 추가 정보 제공 ]
- 국토교통부 실거래가 공공데이터 3년치(2019,2020,2021년)를 전처리하여 매물 가격 동향 정보 제공
- Chart.js를 활용하여 시각화

[ 예상 대출금액 계산 기능 ]
- 부동산계산기.com 의 계산 공식을 활용하여 동일한 계산식을 구현
- JavaScript를 활용하여 구현

3. 서비스 구현

[ 화면 설계/ 화면 구현 ]
- HTML/CSS 기반의 정적 페이지 구현
- JavaScript 기반의 동적 페이지 구현
- Chart.js 활용하여 시각화

[ 웹 서버 기능 연동 ]
- Jsp/Servlet, Jstl을 활용한 웹 서버 기능 연동

[ Oracle DB와 웹 서버 연동 ]
- MyBATIS를 활용한 데이터베이스 연동
- DAO활용

* DAO - Data Access Object
* DTO - Data Transfer Object = Value Object
