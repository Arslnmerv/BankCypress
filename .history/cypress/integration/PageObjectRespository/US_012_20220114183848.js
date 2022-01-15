class US_012 {

   getMyOperations(){
       return cy.get('#entity-menu > .dropdown-toggle > span')
   }
   getManageCustomers(){
       return cy.get('[href="/tp-customer"] > span')
   }
   getFirstNameHead(){
       return cy.get('tr > :nth-child(2) > span')
   }
   getLastNameHead(){
       return cy.get('thead > tr > :nth-child(3)')
   }
   getMiddleNameHead(){
    return cy.get('tr > :nth-child(4) > span')
    }
    getEmailHead(){
    return cy.get('tr > :nth-child(5) > span')
    }
    getMobilNumberHead(){
    return cy.get('tr > :nth-child(6) > span')
    }
    getAddressHead(){
    return cy.get('tr > :nth-child(8) > span')
    }
    getCreatedDateHead(){
        return cy.get('thead > tr > :nth-child(9) > span')
        }
        getFirstUserName(){
            return cy.get('tbody > :nth-child(1) > :nth-child(2)')
        }
        getViewButton(){
            return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-info')
        }
        getEditInView(){
            return cy.get('.btn-primary')
        }
             getEditButton(){
            return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-primary')
        }
        getCreateEditHeader(){
            return cy.get('[id="gmibankfrontendApp.tPCustomer.home.createOrEditLabel"]')
        }
        getAccountMenu(){
            return cy.get('#account-menu > .dropdown-toggle')
        }
        getLogout(){
            return cy.get('[href="/logout"] > span')
        }
        getFirstName() {
            return cy.get('#tp-customer-firstName')
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
export default US_012