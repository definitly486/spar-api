package m6;

import g6.jyumaefscl;
import g6.yggfygwlhe;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends m6.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f65279ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f65280wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f65281zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        String strDxjokdxxww = yggfygwlhe.dxjokdxxww("NetworkMeteredCtrlr");
        zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f65280wkgbmnqykc = strDxjokdxxww;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(n6.nufgyqmvbu tracker) {
        super(tracker);
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.f65281zoijcleaow = 7;
    }

    @Override // m6.iobyxmoadg
    protected int eablkybsjg() {
        return this.f65281zoijcleaow;
    }

    @Override // m6.wkgbmnqykc
    public boolean iobyxmoadg(p6.yggfygwlhe workSpec) {
        zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        return workSpec.f75789btonecajqb.gxszxtbevo() == jyumaefscl.METERED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.iobyxmoadg
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public boolean gxszxtbevo(l6.wkgbmnqykc value) {
        zdlpuopuiu.btonecajqb(value, "value");
        return (value.iobyxmoadg() && value.zoijcleaow()) ? false : true;
    }
}
