/*
"System should allow to read all Applicants using api end point
""https://www.gmibank.com/api/tp-account-registrations""
""Sistem, tüm Başvuru Sahiplerinin api end point kullanılarak okunmasına izin vermelidir."
"Read all registrants you created and validate them from your data set
Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları veri kümenizden doğrulayın"
"Read all registrants you created and validate them 1 by 1
Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları tek tek doğrulayın"
*/
Cypress.on("uncaught:exception", (err, runnable) => {
  return false;
});
// describe('US_023, Request', () => {

      
//     it.only('TC_001', () => {
        
//         cy.api({ 
//             url: "api/tp-account-registrations",
//             method: 'GET',
//             auth: {
//                username: 'team69Admin' , 
//                password: 'Team69+' ,
//               },
//             }).its('status')
//             .should('eq',200);
//             })
       
//         })
