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
    getAddressHead(){
    return cy.get('tr > :nth-child(8) > span')
    }
    getCreatedDateHead(){
        return cy.get('thead > tr > :nth-child(9) > span')
        }
        getFirstUserName(){
            return cy.get('tbody > :nth-child(1) > :nth-child(2)')
        }
        getViewButton(){
            return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-info')
        }
        getViewEdit(){
            return cy.get('.btn-primary')
        }
        getE
}
export default US_012