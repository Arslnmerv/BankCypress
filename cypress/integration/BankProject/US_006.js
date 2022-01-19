it.only("Kullanıcı giriş", function() {

    cy.visit("https://www.gmibank.com/login")
    
    cy.get('#username').type('Team69Admin')        
    cy.get('#password').type('Team69+')
    cy.get('.btn-primary').click()
    cy.get('#account-menu > .dropdown-toggle > span').click()
    cy.get('[href="/account/settings"] > span').click()
    cy.wait(2000)
    

    cy.get('.btn').click()
    cy.get('.btn').should('be.visible','Save')
    
    cy.get('#account-menu > .dropdown-toggle > span').click()
    cy.get('[href="/logout"] > span').click()
  

 
});
