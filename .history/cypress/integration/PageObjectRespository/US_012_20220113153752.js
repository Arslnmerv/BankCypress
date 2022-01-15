class US_012 {

   getMyOperations(){
       return cy.get('#entity-menu > .dropdown-toggle > span')
   }
   getManageCustomers(){
       return cy.get('[href="/tp-customer"] > span')
   }
   getFirstNameHead(){
       return cy.get('tr > :nth-child(2) > span')
   }
   getLastNameHead(){
       return cy.get('thead > tr > :nth-child(3)')
   }
   getMiddleNameHead(){
    return cy.get('tr > :nth-child(4) > span')
    }
    getEmailHead(){
    return cy.get('tr > :nth-child(5) > span')
    }
    getMobilNumberHead(){
    return cy.get('tr > :nth-child(6) > span')
    }
    getAdressHead(){
    return cy.get('tr > :nth-child(8) > span')
    }
}
export default US_012