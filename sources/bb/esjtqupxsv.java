package bb;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final esjtqupxsv f15642iobyxmoadg = new esjtqupxsv();

    private esjtqupxsv() {
    }

    static esjtqupxsv iobyxmoadg() {
        return f15642iobyxmoadg;
    }

    public static esjtqupxsv zoijcleaow(esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (esjtqupxsvVar != null) {
            return esjtqupxsvVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
