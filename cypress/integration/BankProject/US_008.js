import US_008 from "../PageObjectRespository/US_008";

Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});

describe("US_008", function ()  {
    before(function () {
        cy.fixture("omerdem").then(function (data) {
          this.data = data;
        });
      });

    const page = new US_008();

    it("Testcase01",function () {
        cy.LoginAdmin();
        page.getloginadmin().click();
        page.getpasswordadmin().click();
        page.getcurrentpassword().type(this.data.currentpass)
        page.getnewpasswordadmin().type(this.data.newpassword1)
        page.getpasswordstrength1().should("be.visible")
        page.getnewpasswordadmin().clear().type(this.data.newpassword2)
        page.getpasswordstrength2().should("be.visible","background-color:rgb(255, 153, 0)")
        page.getnewpasswordadmin().clear().type(this.data.newpassword3)
        page.getpasswordstrength3().should("be.visible","background-color:rgb(255, 255, 0);")
        page.getnewpasswordadmin().clear().type(this.data.newpassword4)
        page.getpasswordstrength4().should("be.visible","background-color:rgb(153, 255, 0);")
        page.getnewpasswordadmin().clear().type(this.data.newpassword5)
        page.getpasswordstrength5().should("be.visible","background-color:rgb(0, 255, 0);")
        page.getnewpasswordconfirmation().type(this.data.newpassword5)
    })
        it.skip("Testcase02",function () {

        page.getpasswordsavebutton().click();
        page.getFedbackText().should("not.be.visible");
        
    })
})