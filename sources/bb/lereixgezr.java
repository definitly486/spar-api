package bb;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import nb.cdpycssgdh;
import nb.istkbnxepw;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
abstract class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Charset f15666iobyxmoadg = Charset.forName("UTF-8");

    public static cdpycssgdh.ppxfxbqfkf iobyxmoadg(istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) {
        return (cdpycssgdh.ppxfxbqfkf) cdpycssgdh.ppxfxbqfkf.ntlheqmsrt().vdvldrhtss(ppxfxbqfkfVar.mbcevpiqjq().ntlheqmsrt()).rgvfuqvkyq(ppxfxbqfkfVar.sopmlzcsov()).ojitshcjhn(ppxfxbqfkfVar.ulzqkzuiru()).agtfadlqog(ppxfxbqfkfVar.ntlheqmsrt()).ppxfxbqfkf();
    }

    public static void ppxfxbqfkf(istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) throws GeneralSecurityException {
        if (!ppxfxbqfkfVar.crxdokpmqz()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ppxfxbqfkfVar.ntlheqmsrt())));
        }
        if (ppxfxbqfkfVar.ulzqkzuiru() == ylkuphrtab.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ppxfxbqfkfVar.ntlheqmsrt())));
        }
        if (ppxfxbqfkfVar.sopmlzcsov() == nb.lereixgezr.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ppxfxbqfkfVar.ntlheqmsrt())));
        }
    }

    public static void wkgbmnqykc(istkbnxepw istkbnxepwVar) throws GeneralSecurityException {
        int iSopmlzcsov = istkbnxepwVar.sopmlzcsov();
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = true;
        for (istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar : istkbnxepwVar.ulzqkzuiru()) {
            if (ppxfxbqfkfVar.sopmlzcsov() == nb.lereixgezr.ENABLED) {
                ppxfxbqfkf(ppxfxbqfkfVar);
                if (ppxfxbqfkfVar.ntlheqmsrt() == iSopmlzcsov) {
                    if (z13) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z13 = true;
                }
                if (ppxfxbqfkfVar.mbcevpiqjq().mbcevpiqjq() != nb.esjtqupxsv.ppxfxbqfkf.ASYMMETRIC_PUBLIC) {
                    z14 = false;
                }
                i13++;
            }
        }
        if (i13 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z13 && !z14) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static cdpycssgdh zoijcleaow(istkbnxepw istkbnxepwVar) {
        cdpycssgdh.zoijcleaow zoijcleaowVarOjitshcjhn = cdpycssgdh.ntlheqmsrt().ojitshcjhn(istkbnxepwVar.sopmlzcsov());
        Iterator it = istkbnxepwVar.ulzqkzuiru().iterator();
        while (it.hasNext()) {
            zoijcleaowVarOjitshcjhn.agtfadlqog(iobyxmoadg((istkbnxepw.ppxfxbqfkf) it.next()));
        }
        return (cdpycssgdh) zoijcleaowVarOjitshcjhn.ppxfxbqfkf();
    }
}
