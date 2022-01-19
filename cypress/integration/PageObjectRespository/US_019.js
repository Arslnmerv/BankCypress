class US_019 {
  pageLanguageEn() {
    cy.get(":nth-child(1) > .dropdown-toggle").click();
    cy.get('[value="en"]').click();
  }

  manageAccount() {
    return cy.get('[href="/tp-account"]');
  }

  createANewAccountButton() {
    return cy.get("#jh-create-entity");
  }

  descriptionTextBox() {
    return cy.get("#tp-account-description");
  }

  descriptionErrorMessage() {
    return cy.get(":nth-child(1) > .text-danger > .invalid-feedback");
  }

  balanceTextBox() {
    return cy.get("#tp-account-balance");
  }

  balanceErrorMessage() {
    return cy.get(":nth-child(2) > .text-danger > .invalid-feedback");
  }

  saveButton() {
    return cy.get("#save-entity");
  }

  signOut() {
    cy.get("#account-menu > .dropdown-toggle").click();
    cy.get('[href="/logout"]').click();
  }

  accountTypeDropDown() {
    return cy.get("#tp-account-accountType");
  }

  accountStatusTypeDropDown() {
    return cy.get("#tp-account-accountStatusType");
  }

  employeeDropdown() {
    return cy.get("#tp-account-employee");
  }
}
export default US_019;
