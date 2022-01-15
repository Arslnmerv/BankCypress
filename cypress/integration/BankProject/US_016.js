import gmiBankPom from "../PageObjectRespository/gmiBankPom";
Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});
describe("Us 16", () => {
  const gmibankpom = new gmiBankPom();
  it("kullanicini en az iki hesabi olma", () => {
    cy.LoginCustomer();
    gmibankpom.getMyOperations().click();
    gmibankpom.getTransferMoney().click();
    var arr = [];
    arr.push(gmibankpom.getAccountFrom().select(1));
    arr.push(gmibankpom.getAccountFrom().select(2));
    assert.equal(arr.length, 2);
  });
  it('para transferi',()=> {
      gmibankpom.getAccountFrom().select(1)
      gmibankpom.getAccountTo().select(1)
      gmibankpom.getBalanceFrom().type(500)
      gmibankpom.getDescription().type('loan')
      gmibankpom.getMakeTransferButton().click()
      gmibankpom.getText().should('be.visible')
      .and('have.text','Transfer is succesfull')
  })
});
















