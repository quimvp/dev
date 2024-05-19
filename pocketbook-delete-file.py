#!/usr/bin/env python3
import requests
import sys
BEARER_TOKEN="dToyMzIyZWU6YmMwNGY4MmExNjkyZTMxMzYxMGRiMWUxY2M0N2ZlOThmMw"

if len(sys.argv) <= 1:
    print("no hash??")
    exit(-1)


hash = str(sys.argv[1])

url = "https://cloud.pocketbook.digital/api/v1.1/fileops/delete/?fast_hash=" + hash

payload = {}
headers = {
  'Authorization': 'Bearer dToyMzIyZWU6YmMwNGY4MmExNjkyZTMxMzYxMGRiMWUxY2M0N2ZlOThmMw'
}

response = requests.request("POST", url, headers=headers, data=payload)

print(response.text)