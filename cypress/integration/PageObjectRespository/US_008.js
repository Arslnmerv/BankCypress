class US_008 { 
    getloginadmin(){ 
        return cy.get('#account-menu > .dropdown-toggle')
    }
    getpasswordadmin(){ 
        return cy.get('[href="/account/password"]')
    }
    getcurrentpassword(){ 
        return cy.get('#currentPassword')
    }
    getnewpasswordadmin(){ 
        return cy.get('#newPassword')
    }
    getpasswordstrength1(){ 
        return cy.get('[style="background-color: rgb(255, 0, 0);"]')
    }
    getpasswordstrength2(){ 
        return cy.get('#strengthBar > :nth-child(2)')
        
    }
    getpasswordstrength3(){ 
        return cy.get('#strengthBar > :nth-child(3)')
    }
    getpasswordstrength4(){ 
        return cy.get('#strengthBar > :nth-child(4)')
    }
    getpasswordstrength5(){
        return cy.get('#strengthBar > :nth-child(5)')

    }
    getnewpasswordconfirmation(){ 
        return cy.get('#confirmPassword')
    }
    getpasswordsavebutton(){

        return cy.get('.btn')

    }
    getFedbackText(){
        return cy.get('.invalid-feedback')
    }
        
    }
    export default US_008;