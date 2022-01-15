import US_012 from '../pageObjectRespository/US_012'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
describe ('Manage Customers işlemleri' ,()=> {

    before(function(){
    cy.fixture('creds').then(function(data){
        this.data = data
    })
})

       it('US12-T01 tüm kullanıcı bilgilrini görebilme', function(){
     const page = new US_012 

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
    it.skip('US12-T02 Wiev özelliklerini görebilme', function(){
      const page = new US_012 
 
      page.getMyOperations().click()
      page.getManageCustomers().click()
      page.getViewButton().click()
      page.getEditInView().click()
      cy.viewport(1000, 1000)
      cy.scrollTo('top')
      cy.wait(1000)
      page.getEditCustomerHeader().should('be.visible')
})
it('US12-T03 Edit özelliklerine gecme', function(){
  const page = new US_012 

  page.getMyOperations().click()
  page.getManageCustomers().click()
  page.getEditButton.click()
  cy.viewport(1000, 1000)
  
  
})
})