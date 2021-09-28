let accounts = [
    {
        FirstName:"D",
        LastName: "Sahith",
        AccountNumber: "089287647277",
        balance: 40000


    },
    {
      FirstName:"D",
      LastName: "Sahith",
      AccountNumber: "54677647277",
      balance: 60000


    },
    {
      FirstName:"D",
      LastName: "Sahith",
      AccountNumber: "0892876467887",
      balance: 70000

    },
    {
      FirstName:"D",
      LastName: "Sahith",
      AccountNumber: "0892876472455",
      balance: 450000


    },
    {
      FirstName:"D",
      LastName: "Arshat coder",
      AccountNumber: "2842957276472455",
      balance: 4500000000


    }
    


];

var acc = "";
for (let account of accounts) {
    acc += ` <div class="col-sm-6">
    <div class="card card text-white bg-dark mb-3">
      <div class="card-body">
        <h5>${account.AccountNumber}</h5>
        <div>${account.FirstName} ${account.LastName}</div>
        <div class="badge badge-danger">${account.balance}</div><br><br>
        <div class="card-footer">
          <a href="WithDraw.html" class="btn btn-primary">WithDraw</a>
          <a href="Deposit.html" class="btn btn-primary">Deposit</a>
          <a href="TransactionList.html" class="btn btn-primary">TransactionList</a>
        </div>
      </div>
    </div>
  </div>`;
}
document.getElementById("accounts").innerHTML = acc;
