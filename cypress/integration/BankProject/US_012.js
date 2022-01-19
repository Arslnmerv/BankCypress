import US_012 from '../pageObjectRespository/US_012'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
  
describe ('Manage Customers islemleri' ,()=> {
 
  before(function () {
    cy.fixture('oner').then(function (data) {
      this.data = data;
    })

});
 const page = new US_012 
       it('US12-T01 tüm kullanici bilgilrini görebilme',()=>{
    

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
    it('US12-T02 Wiev özelliklerini görebilme', ()=>{
 
      page.getMyOperations().click()
      page.getManageCustomers().click()
      page.getViewButton().click()
      page.getEditInView().click()
      cy.viewport(1500, 1500)
      page.getCreateEditHeader().scrollIntoView().should('include.text','edit')
      page.getAccountMenu().click()
      page.getLogout().click()
})
it('US12-T03 Edit özelliklerine gecme', ()=>{
//cy.reload()
  cy.LoginEmployee()
  page.getMyOperations().click()
  cy.wait(2000)
  page.getManageCustomers().click({ multiple: true })
  page.getEditButton().click()
  cy.viewport(1500, 1500)
  page.getCreateEditHeader().scrollIntoView().should('include.text','edit')
  
})


it('US12-T04 Edit featureslari kullanma', ()=>{
 
 page.getFirstName().clear().type('william')
 page.getLastName().clear().type('kus')
 page.getMiddleInitial().clear().type('akf')
 page.getEmail().clear().type('ozgur@gmail.com')
page.getMobileNumber().clear().type('123-456-7890')
   page.getZipCode().clear().type('07100')
   page.getAddressTextBox().clear().type('konyaalti')
   page.getCity().clear().type('antalya')
   page.getSsn().clear().type('123-22-5555')
   cy.wait(2000)
   page.getSaveButton().click()
   page.getFirstUserName().should('include.text', 'william')
  })
  it('US12-T05 Delete featureslari kullanma', ()=>{
 
    page.getMyOperations().click()
    cy.wait(2000)
    page.getManageCustomers().click({ multiple: true })
    page.getDeleteButton().click()
    page.getConfirmDeletion().should('be.visible')
    page.getDeleteLast().click()
    page.getInternalServerError().should('be.visible')
    cy.wait(4000)
    page.getClosePopup().click()
    page.getAccountMenu().click()
    page.getLogout().click()
     })
})

