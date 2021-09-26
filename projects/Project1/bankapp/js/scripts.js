let accounts = [
    {
        FirstName: D,
        LastName: Sahith,
        AccountNumber: 089287647277,
        balance: 40000


    },
    {
        FirstName: D,
        LastName: Sahith,
        AccountNumber: 0892876473456,
        balance: 6000


    },
    {
        FirstName: D,
        LastName: Sahith,
        AccountNumber: 0892876473556,
        balance: 50000


    },
    {
        FirstName: D,
        FirstName: Sahith,
        AccountNumber: 08928764726984,
        balance: 90000


    },


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
