import US_018 from "../pageObjectRespository/US_018";
import "cypress-file-upload";
Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});

describe("US 018 admin musteriyi yonetebilir", () => {
  before(function () {
    cy.fixture("us18").then(function (data) {
      this.data = data;
    });
  });
  const page = new US_018();
  it("admin musteri bilgilerini gorebilir", function () {
    cy.LoginAdmin();
    /*Kullanici bilgilerinin görünür durumda olmasi*/
    /*cy.visit("https://www.gmibank.com/");*/
    page.administration().click();
    page.userManagement().click();
    page.view().click();
    page.firstName().should("be.visible");
    /*page.backButonu().click();
    page.administration().click();
    page.userManegement2().click();
    page.editButonu().should("be.visible").click();*/
    page.adminButonu().click();
    page.signOut().click();
  });
  it("admin musteriyi guncelleyebilir", function () {
    /*Kullanicinin bilgilerinin güncellenebilmesi */
    cy.LoginAdmin();
    page.administration().click();
    page.userManagement().click();
    page.editButonu().click(); /*.should("be.visible");*/
    page.loginTextBox().clear().type("abidin");
    page.saveButonu().click();
    page.kaydedildiUyarisi().should("be.visible");
    page.adminButonu().click();
    page.signOut().click();
  });
  it("admin musteriyi silerken uyari alir", function () {
    /*Kullanici silinirken silinecek uyarisi*/
    cy.LoginAdmin();
    page.administration().click();
    page.userManagement().click();
    page.deleteButonu().click();
    page
      .silinecekUyarisi()
      .should("have.text", "Are you sure you want to delete user abidin?");
    page.cancelButonu().click();
    page.adminButonu().click();
    page.signOut().click();
  });
});
