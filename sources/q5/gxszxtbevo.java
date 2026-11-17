package q5;

import android.os.Bundle;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s5.zoijcleaow f77854iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private q5.zoijcleaow.C1741zoijcleaow f77855zoijcleaow;

    public interface iobyxmoadg {
        void iobyxmoadg(dxjokdxxww dxjokdxxwwVar);
    }

    public interface zoijcleaow {
        Bundle iobyxmoadg();
    }

    public gxszxtbevo(s5.zoijcleaow impl) {
        zdlpuopuiu.btonecajqb(impl, "impl");
        this.f77854iobyxmoadg = impl;
    }

    public final void eablkybsjg(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f77854iobyxmoadg.gtknphoqwx(key);
    }

    public final Bundle iobyxmoadg(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this.f77854iobyxmoadg.ppxfxbqfkf(key);
    }

    public final void ppxfxbqfkf(String key, zoijcleaow provider) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(provider, "provider");
        this.f77854iobyxmoadg.btonecajqb(key, provider);
    }

    public final void wkgbmnqykc(Class clazz) {
        zdlpuopuiu.btonecajqb(clazz, "clazz");
        if (!this.f77854iobyxmoadg.eablkybsjg()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        q5.zoijcleaow.C1741zoijcleaow c1741zoijcleaow = this.f77855zoijcleaow;
        if (c1741zoijcleaow == null) {
            c1741zoijcleaow = new q5.zoijcleaow.C1741zoijcleaow(this);
        }
        this.f77855zoijcleaow = c1741zoijcleaow;
        try {
            clazz.getDeclaredConstructor(null);
            q5.zoijcleaow.C1741zoijcleaow c1741zoijcleaow2 = this.f77855zoijcleaow;
            if (c1741zoijcleaow2 != null) {
                String name = clazz.getName();
                zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                c1741zoijcleaow2.zoijcleaow(name);
            }
        } catch (NoSuchMethodException e13) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e13);
        }
    }

    public final zoijcleaow zoijcleaow(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this.f77854iobyxmoadg.wkgbmnqykc(key);
    }
}
