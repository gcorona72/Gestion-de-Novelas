# Gestión de Novelas

Una aplicación de Android para gestionar una colección de novelas utilizando Jetpack Compose, Room y la arquitectura MVVM.

## Funcionalidades

- **Agregar novelas**: Los usuarios pueden agregar nuevas novelas a la base de datos proporcionando detalles como el título, autor, año de publicación y sinopsis.
  
- **Eliminar novelas**: Los usuarios tienen la opción de eliminar novelas de la base de datos de manera sencilla.

- **Ver listado de novelas**: La aplicación muestra una lista de todas las novelas almacenadas, ordenadas alfabéticamente por su título.

- **Sincronización en tiempo real**: La lista de novelas se actualiza automáticamente cada vez que se agrega o elimina una novela.

## Arquitectura

Esta aplicación sigue el patrón **MVVM (Model-View-ViewModel)** para asegurar una clara separación de responsabilidades entre la interfaz de usuario y la lógica de negocio.

### Principales componentes:

- **Jetpack Compose**: Se utiliza para construir la interfaz de usuario declarativa.
- **Room Database**: Maneja la persistencia de datos a nivel local, permitiendo agregar, eliminar y consultar novelas.
- **ViewModel**: Gestiona el estado de la interfaz y actúa como intermediario entre la vista y los datos.
- **Repository**: Se encarga de la lógica de acceso a datos, obteniendo la información desde Room y poniéndola a disposición del ViewModel.

## Dependencias principales

- **Kotlin**: Lenguaje principal del proyecto.
- **Jetpack Compose**: Para la construcción de la interfaz de usuario.
- **Room Database**: Para la gestión de la base de datos local.
- **LiveData**: Para la observación y actualización de los datos en tiempo real.
- **Firebase**: Para la analítica y otros servicios de backend.

## Instalación

1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu_usuario/gestion-de-novelas.git
    ```

2. Abre el proyecto en **Android Studio**.
   
3. Asegúrate de tener las dependencias necesarias en el archivo `build.gradle.kts` y sincroniza el proyecto.

4. Añade el archivo `google-services.json` en el directorio `app/`.

5. Ejecuta la aplicación en un emulador o dispositivo físico.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir:

1. Haz un fork del repositorio.
2. Crea una nueva rama: `git checkout -b feature/nueva-funcionalidad`.
3. Realiza los cambios necesarios y haz un commit: `git commit -m 'Añadir nueva funcionalidad'`.
4. Sube los cambios: `git push origin feature/nueva-funcionalidad`.
5. Abre un **Pull Request**.
