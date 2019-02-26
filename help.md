
Now we’ll create a set of cryptographic keys and store it in a keystore.

We can use the following command to generate our PKCS12 keystore format:


keytool -genkeypair -alias yerevan -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore yerevan.p12 -validity 36500


keytool -genkeypair -alias yerevan -keyalg RSA -keysize 2048 -keystore yerevan.jks -validity 36500

keytool -importkeystore -srckeystore yerevan.jks -destkeystore yerevan.p12 -deststoretype pkcs12

copy paste generated files to zuul/src/main/resources/keystore

zuul yml file updated in develop branch:


run all services in localhost:


https://localhost:8079/world/gateway/yerevan/api/v2/armenia


Want more???

dockerize it wihout me:)

