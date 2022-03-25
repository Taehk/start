select * from emp;

select * from emp e, dept d where d.deptno = e.deptno;

-- ���̺� ������ ��ȸ�غ��� ���
-- ����) describe ���̺��̸�;
--      desc ���̺��̸�;
--      emp ���̺��� ������ ��ȸ�غ���
describe emp;
/*
    SELECT
    
    FROM
        ���̺� �̸�... �޸��� �����ؼ� ����
    [WHERE          ]
    [GROUP BY       ]
    [HAVING         ]
    [ORDER BY       ];
*/
-- �μ������� ���� ��ȸ
SELECT deptno, dname, loc
FROM dept
;
-- 1+4�� ����� ��ȸ�ϼ���
SELECT 1+4 FROM emp;

-- ���� : ����Ŭ�� �������� ���¸� �ſ� �߿���Ѵ�.
-- ��Ģ������ ���ڴ� ���ڳ����� ���ϰ� ���ڴ� ���ڳ����� ���Ѵ�
-- ��¥�� ����ó�� ���� �� �ִ�.
-- ���ڵ����͸� ��¥�����ͷ� ��ȯ�� �� ���ϰ� �ȴ�.

-- ����Ŭ�� ���ڵ� ũ�� �񱳰� �����ϴ�.
-- �ƽ�Ű �ڵ尪���� ���ϱ� ����
-- ����Ŭ�� ���ڿ� ���ڿ��� ������ ����.
-- ��� ���ڿ� �������� ��ҹ��ڴ� �ݵ�� �����ؼ� ó���ؾ��Ѵ�.

-- ������ ���ϴ� ����� ����Ŭ�� 
-- �� ���� ���ǿ� �´����� Ȯ����
-- ������ ������ ����ϰ� �ȴ�.

-- �������� ������ ������ �����ϴ� ���� AND OR �����ڸ� �̿��ؼ� �����Ѵ�
--      �� �� ��ȸ�ð��� ó�� ������ ���� �ɷ����� �����ϼ��� ª������.
        -- ��� �� ������ MANAGER�̰� �μ���ȣ�� 10���� ������ ��ȸ�Ͻÿ�
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
            EMP ���̺�
                
                EMPNO       : �����ȣ
                ENAME       : ����̸�
                JOB         : �������
                MGR         : ����ȣ
                HIREDATE    : �Ի���
                SAL         : ����
                COMM        : Ŀ�̼�
                DEPTNO      : �μ���ȣ
            
 */
 /*
        1. ����̸��� SMITH�� ����� �̸�, ����, �Ի����� ��ȸ�ϼ���
 */
 SELECT
    ename, job, hiredate  
 FROM
    emp
 WHERE
    ename = 'SMITH'
 ;
 /*
        2. ������ MANAGER�� ����� �̸�, ����, �޿��� ��ȸ�ϼ���
 */
 SELECT
    ename, job, sal
FROM
    emp
WHERE
    job = 'MANAGER'
 ;
 /*
        3. �޿��� 1500�� �Ѵ� ������� ����̸�, ����, �޿��� ��ȸ�ϼ���
 */
 SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal > 1500
;
 /*
        4. ����̸��� 'S' ������ ���ڷ� �����ϴ� ������� �̸�, ����, �޿��� ��ȸ�ϼ���
 */
SELECT
    ename, job, sal
FROM
    emp
WHERE
    ename >= 'S'
;

/*
        5. �Ի����� '81/08'������ �Ի��� ������� ����̸�
*/
SELECT
    ename, hiredate, sal
FROM
    emp
WHERE
    hiredate < '81/08/01'
;
/*
        6. �μ���ȣ�� 10 �Ǵ� 30�� ������� ����̸� ���� �μ���ȣ
*/
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    deptno = 10 or deptno = 30
;

-- �μ���ȣ 10�� �ƴ� ����̸� ���� �μ���ȣ
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    not deptno = 10
--  deptno <> 10
--  deptno != 10
;

-- �޿� 1000 ~ 3000 �� ������� ����̸� ���� �޿��� ��ȸ�ϼ���
SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal >= 1000 and sal <= 3000
;
-- ���� MANAGER�̸鼭 �޿��� 1000 �̻��� ����� �̸� ���� �Ի��� �޿� ��ȸ
SELECT
    ename, job, hiredate, sal
FROM
    emp
WHERE
    job = 'MANAGER' and sal >= 1000
;

/*
        ���� ������
            �ʵ� Between A and B
                A�� B���� �����͵�
            �ʵ� IN(A, B, C)
                �����Ͱ� �־��� �����͵� �� �ϳ����� Ȯ��
            �ʵ� LIKE '���ϵ�ī��'
                ���ڿ� �����ִ� ������(���ڿ����� ���)
                _ : �Ѱ� �� �� ���ڸ��� ���ϵ�ī��� �����ϴ� ��
                % : ���ڼ��� ������� ��� ���ڸ� �����ϴ� ���ϵ� ī��
                'M%' - 'M'���� �����ϴ� ��� ���ڿ�

        ��ȸ�Ǵ� �÷��� ��Ī�� �ο��ؼ� ��ȸ�� �� �ִ�.
            ���� 
                Į���̸�        ��Ī
                Į���̸�        AS ��Ī
                Į���̸�        "�� Ī"
                Į���̸�        AS "�� Ī"
            ������ ���Ե� ��Ī�� ��쿡�� " "�� ����Ѵ�.
                SELECT ename "��� �̸�", job AS "�� ��"
                FROM emp
                WHERE "��� �̸�" = 'SMITH';
*/

-- ������ MANAGER, SALESMAN�� �ƴ� ����̸� ���� �޿�
SELECT
    ename, job, sal
FROM
    emp
WHERE
    job Not in('MANAGER', 'SALESMAN') 
;

-- �̸��� �ټ������� ����̸� ����
SELECT
    ename, job
FROM
    emp
WHERE
    ename like '_____'
;
-- �Ի��� 1���� ����� �̸�, �Ի���
SELECT
    ename, hiredate
FROM
    emp
WHERE
    hiredate like  '__/01/__'
;

-----------------------------------------------------
-- �μ���ȣ 10�� �̸� ���� �Ի��� �μ���ȣ
SELECT ename, job, hiredate, deptno
FROM emp
WHERE  deptno = 10
;
-- ������ SALESMAN�� �̸� ���� �޿�
SELECT ename �̸�, job ����, sal �޿�
FROM emp
WHERE job = 'SALESMAN'
;
-- �޿��� 1000���� ���� �̸�, ����, �޿�
SELECT ename, job, sal
FROM emp
WHERE sal < 1000
;
-- ����̸� 'M' ������ ���� ����̸� ���� �޿�
SELECT ename, job, sal
FROM emp
WHERE ename <= 'M'
;
-- �Ի����� 1981 9 8���� �̸� ���� �Ի���
SELECT  ename, job, hiredate
FROM emp
WHERE hiredate = '81/09/08'
;
-- 'M'���� ���� + �޿� 1000�̻� �̸� �޿� ����
SELECT  ename, sal, job
FROM emp
WHERE ename >= 'M' and sal >= 1000
;
-- ���� 'MANAGER' �޿� 1000�ʰ� �μ���ȣ 10�� �̸� ���� �޿� �μ���ȣ
SELECT ename, job, sal, deptno
FROM emp
WHERE job = 'MANAGER' and sal > 1000
;
-- ���� 'MANAGER' ���� �̸� ���� �Ի��� + NOT ���
SELECT ename, job, hiredate
FROM emp
WHERE  not job = 'MANAGER'
;
-- �̸� 'C'���� ũ�� 'M'����(���Ե�) �̸� ���� �޿� BETWEEN���
SELECT ename, job, sal
FROM emp
WHERE ename Between 'C' and 'M'
;
-- �޿� 800, 950 �ƴ� �̸� ���� �޿� IN���
SELECT ename job, sal
FROM emp
WHERE sal not in(800, 950)
;
--  'S'���� �ټ����� �̸� ���� �޿�
SELECT ename, job, sal
FROM emp
WHERE ename like 'S____'
;
-- �Ի��� 3���� ����� �̸� ���� �Ի��� ��ȸ
SELECT ename, job, hiredate
FROM emp
WHERE hiredate like '%03'
;
-- ���ڼ� 4���ڳ� 5������ ��� �̸� ���� ��ȸ
SELECT  ename, job
FROM emp
WHERE   ename like '____' or  ename like '_____'
;
-- �Ի�⵵ 81, 82�� �̸� �޿� �Ի���
SELECT ename, sal, hiredate
FROM emp
WHERE hiredate like '81%' or hiredate like '82%'
;
-- 'S'������ ��� �̸� �޿� Ŀ�̼� ��ȸSELECT
SELECT ename, sal, comm
FROM emp
WHERE ename like '%S'
;