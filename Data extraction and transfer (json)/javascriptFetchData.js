async function fetchData() {
  const response = await fetch('/api/data');
  const data = await response.json();

  // Process and visualize data
  // ... using D3.js, Chart.js, etc. ...
}

fetchData();
