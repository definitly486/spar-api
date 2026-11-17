package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/gxszxtbevo;", "La/eablkybsjg;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(La/eablkybsjg;ZLtg/draadjrbmk;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/gxszxtbevo;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/gxszxtbevo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "La/eablkybsjg;", "getAlignment", "()La/eablkybsjg;", "ppxfxbqfkf", "Z", "getMatchParentSize", "()Z", "wkgbmnqykc", "Ltg/draadjrbmk;", "getInspectorInfo", "()Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BoxChildDataElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final boolean matchParentSize;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final a.eablkybsjg alignment;

    public BoxChildDataElement(a.eablkybsjg eablkybsjgVar, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        this.alignment = eablkybsjgVar;
        this.matchParentSize = z13;
        this.inspectorInfo = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = other instanceof BoxChildDataElement ? (BoxChildDataElement) other : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(gxszxtbevo node) {
        node.K0(this.alignment);
        node.L0(this.matchParentSize);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo btonecajqb() {
        return new gxszxtbevo(this.alignment, this.matchParentSize);
    }
}
