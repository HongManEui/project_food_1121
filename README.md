# 

## Model
www.msaez.io/#/storming/UbQxA2gspaWXrzc7FwXKZ7lDo1f2/bd3c13d771776490a68c195612dae8b2

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- shop
- deliveryFood
- customer


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/orders id="id" customerId="customerId" foodId="foodId" status="status" price="price" options="options" adress="adress" storeId="storeId" 
 http :8088/pays id="id" orderId="orderId" status="status" payOption="payOption" price="price" 
```
- shop
```
 http :8088/shops id="id" orderId="orderId" status="status" options="options" adress="adress" price="price" customerId="customerId" storeId="storeId" 
```
- deliveryFood
```
 http :8088/deliveries id="id" adress="adress" storeId="storeId" status="status" orderId="orderId" 
```
- customer
```
 http :8088/logs id="id" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

