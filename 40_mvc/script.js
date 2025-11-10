function edit(button) {
  let row = button.parentElement.parentElement;
  let cells = row.querySelectorAll("td");

  for (let i = 1; i < cells.length - 1; i++) {
    let cell = cells[i];
    let value = cell.textContent;
    const input = document.createElement("input");
    if (i == 2) input.type = "number";
    else input.type = "text";
    input.value = value;
    input.style.width = "100%";
    input.style.boxSizing = "border-box";

    cell.textContent = "";
    cell.appendChild(input);
  }
  const actionCell = cells[cells.length - 1];
  actionCell.innerHTML = "";
  const updatebtn = document.createElement("button");
  const image = document.createElement('img');
  image.src = 'images/update.png'
  updatebtn.appendChild(image);
  updatebtn.onclick = () => updateRow(row);
  actionCell.appendChild(updatebtn);
}

function updateRow(row) {
  const id = row.cells[0].textContent;
  const name = row.cells[1].querySelector("input").value;
  const age = row.cells[2].querySelector("input").value;
  const college = row.cells[3].querySelector("input").value;
  const marks = row.cells[4].querySelector("input").value;

  const form = document.createElement("form");
  form.method = "post";
  form.action = "update.do";

  const fields = { id, name, age, college, marks };
  for (let key in fields) {
    const input = document.createElement("input");
    input.type = "hidden";
    input.name = key;
    input.value = fields[key];
    form.appendChild(input);
  }
  document.body.appendChild(form);
  form.submit();
}
