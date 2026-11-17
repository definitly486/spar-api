package fk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ageimvtcrz implements ek.eablkybsjg, ek.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f34098iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f34099zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hcddaimhww(ageimvtcrz ageimvtcrzVar, bk.iobyxmoadg iobyxmoadgVar, Object obj) {
        return (iobyxmoadgVar.iobyxmoadg().zoijcleaow() || ageimvtcrzVar.cdpycssgdh()) ? ageimvtcrzVar.hkdspvbjdz(iobyxmoadgVar, obj) : ageimvtcrzVar.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object jpowsppfya(ageimvtcrz ageimvtcrzVar, bk.iobyxmoadg iobyxmoadgVar, Object obj) {
        return ageimvtcrzVar.hkdspvbjdz(iobyxmoadgVar, obj);
    }

    private final Object okpsazkaxt(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
        ikoacuggdj(obj);
        Object objInvoke = iobyxmoadgVar.invoke();
        if (!this.f34099zoijcleaow) {
            jhduphickx();
        }
        this.f34099zoijcleaow = false;
        return objInvoke;
    }

    @Override // ek.eablkybsjg
    public final long agtfadlqog() {
        return ulzqkzuiru(jhduphickx());
    }

    @Override // ek.ppxfxbqfkf
    public final ek.eablkybsjg btonecajqb(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return mbcevpiqjq(ribwqtqdhb(descriptor, i13), descriptor.lqeggnwhkg(i13));
    }

    protected abstract boolean cllcsxoeiz(Object obj);

    @Override // ek.eablkybsjg
    public final boolean cqumvgiudr() {
        return cllcsxoeiz(jhduphickx());
    }

    protected abstract String crxdokpmqz(Object obj);

    @Override // ek.ppxfxbqfkf
    public final short draadjrbmk(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return sopmlzcsov(ribwqtqdhb(descriptor, i13));
    }

    protected abstract byte dsvhmnatus(Object obj);

    @Override // ek.ppxfxbqfkf
    public final int dxjokdxxww(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return ntlheqmsrt(ribwqtqdhb(descriptor, i13));
    }

    @Override // ek.eablkybsjg
    public abstract Object eablkybsjg(bk.iobyxmoadg iobyxmoadgVar);

    @Override // ek.eablkybsjg
    public final char esjtqupxsv() {
        return wypolnanlu(jhduphickx());
    }

    @Override // ek.eablkybsjg
    public final Void gtknphoqwx() {
        return null;
    }

    @Override // ek.ppxfxbqfkf
    public int gxszxtbevo(dk.gxszxtbevo gxszxtbevoVar) {
        return ek.ppxfxbqfkf.iobyxmoadg.iobyxmoadg(this, gxszxtbevoVar);
    }

    protected Object hkdspvbjdz(bk.iobyxmoadg deserializer, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        return eablkybsjg(deserializer);
    }

    protected final void ikoacuggdj(Object obj) {
        this.f34098iobyxmoadg.add(obj);
    }

    @Override // ek.ppxfxbqfkf
    public final Object iozdgvuglv(dk.gxszxtbevo descriptor, int i13, final bk.iobyxmoadg deserializer, final Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        return okpsazkaxt(ribwqtqdhb(descriptor, i13), new tg.iobyxmoadg() { // from class: fk.fiwbwshyhd
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ageimvtcrz.hcddaimhww(this.f34135zdlpuopuiu, deserializer, obj);
            }
        });
    }

    @Override // ek.eablkybsjg
    public ek.eablkybsjg istkbnxepw(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return mbcevpiqjq(jhduphickx(), descriptor);
    }

    @Override // ek.eablkybsjg
    public final double iwizpuwonk() {
        return stevsuqkhv(jhduphickx());
    }

    protected final Object jhduphickx() {
        ArrayList arrayList = this.f34098iobyxmoadg;
        Object objRemove = arrayList.remove(hg.jyumaefscl.ojitshcjhn(arrayList));
        this.f34099zoijcleaow = true;
        return objRemove;
    }

    protected final Object jlmebxxoox() {
        return hg.jyumaefscl.lxfrhoxuzk(this.f34098iobyxmoadg);
    }

    @Override // ek.eablkybsjg
    public final float jyumaefscl() {
        return tzroggbefp(jhduphickx());
    }

    @Override // ek.ppxfxbqfkf
    public boolean kcexrzcfyt() {
        return ek.ppxfxbqfkf.iobyxmoadg.zoijcleaow(this);
    }

    protected abstract int kegysxyocb(Object obj, dk.gxszxtbevo gxszxtbevoVar);

    @Override // ek.ppxfxbqfkf
    public final Object lereixgezr(dk.gxszxtbevo descriptor, int i13, final bk.iobyxmoadg deserializer, final Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        return okpsazkaxt(ribwqtqdhb(descriptor, i13), new tg.iobyxmoadg() { // from class: fk.hszhottldk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ageimvtcrz.jpowsppfya(this.f34148zdlpuopuiu, deserializer, obj);
            }
        });
    }

    @Override // ek.eablkybsjg
    public final byte lmojexxdyd() {
        return dsvhmnatus(jhduphickx());
    }

    protected ek.eablkybsjg mbcevpiqjq(Object obj, dk.gxszxtbevo inlineDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inlineDescriptor, "inlineDescriptor");
        ikoacuggdj(obj);
        return this;
    }

    protected abstract int ntlheqmsrt(Object obj);

    @Override // ek.eablkybsjg
    public final int nufgyqmvbu() {
        return ntlheqmsrt(jhduphickx());
    }

    @Override // ek.ppxfxbqfkf
    public final boolean ojitshcjhn(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return cllcsxoeiz(ribwqtqdhb(descriptor, i13));
    }

    @Override // ek.eablkybsjg
    public final int oxmwwwfdhm(dk.gxszxtbevo enumDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumDescriptor, "enumDescriptor");
        return kegysxyocb(jhduphickx(), enumDescriptor);
    }

    @Override // ek.eablkybsjg
    public final String pmvmpeiblj() {
        return crxdokpmqz(jhduphickx());
    }

    @Override // ek.ppxfxbqfkf
    public final byte rgvfuqvkyq(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return dsvhmnatus(ribwqtqdhb(descriptor, i13));
    }

    protected abstract Object ribwqtqdhb(dk.gxszxtbevo gxszxtbevoVar, int i13);

    protected abstract short sopmlzcsov(Object obj);

    protected abstract double stevsuqkhv(Object obj);

    protected abstract float tzroggbefp(Object obj);

    protected abstract long ulzqkzuiru(Object obj);

    @Override // ek.ppxfxbqfkf
    public final String vdvldrhtss(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return crxdokpmqz(ribwqtqdhb(descriptor, i13));
    }

    public final ArrayList vipkmwdibw() {
        return this.f34098iobyxmoadg;
    }

    @Override // ek.ppxfxbqfkf
    public final char wflxmlrfwp(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return wypolnanlu(ribwqtqdhb(descriptor, i13));
    }

    @Override // ek.ppxfxbqfkf
    public final long wwaezpbzkn(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return ulzqkzuiru(ribwqtqdhb(descriptor, i13));
    }

    protected abstract char wypolnanlu(Object obj);

    @Override // ek.eablkybsjg
    public final short yggfygwlhe() {
        return sopmlzcsov(jhduphickx());
    }

    @Override // ek.ppxfxbqfkf
    public final double zdlpuopuiu(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return stevsuqkhv(ribwqtqdhb(descriptor, i13));
    }

    @Override // ek.ppxfxbqfkf
    public final float zynmafqrjb(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return tzroggbefp(ribwqtqdhb(descriptor, i13));
    }
}
