package ph;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class wwaezpbzkn extends yadqdtsiqt implements zh.istkbnxepw {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Collection f76614ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f76615wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final WildcardType f76616zoijcleaow;

    public wwaezpbzkn(WildcardType reflectType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reflectType, "reflectType");
        this.f76616zoijcleaow = reflectType;
        this.f76614ppxfxbqfkf = hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return this.f76615wkgbmnqykc;
    }

    @Override // zh.wkgbmnqykc
    public Collection getAnnotations() {
        return this.f76614ppxfxbqfkf;
    }

    @Override // zh.istkbnxepw
    public boolean hkdspvbjdz() {
        Type[] upperBounds = stevsuqkhv().getUpperBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
        return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hg.agtfadlqog.ydmasvzmpa(upperBounds), Object.class);
    }

    @Override // zh.istkbnxepw
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt cqumvgiudr() {
        Type[] upperBounds = stevsuqkhv().getUpperBounds();
        Type[] lowerBounds = stevsuqkhv().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + stevsuqkhv());
        }
        if (lowerBounds.length == 1) {
            yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f76617iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lowerBounds);
            Object objIxidwrxhsl = hg.agtfadlqog.ixidwrxhsl(lowerBounds);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objIxidwrxhsl, "single(...)");
            return iobyxmoadgVar.iobyxmoadg((Type) objIxidwrxhsl);
        }
        if (upperBounds.length == 1) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(upperBounds);
            Type type = (Type) hg.agtfadlqog.ixidwrxhsl(upperBounds);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(type, Object.class)) {
                yadqdtsiqt.iobyxmoadg iobyxmoadgVar2 = yadqdtsiqt.f76617iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(type);
                return iobyxmoadgVar2.iobyxmoadg(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ph.yadqdtsiqt
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public WildcardType stevsuqkhv() {
        return this.f76616zoijcleaow;
    }
}
