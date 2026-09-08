Circular Dependency During application startup:
-----------------------------------------------
![img.png](src/main/resources/static/images/img.png)

Response After adding @Lazy to remove circular dependency
![img_1.png](src/main/resources/static/images/img_1.png)
Beans details from Actuator UI:
![img_2.png](src/main/resources/static/images/img_2.png)
![img_3.png](src/main/resources/static/images/img_3.png)

Response After Refactoring code inorder to remove circular dependency:
(seprate orderStatus service for removing CD)
![img_4.png](src/main/resources/static/images/img_4.png)

Now we can see in actuator UI OrderService depends on paymentService and paymentService depends on OrderStatusService, which gives idea CD has been resolved.
![img_5.png](src/main/resources/static/images/img_5.png)
![img_6.png](src/main/resources/static/images/img_6.png)
