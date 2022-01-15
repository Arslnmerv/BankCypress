Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  })
  describe("", () => {
    it("", () => {
      cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('Team69Admin')
      cy.get('#password').type('Team69+')
      cy.get
    });
  });