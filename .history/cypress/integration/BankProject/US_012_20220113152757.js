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
     page.getfirstnamehead().should('')

     cy.get('[href="/tp-customer"] > span').click()
     cy.get('tr > :nth-child(2) > span').should('is.')
     page.getThisFieldIsRequired().should('be.visible')
    })
})