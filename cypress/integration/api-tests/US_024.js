Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('Post state', () => {
  

      it('Post states data', () => {
        cy.api({
           url: '/api/tp-states',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
              name: "Istanbul",
              
              tpcountry: null
             }
         }).then((res)=>{

expect(res.body.name).to.eql("Istanbul");
expect(res.body.tpcountry).to.eql(null);
         })
     
              
         })
 });
       