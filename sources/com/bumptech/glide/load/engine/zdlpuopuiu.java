package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class zdlpuopuiu implements l8.eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final g9.nufgyqmvbu f21020btonecajqb = new g9.nufgyqmvbu(50);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final l8.gtknphoqwx f21021dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f21022eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f21023gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Class f21024lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final l8.lqeggnwhkg f21025nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l8.eablkybsjg f21026ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final l8.eablkybsjg f21027wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.zoijcleaow f21028zoijcleaow;

    zdlpuopuiu(o8.zoijcleaow zoijcleaowVar, l8.eablkybsjg eablkybsjgVar, l8.eablkybsjg eablkybsjgVar2, int i13, int i14, l8.gtknphoqwx gtknphoqwxVar, Class cls, l8.lqeggnwhkg lqeggnwhkgVar) {
        this.f21028zoijcleaow = zoijcleaowVar;
        this.f21026ppxfxbqfkf = eablkybsjgVar;
        this.f21027wkgbmnqykc = eablkybsjgVar2;
        this.f21022eablkybsjg = i13;
        this.f21023gxszxtbevo = i14;
        this.f21021dxjokdxxww = gtknphoqwxVar;
        this.f21024lqeggnwhkg = cls;
        this.f21025nufgyqmvbu = lqeggnwhkgVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] ppxfxbqfkf() {
        g9.nufgyqmvbu nufgyqmvbuVar = f21020btonecajqb;
        byte[] bArr = (byte[]) nufgyqmvbuVar.lqeggnwhkg(this.f21024lqeggnwhkg);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f21024lqeggnwhkg.getName().getBytes(l8.eablkybsjg.f61829iobyxmoadg);
        nufgyqmvbuVar.gtknphoqwx(this.f21024lqeggnwhkg, bytes);
        return bytes;
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof zdlpuopuiu)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
        return this.f21023gxszxtbevo == zdlpuopuiuVar.f21023gxszxtbevo && this.f21022eablkybsjg == zdlpuopuiuVar.f21022eablkybsjg && g9.draadjrbmk.wkgbmnqykc(this.f21021dxjokdxxww, zdlpuopuiuVar.f21021dxjokdxxww) && this.f21024lqeggnwhkg.equals(zdlpuopuiuVar.f21024lqeggnwhkg) && this.f21026ppxfxbqfkf.equals(zdlpuopuiuVar.f21026ppxfxbqfkf) && this.f21027wkgbmnqykc.equals(zdlpuopuiuVar.f21027wkgbmnqykc) && this.f21025nufgyqmvbu.equals(zdlpuopuiuVar.f21025nufgyqmvbu);
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        int iHashCode = (((((this.f21026ppxfxbqfkf.hashCode() * 31) + this.f21027wkgbmnqykc.hashCode()) * 31) + this.f21022eablkybsjg) * 31) + this.f21023gxszxtbevo;
        l8.gtknphoqwx gtknphoqwxVar = this.f21021dxjokdxxww;
        if (gtknphoqwxVar != null) {
            iHashCode = (iHashCode * 31) + gtknphoqwxVar.hashCode();
        }
        return (((iHashCode * 31) + this.f21024lqeggnwhkg.hashCode()) * 31) + this.f21025nufgyqmvbu.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f21026ppxfxbqfkf + ", signature=" + this.f21027wkgbmnqykc + ", width=" + this.f21022eablkybsjg + ", height=" + this.f21023gxszxtbevo + ", decodedResourceClass=" + this.f21024lqeggnwhkg + ", transformation='" + this.f21021dxjokdxxww + "', options=" + this.f21025nufgyqmvbu + '}';
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f21028zoijcleaow.wkgbmnqykc(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f21022eablkybsjg).putInt(this.f21023gxszxtbevo).array();
        this.f21027wkgbmnqykc.zoijcleaow(messageDigest);
        this.f21026ppxfxbqfkf.zoijcleaow(messageDigest);
        messageDigest.update(bArr);
        l8.gtknphoqwx gtknphoqwxVar = this.f21021dxjokdxxww;
        if (gtknphoqwxVar != null) {
            gtknphoqwxVar.zoijcleaow(messageDigest);
        }
        this.f21025nufgyqmvbu.zoijcleaow(messageDigest);
        messageDigest.update(ppxfxbqfkf());
        this.f21028zoijcleaow.eablkybsjg(bArr);
    }
}
