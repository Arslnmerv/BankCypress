// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })
Cypress.Commands.add('LoginAdmin',()=> {
    cy.visit("https://www.gmibank.com/")
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('team68Admin')
      cy.get('#password').type('Team68+')
      cy.get('.btn-primary').click()
})
Cypress.Commands.add('LoginEmployee',()=> {
    cy.visit("https://www.gmibank.com/")
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.wait(1000)
      cy.get('#username').type('employee32')
      cy.wait(1000)
      cy.get('#password').type('team32team32-')
      cy.wait(1000)
      cy.get('.btn-primary').click()
})

Cypress.Commands.add('CreateANewCustomer',()=> {
  cy.get('#entity-menu > .dropdown-toggle').click()
         cy.get('[href="/tp-customer"] > span').click()
         cy.get('#jh-create-entity > span').click()
})



Cypress.Commands.add('LoginCustomer',()=> {
  cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('omeraslan')
      cy.get('#password').type('221626ebe.')
      cy.get('.btn-primary').click();
})

Cypress.Commands.add('LoginCustomer2',()=> {
  cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('Tester')
      cy.get('#password').type('AliVeli+1')
      cy.get('.btn-primary').click();

})
import 'cypress-file-upload'