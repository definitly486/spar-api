package t6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwxlajgraz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static iobyxmoadg f109819iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static ikoacuggdj f109820zoijcleaow;

    public static ikoacuggdj iobyxmoadg() {
        if (f109820zoijcleaow == null) {
            synchronized (iwxlajgraz.class) {
                f109820zoijcleaow = new xrmfcynszj();
            }
        }
        return f109820zoijcleaow;
    }

    public static iobyxmoadg zoijcleaow() {
        if (f109819iobyxmoadg == null) {
            synchronized (iwxlajgraz.class) {
                f109819iobyxmoadg = new rgvfuqvkyq(new i1());
            }
        }
        return f109819iobyxmoadg;
    }
}
