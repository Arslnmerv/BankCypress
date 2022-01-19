Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('DELETE', () => {
      it('Delete states data', () => {
        cy.api({
           url: '/api/tp-states/22714',
          method:'DELETE',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
           
         }).then((res)=>{
         expect(res.status).to.eq(204);
      
         })     
              
         })
 });