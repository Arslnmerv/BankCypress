import US_010 from '../pageObjectRespository/US_010'
Cypress.on('uncaught:exception', (err, runnable) => {
    
    return false
  })
describe ('Müşteri adresi oluşturulabilmelidir.' ,()=> {

    before(function(){
    cy.fixture('creds').then(function(data){
        this.data = data
    })
})

       it('US10-T01', function(){
     const page = new US_010 

     cy.LoginEmployee()
     cy.CreateANewCustomer()

     page.getFirstName().type(this.data.firstname)
     page.getLastName().type(this.data.lastname)
     page.getMiddleInitial().type(this.data.middleInitial)
     page.getEmail().type(this.data.email)
     page.getMobileNumber().type(this.data.mobileNumber)
     page.getPhoneNumber().type(this.data.phoneNumber)
     page.getZipCode().type(this.data.zipCode)
     page.getSsn().type(this.data.Ssn)
    //  page.getCity().type(this.data.city)


    // Adres boş bırakılamamalıdır.
     page.getAddressTextBox().type(' ')
     page.getSaveButton().click()
     page.getThisFieldIsRequired().should('be.visible')

    // Adres, sokak ve numara olarak verilmeli 
     page.getAddressTextBox().type(this.data.validAddress)
     page.getAddressTextBox().should('have.class', 'av-valid')
    

    // Şehir boş bırakılamamalıdır.
    page.getCity().type(' ')
    page.getSaveButton().click()
    page.getThisFieldIsRequired().should('be.visible')

    //Şehir girilmeli
    page.getCity().type(this.data.city)
    page.getCity().should('have.class', 'av-valid')

    it.skip('UlkeTest', function() {

    // Ülke boş bırakılamamalıdır.
    page.getCountry().type(' ')
    page.getSaveButton().click()
    page.getThisFieldIsRequired().should('be.visible')
   })

     // Ülke girilmeli
     page.getCountry().select(10)
     page.getCity().should('have.class', 'av-valid')

     it.skip('EyaletTest', function() {
         
    // Eyalet boş bırakılamamalıdır.
    page.getState().type(' ')
    page.getSaveButton().click()
    page.getThisFieldIsRequired().should('be.visible')

    //Eyalet sadece USA eyaletleri olarak girilmelidir
    page.getState().type(this.data.invalidState)
    page.getState().should('have.class', 'av-invalid')
     })


   })
   
})