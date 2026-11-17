package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/iozdgvuglv;", "Lw0/nufgyqmvbu;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(FFFFZLtg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/iozdgvuglv;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/iozdgvuglv;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "F", "ppxfxbqfkf", "wkgbmnqykc", "eablkybsjg", "gxszxtbevo", "Z", "lqeggnwhkg", "Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SizeElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    public /* synthetic */ SizeElement(float f13, float f14, float f15, float f16, boolean z13, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, z13, draadjrbmkVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return w0.nufgyqmvbu.dxjokdxxww(this.minWidth, sizeElement.minWidth) && w0.nufgyqmvbu.dxjokdxxww(this.minHeight, sizeElement.minHeight) && w0.nufgyqmvbu.dxjokdxxww(this.maxWidth, sizeElement.maxWidth) && w0.nufgyqmvbu.dxjokdxxww(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    public int hashCode() {
        return (((((((w0.nufgyqmvbu.btonecajqb(this.minWidth) * 31) + w0.nufgyqmvbu.btonecajqb(this.minHeight)) * 31) + w0.nufgyqmvbu.btonecajqb(this.maxWidth)) * 31) + w0.nufgyqmvbu.btonecajqb(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(iozdgvuglv node) {
        node.O0(this.minWidth);
        node.N0(this.minHeight);
        node.M0(this.maxWidth);
        node.L0(this.maxHeight);
        node.K0(this.enforceIncoming);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public iozdgvuglv btonecajqb() {
        return new iozdgvuglv(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    public /* synthetic */ SizeElement(float f13, float f14, float f15, float f16, boolean z13, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf() : f13, (i13 & 2) != 0 ? w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf() : f14, (i13 & 4) != 0 ? w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf() : f15, (i13 & 8) != 0 ? w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf() : f16, z13, draadjrbmkVar, null);
    }

    private SizeElement(float f13, float f14, float f15, float f16, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        this.minWidth = f13;
        this.minHeight = f14;
        this.maxWidth = f15;
        this.maxHeight = f16;
        this.enforceIncoming = z13;
        this.inspectorInfo = draadjrbmkVar;
    }
}
