class US_012 {

    getFirstName() {
         return cy.get('#tp-customer-firstName')
    }
   getMyOperations(){
       return cy.get('#entity-menu > .dropdown-toggle > span')
   }
   getManageCustomers(){
       return cy.get('[href="/tp-customer"] > span')
   }
   getfirstnamehead(){
       return cy.get('tr > :nth-child(2) > span')
   }
}
export default US_012