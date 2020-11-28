import java.util.Scanner;
import java.util.Arrays;


public class tableau2dMethod {
 

    
    public static String [][] tableauVide(){
       
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        //creation du tableau vide avec les titre ligne&colonnes///////////////////////////
        ///////////////////////////////////////////////////////////////
       String [][]tableauVide = new String [6][5];
        tableauVide [0][0] = null;
        tableauVide [0][1] = "twingo";
        tableauVide [0][2] = "clio";
        tableauVide [0][3] = "megane";
        tableauVide [0][4] = "vel satis";
        tableauVide [1][0] = "Andre";
        tableauVide [2][0] = "Ingemar";
        tableauVide [3][0] = "Jean-jerome";
        tableauVide [4][0] = "Cindy";
        tableauVide [5][0] = " Joey";
    return tableauVide;
    }
    public static String [][]tableauRempli(){
        /////////////////////////////////////////////////////////////////
        ///Remplissage du tableau avec les input utilisateurs////////////////////
        ///////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        String [][] tableauRempli = tableauVide();
        
        int i=1;
        int j=1;
        
        for (i=1; i<=tableauRempli.length-1;i++ ){
            for (j=1; j<=4;j++){
                System.out.println("Combien de "+tableauRempli[0][j]+" a vendu "+tableauRempli[i][0] +" ?");
                String vente= sc.next();
                tableauRempli[i][j] = vente;
                //System.out.println(tableauVente[i][j]);
            } 
        }
    return tableauRempli;
    }
    public static int affichageTableau(){
        //////////////////////////////////////////////////////////////////////////
        ////////////////Affichage du tableau/////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        String [][]tableauVente=tableauRempli() ;
        int k=0;
        for( k = 0 ; k<=5 ;k++){
            System.out.println(Arrays.toString(tableauVente[k])); // affichage du tableau

        }
    return 0;
    
}
    public static String nombreVenteTypeVoiture(){
        ////////////////////////////////////////////////////////////////////
        //////////////Calcul du nombre de ventes de chaque véhicule/////////
        ///////////////////////////////////////////////////////////////////
        String [][] tableauVente = tableauRempli();
        int totalTwingo=0;
        int totalClio = 0;
        int totalMegane=0; 
        int totalVelsatis = 0;
       
        for (int l = 1 ; l<=5;l++){
            totalTwingo += Integer.parseInt(tableauVente[l][1]);
            totalClio  +=Integer.parseInt(tableauVente[l][2]);
            totalMegane +=Integer.parseInt(tableauVente[l][3]);
            totalVelsatis +=Integer.parseInt(tableauVente[l][4]);    
        }
        String  totalParMarque = "totalTwingo :"+totalTwingo+" totalClio: "+totalClio+" totalMegane: "+totalMegane+" totalVelsatis: "+totalVelsatis;
       
        System.out.println("totalTwingo :"+totalTwingo+" totalClio: "+totalClio+" totalMegane: "+totalMegane+" totalVelsatis: "+totalVelsatis);
    return totalParMarque;
    }
    public static String totalCaVendeur (){
        /////////////////////////////////////////////////////////////////////////
        // declaration des prix des voitures et calcul du chiffre d'affaire de chaque vendeur////
        /////////////////////////////////////////////////////////////////////////////////////////
        String [][]tableauVente = tableauRempli();
        ///Prix des vehicule////
        int []prix= new int[5];
        prix[1] = 1000;
        prix[2]= 1500;
        prix[3]=2000;
        prix[4]= 2500;  
        //// ca des vendeur///
       int ingemar = 0;
       int andre = 0;
       int jeanjean = 0 ;
       int joey=0;
       int cindy =0;

       for( int m  = 1 ; m <5 ;m++){
        andre +=Integer.parseInt( tableauVente [1][m]) * prix[m];
        ingemar+=Integer.parseInt( tableauVente [2][m])* prix[m];
        jeanjean +=Integer.parseInt( tableauVente [3][m])* prix[m];
        cindy += Integer.parseInt( tableauVente [4][m])* prix[m];
        joey += Integer.parseInt( tableauVente [5][m])* prix[m];
        
       }
       String TotalVenteParVendeur = " andre : " +andre+" ingemar : "+ingemar+" jeanjean : "+jeanjean+" cindy : "+cindy+" joey : "+joey;
       System.out.println(" andre : " +andre+" ingemar : "+ingemar+" jeanjean : "+jeanjean+" cindy : "+cindy+" joey : "+joey); 
       /////////////////////////////////////////////////////////////////
    return TotalVenteParVendeur;
    }
   
    
}
