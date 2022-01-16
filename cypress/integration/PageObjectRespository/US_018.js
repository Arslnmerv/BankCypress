class US_018 {
  adreseGit() {
    return cy.visit("https://www.gmibank.com/");
  }
  loginButonu() {
    return cy.get("#account-menu > .dropdown-toggle");
  }
  myOperation() {
    return cy.get("#entity-menu > .dropdown-toggle");
  }
  manageCustomer() {
    return cy.get('[href="/tp-customer"]');
  }
  administration() {
    return cy.get("#admin-menu > .dropdown-toggle");
  }
  userManagement() {
    return cy.get('[href="/admin/user-management"] > span');
  }
  view() {
    return cy.get("#abidin > .text-right > .btn-group > .btn-info");
  }
  firstName() {
    return cy.get(".jh-entity-details > :nth-child(3) > span");
  }
  backButonu() {
    return cy.get(".btn");
  }
  userManegement2() {
    return cy.get(".dropdown-menu > .active");
  }
  editButonu() {
    return cy.get("#abidin > .text-right > .btn-group > .btn-primary");
  }
  adminButonu() {
    return cy.get("#account-menu > .dropdown-toggle");
  }
  signOut() {
    return cy.get('[href="/logout"]');
  }
  loginTextBox() {
    return cy.get("#login");
  }
  saveButonu() {
    return cy.get(".btn-primary");
  }
  kaydedildiUyarisi() {
    return cy.get(".Toastify__toast");
  }
  deleteButonu() {
    return cy.get("#abidin > .text-right > .btn-group > .btn-danger");
  }
  silinecekUyarisi() {
    return cy.get(".modal-body");
  }
  cancelButonu() {
    return cy.get(".btn-secondary");
  }
}
export default US_018;
