package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/pmvmpeiblj;", "Lw0/nufgyqmvbu;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(FFFFZLtg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/pmvmpeiblj;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/pmvmpeiblj;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "ppxfxbqfkf", "getTop-D9Ej5fM", "setTop-0680j_4", "wkgbmnqykc", "getEnd-D9Ej5fM", "setEnd-0680j_4", "eablkybsjg", "getBottom-D9Ej5fM", "setBottom-0680j_4", "gxszxtbevo", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "lqeggnwhkg", "Ltg/draadjrbmk;", "getInspectorInfo", "()Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private float start;

    public /* synthetic */ PaddingElement(float f13, float f14, float f15, float f16, boolean z13, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, z13, draadjrbmkVar);
    }

    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && w0.nufgyqmvbu.dxjokdxxww(this.start, paddingElement.start) && w0.nufgyqmvbu.dxjokdxxww(this.top, paddingElement.top) && w0.nufgyqmvbu.dxjokdxxww(this.end, paddingElement.end) && w0.nufgyqmvbu.dxjokdxxww(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    public int hashCode() {
        return (((((((w0.nufgyqmvbu.btonecajqb(this.start) * 31) + w0.nufgyqmvbu.btonecajqb(this.top)) * 31) + w0.nufgyqmvbu.btonecajqb(this.end)) * 31) + w0.nufgyqmvbu.btonecajqb(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(pmvmpeiblj node) {
        node.M0(this.start);
        node.N0(this.top);
        node.K0(this.end);
        node.J0(this.bottom);
        node.L0(this.rtlAware);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj btonecajqb() {
        return new pmvmpeiblj(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    private PaddingElement(float f13, float f14, float f15, float f16, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        this.start = f13;
        this.top = f14;
        this.end = f15;
        this.bottom = f16;
        this.rtlAware = z13;
        this.inspectorInfo = draadjrbmkVar;
        boolean z14 = true;
        boolean z15 = f13 >= 0.0f || Float.isNaN(f13);
        float f17 = this.top;
        boolean z16 = z15 & (f17 >= 0.0f || Float.isNaN(f17));
        float f18 = this.end;
        boolean z17 = z16 & (f18 >= 0.0f || Float.isNaN(f18));
        float f19 = this.bottom;
        if (f19 < 0.0f && !Float.isNaN(f19)) {
            z14 = false;
        }
        if (!z17 || !z14) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("Padding must be non-negative");
        }
    }
}
