package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WrapContentElement;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/pkzmftpjix;", "Lczzsidtyhn/yggfygwlhe;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lw0/oxmwwwfdhm;", "Lw0/zdlpuopuiu;", "Lw0/agtfadlqog;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Lczzsidtyhn/yggfygwlhe;ZLtg/rgvfuqvkyq;Ljava/lang/Object;Ljava/lang/String;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/pkzmftpjix;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/layout/pkzmftpjix;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lczzsidtyhn/yggfygwlhe;", "ppxfxbqfkf", "Z", "wkgbmnqykc", "Ltg/rgvfuqvkyq;", "eablkybsjg", "Ljava/lang/Object;", "gxszxtbevo", "Ljava/lang/String;", "lqeggnwhkg", "iobyxmoadg", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapContentElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final tg.rgvfuqvkyq alignmentCallback;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final czzsidtyhn.yggfygwlhe direction;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w0.agtfadlqog dxjokdxxww(a.eablkybsjg.zoijcleaow zoijcleaowVar, w0.oxmwwwfdhm oxmwwwfdhmVar, w0.zdlpuopuiu zdlpuopuiuVar) {
            return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) zoijcleaowVar.iobyxmoadg(0, (int) (oxmwwwfdhmVar.btonecajqb() >> 32), zdlpuopuiuVar)) << 32) | (((long) 0) & 4294967295L)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w0.agtfadlqog eablkybsjg(a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, w0.oxmwwwfdhm oxmwwwfdhmVar, w0.zdlpuopuiu zdlpuopuiuVar) {
            return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) 0) << 32) | (4294967295L & ((long) ppxfxbqfkfVar.iobyxmoadg(0, (int) (oxmwwwfdhmVar.btonecajqb() & 4294967295L))))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w0.agtfadlqog lqeggnwhkg(a.eablkybsjg eablkybsjgVar, w0.oxmwwwfdhm oxmwwwfdhmVar, w0.zdlpuopuiu zdlpuopuiuVar) {
            return w0.agtfadlqog.ppxfxbqfkf(eablkybsjgVar.iobyxmoadg(w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg(), oxmwwwfdhmVar.btonecajqb(), zdlpuopuiuVar));
        }

        public final WrapContentElement gxszxtbevo(final a.eablkybsjg eablkybsjgVar, boolean z13) {
            return new WrapContentElement(czzsidtyhn.yggfygwlhe.Both, z13, new tg.rgvfuqvkyq() { // from class: czzsidtyhn.jrbgnlbqoe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.Companion.lqeggnwhkg(eablkybsjgVar, (w0.oxmwwwfdhm) obj, (w0.zdlpuopuiu) obj2);
                }
            }, eablkybsjgVar, "wrapContentSize");
        }

        public final WrapContentElement nufgyqmvbu(final a.eablkybsjg.zoijcleaow zoijcleaowVar, boolean z13) {
            return new WrapContentElement(czzsidtyhn.yggfygwlhe.Horizontal, z13, new tg.rgvfuqvkyq() { // from class: czzsidtyhn.mhtqkkgtqm
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.Companion.dxjokdxxww(zoijcleaowVar, (w0.oxmwwwfdhm) obj, (w0.zdlpuopuiu) obj2);
                }
            }, zoijcleaowVar, "wrapContentWidth");
        }

        public final WrapContentElement wkgbmnqykc(final a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
            return new WrapContentElement(czzsidtyhn.yggfygwlhe.Vertical, z13, new tg.rgvfuqvkyq() { // from class: czzsidtyhn.ixidwrxhsl
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return WrapContentElement.Companion.eablkybsjg(ppxfxbqfkfVar, (w0.oxmwwwfdhm) obj, (w0.zdlpuopuiu) obj2);
                }
            }, ppxfxbqfkfVar, "wrapContentHeight");
        }

        private Companion() {
        }
    }

    public WrapContentElement(czzsidtyhn.yggfygwlhe yggfygwlheVar, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj, String str) {
        this.direction = yggfygwlheVar;
        this.unbounded = z13;
        this.alignmentCallback = rgvfuqvkyqVar;
        this.align = obj;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.align, wrapContentElement.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(pkzmftpjix node) {
        node.K0(this.direction);
        node.L0(this.unbounded);
        node.J0(this.alignmentCallback);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public pkzmftpjix btonecajqb() {
        return new pkzmftpjix(this.direction, this.unbounded, this.alignmentCallback);
    }
}
