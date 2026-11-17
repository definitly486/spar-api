package gk;

import hk.hkdspvbjdz;
import hk.jpowsppfya;
import hk.ylkuphrtab;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements bk.oxmwwwfdhm {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f37751wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f37752iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hk.agtfadlqog f37753ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ik.zoijcleaow f37754zoijcleaow;

    public static final class iobyxmoadg extends zoijcleaow {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
            super(new lqeggnwhkg(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), ik.ppxfxbqfkf.iobyxmoadg(), null);
        }
    }

    public /* synthetic */ zoijcleaow(lqeggnwhkg lqeggnwhkgVar, ik.zoijcleaow zoijcleaowVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(lqeggnwhkgVar, zoijcleaowVar);
    }

    public final lqeggnwhkg eablkybsjg() {
        return this.f37752iobyxmoadg;
    }

    public final hk.agtfadlqog gxszxtbevo() {
        return this.f37753ppxfxbqfkf;
    }

    @Override // bk.draadjrbmk
    public ik.zoijcleaow iobyxmoadg() {
        return this.f37754zoijcleaow;
    }

    @Override // bk.oxmwwwfdhm
    public final Object ppxfxbqfkf(bk.iobyxmoadg deserializer, String string) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        hk.wwaezpbzkn wwaezpbzknVarIobyxmoadg = ylkuphrtab.iobyxmoadg(this, string);
        Object objEablkybsjg = new hk.yadqdtsiqt(this, hkdspvbjdz.OBJ, wwaezpbzknVarIobyxmoadg, deserializer.iobyxmoadg(), null).eablkybsjg(deserializer);
        wwaezpbzknVarIobyxmoadg.jyumaefscl();
        return objEablkybsjg;
    }

    public final Object wkgbmnqykc(bk.iobyxmoadg deserializer, btonecajqb element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        return jpowsppfya.iobyxmoadg(this, element, deserializer);
    }

    @Override // bk.oxmwwwfdhm
    public final String zoijcleaow(bk.agtfadlqog serializer, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serializer, "serializer");
        hk.cqumvgiudr cqumvgiudrVar = new hk.cqumvgiudr();
        try {
            hk.iwizpuwonk.iobyxmoadg(this, cqumvgiudrVar, serializer, obj);
            return cqumvgiudrVar.toString();
        } finally {
            cqumvgiudrVar.nufgyqmvbu();
        }
    }

    private zoijcleaow(lqeggnwhkg lqeggnwhkgVar, ik.zoijcleaow zoijcleaowVar) {
        this.f37752iobyxmoadg = lqeggnwhkgVar;
        this.f37754zoijcleaow = zoijcleaowVar;
        this.f37753ppxfxbqfkf = new hk.agtfadlqog();
    }
}
