

  import gmiBankPom from "../PageObjectRespository/gmiBankPom"
  Cypress.on("uncaught:exception", (err, runnable) => {
    return false
  })
  describe("US 001", () => {
    before(function(){
      cy.fixture('kubilay').then(function(data){
          this.data = data
      })
  })
    const gmibankpom = new gmiBankPom()
    it("login pozitif test", function() {
      gmibankpom.getBank()
      gmibankpom.getLoginButonu().click()
      gmibankpom.getRegister().click()
      gmibankpom.getSSN().type(this.data.SSN)
      gmibankpom.getFirstName().type(this.data.firstName)
      gmibankpom.getLastName().type(this.data.lastName)
      gmibankpom.getAddress().type(this.data.Address)
      gmibankpom.getPhoneNumber().type(this.data.PhoneNumber)
      gmibankpom.getEmail().type(this.data.email)
      gmibankpom.getUsername().type(this.data.usernameRegister)
      gmibankpom.getNewPassword().type(this.data.passwordRegister)
      gmibankpom.getNewPasswordAgain().type(this.data.passwordRegister)
      gmibankpom.getRegisterButton().click()
    })
    it.only("login negatif test",  function () {
      gmibankpom.getBank();
      gmibankpom.getLoginButonu().click();
      gmibankpom.getRegister().click();
      gmibankpom.getSSN().type(this.data.gecersizSSN);
      gmibankpom.getFirstName().type(this.data.firstName);
      gmibankpom.getLastName().type(this.data.lastName);
      gmibankpom.getAddress().type(this.data.Address);
      gmibankpom.getPhoneNumber().type(this.data.PhoneNumber);
      gmibankpom.getEmail().type(this.data.email);
      gmibankpom.getUsername().type(this.data.usernameRegister);
      gmibankpom.getNewPassword().type(this.data.passwordRegister);
      gmibankpom.getNewPasswordAgain().type(this.data.passwordRegister);
      gmibankpom.getRegisterButton().click();
    });
    /*
    it('register pozitif test',()=>{
      var faker=require('faker');
      gmibankpom.getBank();
      gmibankpom.getLoginButonu().click();
      gmibankpom.getRegister().click();
      gmibankpom.getSSN().type(faker.finance.account);
      gmibankpom.getFirstName().type(faker.name.firstName);
      gmibankpom.getLastName().type(faker.name.lastName);
      gmibankpom.getAddress().type(faker.address.streetAddress);
      gmibankpom.getPhoneNumber().type(faker.phone.phoneNumber);
      gmibankpom.getEmail().type(faker.internet.email);
      gmibankpom.getUsername().type(faker.finance.accountName);
      gmibankpom.getNewPassword().type('Tac123?');
      gmibankpom.getNewPasswordAgain().type('Tac123?');
      gmibankpom.getRegisterButton().click();
    })
    */
  });
  
  
  
  
  
  
  
  
  
  