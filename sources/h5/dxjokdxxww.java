package h5;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class dxjokdxxww {
    public static /* synthetic */ androidx.navigation.wflxmlrfwp iobyxmoadg(androidx.navigation.wflxmlrfwp.vdvldrhtss vdvldrhtssVar, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return vdvldrhtssVar.iobyxmoadg(str, str2);
        }
        try {
            return vdvldrhtssVar.iobyxmoadg("j$" + str.substring(4), str2);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof ClassNotFoundException) {
                return vdvldrhtssVar.iobyxmoadg(str, str2);
            }
            throw e13;
        }
    }
}
