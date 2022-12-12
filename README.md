<div align=center>
	<img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=PROJECT02&fontSize=90" />	
</div>
<div align=center>
	<h3>데이터 크롤링 기반 부동산 정보 제공 서비스, 맛동산</h3>
	<p>크롤링한 네이버 부동산의 순천지역 아파트 데이터와 국토교통부 실거래가 공공데이터를 
활용하여 사용자에게 아파트 매매에 필요한 정보를 제공합니다.
대상 아파트와 사용자의 조건을 입력하여 예상 대출금액을 계산할 수 있습니다.
JSP/Servlet 으로 웹 페이지를 구성하였고 Kakao Map API, Chart.js, Javascript 등을 활용하여 시각화하였습니다.</p>
</div>

---


## 1. 프로젝트 기획

[ 프로젝트 목표 ]
에레레

- 서비스 목표 기능
1) 데이터 크롤링으로 얻은 아파트 매물 정보 제공
2) Kakaomap API를 활용하여 시각화 및 추가 정보 제공
3) 공공 데이터(아파트 실거래가)를 활용하여 추가 정보 제공
4) 예상 대출금액 계산 기능 구현
5) 회원가입

## 2. 기능구현

<div align=center>
	<h3>🛠 적용기술 🛠</h3>
</div>
<div align="center">
	<img src="https://user-images.githubusercontent.com/107980487/206960774-9b3425cd-a028-4ba9-92d6-4ca39f356600.png" style="width:10%"/>
	<img src="https://user-images.githubusercontent.com/107980487/206961031-325630c3-e778-4e98-a684-42633e900f18.png" style="width:10%"/>
	<img src="https://user-images.githubusercontent.com/107980487/206961080-5b3165a5-d198-4b29-a043-6137689e8210.png" style="width:10%"/>
	<img src="https://user-images.githubusercontent.com/107980487/206961149-41c061d4-683d-41e1-8792-669fb0ef4351.png" style="width:8%"/>
	<img src="https://user-images.githubusercontent.com/107980487/206961162-e35c3906-0a3b-4386-b0ca-c684c3a2254f.png" style="width:8%"/>
	<br>
	<img src="https://user-images.githubusercontent.com/107980487/206961179-5dbbb9f8-b4dd-41db-92e1-97e147072933.png" style="width:6%"/>
  <img src="https://user-images.githubusercontent.com/107980487/206961199-736f57c8-be75-4ca6-8cd3-2ab6e7dcee08.png" style="width:8%"/>
  <img src="https://user-images.githubusercontent.com/107980487/206961252-f744a9d7-e855-4055-96b1-6abaa1bb5085.png" style="width:8%"/>
	<img src="https://user-images.githubusercontent.com/107980487/206961273-62a2979c-8731-4ce7-856a-4cf16d1752de.png" style="width:8%"/>
 
</div>
<br><br>

###### [ MVC Framework를 활용한 웹서버 구현 ]

- Controller, Model(DTO), View(Jsp) 활용
- 회원 관련 기능, 매물 검색, 매물 정보 제공, 건의사항 전달, 관심 매물 등록 등

![image](https://user-images.githubusercontent.com/107980487/206963783-2cc55530-50d7-434c-83e7-0596941361f2.png)

<br>

###### [ 데이터 크롤링을 통한 아파트 정보 활용 ]
- Python 관련 라이브러리 BeautifulSoup, Selenium를 활용한 네이버 부동산 정보 데이터 크롤링으로 현재 순천에 있는 매물 정보를 가져와서 사용
- Kakaomap API를 활용하여 시각화 및 추가 정보 제공

![image](https://user-images.githubusercontent.com/107980487/206963689-1d143896-374d-4e35-9c4b-47fb62323074.png)

<br>

###### [ 공공데이터를 활용한 추가 정보 제공 ]
- 국토교통부 실거래가 공공데이터 3년치(2019,2020,2021년)를 전처리하여 매물 가격 동향 정보 제공
- Chart.js를 활용하여 시각화

![image](https://user-images.githubusercontent.com/107980487/206963941-7f2666bc-fe24-46f1-812d-b41024389fa6.png)

<br>

###### [ 예상 대출금액 계산 기능 ]
- 부동산계산기.com 의 계산 공식을 활용하여 동일한 계산식을 구현
- JavaScript를 활용하여 구현

![image](https://user-images.githubusercontent.com/107980487/206964024-3aa0d9a8-09d3-4a1f-9fd6-7cd6eb2127c9.png)

<br>

## 3. 서비스 구현

###### [ 화면 설계/ 화면 구현 ]
- HTML/CSS 기반의 정적 페이지 구현
- JavaScript 기반의 동적 페이지 구현
- Chart.js 활용하여 시각화
<br>

###### [ 웹 서버 기능 연동 ]
- Jsp/Servlet, Jstl을 활용한 웹 서버 기능 연동
<br>

###### [ Oracle DB와 웹 서버 연동 ]
- MyBATIS를 활용한 데이터베이스 연동
- DAO활용

* DAO - Data Access Object
* DTO - Data Transfer Object = Value Object

![Footer](https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=footer)
