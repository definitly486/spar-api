package androidx.compose.foundation.lazy.layout;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz implements jpowsppfya, androidx.compose.ui.layout.draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zynmafqrjb f4998jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final x.kegysxyocb f4999yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final esjtqupxsv f5000zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f4997iwizpuwonk = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f4996cqumvgiudr = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();

    public hkdspvbjdz(esjtqupxsv esjtqupxsvVar, x.kegysxyocb kegysxyocbVar) {
        this.f5000zdlpuopuiu = esjtqupxsvVar;
        this.f4999yggfygwlhe = kegysxyocbVar;
        this.f4998jyumaefscl = (zynmafqrjb) esjtqupxsvVar.wkgbmnqykc().invoke();
    }

    @Override // w0.wkgbmnqykc
    public float A(float f13) {
        return this.f4999yggfygwlhe.A(f13);
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f4999yggfygwlhe.F();
    }

    @Override // w0.wkgbmnqykc
    public float I(float f13) {
        return this.f4999yggfygwlhe.I(f13);
    }

    @Override // androidx.compose.foundation.lazy.layout.jpowsppfya
    public List N(int i13) {
        List list = (List) this.f4996cqumvgiudr.zoijcleaow(i13);
        if (list != null) {
            return list;
        }
        Object objWkgbmnqykc = this.f4998jyumaefscl.wkgbmnqykc(i13);
        List listFmlbqenlif = this.f4999yggfygwlhe.fmlbqenlif(objWkgbmnqykc, this.f5000zdlpuopuiu.zoijcleaow(i13, objWkgbmnqykc, this.f4998jyumaefscl.gxszxtbevo(i13)));
        this.f4996cqumvgiudr.oxmwwwfdhm(i13, listFmlbqenlif);
        return listFmlbqenlif;
    }

    @Override // w0.wkgbmnqykc
    public long V(long j13) {
        return this.f4999yggfygwlhe.V(j13);
    }

    @Override // androidx.compose.ui.layout.draadjrbmk
    public x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        return this.f4999yggfygwlhe.Z(i13, i14, map, draadjrbmkVar, draadjrbmkVar2);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f4999yggfygwlhe.getDensity();
    }

    @Override // x.wflxmlrfwp
    public w0.zdlpuopuiu getLayoutDirection() {
        return this.f4999yggfygwlhe.getLayoutDirection();
    }

    @Override // w0.wkgbmnqykc
    public int hszhottldk(float f13) {
        return this.f4999yggfygwlhe.hszhottldk(f13);
    }

    @Override // w0.wkgbmnqykc
    public long mbcevpiqjq(long j13) {
        return this.f4999yggfygwlhe.mbcevpiqjq(j13);
    }

    @Override // w0.wkgbmnqykc
    public float mhtqkkgtqm(long j13) {
        return this.f4999yggfygwlhe.mhtqkkgtqm(j13);
    }

    @Override // androidx.compose.ui.layout.draadjrbmk
    public x.istkbnxepw nuxfzjnpeb(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar) {
        return this.f4999yggfygwlhe.nuxfzjnpeb(i13, i14, map, draadjrbmkVar);
    }

    @Override // w0.draadjrbmk
    public long tzroggbefp(float f13) {
        return this.f4999yggfygwlhe.tzroggbefp(f13);
    }

    @Override // w0.wkgbmnqykc
    public long uwvvkdfqfp(float f13) {
        return this.f4999yggfygwlhe.uwvvkdfqfp(f13);
    }

    @Override // w0.draadjrbmk
    public float vipkmwdibw(long j13) {
        return this.f4999yggfygwlhe.vipkmwdibw(j13);
    }

    @Override // w0.wkgbmnqykc
    public float x(int i13) {
        return this.f4999yggfygwlhe.x(i13);
    }

    @Override // x.wflxmlrfwp
    public boolean zeieaojujs() {
        return this.f4999yggfygwlhe.zeieaojujs();
    }
}
