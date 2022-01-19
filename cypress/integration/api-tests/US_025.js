Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('POST', () => {
  

      it('Post country data', () => {
        cy.api({
           url: '/api/tp-countries',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
              name: "Istanbul",
              states: null

             }
         }).then((res)=>{

expect(res.body.name).to.eql("Istanbul");
expect(res.body.states).to.eql(null);
         })     
              
         })
 });