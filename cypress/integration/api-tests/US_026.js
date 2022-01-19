Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('UPDATE', () => {
      it('Update country data', () => {
        cy.api({
           url: '/api/tp-countries/24113',
          method:'PUT',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
              name: "Alaska",
              states: 'surrey'

             }
         }).then((res)=>{

expect(res.body.name).to.eql("Alaska");
expect(res.body.states).to.eql(null);
         })     
              
         })
 });