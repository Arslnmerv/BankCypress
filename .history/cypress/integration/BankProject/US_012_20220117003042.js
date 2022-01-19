import US_012 from '../pageObjectRespository/US_012'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
  
describe ('Manage Customers islemleri' ,function() {
 
  before(function(){
    cy.fixture("us12").then(function(data){
        this.data = data
    })
})
 const page = new US_012 
       it('US12-T01 tüm kullanıcı bilgilrini görebilme', function(){
    

     cy.LoginEmployee()
     page.getMyOperations().click()
     page.getManageCustomers().click()
     page.getFirstNameHead().should('be.visible')
     page.getLastNameHead().should('be.visible')
     page.getEmailHead().should('be.visible')
     page.getMobilNumberHead().should('be.visible')
     page.getAddressHead().should('be.visible')
     page.getCreatedDateHead().should('be.visible')
     page.getFirstUserName().should('be.visible')
     page.getFirstUserName().should('include.text', 'william')
          console.log(page.getFirstUserName)
     
    })
    it('US12-T02 Wiev özelliklerini görebilme', function(){
 
      page.getMyOperations().click()
      page.getManageCustomers().click()
      page.getViewButton().click()
      page.getEditInView().click()
      cy.viewport(1500, 1500)
      page.getCreateEditHeader().scrollIntoView().should('include.text','edit')
      page.getAccountMenu().click()
      page.getLogout().click()
})
it('US12-T03 Edit özelliklerine gecme', function(){
//cy.reload()
  cy.LoginEmployee()
  page.getMyOperations().click()
  cy.wait(4000)
  page.getManageCustomers().click({ multiple: true })
  page.getEditButton().click()
  cy.viewport(1500, 1500)
  page.getCreateEditHeader().scrollIntoView().should('include.text','edit')
  
})


it('US12-T04 Edit featuresları kullanma', function(){
 
 page.getFirstName().clear()
 page.getFirstName().type('ozgur')

 page.getLastName().clear()
 page.getLastName().type('kus')
   
  page.getMiddleInitial().type('')
  page.getEmail().type()

  
})
})