package configuracion;

import auditoria.Revision;
import org.hibernate.envers.RevisionListener;

public class CRL implements RevisionListener {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
