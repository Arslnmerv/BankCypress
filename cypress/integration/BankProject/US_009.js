import gmiBankPom from "../PageObjectRespository/gmiBankPom";
Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});
describe("Us 09", () => {
  const gmibankpom = new gmiBankPom();
  it("kisi sorgulama pozitif", () => {
    cy.LoginEmployee();
    gmibankpom.getMyOperations().click();
    gmibankpom.getManagementCustomer().click();
    gmibankpom.getCreateCustomer().click();
    gmibankpom.getSearchSSN().type("555-55-5555");
    gmibankpom.getSearchSSNButton().click();
    gmibankpom
      .getSearchSSNText()
      .should("be.visible")
      .and("include.text", "found[gmiBankBackendApp");
      cy.screenshot();
    gmibankpom.getLoginButonu().click();
    gmibankpom.getLogoutButton().click();
  });
  it("kisi sorgulama negatif", () => {
    cy.LoginEmployee();
    gmibankpom.getMyOperations().click();
    gmibankpom.getManagementCustomer().click();
    gmibankpom.getCreateCustomer().click();
    gmibankpom.getSearchSSN().type("955-55-5555");
    gmibankpom.getSearchSSNButton().click();
    gmibankpom
      .getSearchSSNText()
      .should("be.visible")
      .and("include.text", "error.ssn");
      cy.screenshot();
    gmibankpom.getLoginButonu().click();
    gmibankpom.getLogoutButton().click();
  });
});









