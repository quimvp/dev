package com.java.components.util;

import java.util.HashMap;
import java.util.Arrays;

/**
 * Clase que representa una tabla con clave-valor, donde la clave es de un tipo específico
 * y los valores son de tipos específicos también.
 */
public class Table {
    private HashMap<Object, Object[]> table = new HashMap<>();
    private Class<?>[] types;

    /**
     * Constructor que inicializa la tabla con los tipos de datos esperados.
     * 
     * @param types los tipos de datos esperados para la clave y los valores
     */
    public Table(Class<?>... types) {
        if (types == null || types.length == 0) {
            throw new IllegalArgumentException("No se encontraron tipos de datos");
        }
        this.types = Arrays.copyOf(types, types.length);
    }

    /**
     * Agrega un registro a la tabla si la clave y los valores cumplen con los tipos esperados.
     * 
     * @param key   la clave del registro
     * @param values los valores del registro
     */
    public void put(Object key, Object... values) {
        if (isValid(key, values)) {
            table.put(key, values);
        }
    }

    /**
     * Verifica si se puede agregar un registro a la tabla según los tipos esperados.
     * 
     * @param key   la clave del registro
     * @param values los valores del registro
     * @return true si se puede agregar, false en caso contrario
     */
    public boolean isPut(Object key, Object... values) {
        return isValid(key, values);
    }

    /**
     * Obtiene un registro de la tabla según la clave.
     * 
     * @param key la clave del registro
     * @return el registro si existe, null en caso contrario
     */
    public Object[] get(Object key) {
        return table.get(key);
    }

    /**
     * Obtiene un registro de la tabla según la clave y devuelve un valor predeterminado si no existe.
     * 
     * @param key la clave del registro
     * @param defaultValue el valor predeterminado
     * @return el registro si existe, el valor predeterminado en caso contrario
     */
    public Object[] get(Object key, Object... defaultValue) {
        Object[] values = table.get(key);
        return values != null ? values : defaultValue;
    }

    /**
     * Obtiene un valor específico de un registro según la clave y el índice.
     * 
     * @param key la clave del registro
     * @param index el índice del valor
     * @return el valor si existe, null en caso contrario
     */
    public Object get(Object key, int index) {
        Object[] values = table.get(key);
        return values != null ? values[index] : null;
    }

    /**
     * Obtiene un valor específico de un registro según la clave y el índice, y devuelve un valor predeterminado si no existe.
     * 
     * @param key la clave del registro
     * @param index el índice del valor
     * @param defaultValue el valor predeterminado
     * @return el valor si existe, el valor predeterminado en caso contrario
     */
    public Object get(Object key, int index, Object defaultValue) {
        Object value = get(key, index);
        return value != null ? value : defaultValue;
    }

    /**
     * Verifica si un objeto es instancia de una clase específica.
     * 
     * @param obj el objeto a verificar
     * @param clazz la clase a verificar
     * @return true si es instancia, false en caso contrario
     */
    public static boolean isInstance(Object obj, Class<?> clazz) {
        return clazz.isInstance(obj);
    }

    /**
     * Verifica si la clave y los valores cumplen con los tipos esperados.
     * 
     * @param key   la clave del registro
     * @param values los valores del registro
     * @return true si cumplen con los tipos, false en caso contrario
     */
    private boolean isValid(Object key, Object... values) {
        if (!isInstance(key, types[0])) {
            return false;
        }
        if (values.length != types.length - 1) {
            return false;
        }
        for (int i = 0; i < values.length; i++) {
            if (!isInstance(values[i], types[i + 1])) {
                return false;
            }
        }
        return true;
    }
}