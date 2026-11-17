package uj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f113681iobyxmoadg = Runtime.getRuntime().availableProcessors();

    public static final int iobyxmoadg() {
        return f113681iobyxmoadg;
    }

    public static final String zoijcleaow(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
