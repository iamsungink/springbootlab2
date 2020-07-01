# markdowntest

# header

# 1 헤더 크기 (h1)
## 2 헤더 크기 (h2)
### 3 헤더 크기 (h3)
#### 4 헤더 크기 (h4)
##### 5 헤더 크기 (h5)
###### 6 헤더 크기 (h6)

# 목록

unordered
* item1
* item2
    * item2a
    * item2b

ordered
1. item1
1. item2
1. item3
    1. item 3a
    1. item 3b
    * item3c

# 문단
>문단을 구별하려면 한 개 이상의 빈 줄을 문단 사이에 삽입하거나, 줄의 마지막에 [space bar]를 두 번 이상 눌러 띄어쓰기를 하면 됩니다.

# 이미지

## 첫번째 방법
![샘플1](./images/sample.jpg)  
Format: ![이미지 alt명](url 링크)

## 두번째 방법
<a href="#"><img src="./images/sample.jpg" width="500px" alt="sample"></a>


# 하이퍼링크

[Github](http://github.com "깃허브")

# 코드블럭
>해당 프로그래밍 언어의 구문 표시를 적용한 코드를 볼 수 있습니다.

~~~javascript
function test(){
    console.log("hello world")
}
~~~

# 인용
As Grace Hopper said:

> I've always been more interested.  
> in the future than in the past.

# 강조

*This text will be italic*  
_This will also be italic_

**This text will be bold**  
__This will be bold__

*You **can** combine them*

# 테이블

First Header | Second Header
------------ | --------------
Content cell 1 | Content cell 2
Content column 1 | Content column 2

# 체크박스

- [ ] 운동 하기
- [x] 강의 듣기

# 인라인 코드

문단 중간에 `Code`를 넣을 수 있습니다.  
예를 들어 `printf("hello world!");` 이런 식으로 들어갑니다.

# 수평선

---

***

---

