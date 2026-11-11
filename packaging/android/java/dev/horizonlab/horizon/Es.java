package dev.horizonlab.horizon;

import java.util.HashMap;
import java.util.Locale;

/**
 * Spanish for the setup and profile screens: every Ui.t call already passes the
 * English string, so it is looked up here when the phone's language is Spanish.
 * A missing string simply stays English, and Russian keeps its own path.
 */
final class Es {
    private static final HashMap<String, String> MAP = new HashMap<>();

    static {
        // Setup: first launch and the game files download.
        MAP.put("First launch", "Primer inicio");
        MAP.put("The game needs the Minecraft 26.3 files. They will be downloaded automatically, about 700 MB. Wi-Fi is best.",
                "El juego necesita los archivos de Minecraft 26.3. Se descargarán automáticamente, unos 700 MB. Mejor con Wi-Fi.");
        MAP.put("Download game files", "Descargar archivos del juego");
        MAP.put("Pick horizon-derived.zip", "Elegir horizon-derived.zip");
        MAP.put("No file picker app found.", "No hay ninguna app para elegir archivos.");
        MAP.put("Copy the error text", "Copiar el texto del error");
        MAP.put("Copied ✓", "Copiado ✓");
        MAP.put("Vulkan driver (experimental)", "Controlador Vulkan (experimental)");
        MAP.put("Profile: name and skin", "Perfil: nombre y skin");
        MAP.put("This build has no Horizon data pack address. Put horizon-derived.zip in the game folder (Android/data/dev.horizonlab.horizon/files) or install a build that has one.",
                "Esta build no trae la dirección del paquete de datos de Horizon. Pon horizon-derived.zip en la carpeta del juego (Android/data/dev.horizonlab.horizon/files) o instala una build que la tenga.");
        MAP.put("Copying the archive…", "Copiando el archivo…");
        MAP.put("the file did not open", "el archivo no se abrió");
        MAP.put("this is not a zip archive", "esto no es un archivo zip");
        MAP.put("The archive is in place. Tap Download game files.", "El archivo está en su sitio. Toca Descargar archivos del juego.");
        MAP.put("Could not copy the archive: ", "No se pudo copiar el archivo: ");
        MAP.put("Not enough space. About 1.5 GB is needed, free: ", "No hay espacio suficiente. Se necesitan unos 1,5 GB; libres: ");
        MAP.put(" MB.", " MB.");
        MAP.put("Mobile data", "Datos móviles");
        MAP.put("You are not on Wi-Fi. Download about 700 MB over mobile data?", "No estás con Wi-Fi. ¿Descargar unos 700 MB con datos móviles?");
        MAP.put("Download", "Descargar");
        MAP.put("Cancel", "Cancelar");
        MAP.put("Preparing", "Preparando");
        MAP.put("Downloading the game", "Descargando el juego");
        MAP.put("Unpacking", "Desempaquetando");
        MAP.put("Sounds, fonts and languages", "Sonidos, fuentes e idiomas");
        MAP.put("Horizon data", "Datos de Horizon");
        MAP.put("Ready", "Listo");
        MAP.put("The phone ran out of space.", "El teléfono se quedó sin espacio.");
        MAP.put("The Horizon data pack was not found. Put horizon-derived.zip in the game folder and tap Retry.",
                "No se encontró el paquete de datos de Horizon. Pon horizon-derived.zip en la carpeta del juego y toca Reintentar.");
        MAP.put("A file is missing on the server (404). This build's link is out of date: update Horizon.",
                "Falta un archivo en el servidor (404). El enlace de esta build está desfasado: actualiza Horizon.");
        MAP.put("The server refused the file. Wait a few minutes or switch networks (VPN or mobile data).",
                "El servidor rechazó el archivo. Espera unos minutos o cambia de red (VPN o datos móviles).");
        MAP.put("The download server is down for now. Try again later.", "El servidor de descargas no está disponible ahora. Prueba más tarde.");
        MAP.put("A secure connection failed. Check the phone's date and time, or switch networks.",
                "No se pudo establecer la conexión segura. Comprueba la fecha y la hora del teléfono, o cambia de red.");
        MAP.put("The data pack is damaged. Delete horizon-derived.zip from the game folder and tap Retry.",
                "El paquete de datos está dañado. Borra horizon-derived.zip de la carpeta del juego y toca Reintentar.");
        MAP.put("A file arrived damaged. Tap Retry.", "Un archivo llegó dañado. Toca Reintentar.");
        MAP.put("Could not reach the server. Check the connection and tap Retry.", "No se pudo conectar con el servidor. Comprueba la conexión y toca Reintentar.");
        MAP.put("Something went wrong. Tap Retry, the download continues where it stopped.",
                "Algo salió mal. Toca Reintentar; la descarga continúa donde se quedó.");
        MAP.put(" MB", " MB");
        MAP.put(" MB/s", " MB/s");
        MAP.put(" files", " archivos");
        MAP.put("The download stopped", "La descarga se detuvo");
        MAP.put("Details: ", "Detalles: ");
        MAP.put("Retry", "Reintentar");
        // The download's notification.
        MAP.put("Game files download", "Descarga de archivos del juego");
        MAP.put("Game files are ready", "Los archivos del juego están listos");
        // Turnip.
        MAP.put("Now: the system Qualcomm driver", "Ahora: el controlador Qualcomm del sistema");
        MAP.put("Now: ", "Ahora: ");
        MAP.put("Install Turnip", "Instalar Turnip");
        MAP.put("System", "Del sistema");
        MAP.put("Vulkan driver · experimental", "Controlador Vulkan · experimental");
        MAP.put("The custom driver did not start last time, so the game went back to the system one. Try another Turnip build.",
                "La última vez el controlador personalizado no arrancó y el juego volvió al del sistema. Prueba otra build de Turnip.");
        MAP.put("A Turnip zip (libvulkan_freedreno.so). Faster than the system driver on some Snapdragons. If the game fails to start with it, the next launch uses the system one.",
                "Un zip de Turnip (libvulkan_freedreno.so). Más rápido que el controlador del sistema en algunos Snapdragon. Si el juego no arranca con él, el siguiente inicio usa el del sistema.");
        MAP.put("Safe start: Vulkan did not start, so the game runs on OpenGL ES and can be slower.",
                "Inicio seguro: Vulkan no arrancó, así que el juego corre con OpenGL ES y puede ir más lento.");
        MAP.put("Try Vulkan again", "Probar Vulkan de nuevo");
        MAP.put("Restart the game", "Reinicia el juego");
        MAP.put("System driver. Restart the game.", "Controlador del sistema. Reinicia el juego.");
        MAP.put("Driver installed: ", "Controlador instalado: ");
        MAP.put(". Fully close the game and open it again.", ". Cierra del todo el juego y vuelve a abrirlo.");
        MAP.put("The archive has no driver .so (a zip with libvulkan_freedreno.so is needed).",
                "El zip no trae el controlador .so (hace falta un zip con libvulkan_freedreno.so).");
        // Mods.
        MAP.put("Share the mod to Horizon, or use the button on the profile screen.", "Comparte el mod con Horizon o usa el botón de la pantalla de perfil.");
        MAP.put("Install this mod?", "¿Instalar este mod?");
        MAP.put("A mod gets full access to the game and your Microsoft sign-in. Only install mods you trust.",
                "Un mod obtiene acceso total al juego y a tu sesión de Microsoft. Instala solo mods en los que confíes.");
        MAP.put("Install", "Instalar");
        MAP.put("Not a Horizon mod (.hnmod or .hmod): ", "No es un mod de Horizon (.hnmod o .hmod): ");
        MAP.put("Could not install the mod: ", "No se pudo instalar el mod: ");
        MAP.put("Mod installed: ", "Mod instalado: ");
        MAP.put(". Restart the game; it is in Options > Mods.", ". Reinicia el juego; está en Opciones > Mods.");
        MAP.put("Mods", "Mods");
        MAP.put("A .hnmod with an Android build, or a .hmod. Or drop the file into Android/data/dev.horizonlab.horizon/files/mods/.",
                "Un .hnmod con build para Android o un .hmod. O deja el archivo en Android/data/dev.horizonlab.horizon/files/mods/.");
        MAP.put("Install a mod", "Instalar un mod");
        // Profile: name and skin.
        MAP.put("Name", "Nombre");
        MAP.put("Skin…", "Skin…");
        MAP.put("PLAY", "JUGAR");
        MAP.put("Arms: ", "Brazos: ");
        MAP.put("slim (Alex)", "delgados (Alex)");
        MAP.put("classic (Steve)", "clásicos (Steve)");
        MAP.put("Name: 3–16 characters, letters, digits and _ only.", "Nombre: de 3 a 16 caracteres, solo letras, dígitos y _.");
        MAP.put("Could not save.", "No se pudo guardar.");
        MAP.put("A skin is needed: a 64×64 or 64×32 PNG (HD 128/256… works too).", "Hace falta una skin: un PNG de 64×64 o 64×32 (HD 128/256… también vale).");
        MAP.put("Skin applied.", "Skin aplicada.");
        MAP.put("Could not read the file.", "No se pudo leer el archivo.");
        MAP.put("Screen", "Pantalla");
        // Microsoft sign-in.
        MAP.put("Microsoft account", "Cuenta de Microsoft");
        MAP.put("For licensed servers. Sign in with your email and password once: it renews by itself.",
                "Para servidores con licencia. Inicia sesión con tu correo y contraseña una vez: se renueva sola.");
        MAP.put("Sign in with Microsoft", "Iniciar sesión con Microsoft");
        MAP.put("Copy code", "Copiar código");
        MAP.put("Open browser", "Abrir navegador");
        MAP.put("Sign out", "Cerrar sesión");
        MAP.put("Signed out.", "Se cerró la sesión.");
        MAP.put("Other sign-in ▾", "Otro modo de inicio ▾");
        MAP.put("Code sign-in with your own Azure client ID approved by Mojang (aka.ms/mce-reviewappid). Only needed if the sign-in above fails.",
                "Inicio con código mediante tu propio client ID de Azure aprobado por Mojang (aka.ms/mce-reviewappid). Solo hace falta si el inicio de arriba falla.");
        MAP.put("Sign in with a code", "Iniciar sesión con un código");
        MAP.put("Signing in to Xbox and Minecraft…", "Iniciando sesión en Xbox y Minecraft…");
        MAP.put("Signing in…", "Iniciando…");
        MAP.put("Waiting for sign-in…", "Esperando el inicio de sesión…");
        MAP.put("Requesting a code…", "Pidiendo un código…");
        MAP.put("Open ", "Abre ");
        MAP.put(", enter the code and sign in. This screen notices by itself.", ", escribe el código e inicia sesión. Esta pantalla se entera sola.");
        MAP.put("No browser. Open ", "No hay navegador. Abre ");
        MAP.put("No WebView on this phone: sign in with a code below.", "Este teléfono no tiene WebView: inicia sesión con un código abajo.");
        MAP.put("Signed in: ", "Sesión iniciada: ");
        MAP.put("● Offline (no license)", "● Sin licencia (sin conexión)");
        MAP.put("● Licensed: ", "● Con licencia: ");
        MAP.put("Account: ", "Cuenta: ");
        MAP.put("Not connected", "No conectada");
        MAP.put("Sign-in cancelled: ", "Inicio de sesión cancelado: ");
        MAP.put("Sign-in cancelled.", "Inicio de sesión cancelado.");
        MAP.put("Wait for sign-in to finish.", "Espera a que termine el inicio de sesión.");
        MAP.put("Nothing to renew the sign-in with.", "No hay datos con los que renovar la sesión.");
        MAP.put("The sign-in has expired; sign in with Microsoft again.", "La sesión ha caducado; inicia sesión con Microsoft de nuevo.");
        MAP.put("No network; the sign-in renews later.", "Sin red; la sesión se renovará más tarde.");
        MAP.put("Could not renew the sign-in.", "No se pudo renovar la sesión.");
        MAP.put("No network. Check the connection and try again.", "Sin red. Comprueba la conexión e inténtalo de nuevo.");
        MAP.put("The code expired. Start again.", "El código caducó. Empieza de nuevo.");
        MAP.put("Xbox Live refused the sign-in.", "Xbox Live rechazó el inicio de sesión.");
        MAP.put("Mojang has not approved this Azure app yet. Register your own client ID and submit it at aka.ms/mce-reviewappid.",
                "Mojang aún no aprobó esta app de Azure. Registra tu propio client ID y envíalo en aka.ms/mce-reviewappid.");
        MAP.put("The Minecraft services refused the sign-in.", "Los servicios de Minecraft rechazaron el inicio de sesión.");
        MAP.put("This account doesn't own Minecraft: Java Edition.", "Esta cuenta no tiene Minecraft: Java Edition.");
        MAP.put("Create a Minecraft profile at minecraft.net first.", "Crea primero un perfil de Minecraft en minecraft.net.");
        MAP.put("No Xbox profile yet. Sign in once at xbox.com.", "Aún no hay perfil de Xbox. Inicia sesión una vez en xbox.com.");
        MAP.put("A child account needs an adult in a Microsoft family.", "Una cuenta infantil necesita un adulto en una familia de Microsoft.");
        MAP.put("Sign-in was declined in the browser.", "Se rechazó el inicio de sesión en el navegador.");
        MAP.put("Microsoft refused this client ID. Enable public client flows.", "Microsoft rechazó este client ID. Habilita public client flows.");
        MAP.put("Microsoft sign-in failed.", "El inicio de sesión de Microsoft falló.");
        MAP.put("Paste your own Azure client ID.", "Pega tu propio client ID de Azure.");
        MAP.put("Could not save the client ID.", "No se pudo guardar el client ID.");
        // The screen cutout setting.
        MAP.put("Cutout: stay clear of the camera", "Recorte: sin meterse bajo la cámara");
        MAP.put("Cutout: draw under the camera", "Recorte: siempre bajo la cámara");
        MAP.put("Cutout: short edges", "Recorte: solo en los bordes");
    }

    private Es() {}

    static boolean speaks() {
        return "es".equals(Locale.getDefault().getLanguage());
    }

    /** The Spanish for an English screen string, or the string itself. */
    static String of(String en) {
        if (!speaks()) return en;
        String es = MAP.get(en);
        return es != null ? es : en;
    }
}
