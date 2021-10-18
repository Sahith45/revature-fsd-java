//  let accounts = [
//     {

//         AccountNumber: "089287647277",
//         balance: 40000


//     },
//     {

//       AccountNumber: "54677647277",
//       balance: 60000


//     },
//     {

//       AccountNumber: "0892876467887",
//       balance: 70000

//     },
//     {

//       AccountNumber: "0892876472455",
//       balance: 450000


//     },
//     {

//       AccountNumber: "2842957276472455",
//       balance: 4500000000


//     }



// ];
const urlParams = new URLSearchParams(window.location.search);
const currentId = urlParams.get('id');

(async function () {
    try {
     let response = await fetch("http://localhost:8080/bank-app-rest/accounts/"+ currentId);
       let accounts = await response.json();
      var acc = "";
      for (let account of accounts) {
        acc += ` <div class="col-sm-6">
      <div class="card card text-dark bg-light mb-3 card border-danger mb-3">
        <div class="card-body">
          <h5>Account Number : ${account.AccountNumber}</h5>
         
          <div class="badge badge-success">Balance : ${account.balance}</div><br><br>
         
        </div>
      </div>
    </div>`;
      }
      document.getElementById("accounts").innerHTML = acc;
  
  
    } catch (err) {
  
    }
  })();
  
  
  // var acc = "";
  // for (let account of accounts) {
  //     acc += ` <div class="col-sm-6">
  //     <div class="card card text-white bg-dark mb-3">
  //       <div class="card-body">
  //         <h5>Account Number : ${account.AccountNumber}</h5>
  
  //         <div class="badge badge-danger">Balance : ${account.balance}</div><br><br>
  //         <div class="card-footer">
  //           <a href="WithDraw.html" class="btn btn-primary">WithDraw</a>
  //           <a href="Deposit.html" class="btn btn-primary">Deposit</a>
  //           <a href="TransactionList.html" class="btn btn-primary">TransactionList</a>
  //         </div>
  //       </div>
  //     </div>
  //   </div>`;
  // }
  // document.getElementById("accounts").innerHTML = acc;
  