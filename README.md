# springboot-azure-keyvault-demo

Update key vault settings in application.properties

azure.keyvault.client-id={{service principal client id}}
  
azure.keyvault.client-key={{service principal secret key}}
  
azure.keyvault.enabled=true

azure.keyvault.tenant-id={{service principal tenant id}}
  
azure.keyvault.uri=https://{{keyvault name}}.vault.azure.net/


Reference: https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault
