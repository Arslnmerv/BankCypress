Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });
  describe("password", () => {
    it("passwordStrength", () => {
      cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click();
      cy.get('[href="/account/register"] > span').click();
      cy.get('#firstPassword').click().type('aba.90bAbba').then(()=>{
  cy.get('#strengthBar > :nth-child(2)').should('have.css', 'background-color', 'rgb(0, 255, 0)')
      });
      cy.get('#firstPassword').clear();
       
       
      cy.get('#firstPassword').click().type('aba.90bbba').then(()=>{
      cy.get('#strengthBar > :nth-child(2)').should('have.css', 'background-color', 'rgb(255, 255, 0)')
          });
           
       cy.get('#firstPassword').clear();
       
      cy.get('#firstPassword').click().type('aba90bbba').then(()=>{
      cy.get('#strengthBar > :nth-child(2)').should('have.css', 'background-color', 'rgb(255, 153, 0)')
           });
         cy.get('#firstPassword').clear();
        
       
      cy.get('#firstPassword').click().type('bnbbba').then(()=>{
      cy.get('#strengthBar > :nth-child(1)').should('have.css', 'background-color', 'rgb(255, 0, 0)')
                     });
  });
  })
 
   
  