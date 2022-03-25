select * from emp;

select * from emp e, dept d where d.deptno = e.deptno;

-- 테이블 구조를 조회해보는 명령
-- 형식) describe 테이블이름;
--      desc 테이블이름;
--      emp 테이블의 구조를 조회해보자
describe emp;
/*
    SELECT
    
    FROM
        테이블 이름... 콤마로 구분해서 나열
    [WHERE          ]
    [GROUP BY       ]
    [HAVING         ]
    [ORDER BY       ];
*/
-- 부서데이터 정보 조회
SELECT deptno, dname, loc
FROM dept
;
-- 1+4의 결과를 조회하세요
SELECT 1+4 FROM emp;

-- 참고 : 오라클은 데이터의 형태를 매우 중요시한다.
-- 원칙적으로 문자는 문자끼리만 비교하고 숫자는 숫자끼리만 비교한다
-- 날짜는 문자처럼 비교할 수 있다.
-- 문자데이터를 날짜데이터로 변환한 후 비교하게 된다.

-- 오라클은 문자도 크기 비교가 가능하다.
-- 아스키 코드값으로 비교하기 때문
-- 오라클은 문자와 문자열의 구분이 없다.
-- 대신 문자열 데이터의 대소문자는 반드시 구분해서 처리해야한다.

-- 조건을 비교하는 방법은 오라클이 
-- 그 행이 조건에 맞는지를 확인후
-- 조건이 맞으면 출력하게 된다.

-- 조건절에 조건을 여러개 나열하는 경우는 AND OR 연산자를 이용해서 나열한다
--      이 때 조회시간은 처음 조건이 많이 걸러내는 조건일수록 짧아진다.
        -- 사원 중 직급이 MANAGER이고 부서번호가 10번인 데이터 조회하시오
SELECT
    ename
FROM
    emp
WHERE
    job = 'MANAGER'
    AND detpno = 10
 ;   
 
 ------------------------------------------------------------------------
 /*
            EMP 테이블
                
                EMPNO       : 사원번호
                ENAME       : 사원이름
                JOB         : 사원직급
                MGR         : 상사번호
                HIREDATE    : 입사일
                SAL         : 봉급
                COMM        : 커미션
                DEPTNO      : 부서번호
            
 */
 /*
        1. 사원이름이 SMITH인 사원의 이름, 직급, 입사일을 조회하세요
 */
 SELECT
    ename, job, hiredate  
 FROM
    emp
 WHERE
    ename = 'SMITH'
 ;
 /*
        2. 직급이 MANAGER인 사원의 이름, 직급, 급여를 조회하세요
 */
 SELECT
    ename, job, sal
FROM
    emp
WHERE
    job = 'MANAGER'
 ;
 /*
        3. 급여가 1500을 넘는 사원들의 사원이름, 직급, 급여를 조회하세요
 */
 SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal > 1500
;
 /*
        4. 사원이름이 'S' 이후의 문자로 시작하는 사원들의 이름, 직급, 급여를 조회하세요
 */
SELECT
    ename, job, sal
FROM
    emp
WHERE
    ename >= 'S'
;

/*
        5. 입사일이 '81/08'이전에 입사한 사원들의 사원이름
*/
SELECT
    ename, hiredate, sal
FROM
    emp
WHERE
    hiredate < '81/08/01'
;
/*
        6. 부서번호가 10 또는 30인 사원들의 사원이름 직급 부서번호
*/
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    deptno = 10 or deptno = 30
;

-- 부서번호 10이 아닌 사원이름 직급 부서번호
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    not deptno = 10
--  deptno <> 10
--  deptno != 10
;

-- 급여 1000 ~ 3000 인 사원들의 사원이름 직급 급여를 조회하세요
SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal >= 1000 and sal <= 3000
;
-- 직급 MANAGER이면서 급여가 1000 이상인 사원의 이름 직급 입사일 급여 조회
SELECT
    ename, job, hiredate, sal
FROM
    emp
WHERE
    job = 'MANAGER' and sal >= 1000
;

/*
        조건 연산자
            필드 Between A and B
                A와 B사이 데이터들
            필드 IN(A, B, C)
                데이터가 주어진 데이터들 중 하나인지 확인
            필드 LIKE '와일드카드'
                문자열 비교해주는 연산자(문자열에만 사용)
                _ : 한개 당 한 글자만을 와일드카드로 지정하는 것
                % : 글자수에 관계없이 모든 문자를 포함하는 와일드 카드
                'M%' - 'M'으로 시작하는 모든 문자열

        조회되는 컬럼에 별칭을 부여해서 조회할 수 있다.
            형식 
                칼럼이름        별칭
                칼럼이름        AS 별칭
                칼림이름        "별 칭"
                칼림이름        AS "별 칭"
            공백이 포함된 별칭의 경우에만 " "를 사용한다.
                SELECT ename "사원 이름", job AS "직 급"
                FROM emp
                WHERE "사원 이름" = 'SMITH';
*/

-- 직급이 MANAGER, SALESMAN이 아닌 사원이름 직급 급여
SELECT
    ename, job, sal
FROM
    emp
WHERE
    job Not in('MANAGER', 'SALESMAN') 
;

-- 이름이 다섯글자인 사원이름 직급
SELECT
    ename, job
FROM
    emp
WHERE
    ename like '_____'
;
-- 입사일 1월인 사원의 이름, 입사일
SELECT
    ename, hiredate
FROM
    emp
WHERE
    hiredate like  '__/01/__'
;

-----------------------------------------------------
-- 부서번호 10의 이름 직급 입사일 부서번호
SELECT ename, job, hiredate, deptno
FROM emp
WHERE  deptno = 10
;
-- 직급이 SALESMAN인 이름 직급 급여
SELECT ename 이름, job 직급, sal 급여
FROM emp
WHERE job = 'SALESMAN'
;
-- 급여가 1000보다 적은 이름, 직급, 급여
SELECT ename, job, sal
FROM emp
WHERE sal < 1000
;
-- 사원이름 'M' 이전의 문자 사원이름 직급 급여
SELECT ename, job, sal
FROM emp
WHERE ename <= 'M'
;
-- 입사일이 1981 9 8일인 이름 직급 입사일
SELECT  ename, job, hiredate
FROM emp
WHERE hiredate = '81/09/08'
;
-- 'M'이후 문자 + 급여 1000이상 이름 급여 직급
SELECT  ename, sal, job
FROM emp
WHERE ename >= 'M' and sal >= 1000
;
-- 직급 'MANAGER' 급여 1000초과 부서번호 10인 이름 직급 급여 부서번호
SELECT ename, job, sal, deptno
FROM emp
WHERE job = 'MANAGER' and sal > 1000
;
-- 직급 'MANAGER' 제외 이름 직급 입사일 + NOT 사용
SELECT ename, job, hiredate
FROM emp
WHERE  not job = 'MANAGER'
;
-- 이름 'C'보다 크고 'M'보다(포함됨) 이름 직급 급여 BETWEEN사용
SELECT ename, job, sal
FROM emp
WHERE ename Between 'C' and 'M'
;
-- 급여 800, 950 아닌 이름 직급 급여 IN사용
SELECT ename job, sal
FROM emp
WHERE sal not in(800, 950)
;
--  'S'시작 다섯글자 이름 직급 급여
SELECT ename, job, sal
FROM emp
WHERE ename like 'S____'
;
-- 입사일 3일인 사원의 이름 직급 입사일 조회
SELECT ename, job, hiredate
FROM emp
WHERE hiredate like '%03'
;
-- 글자수 4글자나 5글자인 사원 이름 직급 조회
SELECT  ename, job
FROM emp
WHERE   ename like '____' or  ename like '_____'
;
-- 입사년도 81, 82인 이름 급여 입사일
SELECT ename, sal, hiredate
FROM emp
WHERE hiredate like '81%' or hiredate like '82%'
;
-- 'S'끝나는 사원 이름 급여 커미션 조회SELECT
SELECT ename, sal, comm
FROM emp
WHERE ename like '%S'
;