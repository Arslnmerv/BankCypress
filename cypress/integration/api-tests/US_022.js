//System should allow to read states using api end point "https://www.gmibank.com/api/tp-states"
//Read all states you created and validate them from your data set
//Read all states you created and validate them 1 by 1
Cypress.on('uncaught:exception', (err, runnable) => {
    return false
  });
describe('GET', () => {
    it('Get states data', () => {
     cy.api({
        url: '/api/tp-states',
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
           url: '/api/tp-states',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
                name: "Surrey",
                tpcountry: null
             }
         }).then((res)=>{
expect(res.body.name).to.eql("Surrey");
expect(res.body.tpcountry).to.eql(null);
         })
         })
 });

 //"baseUrl": "https://www.gmibank.com",
 // "integrationFolder": "cypress/integration/api-tests"
