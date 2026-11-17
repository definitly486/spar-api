package mh;

import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn extends agtfadlqog implements jh.hkdspvbjdz {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ii.ppxfxbqfkf f67176cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f67177esjtqupxsv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwaezpbzkn(jh.lmojexxdyd module, ii.ppxfxbqfkf fqName) {
        super(module, kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), fqName.nufgyqmvbu(), xrmfcynszj.f51348iobyxmoadg);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        this.f67176cqumvgiudr = fqName;
        this.f67177esjtqupxsv = "package " + fqName + " of " + module;
    }

    @Override // jh.hkdspvbjdz
    public final ii.ppxfxbqfkf gxszxtbevo() {
        return this.f67176cqumvgiudr;
    }

    @Override // mh.agtfadlqog, jh.rgvfuqvkyq
    public xrmfcynszj lqeggnwhkg() {
        xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn visitor, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visitor, "visitor");
        return visitor.draadjrbmk(this, obj);
    }

    @Override // mh.wflxmlrfwp
    public String toString() {
        return this.f67177esjtqupxsv;
    }

    @Override // mh.agtfadlqog, jh.wflxmlrfwp
    public jh.lmojexxdyd zoijcleaow() {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = super.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (jh.lmojexxdyd) wflxmlrfwpVarZoijcleaow;
    }
}
