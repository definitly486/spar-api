package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Class f8877iobyxmoadg = iobyxmoadg("libcore.io.Memory");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final boolean f8878zoijcleaow;

    static {
        f8878zoijcleaow = iobyxmoadg("org.robolectric.Robolectric") != null;
    }

    private static Class iobyxmoadg(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean ppxfxbqfkf() {
        return (f8877iobyxmoadg == null || f8878zoijcleaow) ? false : true;
    }

    static Class zoijcleaow() {
        return f8877iobyxmoadg;
    }
}
