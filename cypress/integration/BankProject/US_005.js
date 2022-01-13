
describe("Geçersiz kullanici bilgileriyle sisteme login olunamamalidir.", () => {
    it("US005", () => {
      cy.visit("https://www.gmibank.com/")

      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
    })
  })
  

  
