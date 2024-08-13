## 1. 개요

- 프로젝트명 : board
- 개발 인원 : 1 명
- 개발 기간 : 2024-08-13 ~
- 주요 기능 : 기본적인 게시판 기능 구현
- 사용 기술 : Java, SpringBoot, gradle, thymeleaf, jpa
- DB : mysql
- 만든 이유 : spring mvc 강의를 들은 것들을 내것으로 소화하기 위한 연습

## 2. skills

- java 17
- SpringBoot
- gradle
- Thymeleaf
- Jpa
- MySql

### 기타 사용 기술

- 인터셉터
- 메시지/국제화
- 유효성검사
- TDD (JUnit5)

### 요구사항

1) 공통 페이지
    - Global Navigation Bar 를 통한 페이지간 이동
    - 로그인 시 회원 닉네임, 마이 페이지, 로그아웃 버튼 표시
2) 회원 가입 페이지
    - 회원 가입 후 welcome 페이지
    - 로그인 페이지 이동 링크
      **유효성 검사**
      **중복 검사**

3) 로그인 페이지
   **회원가입 페이지 이동 링크**  
   **유효성 검사**
    - 로그인 제한된 페이지인 경우 "로그인이 필요한 서비스입니다." 후 redirect 로그인 페이지
    - 로그인 후 다시 원래 페이지로 이동

4) 회원 정보 페이지
   **회원 정보 수정**
   **비밀번호 수정**
   **유효성 검사**


5) 게시판 메인 페이지
    - 최신순 정렬
    - 게시글 제목 클릭시 해당 게시글 페이지로 이동
    - 게시글 시간 표시는 24시간 전에는 시간 이후는 날짜로 표기

   **검색**

    - 제목 검색
    - 내용 검색
    - 작성자 검색
    - 제목+내용 검색

6) 게시글
    - 생성 시간, 수정 일자, 작성자를 기롤
    - 조회수

   **유효성 검사**

    - 제목, 내용 빈칸인 경우 오류메세지 출력
    - 수정 시에도 동일 적용

   **수정,삭제**

    - 자신의 게시물일 경우 수정, 삭제 버튼 표시
    - 자신의 게시물일 경우 수정, 삭제 권한 부여

   **이미지 업로드**

    - 게시글에 이미지 업로드 기능 추가

7) 메시지, 국제화
    - 영어권 국가에서 접속시 영어 표시
    - 모든 텍스트, 에러 메시지 messages,errors (properties)로 관리

## DB 설계

## API 설계

## 화면 설계

### 로그인

<details>
<summary>더보기</summary>

내용

</details>

### 게시판

<details>
<summary>더보기</summary>

내용

</details>

### 게시글

<details>
<summary>더보기</summary>

내용

</details>

### 회원

<details>
<summary>더보기</summary>

내용

</details>

### 댓글

<details>
<summary>더보기</summary>

내용

</details>

### 이미지 업로드

<details>
<summary>더보기</summary>

내용

</details>

- ### 메시지, 국제화

<details>
<summary>더보기</summary>

내용

</details>

## 스스로 피드백

## 회고