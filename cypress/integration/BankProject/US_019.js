/// <reference types="cypress" />

import gmiBankPom from "../pageObjectRespository/gmiBankPom";
import US_019 from "../PageObjectRespository/US_019";

Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});

const gmi = new gmiBankPom();
const us_019 = new US_019();

describe("Sistem, Adminin yeni bir banka hesabi olusturmasina izin vermelidir.", () => {
  beforeEach(() => {
    cy.LoginEmployee();

    us_019.pageLanguageEn();

    gmi.getMyOperations().click();

    us_019.manageAccount().click();

    us_019.createANewAccountButton().click();
  });

  it("Employee yeni hesap için bir açıklama oluşturmalıdır. Ve bu kısım boş bırakılamamalıdır.", () => {
    us_019.descriptionTextBox().click();
    us_019.balanceTextBox().click();
    us_019.descriptionErrorMessage().should("be.visible");

    us_019.descriptionTextBox().type("Cypress");
    us_019.balanceErrorMessage().should("be.visible");

    us_019.balanceTextBox().type(12500);

    us_019.saveButton().click();

    us_019.signOut();
  });

  it("Employee, ilk kez hesap oluşturmak için Dolar olarak bir bakiye sağlamalıdır.", () => {
    us_019.descriptionTextBox().type("Cypress1");
    us_019.balanceTextBox().type("100$");

    us_019.descriptionTextBox().click();

    cy.screenshot();

    us_019.signOut();
  });

  it("Employee CHECKING, SAVING, CREDIT_CARD veya INVESTING olarak bir hesap türü seçebilir.", () => {
    us_019.descriptionTextBox().type("Cypress1");

    us_019.balanceTextBox().type(11111);

    us_019
      .accountTypeDropDown()
      .select("CHECKING")
      .should("have.value", "CHECKING");
    us_019
      .accountTypeDropDown()
      .select("SAVING")
      .should("have.value", "SAVING");
    us_019
      .accountTypeDropDown()
      .select("CREDIT_CARD")
      .should("have.value", "CREDIT_CARD");
    us_019
      .accountTypeDropDown()
      .select("INVESTING")
      .should("have.value", "INVESTING");

    us_019.saveButton().click();

    us_019.signOut();
  });

  it("Hesap durumu AKTİF(ACTIVE), ASKIYA ALINDI(SUSPENDED) veya KAPALI(CLOSED) olarak tanımlanmalıdır.", () => {
    us_019.descriptionTextBox().type("Cypress2");

    us_019.balanceTextBox().type(22222);

    us_019
      .accountStatusTypeDropDown()
      .select("ACTIVE")
      .should("have.value", "ACTIVE");
    us_019
      .accountStatusTypeDropDown()
      .select("SUESPENDED")
      .should("have.value", "SUESPENDED");
    us_019
      .accountStatusTypeDropDown()
      .select("CLOSED")
      .should("have.value", "CLOSED");
    
    us_019.signOut();  
  });

  it("Employee acilir menüden bir calisan secebilir / Istege bagli.", () => {
    us_019
      .employeeDropdown()
      .select("")
      .should("have.value", "", "SECILEBILIR VALUE YOK");

    cy.viewport(1000, 550);
    cy.screenshot();

    us_019.signOut();   
  });
});
