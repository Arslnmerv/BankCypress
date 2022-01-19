Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  })
  describe("Sistem gecersiz karakterlerle kayit yapilmasina izin vermez", () => {
    it.skip("ssn", () => {
        cy.visit("https://www.gmibank.com/account/register");
        cy.get('#ssn').type('merve_')
        cy.wait(3000)
        cy.get('#firstname').click()
       
        cy.get('#ssn').should('have.attr', 'value')
        //ssn '-' karakteri haric baska ozel karakterler kabul etmemeli 
      
    })  
    it.skip("phone", () => {
      cy.visit("https://www.gmibank.com/account/register");
      cy.get('#mobilephone').type('555.555.5555')
      cy.wait(3000)
      cy.get('#username').click()
     
      //number '-' karakteri haric baska ozel karakterler kabul etmemeli
    
  })  
  it.skip("email", () => {
    cy.visit("https://www.gmibank.com/account/register");
    cy.get('#email').type('merve#hotmail,com')
    cy.wait(3000)
    cy.get('#firstPassword').click()
    cy.get(':nth-child(7) > .invalid-feedback').should('have.text','Your email is invalid.')
   
  
    //email '@' ve '.' karakteri haric baska ozel karakterler kabul etmemeli 
  
})  
  })
