class US_015 {

    getMyOperations() {
        return cy.get('#entity-menu > .dropdown-toggle')
    }
    getManageAccount() {
        return cy.get('[href="/tp-account"] > span')
    }
    getActive(){
        return cy.get('tbody > :nth-child(2) > :nth-child(5)')
    }
    getSuespended() {
        return cy.get(':nth-child(5) > :nth-child(5)')
    }
    getSaving() {
        return cy.get('tbody > :nth-child(3) > :nth-child(4)')
    }
    getChecking() {
        return cy.get('tbody > :nth-child(2) > :nth-child(4)')
    }
    getCreditCard() {
        return cy.get('tbody > :nth-child(9) > :nth-child(4)')
    }
    getInvesting() {
        return cy.get(':nth-child(27) > :nth-child(4)')
    }
    view() {
        return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-info')
    }
    accountHeader(){
        return cy.get('h2 > span')
    }
    backFromViewPage(){
        return cy.get('.btn-info > .d-none > span')
    }
    edit(){
        return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-primary')
    }
    descriptionInEditPage(){
        return cy.get('#descriptionLabel')
    }
    backFromEditPage(){
        return cy.get('.d-none > span')
    }
    delete(){ 
        return cy.get(':nth-child(1) > .text-right > .btn-group > .btn-danger')
    }
    confirmDelete(){
        return cy.get('.modal-title > span')
    }
}
export default US_015