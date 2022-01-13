Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  })
  describe("", () => {
    it.skip("pozititiveLogin", () => {
      cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('Team69Admin')
      cy.get('#password').type('Team69+')
      cy.get('.btn-primary > span').click()
      cy.url().should('include', 'gmibank')
      cy.get('#account-menu > .dropdown-toggle > span').should('have.text','Admin69 Team')
    });

    it("negative", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click()
        cy.get('#login-item').click()
        cy.get('#username').type('Team69Admin')
        cy.get('#password').type('Team69')
        cy.get('.btn-primary > span').click()
        cy.get('strong').should('include.text','Failed to sign in!')
      });
  
      it.skip("cansel", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click()
        cy.get('#login-item').click()
        cy.get('#username').type('Team69Admin')
        cy.get('#password').type('Team69+')
        cy.get('.btn-secondary > span').click
        cy.url().should('include', 'gmibank')
      });
    });
