class US_010 {

    getFirstName() {
         return cy.get('#tp-customer-firstName')cy.get('#tp-customer-firstName')
    }
    getLastName() { 
        return cy.get('#tp-customer-lastName')
    }
    getMiddleInitial() {
        return cy.get('#tp-customer-middleInitial')
    }
    getEmail() {
        return cy.get('#tp-customer-email')
    }
    getMobileNumber() {
        return cy.get('#tp-customer-mobilePhoneNumber')
    }
    getPhoneNumber() {
        return cy.get('#tp-customer-phoneNumber')
    }
    getZipCode() {
        return cy.get('#tp-customer-zipCode')
    }
    getSsn() {
        return cy.get('#tp-customer-ssn')
    }
    getAddressTextBox(){
        return cy.get('#tp-customer-address')
    }
    getThisFieldIsRequired(){
        return cy.get('.invalid-feedback')
    }
    getSaveButton() {
        return cy.get('#save-entity')
    }
    getCity() {
        return cy.get('#tp-customer-city')
    }
    getState() {
        return cy.get('#tp-customer-state')
    }
    getCountry() {
        return cy.get('#tp-customer-country')
    }
}
export default US_010
