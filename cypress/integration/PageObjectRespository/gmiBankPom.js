class gmiBankPom {
    getBank() {
      return cy.visit("https://www.gmibank.com/");
    }
    getLoginButonu() {
      return cy.get("#account-menu > .dropdown-toggle");
    }
    getRegister() {
      return cy.get('[href="/account/register"]');
    }
    getSSN() {
      return cy.get("#ssn");
    }
    getFirstName() {
      return cy.get("#firstname");
    }
    getLastName() {
      return cy.get("#lastname");
    }
    getAddress() {
      return cy.get("#address");
    }
    getPhoneNumber() {
      return cy.get("#mobilephone");
    }
    getUsername() {
      return cy.get("#username");
    }
    getEmail() {
      return cy.get("#email");
    }
    getNewPassword() {
      return cy.get("#firstPassword");
    }
    getNewPasswordAgain() {
      return cy.get("#secondPassword");
    }
    getRegisterButton() {
      return cy.get("#register-submit");
    }
    getMyOperations() {
      return cy.get('#entity-menu > .dropdown-toggle')
    }
    getManagementCustomer() {
      return cy.get('[href="/tp-customer"]')
    }
    getCreateCustomer() {
      return cy.get('#jh-create-entity')
    }
    getSearchSSN() {
      return cy.get('#search-ssn')
    }
    getSearchSSNButton() {
      return cy.get('form.av-invalid > :nth-child(1) > .btn')
    }
    getSearchSSNText() {
      return cy.get('.Toastify__toast-body')
    }
    getLogoutButton() {
      return cy.get('[href="/logout"]')
    }
    getTransferMoney() {
      return cy.get('[href="/customer/tp-customer-accounts/transfer/120840"]')
    }
    getAccountFrom(){
      return cy.get('#fromAccountId')
    }
    getAccountTo(){
      return cy.get('#toAccountId')
    }
    getBalanceFrom(){
      return cy.get('#balance')
    }
    getDescription() {
      return cy.get('#description')
    }
    getMakeTransferButton() {
      return cy.get('#make-transfer')
    }
    getText() {
      return cy.get('.Toastify__toast-body')
    }
  }
  export default gmiBankPom;