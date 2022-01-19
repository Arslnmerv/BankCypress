class US_013 {

    getMyOperations(){
        return cy.get('#entity-menu > .dropdown-toggle > span')
    }
    getManageAccounts() {
        return cy.get('[href="/tp-account"] > span')
    }
        getcreateAccount(){
            return cy.get('#jh-create-entity')
          }
          getAccountType(){
            return cy.get('#tp-account-accountType')
          }
          getBalance(){
            return cy.get('#tp-account-balance')
          }
          getDescription() {
            return cy.get('#tp-account-description')
          }
          getAccountState(){
              return cy.get('#tp-account-accountStatusType')
          }
          getEmployee(){
              return cy.get('#tp-account-employee')
          }
        }
     export default US_013
    