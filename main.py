from functools import wraps

Productos = {1: 'Pantalones', 2: 'Camisas', 3: 'Corbatas', 4: 'Casacas'}
Precios = {1: 200.00, 2: 120.00, 3: 50.00, 4: 350.00}
Stock = {1: 50, 2: 45, 3: 30, 4: 15}

def handle_exceptions(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        try:
            return func(*args, **kwargs)
        except ValueError as ve:
            print(f"Error: {ve}. Por favor, ingrese un valor válido.")
        except KeyError as ke:
            print(f"Error: No se encontró el producto con ID {ke}.")
        except Exception as e:
            print(f"Ha ocurrido un error inesperado: {e}")
    return wrapper

def mostrar_productos():
    print("========================================")
    print("Lista de Productos:")
    print("========================================")
    for id in Productos:
        print(f"{id} \t {Productos[id]} \t {Precios[id]} \t {Stock[id]}")
    print("========================================")

@handle_exceptions
def agregar_producto():
    nuevo_id = max(Productos.keys()) + 1
    nombre = input("Ingrese el nombre del nuevo producto: ")
    precio = float(input("Ingrese el precio del nuevo producto: "))
    cantidad = int(input("Ingrese la cantidad en stock del nuevo producto: "))
    Productos[nuevo_id] = nombre
    Precios[nuevo_id] = precio
    Stock[nuevo_id] = cantidad
    print(f"Producto {nombre} agregado exitosamente.")

@handle_exceptions
def eliminar_producto():
    id = int(input("Ingrese el ID del producto a eliminar: "))
    if id in Productos:
        del Productos[id]
        del Precios[id]
        del Stock[id]
        print(f"Producto con ID {id} eliminado exitosamente.")
    else:
        raise KeyError(id)

@handle_exceptions
def actualizar_producto():
    id = int(input("Ingrese el ID del producto a actualizar: "))
    if id in Productos:
        nombre = input("Ingrese el nuevo nombre del producto: ")
        precio = float(input("Ingrese el nuevo precio del producto: "))
        cantidad = int(input("Ingrese la nueva cantidad en stock del producto: "))
        Productos[id] = nombre
        Precios[id] = precio
        Stock[id] = cantidad
        print(f"Producto con ID {id} actualizado exitosamente.")
    else:
        raise KeyError(id)

@handle_exceptions
def obtener_opcion() -> int:
    return int(input("Elija opción: "))

while True:
    mostrar_productos()
    print("[1] Agregar, [2] Eliminar, [3] Actualizar, [4] Salir")
    opcion = obtener_opcion()
    if opcion == 1:
        agregar_producto()
    elif opcion == 2:
        eliminar_producto()
    elif opcion == 3:
        actualizar_producto()
    elif opcion == 4:
        print("Saliendo del programa...")
        break
    else:
        print("Opción no válida. Por favor, elija una opción válida.")

