class US_012 {

    getFirstName() {
         return cy.get('#tp-customer-firstName')
    }
   getMyOperations(){
       return cy.get('#entity-menu > .dropdown-toggle > span')
   }
   getManageCustomers(){}
}
export default US_012