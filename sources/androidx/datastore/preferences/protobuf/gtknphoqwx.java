package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Class f8639iobyxmoadg = ppxfxbqfkf();

    public static draadjrbmk iobyxmoadg() {
        if (f8639iobyxmoadg != null) {
            try {
                return zoijcleaow("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return draadjrbmk.f8625eablkybsjg;
    }

    static Class ppxfxbqfkf() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static final draadjrbmk zoijcleaow(String str) {
        return (draadjrbmk) f8639iobyxmoadg.getDeclaredMethod(str, null).invoke(null, null);
    }
}
