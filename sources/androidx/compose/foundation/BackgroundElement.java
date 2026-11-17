package androidx.compose.foundation;

import h.e;
import h.jztzpxfvev;
import h.oipsdeybqn;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/wkgbmnqykc;", "Lh/oipsdeybqn;", "color", "Lh/jztzpxfvev;", "brush", "", "alpha", "Lh/e;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(JLh/jztzpxfvev;FLh/e;Ltg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/wkgbmnqykc;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/wkgbmnqykc;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "J", "ppxfxbqfkf", "Lh/jztzpxfvev;", "wkgbmnqykc", "F", "eablkybsjg", "Lh/e;", "gxszxtbevo", "Ltg/draadjrbmk;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BackgroundElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final e shape;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final jztzpxfvev brush;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final long color;

    public /* synthetic */ BackgroundElement(long j13, jztzpxfvev jztzpxfvevVar, float f13, e eVar, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, jztzpxfvevVar, f13, eVar, draadjrbmkVar);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && oipsdeybqn.ojitshcjhn(this.color, backgroundElement.color) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.shape, backgroundElement.shape);
    }

    public int hashCode() {
        int iYggfygwlhe = oipsdeybqn.yggfygwlhe(this.color) * 31;
        jztzpxfvev jztzpxfvevVar = this.brush;
        return ((((iYggfygwlhe + (jztzpxfvevVar != null ? jztzpxfvevVar.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(wkgbmnqykc node) {
        node.N0(this.color);
        node.M0(this.brush);
        node.eablkybsjg(this.alpha);
        node.weqkydbzbr(this.shape);
        z.yggfygwlhe.iobyxmoadg(node);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc btonecajqb() {
        return new wkgbmnqykc(this.color, this.brush, this.alpha, this.shape, null);
    }

    public /* synthetic */ BackgroundElement(long j13, jztzpxfvev jztzpxfvevVar, float f13, e eVar, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? oipsdeybqn.f38945zoijcleaow.lqeggnwhkg() : j13, (i13 & 2) != 0 ? null : jztzpxfvevVar, f13, eVar, draadjrbmkVar, null);
    }

    private BackgroundElement(long j13, jztzpxfvev jztzpxfvevVar, float f13, e eVar, tg.draadjrbmk draadjrbmkVar) {
        this.color = j13;
        this.brush = jztzpxfvevVar;
        this.alpha = f13;
        this.shape = eVar;
        this.inspectorInfo = draadjrbmkVar;
    }
}
