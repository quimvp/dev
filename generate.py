from openpyxl import Workbook
import os

# Path to the Excel file
file_path = 'products.xlsx'

# If the Excel file doesn't exist, create it with headers
if not os.path.exists(file_path):
    workbook = Workbook()

    # Create Products sheet
    sheet1 = workbook.active
    sheet1.title = 'Products'
    sheet1.append(['Product ID', 'Product Name', 'Quantity', 'RagNo'])
    
    # Create Users sheet
    sheet2 = workbook.create_sheet('Users')
    sheet2.append(['Username', 'Hashed Password'])

    # Save the workbook
    workbook.save(file_path)

    print(f"File created at {file_path}")
else:
    print(f"File already exists at {file_path}")
