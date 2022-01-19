Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });
  
  
  
  describe("Date should be created on the time of account creation", () => {
    it.skip("The date cannot be typed earlier, in the past, at the time of creation an account", () => {
      cy.visit("https://www.gmibank.com/");
      cy.get('#account-menu > .dropdown-toggle').click();
      cy.get('#login-item > span').click();
      cy.get('#username').type('HelloWorld');
      cy.get('#password').type('GMIBANK.2123');
      cy.get('.btn-primary').click();
      cy.contains('My Operations').click();
      cy.get('[href="/tp-customer"] > span').click();
      cy.get('#jh-create-entity').click();
      cy.get('#search-ssn').type('709-98-675');
      cy.get('#tp-customer-firstName').type('İlhan');
      cy.get('#tp-customer-lastName').type('ozdem');
      cy.get('#tp-customer-middleInitial').type('type');
      cy.get('#tp-customer-email').type('hsdhs@hotmail.com');
      cy.get('#tp-customer-mobilePhoneNumber').type('555-555-5555');
      cy.get('#tp-customer-phoneNumber').type('122-121-1121');
      cy.get('#tp-customer-zipCode').type(57834)
     cy.get('#tp-customer-address').type('london');
     cy.get('#tp-customer-city').type('london');
     cy.get('#tp-customer-ssn').type('452-52-5252');
     cy.get('#tp-customer-createDate').type('2017-06-01T08:30')
cy.get('#tp-customer-createDate').should('not.have.value','2022-01-18T00:00');
        cy.get('#account-menu > .dropdown-toggle').contains('canan yigit').click();
      cy.get('[href="/logout"]').click();  
   
    
 
      
    });
    it.skip("The date should be created as month, day, year, hour and minute", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click();
        cy.get('#login-item > span').click();
        cy.get('#username').type('HelloWorld');
        cy.get('#password').type('GMIBANK.2123');
        cy.get('.btn-primary').click();
        cy.contains('My Operations').click();
        cy.get('[href="/tp-customer"] > span').click();
        cy.get('#jh-create-entity').click();
        cy.get('#search-ssn').type('709-98-675');
        cy.get('#tp-customer-firstName').type('İlhan');
        cy.get('#tp-customer-lastName').type('ozdem');
        cy.get('#tp-customer-middleInitial').type('type');
        cy.get('#tp-customer-email').type('hsdhs@hotmail.com');
        cy.get('#tp-customer-mobilePhoneNumber').type('555-555-5555');
        cy.get('#tp-customer-phoneNumber').type('122-121-1121');
        cy.get('#tp-customer-zipCode').type(57834)
       cy.get('#tp-customer-address').type('london');
       cy.get('#tp-customer-city').type('london');
       cy.get('#tp-customer-ssn').type('452-52-5252');
        cy.get('#tp-customer-createDate').type('2022-01-18');
        cy.get('#account-menu > .dropdown-toggle').contains('canan yigit').click();
        cy.get('[href="/logout"]').click();
   
      
        
      });
      it.skip("User can choose a user from the registration and it cannot be blank", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click();
        cy.get('#login-item > span').click();
        cy.get('#username').type('HelloWorld');
        cy.get('#password').type('GMIBANK.2123');
        cy.get('.btn-primary').click();
        cy.contains('My Operations').click();
        cy.get('[href="/tp-customer"] > span').click();
        cy.get('#jh-create-entity').click();
        cy.get('#search-ssn').type('709-98-675');
        cy.get('#tp-customer-firstName').type('İlhan');
        cy.get('#tp-customer-lastName').type('ozdem');
        cy.get('#tp-customer-middleInitial').type('type');
        cy.get('#tp-customer-email').type('hsdhs@hotmail.com');
        cy.get('#tp-customer-mobilePhoneNumber').type('555-555-5555');
        cy.get('#tp-customer-phoneNumber').type('122-121-1121');
        cy.get('#tp-customer-zipCode').type(57834)
       cy.get('#tp-customer-address').type('london');
       cy.get('#tp-customer-city').type('london');
       cy.get('#tp-customer-ssn').type('452-52-5252');
           
        cy.get('#tp-customer-createDate').type('2017-06-01T08:30');
                 
              cy.get('#tp-customer-state').type('surrey');
              cy.get('#account-menu > .dropdown-toggle').contains('canan yigit').click();
              cy.get('[href="/logout"]').click();
        
      });
      
    it.skip(" There user can choose an account created on manage accounts", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click();
        cy.get('#login-item > span').click();
        cy.get('#username').type('HelloWorld');
        cy.get('#password').type('GMIBANK.2123');
        cy.get('.btn-primary').click();
        cy.contains('My Operations').click();
        cy.get('[href="/tp-customer"] > span').click();
        cy.get('#jh-create-entity').click();
        cy.get('#search-ssn').type('709-98-675');
        cy.get('#tp-customer-firstName').type('İlhan');
        cy.get('#tp-customer-lastName').type('ozdem');
        cy.get('#tp-customer-middleInitial').type('type');
        cy.get('#tp-customer-email').type('hsdhs@hotmail.com');
        cy.get('#tp-customer-mobilePhoneNumber').type('555-555-5555');
        cy.get('#tp-customer-phoneNumber').type('122-121-1121');
        cy.get('#tp-customer-zipCode').type(57834)
       cy.get('#tp-customer-address').type('london');
       cy.get('#tp-customer-city').type('london');
       cy.get('#tp-customer-ssn').type('452-52-5252');
           
        cy.get('#tp-customer-state').type('surrey');
        cy.get('#account-menu > .dropdown-toggle').contains('canan yigit').click();
        cy.get('[href="/logout"]').click();
        
      });
      it(" User can select Zelle Enrolled optionally and save it", () => {
        cy.visit("https://www.gmibank.com/");
        cy.get('#account-menu > .dropdown-toggle').click();
        cy.get('#login-item > span').click();
        cy.get('#username').type('HelloWorld');
        cy.get('#password').type('GMIBANK.2123');
        cy.get('.btn-primary').click();
        cy.contains('My Operations').click();
        cy.get('[href="/tp-customer"] > span').click();
        cy.get('#jh-create-entity').click();
        cy.get('#search-ssn').type('709-98-675');
        cy.get('#tp-customer-firstName').type('İlhan');
        cy.get('#tp-customer-lastName').type('ozdem');
        cy.get('#tp-customer-middleInitial').type('type');
        cy.get('#tp-customer-email').type('hsdhs@hotmail.com');
        cy.get('#tp-customer-mobilePhoneNumber').type('555-555-5555');
        cy.get('#tp-customer-phoneNumber').type('122-121-1121');
        cy.get('#tp-customer-zipCode').type(57834)
       cy.get('#tp-customer-address').type('london');
       cy.get('#tp-customer-city').type('london');
       cy.get('#tp-customer-ssn').type('452-52-5252');
        cy.get('#tp-customer-createDate').type('2017-06-01T08:30');
  
        cy.get('#tp-customer-country').select('UNITED KINGDOM').should('have.value', '5');
           
        cy.get('#tp-customer-state').type('surrey');
        cy.get('#tp-customer-zelleEnrolled').click();
        cy.get('#tp-customer-zelleEnrolled').should('have.value', 'true');
  
        
      });
  
})
