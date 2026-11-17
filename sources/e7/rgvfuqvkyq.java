package e7;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f30760eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f30761gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f30762iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f30763lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x6.wkgbmnqykc f30764ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MemoryCache.Key f30765wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f30766zoijcleaow;

    public rgvfuqvkyq(Drawable drawable, nufgyqmvbu nufgyqmvbuVar, x6.wkgbmnqykc wkgbmnqykcVar, MemoryCache.Key key, String str, boolean z13, boolean z14) {
        super(null);
        this.f30762iobyxmoadg = drawable;
        this.f30766zoijcleaow = nufgyqmvbuVar;
        this.f30764ppxfxbqfkf = wkgbmnqykcVar;
        this.f30765wkgbmnqykc = key;
        this.f30760eablkybsjg = str;
        this.f30761gxszxtbevo = z13;
        this.f30763lqeggnwhkg = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rgvfuqvkyq) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), rgvfuqvkyqVar.iobyxmoadg()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), rgvfuqvkyqVar.zoijcleaow()) && this.f30764ppxfxbqfkf == rgvfuqvkyqVar.f30764ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30765wkgbmnqykc, rgvfuqvkyqVar.f30765wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30760eablkybsjg, rgvfuqvkyqVar.f30760eablkybsjg) && this.f30761gxszxtbevo == rgvfuqvkyqVar.f30761gxszxtbevo && this.f30763lqeggnwhkg == rgvfuqvkyqVar.f30763lqeggnwhkg) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((iobyxmoadg().hashCode() * 31) + zoijcleaow().hashCode()) * 31) + this.f30764ppxfxbqfkf.hashCode()) * 31;
        MemoryCache.Key key = this.f30765wkgbmnqykc;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f30760eablkybsjg;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f30761gxszxtbevo)) * 31) + Boolean.hashCode(this.f30763lqeggnwhkg);
    }

    @Override // e7.dxjokdxxww
    public Drawable iobyxmoadg() {
        return this.f30762iobyxmoadg;
    }

    public final x6.wkgbmnqykc ppxfxbqfkf() {
        return this.f30764ppxfxbqfkf;
    }

    @Override // e7.dxjokdxxww
    public nufgyqmvbu zoijcleaow() {
        return this.f30766zoijcleaow;
    }
}
