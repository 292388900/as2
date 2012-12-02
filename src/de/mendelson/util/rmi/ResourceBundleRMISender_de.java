//$Header: /cvsroot-fuse/mec-as2/39/mendelson/util/rmi/ResourceBundleRMISender_de.java,v 1.1 2012/04/18 14:10:45 heller Exp $
package de.mendelson.util.rmi;
import de.mendelson.util.MecResourceBundle;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */


/** 
 * ResourceBundle to localize the RMISender messages
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class ResourceBundleRMISender_de extends MecResourceBundle{

  public Object[][] getContents() {
    return contents;
  }

  /**List of messages in the specific language*/
  static final Object[][] contents = {
      {"fatal.error.short", "Warnung" },
      {"fatal.error.long", 
      "Warnung auf der Serverseite, die Anfrage konnte nicht ausgef�hrt werden-" },
      {"message.returned", "Folgende Fehlermeldung wurde zur�ckgeliefert:" },
      {"no.server", "Es wurde kein laufender Server auf {0}:{1} entdeckt."},
  };		
  
}