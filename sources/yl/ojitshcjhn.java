package yl;

/* JADX INFO: loaded from: classes3.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f125792iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f125793ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f125794zoijcleaow;

    ojitshcjhn(draadjrbmk draadjrbmkVar, String str) {
        this.f125792iobyxmoadg = draadjrbmkVar.w();
        this.f125794zoijcleaow = draadjrbmkVar.z();
        this.f125793ppxfxbqfkf = str;
    }

    public String toString() {
        return "<" + this.f125794zoijcleaow + ">: " + this.f125793ppxfxbqfkf;
    }

    ojitshcjhn(draadjrbmk draadjrbmkVar, String str, Object... objArr) {
        this.f125792iobyxmoadg = draadjrbmkVar.w();
        this.f125794zoijcleaow = draadjrbmkVar.z();
        this.f125793ppxfxbqfkf = String.format(str, objArr);
    }
}
