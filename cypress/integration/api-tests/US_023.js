//"Sistem, tüm Başvuru Sahiplerinin api end point kullanılarak okunmasına izin vermelidir
//"Read all registrants you created and validate them from your data set
// Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları veri kümenizden doğrulayın"
// "Read all registrants you created and validate them 1 by 1
// Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları tek tek doğrulayın"
Cypress.on('uncaught:exception', (err, runnable) => {
   
    return false
  });

describe('GET', () => {
  
    it('Get registrations data', () => {
     cy.api({
        url: '/api/tp-account-registrations',
       method:'GET',
        auth: {
            username: 'team69Admin',
            password: 'Team69+'
          }
      })
      .its('status')
      .should('eq', 200);      
           
      }),

      it('Post registrations data', () => {
        cy.api({
           url: '/api/tp-account-registrations',
          method:'POST',
           auth: {
               username: 'team69Admin',
               password: 'Team69+'
             },
             body:{
                ssn: "802-13-3484",
                firstName: "cako5",
                lastName: "Lang",
                address: "weybridge, oatlands avenue",
                mobilePhoneNumber: "032-311-0678",
                userId: 172445,
                userName: "cako.bes",
                email: "crazy@hotmail.com",
                createDate: null

             }
         }).then((res)=>{

expect(res.body.firstName).to.eql("cako5");
expect(res.body.email).to.eql("crazy@hotmail.com");
         })
        
               
               
              
         })
 });
       
