package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/zoijcleaow;", "Lx/iobyxmoadg;", "alignmentLine", "Lw0/nufgyqmvbu;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(Lx/iobyxmoadg;FFLtg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/zoijcleaow;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/zoijcleaow;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lx/iobyxmoadg;", "getAlignmentLine", "()Lx/iobyxmoadg;", "ppxfxbqfkf", "F", "getBefore-D9Ej5fM", "()F", "wkgbmnqykc", "getAfter-D9Ej5fM", "eablkybsjg", "Ltg/draadjrbmk;", "getInspectorInfo", "()Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final x.iobyxmoadg alignmentLine;

    public /* synthetic */ AlignmentLineOffsetDpElement(x.iobyxmoadg iobyxmoadgVar, float f13, float f14, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, f13, f14, draadjrbmkVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && w0.nufgyqmvbu.dxjokdxxww(this.before, alignmentLineOffsetDpElement.before) && w0.nufgyqmvbu.dxjokdxxww(this.after, alignmentLineOffsetDpElement.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + w0.nufgyqmvbu.btonecajqb(this.before)) * 31) + w0.nufgyqmvbu.btonecajqb(this.after);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(zoijcleaow node) {
        node.I0(this.alignmentLine);
        node.J0(this.before);
        node.H0(this.after);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb() {
        return new zoijcleaow(this.alignmentLine, this.before, this.after, null);
    }

    private AlignmentLineOffsetDpElement(x.iobyxmoadg iobyxmoadgVar, float f13, float f14, tg.draadjrbmk draadjrbmkVar) {
        this.alignmentLine = iobyxmoadgVar;
        this.before = f13;
        this.after = f14;
        this.inspectorInfo = draadjrbmkVar;
        boolean z13 = true;
        boolean z14 = f13 >= 0.0f || Float.isNaN(f13);
        if (f14 < 0.0f && !Float.isNaN(f14)) {
            z13 = false;
        }
        if (!z14 || !z13) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("Padding from alignment line must be a non-negative number");
        }
    }
}
