<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    color: #333;
  }

  .container {
    display: flex;
    justify-content: space-between;
    margin: 20px;
  }

  .column {
    flex: 1;
    margin: 10px;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #fff;
  }
#content {
  display: flex;
  justify-content: space-between;
}

.left, .center, .right {
  flex: 1;
}

.item {
  margin: 10px;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #f9f9f9;
}

  .column:nth-child(odd) {
    background-color: #f9f9f9;
  }

  h1 {
    font-size: 24px;
    margin-bottom: 10px;
  }

  p {
    margin-bottom: 20px;
  }

  img {
    max-width: 100%;
    height: auto;
    display: block;
    margin-bottom: 10px;
  }

  ul {
    margin-top: 10px;
    padding-left: 20px;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
  }

  th, td {
    padding: 10px;
    text-align: center;
  }

  th {
    font-weight: bold;
  }

  fieldset {
    margin-top: 20px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }

  legend {
    font-size: 18px;
    font-weight: bold;
    margin-bottom: 10px;
  }

  select, input[type="text"], input[type="password"], input[type="email"], input[type="tel"] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }

  input[type="submit"], input[type="reset"] {
    padding: 5px 10px;
    background-color: #333;
    color: #fff;
    border: none;
    border-radius: 3px;
    cursor: pointer;
  }

  input[type="submit"]:hover, input[type="reset"]:hover {
    background-color: #555;
  }

  mark {
    background-color: hsla(600, 0%, 90%, 0.25);
    padding: 3px;
  }
</style>
