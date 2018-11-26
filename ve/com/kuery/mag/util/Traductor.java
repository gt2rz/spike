/* 
 * Traductor.java
 *
 * Version 1.0. Esta version se encarga de realizar el cambio de idioma.
 */

package ve.com.kuery.mag.util;

public class Traductor{
    private static String [] palabrasCastellano =   {"ABRIR","GUARDAR","IMPRIMIR","SALIR","CAPTURAR",
    "DETENER","PROPIEDADES","AYUDA","ACERCA DE...","ARCHIVO",
    "CAPTURA","SPYKE:ANALIZADOR DE PROTOCOLOS TCP/IP","SIMULADOR", "SIMULAR","LISTA DE PAQUETES",
    "INICIAR","HERRAMIENTAS","CONFIGURAR","OPCIONES","GRAFICOS",
    "    ABRIR UN DOCUMENTO EXISTENTE...","    GUARDAR EL DOCUMENTO ACTUAL...", "    IMPRIMIR EL DOCUMENTO ACTUAL...","    INICIAR UNA NUEVA CAPTURA...","    DETENER LA CAPTURA...",
    "    CONFIGURAR LA CAPTURA...","    AYUDA...","CANCELAR","CONTINUAR","CANTIDAD DE PAQUETES:",
    "    SIMULAR UNA CAPTURA...","PROPIEDADES DE CAPTURA","DURACION DE CAPTURA","TIEMPO DE CAPTURA","CANTIDAD DE PAQUETES",
    "MODO DE CAPTURA"," CAPTURAR EN MODO PROMISCUO.","FILTROS","APLICAR FILTROS","TIPOS DE GRAFICO",
    "HISTORICO","ACTUAL","TIPO DE GRAFICA","TODOS","SELECCIONADO:",
    "TORTA","BARRA HORIZONTAL","PUNTO HORIZONTAL","LINEA HORIZONTAL","BARRA VERTICAL",
    "PUNTO VERTICAL","LINEA VERTICAL","CONTINUAR","CANCELAR","PROPIEDADES DE SIMULADOR",
    "OPCIONES","IDIOMA:      ","APARIENCIA:","MOSTRAR BIENVENIDA.","ACEPTAR",
    "INFORMACION DE PAQUETES:","INFORMACION HEXADECIMAL","INFORMACION ASCII", "INFORMACION GENERAL DEL PAQUETE","NUMERO DE PAQUETE: ",
    "FECHA:","HORA DE LLEGADA:","TIEMPO CON RELACION AL PRIMERO: ","TIEMPO CON RELACION AL ANTERIOR: ","CANTIDAD DE BYTES CAPTURADOS: ",
    "CANTIDAD DE BYTES PERDIDOS: ","TIPO DE PAQUETE: ","DIRECCION MAC DESTINO: ","DIRECCION MAC FUENTE: ","TIPO: ",
    "VERSION: ","LONGITUD DE CABECERA: ","TIPO DE SERVICIO: ","LONGITUD TOTAL: ","IDENTIFICACION: ",
    "INDICADOR DE FRAGMENTACION: ","DESPLAZAMIENTO DE FRAGMENTO: ","PROTOCOLO: ","TIEMPO DE VIDA: ","SUMA DE COMPROBACION: ",
    "DIRECCION DESTINO: ","DIRECCION ORIGEN: ","PUERTO ORIGEN: ","PUERTO DESTINO: ","DESPLAZAMIENTO: ",
    "NUMERO DE SECUENCIA: ","NUMERO DE CONFIRMACION: ","RESERVADO: ","URGENTE: ","VENTANA: ",
    "PUNTERO DE URGENCIA: ","DIRECCION FUENTE: ", "OPERACION LONGITUD: ","TIPO DE MENSAJE: ","CODIGO: ",
    "TIEMPO:","ORIGEN:","DESTINO","INTERFAZ DE RED:","DURACION INDEFINIDA.","PROGRESO DE CAPTURA...",
    "CAPTURANDO...","SUSPENDER","DETENER"," PAQ.","     OTROS:",
    "     TOTAL:","CAPTURA SUSPENDIDA.","ACTIVAR","SIMULACION DE PAQUETES...",
    "GRAFICO","GRAFICA DE TORTA","GRAFICA DE BARRA","GRAFICA DE LINEA",  
    "GRAFICA DE PUNTOS","PRIMERO","ANTERIOR","SIGUIENTE","ULTIMO","PROTOCOLOS","RESULTADOS",
    "INFORMACION DE PAQUETE","LONGITUD: ","OPERACION: ","TIPO DE HARDWARE: ","TIPO DE PROTOCOLO: ","LONGITUD DE HARDWARE: ",  
    "LONGITUD DE PROTOCOLO: "};
    
    private static String [] palabrasIngles =    {"Open","Save","Print","Close","Capture",
    "Stop","Properties","Help","About...","File",
    "Capture","SPYKE:TCP/IP Protocols Analyzer","Simulator","Simulate", "List of Packages", 
    "Begin","Tools","Configure","Options","Graphics",
    "    Open an existent document...","    Keep the current document...","    Print the current document...","    Begin a new capture...","    Stop the capture...",
    "    Configure the capture...","    Help...","Cancel","Continue","Quantity of Packages:",
    "     Simulate a Capture...","Capture properties","Capture duration","time of capture","Quantity of packages:",
    "Capture way"," Capture in a promiscuos way.", "Filters", "Apply filters","Graph types",
    "Historical","Current","Graph type", "all","Selected:",
    "Cake","Sweep horizontal","Horizontal point","Lines horizontal","Sweep vertical",
    "Vertical point","Lines vertical","Continue","Cancel","Pretender properties",
    "Options","Languaje:      ","Appearance:", "Show welcome.","Accept",
    "Information of Packages:","Information hexadecimal","Information ASCII","General information of the package","Number of package: ",
    "Dates:","Hour of arrival: ","Time with relationship to the first one: ", "Time with relationship to the previous one: ","Quantity of captured bytes: ",
    "Quantity of lost bytes: ","Package type: ","Addres MAC destination: ","Addres MAC source: ","Type: ",
    "Version: ","Head longitude: ", "Type of service: ","Total longitude: ","Identification: ",
    "Indicator of fragmentation: ", "Fragment displacement: ","Protocol: ","Time of file: ","Adds of confirmation: ",
    "Addres destination: ","Addres origin: ","Port Origin: ","Port Destination: ","Displacement: ",
    "Number of sequence: ","Number de confirmation: ","Reserved: ","Urgent: ","Window: ",
    "Pointer of urgency: ","Address source: ","Operation longitude: ","Message type: ","Code: ",
    "Time:","Origin:","Destination:","Interface of Net:","Indefinite Duration.",
    "Progress of Capture... ", "Capturing... ", "Suspend", "Stop"," Pac.", "     Other:",  
    "     Total:", "Captures Suspended", "Activate","Simulation of Packages...",
    "Graph", "Graph of Cake", "Graph of Bar", "Graph of Lines",  
    "Graph of Points", "First", "Previous", "Following", "Finish", "Protocols", "Results",
    "Information of Package", "Longitude: ", "Operation: ","Type of Hardware: ", "Type of Protocol: ", "Longitude of Hardware: ",  
    "Longitude of Protocol: "};
    
    private static String [] palabrasPortugues = {"Abrir","Economizar","Imprimir","Fim","Capturar",
    "Parada","Propriedades","Ajuda","Sobre...", "Arquivo",
    "Captura","SPYKE: Analisador de Protocolos TCP/IP","Simulador", "Simular","Lista de Pacotes",
    "Come�ar","Ferramentas","Configurar","Op��es","Gr�ficos",
    "    Abrir um documento existente...","    Manter o documento atual...","    Imprimir o documento atual...","    Come�ar uma captura nova...","    Parar a captura...",
    "    Configurar a captura...","    Ajuda...","Cancelar","Continuar","Quantidade de Pacotes:",
    "     Simular uma Captura...","Capture propriedades","Capture dura��o","Tempo de captura", "Quantidade de pacotes",
    "Capture modo"," Capturar de um modo promiscuo.","Filtros","Aplicar filtros","Tipos de grafico",
    "Historico","Atual","Tipo de grafico","Tudo","Selecionado:",
    "Bolo","Varra horizontal","Ponto horizontal","Enfeleira horizontal","Varra vertical",
    "Ponto vertical","Enfileira vertical","Continuar","Cancelar","Propriedades de pretendente",
    "Op��es","Idioma:      ","Aparecimiento:","Mostar acolhimento.", "Aceitar",
    "Informa��o de pacotes:","Hexadecimal de informa��o","Informa��o o ASCII","informa��o geral do pacote","Numero de pacote: ",
    "Data: ","Hora de chegada: ", "Tempo com rela��o para o primeiro: ","Tempo com rela��o para o previo: ","Quantidade de bytes capturados: ",
    "Quantidade de bytes perdidos: ","Tipo de pacote: ","Enderece destino de MAC: ","Enderece fonte de MAC: ","Tipo: ",
    "Vers�o: ","Longitude de cabe�a: ","Tipo de servi�o: ","Longitude total: ","identifica��o: ",
    "Indicador de Fragmenta��o: ","Fragmente deslocamento: ","Protocolo: ","Tempo de vida: ","Soma de confirma��o: ",
    "Enderece destino: ","Enderece origem: ","Aporte origem: ","Aporte destino: ", "Deslocamento: ",
    "Numero de sucess�o: ","Numero de confirma��o: ","Reservado: ","Urgente: ","Janela: ",
    "Ponteiro de urgencia: ","Enderece fonte: ","Longitude de opera��o: ","Tipo de mansagem: ","Codigo: ",
    "Tempo:","Origem:","Destino:","Interface de Rede:","Dura��o indefinida.",
    "Progresso de Captura... ", "Capturando... ", "Suspenda", "Pare", "Pac.", "     Outro:",
    "     Total:", "Capturas Suspenderam", "Ative","Simula��o de Pacotes...",
    "Gr�fico", "Gr�fico de Bolo", "Gr�fico de Barra", "Gr�fico de Linhas",    
    "Gr�fico de Pontos", "Primeiro", "Pr�vio", "Seguindo", "Termine", "Protocolos", "Resultados",
    "Informa��o de Pacote", "Longitude: ", "Opera��o: ","Tipo de Hardware: ", "Tipo de Protocolo: ", "Longitude de Hardware: ",    
    "Longitude de Protocolo: "};
    
    private static String [] palabrasFrances =   {"Ouvert","Sauver", "Imprimer", "Ferment", "Capture", 
    "Arr�t", "Propri�t�s", "Aide", "Sujet de...", "Classez", 
    "Capturez", "SPYKE: TCP/IP Protocoles Analyzer", "Simulateur", "Simuler","Inscrit de Paquets", 
    "Commencer","Outils","Configurer","Options","Graphique",
    "    Ouvrir un document existant...","    Garder le document courant...","    Imprimer le document courant...","    Commencer une nouvelle capture...","    Arr�ter la capture...",
    "    Configurer la capture...","    Aide...","Annuler","Continuer","Quantit� de Paquets:",
    "     Simulare una Cattura...","Capturez des propreet�s","Capturez de dur�e","Temps de capture","Quantite de paquets:",
    "Capturez le chemin"," Capturer dans un chemin confus.", "Filtres","Appliquer des filtres","Types du graphique",
    "Historique","Courant","Types du graphique","Tout","S�lectionn�",
    "G�teau","Balayage horizontal", "Point horizontal","R�gle horizontal","Balayage vertical",
    "Point vertical","R�gle vertical","Continuer","Annuler","Propri�tes du pr�tendant",
    "Options","Langue:      ","Apparence:", "Montrer l'accueil.", "Accepter",
    "Information de paquets:","Information hexad�cimal","Information ASCII","Information gen�erale du paquet","Je compte de paquet: ",
    "Date: ","Heure d�arriv�e: ","Temps avec rapport au premier: ","Temps avec rapport � l`ant�rieur: ","Quantit� de multiplets captur�s: ",
    "Quantit� de multiplets perdus: ","Type du paquet: ","Adressez la destination MAC: ","Adressez la source MAC: ","Type: ",
    "Version: ","Conduisez la longitude: ","Type de service: ","Longitude totale: ","Identification: ",
    "Indicateur de fragmentation: ","Fragmentez le d�placement: ","Protocole: ","Temps de vie: ","Ajoute de confirmation: ",
    "Adressez la destination: ","Adressez l�origine: ","Origine de port: ","Destination de port: ","D�placement: ",
    "Compte de s�quence: ", "Compte de confirmation: ","R�serv�: ","Urgent: ","fen�tre: ",
    "Chien d`arr�t d`urgence: ","Adressez la source: ","longitude de l'operation: ","Type du message: ","Code: ",
    "Temps:","Origine","Destination","Interface de R�seau:","Dur�e ind�finie.",
    "Progr�s de Capture... ", "Capturer... ", "Suspendez", "Arr�tez", "Paq.", "     Autre:",
    "     Total:", "Captures ont Suspendu", "Activez","Simulation de Paquets...",
    "Tracez", "Graphique de G�teau", "Graphique de Barre", "Graphique de Lignes",      
    "Graphique de Points","Premier","Ant�rieur", "Suivre", "Finissez", "Protocoles", "R�sultats",
    "Information de Paquet", "Longitude: ", "Op�ration: ","Type de Mat�riel: ", "Type de Protocole: ", "Longitude de Mat�riel: ",      
    "Longitude de Protocole: "};
    
    private static String [] palabrasItaliano =  {"Aprire", "Salvare", "Stampare", "Vicino", "Catturare", 
    "Fermata", "Propiet�", "Aiuto", "Circa...", "Archivio", 
    "Cattura", "SPYKE: Analizzatore di protocolli TCP/IP","Simulatore","Simulare", "Elenca di Pacchi", 
    "Cominciare","Attrezzi","Configurare","Scelte","Grafiche",
    "    Aprire un documento esistente...","    Tenere il documento corrente...","    Stampare il documento corrente...","    Cominciare una cattura nuova...","    Fermare la cattura...",
    "    Configurare la cattura...","    Aiuto...","Annullare","Continuare","Quantit� di Pacchi:",
    "     Simuler une Capture...","Catturi proprieta","Catturi la durata","Tempo di cattura","Quantita di pacchi",
    "Catturi modo"," Catturare in un modo promiscuo.","Filtri","Applicare filtri", "Tipi di grafico",
    "Storico","Corrente","Tipo di grafico","Tutti","Selezionato:",
    "Torta","Spazzata orizzontale", "Punto orizzontale","Fiancheggia orizzontale","Spazzata verticale",
    "Punto verticale","Fiancheggia orizzontale", "Continuare","Annullare","Proprieta di pretendente",
    "Scelte","Lingua:      ","Aspetto:","Mostrare benvenuto.","Accettare",
    "Informazioni di pacchi:","hexadecimal delle informazioni","Informazioni ASCII","Informazioni generali del pacco", "Io numero di pacco: ",
    "Insieme: ","Ora di arrivo: ","Tempo con relazione al primo: ","Tempo con relazione al precedente: ","Quantita di byti catturati: ",
    "Quantita di byti perduti: ","Tipo di pacco: ","Indirizzi la destinazione di MAC: ","Indirizzi la fonte di MAC: ","Tipo: ",
    "Versione: ","Longitudine di testa: ","Dattilografi di servizio: " ,"Longitudine totale: ","Identificazione: ",
    "Indicatore della frammentazione: ","Frammenti dislocamento: ","Protocollo: " ,"Tempo della vita: ","Aggiunge di conferma: ",
    "Indirizzi destinaziones: ","Indirizzi origine: ","Origine di porto: " ,"Destinazione di porto: ","dislocamento: ",
    "Io numero di sequenza: ","Io numero di conferma: ","Riservato:","Urgente: ","Finestra: ",
    "Cursore di urgenza: ","Indirizzi fonte: ","Longitudine di operazione:" ,"Tipo di comunicaziones: ","Codice: ",
    "Tempo:","Origine:","Destinazione:","Connetta di Rete:","Durata indefinita.",
    "Progresso di Cattura... ", "Catturando... ", "Sospenda", "Fermata", " Pac.", "     Altro: ",    
    "     Totale: ", "Catture Sospesero", "Attivi","Simulazione di Pacchi...",
    "Tracci", "Grafico di Torta", "Grafico di Sbarra", "Grafico di Linee",        
    "grafico di Punti","Prima", "Precedente", "Seguendo", "Finisca", "Protocolli", "Risultati",
    "Informazioni di Pacco", "Longitudine: ", "Operazione: ","Tipo de Hardware: ", "Tipo de Protocolo: ", "Longitude de Hardware: ",        
    "Longitude de Protocolo: "};
    
    public static String traducir(String idioma, String palabra)
    {
        String palabraTraducida="";
        String idiomaM = idioma.toUpperCase();
        if(idiomaM.equals("CASTELLANO"))
        {
            palabraTraducida = palabra;
        }
        else if(idiomaM.equals("INGLES"))
        {
            palabraTraducida = traducirIngles(palabra.toUpperCase());
        }
        else if(idiomaM.equals("PORTUGUES"))
        {
            palabraTraducida = traducirPortugues(palabra.toUpperCase());
        }
        else if(idiomaM.equals("FRANCES"))
        {
            palabraTraducida = traducirFrances(palabra.toUpperCase());
        }
        else if(idiomaM.equals("ITALIANO"))
        {
            palabraTraducida = traducirItaliano(palabra.toUpperCase());
        }
        return palabraTraducida;
    }
    
    public static String traducirIngles(String palabra)
    {
        return metodoTraduccion(palabra, palabrasIngles);
    }
    
    public static String traducirPortugues(String palabra)
    {
        return metodoTraduccion(palabra, palabrasPortugues);
    }
    
    public static String traducirFrances(String palabra)
    {
        return metodoTraduccion(palabra, palabrasFrances);
    }
    
    public static String traducirItaliano(String palabra)
    {
        return metodoTraduccion(palabra,  palabrasItaliano);
    }
    
    private static String metodoTraduccion(String palabra, String[] vector)
    {
        String traduccion="";
        salir:
            for(int i = 0; i<palabrasCastellano.length; i++)
            {
                if(palabra.equals(palabrasCastellano[i]))
                {
                    traduccion = vector[i];
                    break salir;
                }
            }
        return traduccion;
    }
}
