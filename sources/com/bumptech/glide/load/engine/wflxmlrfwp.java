package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class wflxmlrfwp implements l8.eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f21007btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final l8.lqeggnwhkg f21008dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Class f21009eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Class f21010gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l8.eablkybsjg f21011lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Map f21012nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f21013ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f21014wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f21015zoijcleaow;

    wflxmlrfwp(Object obj, l8.eablkybsjg eablkybsjgVar, int i13, int i14, Map map, Class cls, Class cls2, l8.lqeggnwhkg lqeggnwhkgVar) {
        this.f21015zoijcleaow = g9.gtknphoqwx.eablkybsjg(obj);
        this.f21011lqeggnwhkg = (l8.eablkybsjg) g9.gtknphoqwx.gxszxtbevo(eablkybsjgVar, "Signature must not be null");
        this.f21013ppxfxbqfkf = i13;
        this.f21014wkgbmnqykc = i14;
        this.f21012nufgyqmvbu = (Map) g9.gtknphoqwx.eablkybsjg(map);
        this.f21009eablkybsjg = (Class) g9.gtknphoqwx.gxszxtbevo(cls, "Resource class must not be null");
        this.f21010gxszxtbevo = (Class) g9.gtknphoqwx.gxszxtbevo(cls2, "Transcode class must not be null");
        this.f21008dxjokdxxww = (l8.lqeggnwhkg) g9.gtknphoqwx.eablkybsjg(lqeggnwhkgVar);
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return this.f21015zoijcleaow.equals(wflxmlrfwpVar.f21015zoijcleaow) && this.f21011lqeggnwhkg.equals(wflxmlrfwpVar.f21011lqeggnwhkg) && this.f21014wkgbmnqykc == wflxmlrfwpVar.f21014wkgbmnqykc && this.f21013ppxfxbqfkf == wflxmlrfwpVar.f21013ppxfxbqfkf && this.f21012nufgyqmvbu.equals(wflxmlrfwpVar.f21012nufgyqmvbu) && this.f21009eablkybsjg.equals(wflxmlrfwpVar.f21009eablkybsjg) && this.f21010gxszxtbevo.equals(wflxmlrfwpVar.f21010gxszxtbevo) && this.f21008dxjokdxxww.equals(wflxmlrfwpVar.f21008dxjokdxxww);
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        if (this.f21007btonecajqb == 0) {
            int iHashCode = this.f21015zoijcleaow.hashCode();
            this.f21007btonecajqb = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f21011lqeggnwhkg.hashCode()) * 31) + this.f21013ppxfxbqfkf) * 31) + this.f21014wkgbmnqykc;
            this.f21007btonecajqb = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f21012nufgyqmvbu.hashCode();
            this.f21007btonecajqb = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f21009eablkybsjg.hashCode();
            this.f21007btonecajqb = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f21010gxszxtbevo.hashCode();
            this.f21007btonecajqb = iHashCode5;
            this.f21007btonecajqb = (iHashCode5 * 31) + this.f21008dxjokdxxww.hashCode();
        }
        return this.f21007btonecajqb;
    }

    public String toString() {
        return "EngineKey{model=" + this.f21015zoijcleaow + ", width=" + this.f21013ppxfxbqfkf + ", height=" + this.f21014wkgbmnqykc + ", resourceClass=" + this.f21009eablkybsjg + ", transcodeClass=" + this.f21010gxszxtbevo + ", signature=" + this.f21011lqeggnwhkg + ", hashCode=" + this.f21007btonecajqb + ", transformations=" + this.f21012nufgyqmvbu + ", options=" + this.f21008dxjokdxxww + '}';
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
