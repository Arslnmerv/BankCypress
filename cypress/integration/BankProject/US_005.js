
describe("Geçersiz kullanici bilgileriyle sisteme login olunamamalidir.", () => {
    it("Kullanici, hata mesaji ile geçersizliği doğrulanan kullanici adiyla giriş yapamaz.", () => {
      cy.visit("https://www.gmibank.com/")

      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('TeamCrazy')
      cy.get('#password').type('Team69+')
      cy.get('.btn-primary > span').click()
      cy.get('strong').should('include.text','Failed to sign in!')
    })
    it("Kullanici, hata mesaji ile geçersizliği doğrulanan şifreyle giriş yapamaz.", () => {
      cy.visit("https://www.gmibank.com/")

      cy.get('#account-menu > .dropdown-toggle').click()
      cy.get('#login-item').click()
      cy.get('#username').type('Team69+')
      cy.get('#password').type('SifreYanlisNereyeGidiyon')
      cy.get('.btn-primary > span').click()
      cy.get('strong').should('include.text','Failed to sign in!')
  })
  it("Kullanici, hata mesaji ile geçersizliği doğrulanan kullanici adi ve şifreyle giriş yapamaz.", () => {
    cy.visit("https://www.gmibank.com/")

    cy.get('#account-menu > .dropdown-toggle').click()
    cy.get('#login-item').click()
    cy.get('#username').type('BuSeferUserNamedeYanlis')
    cy.get('#password').type('Sifreyibirkerededogruyaz')
    cy.get('.btn-primary > span').click()
    cy.get('strong').should('include.text','Failed to sign in!')
})
it("Henüz kaydolmadiysa, kullaniciya kayit sayfasina gitme seçeneği verilmelidir.", () => {
  cy.visit("https://www.gmibank.com/")
  cy.get('#account-menu > .dropdown-toggle').click()
  cy.get('[href="/account/register"] > span').click()
  
})
})
  

  
