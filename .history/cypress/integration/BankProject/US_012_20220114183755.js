import US_012 from '../pageObjectRespository/US_012'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
  import US_010 from '../pageObjectRespository/US_010'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
describe ('Manage Customers islemleri' ,()=> {

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
    it('US12-T02 Wiev özelliklerini görebilme', function(){
      const page = new US_012 
 
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
  const page = new US_012 
//cy.reload()
  cy.LoginEmployee()
  page.getMyOperations().click()
  cy.wait(4000)
  page.getManageCustomers().click({ multiple: true })
  page.getEditButton().click()
  cy.viewport(1500, 1500)
  page.getCreateEditHeader().scrollIntoView().should('include.text','edit')
  
})
it('US12-T03 Edit özelliklerine gecme', function(){
 
 const page = new US_012 ,
 const page = new US_010
   
  p
  
})
})