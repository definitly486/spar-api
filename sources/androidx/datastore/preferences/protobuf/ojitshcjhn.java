package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final wflxmlrfwp f8759iobyxmoadg = new agtfadlqog();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wflxmlrfwp f8760zoijcleaow = ppxfxbqfkf();

    static wflxmlrfwp iobyxmoadg() {
        wflxmlrfwp wflxmlrfwpVar = f8760zoijcleaow;
        if (wflxmlrfwpVar != null) {
            return wflxmlrfwpVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static wflxmlrfwp ppxfxbqfkf() {
        try {
            return (wflxmlrfwp) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static wflxmlrfwp zoijcleaow() {
        return f8759iobyxmoadg;
    }
}
