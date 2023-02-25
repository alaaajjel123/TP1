package Problems;

public class Who_Likes_It {
	
	public static String whoLikesIt(String...  noms) {
        //Do your magic here
       int nb;
      if (noms.length==0) { return "aucune personne aime ça";}
      else if (noms.length==1) 
      { 
         return String.format("%s aiment ça", noms[0]);}
      else if (noms.length==2) {
        return String.format("%s et %s aiment ça", noms[0], noms[1]);
        }
      else if (noms.length==3) {return String.format("%s, %s et %s aiment ça", noms[0], noms[1], noms[2]);}
      else if (noms.length >3 )
      {
        nb=(noms.length-2);
        return String.format("%s, %s and %d others like this", noms[0], noms[1], nb);}
      
        return "";
    }

}
