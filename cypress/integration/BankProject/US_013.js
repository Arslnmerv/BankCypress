import US_013 from '../pageObjectRespository/US_013'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
  
describe ('Bir Müşteri yeni bir banka hesabi(Account) oluşturabilir.' ,function() {
 
  before(function(){
    cy.fixture("us13").then(function(data){
    
    })
})
 const page = new US_013
       it('US13-T01 Kullanici yeni hesap için bir açiklama girmelidir. Bu kisim boş birakilamaz.', function(){
    

     cy.LoginCustomer2()
     page.getMyOperations().click()
     page.getManageAccounts().click()
     page.getcreateAccount().click()
     page.getDescription().type('kevgir')
    })
    it('US13-T02 Kullanici, ilk kez hesap oluşturmak için Dolar olarak bir bakiye sağlamalidir.', function(){
        
        
        page.getBalance().type(1000)
    })
    it('Kullanici CHECKING, SAVING, CREDIT_CARD veya INVESTING olarak bir hesap türü seçebilir.', function(){
        
        page.getAccountType().select(1)
    })
    it('Hesap durumu AKTİF(ACTIVE), ASKIYA ALINDI(SUSPENDED) veya KAPALI(CLOSED) olarak tanimlanmalidir.', function(){
    page.getAccountState().select(2)

})
it('Kullanici açilir menüden bir çalişan seçebilir / İsteğe bağli.', function(){
    page.getEmployee().select(0)
})
})