package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.util.List;
import java.util.Map;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    private static final class iobyxmoadg {
        public static boolean iobyxmoadg(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static boolean eablkybsjg(Throwable th2) {
        return stevsuqkhv.f123602iobyxmoadg == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static byte[] iobyxmoadg(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        b3.gtknphoqwx gtknphoqwxVar = new b3.gtknphoqwx(iobyxmoadgVar);
        b3.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = new b3.lqeggnwhkg.zoijcleaow().btonecajqb(str).eablkybsjg(map).wkgbmnqykc(2).ppxfxbqfkf(bArr).zoijcleaow(1).iobyxmoadg();
        int i13 = 0;
        b3.lqeggnwhkg lqeggnwhkgVarIobyxmoadg2 = lqeggnwhkgVarIobyxmoadg;
        while (true) {
            try {
                b3.eablkybsjg eablkybsjgVar = new b3.eablkybsjg(gtknphoqwxVar, lqeggnwhkgVarIobyxmoadg2);
                try {
                    byte[] bArrZoijcleaow = ya.iobyxmoadg.zoijcleaow(eablkybsjgVar);
                    stevsuqkhv.draadjrbmk(eablkybsjgVar);
                    return bArrZoijcleaow;
                } catch (HttpDataSource$InvalidResponseCodeException e13) {
                    try {
                        String strPpxfxbqfkf = ppxfxbqfkf(e13, i13);
                        if (strPpxfxbqfkf == null) {
                            throw e13;
                        }
                        i13++;
                        lqeggnwhkgVarIobyxmoadg2 = lqeggnwhkgVarIobyxmoadg2.iobyxmoadg().btonecajqb(strPpxfxbqfkf).iobyxmoadg();
                        stevsuqkhv.draadjrbmk(eablkybsjgVar);
                    } catch (Throwable th2) {
                        stevsuqkhv.draadjrbmk(eablkybsjgVar);
                        throw th2;
                    }
                }
            } catch (Exception e14) {
                throw new MediaDrmCallbackException(lqeggnwhkgVarIobyxmoadg, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.wkgbmnqykc(), gtknphoqwxVar.rgvfuqvkyq(), e14);
            }
        }
    }

    private static String ppxfxbqfkf(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i13) {
        Map map;
        List list;
        int i14 = httpDataSource$InvalidResponseCodeException.f9871iwizpuwonk;
        if ((i14 != 307 && i14 != 308) || i13 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f9870esjtqupxsv) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean wkgbmnqykc(Throwable th2) {
        return stevsuqkhv.f123602iobyxmoadg == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static int zoijcleaow(Throwable th2, int i13) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return stevsuqkhv.crxdokpmqz(stevsuqkhv.jlmebxxoox(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 23 && iobyxmoadg.iobyxmoadg(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || wkgbmnqykc(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th2 instanceof KeysExpiredException) {
            return 6008;
        }
        if (i13 == 1) {
            return 6006;
        }
        if (i13 == 2) {
            return 6004;
        }
        if (i13 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
