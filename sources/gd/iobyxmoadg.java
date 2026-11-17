package gd;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile iobyxmoadg f36841ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f36842iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f36843zoijcleaow;

    public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f36843zoijcleaow = false;
        this.f36842iobyxmoadg = ppxfxbqfkfVar == null ? ppxfxbqfkf.ppxfxbqfkf() : ppxfxbqfkfVar;
    }

    public static iobyxmoadg eablkybsjg() {
        if (f36841ppxfxbqfkf == null) {
            synchronized (iobyxmoadg.class) {
                try {
                    if (f36841ppxfxbqfkf == null) {
                        f36841ppxfxbqfkf = new iobyxmoadg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36841ppxfxbqfkf;
    }

    public void btonecajqb(String str) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.eablkybsjg(str);
        }
    }

    public void dxjokdxxww(boolean z13) {
        this.f36843zoijcleaow = z13;
    }

    public void gtknphoqwx(String str, Object... objArr) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.eablkybsjg(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void gxszxtbevo(String str) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.wkgbmnqykc(str);
        }
    }

    public void iobyxmoadg(String str) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.iobyxmoadg(str);
        }
    }

    public void lqeggnwhkg(String str, Object... objArr) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.wkgbmnqykc(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean nufgyqmvbu() {
        return this.f36843zoijcleaow;
    }

    public void ppxfxbqfkf(String str) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.zoijcleaow(str);
        }
    }

    public void wkgbmnqykc(String str, Object... objArr) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.zoijcleaow(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void zoijcleaow(String str, Object... objArr) {
        if (this.f36843zoijcleaow) {
            this.f36842iobyxmoadg.iobyxmoadg(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private iobyxmoadg() {
        this(null);
    }
}
