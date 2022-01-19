Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('GET', () => {
  
    it('Get customer', () => {
     cy.api({
        url: '/api/tp-customers/126294',
       method:'GET',
        auth: {
            username: 'team69Admin',
            password: 'Team69+'
          }
      })
      .its('status')
      .should('eq', 200);
            
            
           
      }),

      it('post customer', () => {
        cy.api({
           url: '/api/tp-customers',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
              
                
                  
                    firstName: "cako",
                    lastName: "laa",
                    middleInitial: "M",
                    email: "ma34@gmail.com",
                    mobilePhoneNumber: null,
                    phoneNumber: "123-123-3434",
                    zipCode: null,
                    address: "NYC",
                    city: null,
                    ssn: "123-35-3434",
                    createDate: null,
                    zelleEnrolled: null,
                    country: null,
                    state: null,
                    user: null,
                    accounts: null
                

             }
         }).then((res)=>{

expect(res.body.firstName).to.eql("cako");
expect(res.body.states).to.eql(null);
         })
        
               
               
              
         })
 });