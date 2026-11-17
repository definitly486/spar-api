package hk;

import hg.tzroggbefp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class pmvmpeiblj extends esjtqupxsv {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f40536agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f40537draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gk.cdpycssgdh f40538gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f40539wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmvmpeiblj(gk.zoijcleaow json, gk.cdpycssgdh value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f40538gtknphoqwx = value;
        List listM = hg.jyumaefscl.m(auzgnhcxok().keySet());
        this.f40537draadjrbmk = listM;
        this.f40539wflxmlrfwp = listM.size() * 2;
        this.f40536agtfadlqog = -1;
    }

    @Override // hk.esjtqupxsv, hk.ppxfxbqfkf
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public gk.cdpycssgdh auzgnhcxok() {
        return this.f40538gtknphoqwx;
    }

    @Override // hk.esjtqupxsv, fk.vipkmwdibw
    protected String xrmfcynszj(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return (String) this.f40537draadjrbmk.get(i13 / 2);
    }

    @Override // hk.esjtqupxsv, ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        int i13 = this.f40536agtfadlqog;
        if (i13 >= this.f40539wflxmlrfwp - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f40536agtfadlqog = i14;
        return i14;
    }

    @Override // hk.esjtqupxsv, hk.ppxfxbqfkf
    protected gk.btonecajqb ydmasvzmpa(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        return this.f40536agtfadlqog % 2 == 0 ? gk.gtknphoqwx.ppxfxbqfkf(tag) : (gk.btonecajqb) tzroggbefp.btonecajqb(auzgnhcxok(), tag);
    }

    @Override // hk.esjtqupxsv, hk.ppxfxbqfkf, ek.ppxfxbqfkf
    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
    }
}
