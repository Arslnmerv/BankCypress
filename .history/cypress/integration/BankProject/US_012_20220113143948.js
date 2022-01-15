import US_012 from '../pageObjectRespository/US_012'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
describe ('Müşteri adresi oluşturulabilmelidir.' ,()=> {

    before(function(){
    cy.fixture('creds').then(function(data){
        this.data = data
    })
})

       it('US1-T01', function(){
     const page = new US_010 

     cy.LoginEmployee()