Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  })
  describe("sistem adminin kullanicilari yonetmesine izin verir", () => {
    it("user management", () =>{
        cy.visit('https://gmibank.com/login');
        cy.get('#username').type('Team70Admin')
        cy.wait(2000)
        cy.get('#password').type('Team70+')
      
        cy.get('.btn-primary > span').click()
        cy.wait(2000)
        cy.get('#admin-menu > .dropdown-toggle').click()
        cy.wait(2000)
        cy.get('[href="/admin/user-management"] > span').click()
        cy.viewport(1600,   768)
        cy.wait(2000)
        cy.get('#michael > :nth-child(4) > .btn').click()//admin
        cy.get('#xxx > :nth-child(4) > .btn').click()//employee
        cy.get('#bireyselcalisma02 > :nth-child(4) > .btn').click()//user
        cy.get('#tom-ss > :nth-child(4) > .btn').click()//customer
        cy.get('#tom-ss > .text-right > .btn-group > .btn-info').click()//wiev
        cy.get('.btn').click()
        cy.get('#musterilerlogin > .text-right > .btn-group > .btn-primary').click()//edit
        cy.viewport(1600,   1200)
        cy.get('.btn-info').click()
        cy.get('#michael > .text-right > .btn-group > .btn-danger').click()//delete
        cy.get('.modal-title > span').should('have.text','Confirm delete operation')
        cy.get('.modal-footer > .btn-danger').click()
        
    })  
})