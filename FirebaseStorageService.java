package com.macrobiotica.service;
import org.springframework.web.multipart.MultipartFile;
public interface FirebaseStorageService {
     public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "macrobiotica-f6b5d.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "Macrobiotica";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "macrobiotica-f6b5d-firebase-adminsdk-wcpvg-a25380cf73.json";
}
 //editaaaaaar con el firebase creaado por mi