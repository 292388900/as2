//$Header: /cvsroot-fuse/mec-as2/39/mendelson/comm/as2/server/ResourceBundleAS2ServerRemoteImpl_fr.java,v 1.1 2012/04/18 14:10:39 heller Exp $
package de.mendelson.comm.as2.server;
import de.mendelson.util.MecResourceBundle;
/*
 * Copyright (C) mendelson-e-commerce GmbH Berlin Germany
 *
 * This software is subject to the license agreement set forth in the license.
 * Please read and agree to all terms before using this software.
 * Other product and brand names are trademarks of their respective owners.
 */

/**
 * ResourceBundle to localize a mendelson product
 * @author S.Heller
 * @author E.Pailleau
 * @version $Revision: 1.1 $
 */
public class ResourceBundleAS2ServerRemoteImpl_fr extends MecResourceBundle{
    
    public Object[][] getContents() {
        return contents;
    }
    
    /**List of messages in the specific language*/
    static final Object[][] contents = {
        { "server.shutdown", "L''utilisateur {0} ({1}) demande l''arr�t du serveur." },
        { "server.start", "D�marrage du serveur {0}" },
        { "rmi.port.in.use", "Impossible de d�marrer le serveur {2} : Le port du serveur\n"
                  + "{0} est d�j� utilis� par un autre processus.\n"
                  + "Message d''erreur de la commande de bind : \n"
                  + "{1}."
        },
        {"unknown.sender", "L''�metteur du message \"{0}\" n''existe pas." },
        {"unknown.receiver", "Le destinataire du message \"{0}\" n''existe pas." },
        {"receiver.not.localstation", "Le destinataire du message \"{0}\" qui est d�fini dans le message n''est pas un site local dans les param�tres de partenaires." },
        {"incoming.exception", "Exception re�ue sur flux entrant." },
        {"exception.errorcode", "Code d''erreur {0} dans {1}." },
        {"exception.type", "Type d''erreur: {0}." },
        {"exception.description", "Description de l''erreur: {0}." },
        {"sync.mdn.sent", "{0}: MDN synchrone envoy� comme r�ponse au message {1}." },
    };
    
}
