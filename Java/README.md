# Gilded Rose - Refactorización en Java

## ✨ Refactorización con Principios de Buenas Prácticas de Construcción de Software

Este proyecto parte de una base proporcionada en el reto de Gilded Rose, sobre la cual se realizó una refactorización aplicando principios de diseño limpio, como **modularidad**, **encapsulamiento** y **separación de responsabilidades**. El objetivo es mejorar la legibilidad, mantenibilidad y reutilización del código mediante la implementación de una arquitectura por capas.

---

## 🗂️ Estructura por Capas

### 🔹 DAL (Data Access Layer)

Se creó una carpeta denominada `DAL_Product`, dentro de la cual se definió la clase `cls_DAL_Item`. Esta clase encapsula las variables que representan un producto (`name`, `sellIn`, `quality`) y se aplicó el principio de **encapsulamiento** para evitar modificaciones externas indebidas.

**Ventajas:**

- Se protegen los datos internos del objeto.
- Se promueve la reutilización de objetos.
- Se abstraen detalles de implementación, exponiendo solo lo necesario.

---

### 🔹 BLL (Business Logic Layer)

Dentro de esta capa se desarrolló la clase `cls_BLL_Products`, que utiliza los objetos de `cls_DAL_Item` para aplicar las reglas de negocio.

Se realizó una **refactorización completa** del código original, separando la lógica en métodos individuales por tipo de producto (por ejemplo: `updateAgedBrie`, `updateBackstagePass`, etc.), lo cual mejora significativamente la comprensión y el mantenimiento del sistema.

**Aspectos clave de la refactorización:**

- Aplicación del principio de **responsabilidad única**.
- Uso de modificadores de acceso `private` y `public` para controlar el alcance de los métodos.
- **Reutilización de lógica** en métodos auxiliares como `increaseQuality()` y `decreaseQuality()` para evitar duplicación.
- Código más limpio y legible.

---

## ✅ Conclusión

Este ejercicio no solo refactoriza el código de Gilded Rose, sino que también demuestra cómo aplicar principios fundamentales de la ingeniería de software, tales como:

- Arquitectura en capas
- Encapsulamiento
- Reutilización de componentes
- Claridad y mantenimiento del código

---
