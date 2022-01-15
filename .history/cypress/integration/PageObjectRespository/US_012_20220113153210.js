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
   getLastNameHead
}
export default US_012