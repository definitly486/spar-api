package bb;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {
    public static draadjrbmk iobyxmoadg(String str) throws GeneralSecurityException {
        draadjrbmk draadjrbmkVar = (draadjrbmk) cqumvgiudr.dxjokdxxww().get(str);
        if (draadjrbmkVar != null) {
            return draadjrbmkVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
