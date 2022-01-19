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

       it('US12-T01 tüm kullanıcı bilgilrini ', function(){
     const page = new US_012 

     cy.LoginEmployee()
     cy.get('#entity-menu > .dropdown-toggle > span').click()
    })
})