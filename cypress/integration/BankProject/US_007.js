

// US_007_Sistem, geçersiz kimlik bilgileriyle güncelleme yapılmasına izin vermemelidir.


/*
 US_007_TC_001_E-posta adresi, "@" veya "." isaretleri olmadan yalnızca rakam veya karakter iceremez.

    Kullanici URL ye tiklayarak gmibank  sayfasina gider
    Kullanici menu sayfasinda person simgesine tiklar
    Kullanici person simgesinin altinda ki sign in sign in a tiklar
    Kullanici gecerli bir kullanici adi girer
    Kullanici gecerli bir sifre girer
    Kullanici oturum acmak icin sign in button una tiklar
    Kullanici Olusturdugu hesap menusune tiklar
    Kullanici Hesap menusunde user info iconuna tiklar
    Kullanici yeni geceersiz @ ve . isareti olmadan e-posta adresini girer
    Kullanici save basar
    Kullanici hata mesajini dogrular

*/

    
  describe("Sistem, geçersiz kimlik bilgileriyle güncelleme yapilmasina izin vermemelidir.", () => {
  it("US_007_TC01", () => {

    cy.visit("https://www.gmibank.com/")
    cy.get('#account-menu > .dropdown-toggle').click()
    cy.get('#login-item > span').click()
    cy.get('#username').type('cako5')
    cy.get('#password').type('123.456')
    cy.get('.btn-primary > span').click()
    cy.get('#account-menu > .dropdown-toggle > span').click()
    cy.get('[href="/account/settings"] > span').click()
    cy.get('#email').clear().type('huseyin')
    cy.get('.btn').click()
    cy.get('.invalid-feedback').should('have.text','This field is invalid')
    cy.get('#account-menu > .dropdown-toggle').contains('cako5 bes').click()
    cy.get('[href="/logout"] > span').click()
    

 /*
   @US_007_TC_002 İngilizce veya turkce disinda baska bir dil secenegi olmamalıdır.

   Kullanici URL ye tiklayarak gmibank  sayfasina gider
   Kullanici menu sayfasinda person simgesine tiklar
   Kullanici person simgesinin altinda ki sign in sign in a tiklar
   Kullanici gecerli bir kullanici adi girer
   Kullanici gecerli bir sifre girer
   Kullanici oturum acmak icin sign in button una tiklar
   Kullanici Olusturdugu hesap menusune tiklar
   Kullanici Hesap menusunde user info iconuna tiklar

    */ 

  })

  it("US_007_TC02_İngilizce veya turkce disinda baska bir dil secenegi olmamalidir.", () => {

    cy.visit("https://www.gmibank.com/")
    cy.get('#account-menu > .dropdown-toggle').click()
    cy.get('#login-item > span').click()
    cy.get('#username').type('cako5')
    cy.get('#password').type('123.456')
    cy.get('.btn-primary > span').click()
    cy.get('#account-menu > .dropdown-toggle > span').click()
    cy.get('[href="/account/settings"] > span').click()
    cy.get('#email').clear().type('huseyin@gmail.com')
    cy.get('#langKey').select('English').should('have.value', 'en')
    cy.get('#langKey').select('Türkçe').should('have.value', 'tr')
    cy.get('#account-menu > .dropdown-toggle').contains('cako5 bes').click()
    cy.get('[href="/logout"] > span').click()
    
    
    
    
   
    
   

   
   
    
    
    
    



  })

});



