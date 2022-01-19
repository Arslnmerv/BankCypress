/*
"System should allow to read all Applicants using api end point
""https://www.gmibank.com/api/tp-account-registrations""
""Sistem, tüm Başvuru Sahiplerinin api end point kullanılarak okunmasına izin vermelidir."
"Read all registrants you created and validate them from your data set
Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları veri kümenizden doğrulayın"
"Read all registrants you created and validate them 1 by 1
Oluşturduğunuz tüm kayıt sahiplerini okuyun ve bunları tek tek doğrulayın"
*/

// describe('US_023, Request', () => {
//     //XHR, JavaScript ile sunulmus bir API
//     //Web sitesini es zamanli olarak arka planda calisan olaylari takip eder.
   
       
//     //const requestUrl = "https://www.gmibank.com/api/tp-account-registrations"

//     it('TC_001', () => {
        
//         cy.request({ 
//             url: "https://www.gmibank.com/api/tp-account-registrations",
//             method: 'GET',
//             auth: {
//                 username: "team68Admin",
//                 password: "Team68" ,
//               },
//             })
            

//            // assert.equal(response.status, 200)
//             //expect(response.statusText).to.eq('OK')
//         })
//     })
    describe('Logging In - Basic Auth', function () {
        // we can use these values to log in
        const username = 'team68Admin'
        const password = 'Team68+'
      
        context('cy.request', function() {
          // https://on.cypress.io/request
      
          it('without authorization gets 401', () => {
            cy.request({
              url: 'https://www.gmibank.com/api/tp-account-registrations',
              failOnStatusCode: false,
            }).its('status').should('equal', 401)
          })
      
          it.only('with authorization', () => {
            cy.request({
              url: 'https://www.gmibank.com/api/tp-account-registrations',
              auth: {
                username, password,
              },
            }).then(response =>{
              expect(response.body).to.have.keys(["id", "ssn"]);
            })
            // .its('status').should('equal', 200)
          })
        })
    })

