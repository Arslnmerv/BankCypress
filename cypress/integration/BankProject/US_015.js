import 'cypress-iframe';
import US_015 from '../pageObjectRespository/US_015'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
describe ('Sistem, kullanicinin kendi hesabini yönetmesine izin vermelidir.' ,()=> {

       it('US15-T01', function(){
     const page = new US_015

     cy.LoginEmployee()
     page.getMyOperations().click()
     page.getManageAccount().click()
   
    
     //Kullanıcı tüm hesap türlerini ve o hesaplardaki bakiyeyi görmelidir
     cy.viewport(2500 ,1500)
     page.getActive().should('be.visible')
     page.getChecking().should('be.visible')
     page.getCreditCard().should('be.visible')    
     page.getInvesting().should('be.visible')
     page.getSaving().should('be.visible')
     page.getSuespended().should('be.visible')

     //Kullanıcı, hesap işlemlerini görüntüleyebilmelidir.
     page.view().click()
     page.accountHeader().should('be.visible')
     page.backFromViewPage().click()
     page.edit().click()
     page.descriptionInEditPage().should('be.visible')
     page.backFromEditPage().click()
     page.delete().click()
     cy.wait(20000)
     page.confirmDelete().should('be.visible')


   })
   
})