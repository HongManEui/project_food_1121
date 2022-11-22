![image](https://user-images.githubusercontent.com/487999/79708354-29074a80-82fa-11ea-80df-0db3962fb453.png)

Level 2 실습 예제

![Inked1_LI](https://user-images.githubusercontent.com/30682608/202982589-33b9a037-fe64-4ce7-b3f3-4e9f9d5355fa.jpg)

1. 고객이 메뉴를 선택하여 주문한다.
2. 고객이 선택한 메뉴에 대해 결제한다.
3. 주문이 되면 주문 내역이 입점상점주인에게 전달된다.
4. 상점주는 주문을 수락하거나 거절할 수 있다.
5. 상점주는 요리시작때와 완료 지점에 시스템에 상태를 입력한다.
6. 고객은 아직 요리가 시작되지 않은 주문은 취소할 수 있다.
7. 요리가 완료되면 고객의 지역 인근의 라이더들에 의해 배송건 조회가 가능하다.
8. 라이더가 해당 요리를 pick 한 후, pick했다고 앱을 통해 통보한다.
9. 고객이 주문 상태를 중간중간 조회한다.
10. 주문상태가 바뀔때 마다 카톡으로 알림을 보낸다.
11. 고객이 요리를 배달 받으면 배송 확인 버튼을 탭하여, 모든 거래가 완료된다.




[체크포인트]

1. Saga(Pub/Sub)
: Pub/Sub에 해당하는 front에서 음식 주문을 하고 fooddelivery에서 받는 것을 확인한다.

<Pub>
  
![image](https://user-images.githubusercontent.com/30682608/203202517-288328e8-431c-4b42-a9d5-c0e13d979c8f.png)

  
<Sub>
  
![10](https://user-images.githubusercontent.com/30682608/203202829-f6f1e8f4-b164-4956-b21d-8e3c988895a2.png)



2. CQRS
  : 

![11](https://user-images.githubusercontent.com/30682608/203207076-391cab54-7dac-461e-8052-15f9b0fea568.png)

![13](https://user-images.githubusercontent.com/30682608/203217081-53df9cc9-95a9-4367-a8eb-6afb269414fa.png)


3. Compensation / Correlation
  : OrderCancel의 Compensation에 해당하는 PayCancel에 대한 Correlation 확인
  
![14](https://user-images.githubusercontent.com/30682608/203219178-a5af969a-a871-4e90-980c-2e636def8ace.png)

![15](https://user-images.githubusercontent.com/30682608/203219657-9ea9703f-d64e-4365-9d4d-713cbf56a443.png)
  
  
4. Request / Response
  : 소스 내 각 케이스 확인
  
<동기호출>

![6](https://user-images.githubusercontent.com/30682608/203193373-7d08b0c5-6b86-495f-95c5-cddf2d191614.png)

<비동기호출>

![7](https://user-images.githubusercontent.com/30682608/203193409-9eca371c-8d27-4fa6-8fab-c59163c2bb5e.png)

  
5. Circuit Breaker
  : Circuit Breaker를 설정, Circuit Breaker 전후로 부하를 준 뒤 확인 

![18](https://user-images.githubusercontent.com/30682608/203220712-017f5205-704a-4bab-b3b4-20359bfef950.png)

![19](https://user-images.githubusercontent.com/30682608/203221863-db61f9da-c44b-434e-aab4-fc5347caf6fd.png)

![20](https://user-images.githubusercontent.com/30682608/203236042-c8fbe295-acd7-420c-8fd8-d04b48431ad8.png)

![21](https://user-images.githubusercontent.com/30682608/203236306-d54dd8e4-8586-43c4-9130-00884d9b5e7b.png)
  
  
6. Gateway / Breaker 
  : 기본 설정을 확인한다.
  
![16](https://user-images.githubusercontent.com/30682608/203220054-1c4615cc-9cc1-48d1-97b5-86fffa314958.png)

![17](https://user-images.githubusercontent.com/30682608/203220322-be52e77c-3ef6-475b-ac7a-bec4e41ac234.png)

![22](https://user-images.githubusercontent.com/30682608/203240459-cebfadf7-6baf-435c-ba8e-ca55251258cd.png)
