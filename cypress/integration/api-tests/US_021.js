Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('GET', () => {
  
    it('Get states data', () => {
     cy.api({
        url: '/api/tp-countries',
       method:'GET',
        auth: {
            username: 'team69Admin',
            password: 'Team69+'
          }
      })
      .its('status')
      .should('eq', 200);
            
            
           
      }),

      it('Post states data', () => {
        cy.api({
           url: '/api/tp-countries',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
              name: "Milton",
              states: null

             }
         }).then((res)=>{

expect(res.body.name).to.eql("Milton");
expect(res.body.states).to.eql(null);
         })
        
               
               
              
         })
 });