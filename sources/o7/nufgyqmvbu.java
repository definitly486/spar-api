package o7;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72197iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final float f72198ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final float f72199zoijcleaow;

    public nufgyqmvbu(String str, float f13, float f14) {
        this.f72197iobyxmoadg = str;
        this.f72198ppxfxbqfkf = f14;
        this.f72199zoijcleaow = f13;
    }

    public boolean iobyxmoadg(String str) {
        if (this.f72197iobyxmoadg.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f72197iobyxmoadg.endsWith("\r")) {
            String str2 = this.f72197iobyxmoadg;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
