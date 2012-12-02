//$Header: /cvsroot-fuse/mec-as2/39/mendelson/comm/as2/cem/gui/ResourceBundleDialogSendCEM_fr.java,v 1.1 2012/04/18 14:10:20 heller Exp $
package de.mendelson.comm.as2.cem.gui;
import de.mendelson.util.MecResourceBundle;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

/**
 * ResourceBundle to localize gui entries
 * @author S.Heller
 * @version $Revision: 1.1 $
 */
public class ResourceBundleDialogSendCEM_fr extends MecResourceBundle{
    
    @Override
    public Object[][] getContents() {
        return contents;
    }
    
    /**List of messages in the specific language*/
    static final Object[][] contents = {
        {"title", "Certificat d'�change avec les partenaires via CEM" },
        {"button.ok", "Ok" },
        {"button.cancel", "Annuler" },
        {"label.initiator", "Station locale:" },
        {"label.receiver", "R�cepteur:" },
        {"label.certificate", "Certificat:"},
        {"label.activationdate", "Date d''activation:"},
        {"cem.request.failed", "L''�chec de la demande CEM:\n{0}" },
        {"cem.request.success", "La demande CEM a �t� envoy�e avec succ�s." },
        {"cem.request.title", "�change de certificat via CEM" },
    };
    
}