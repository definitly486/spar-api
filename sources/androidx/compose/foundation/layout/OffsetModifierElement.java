package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetElement, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/jyumaefscl;", "Lw0/nufgyqmvbu;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(FFZLtg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/jyumaefscl;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/jyumaefscl;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "zoijcleaow", "F", "getX-D9Ej5fM", "()F", "ppxfxbqfkf", "getY-D9Ej5fM", "wkgbmnqykc", "Z", "getRtlAware", "()Z", "eablkybsjg", "Ltg/draadjrbmk;", "getInspectorInfo", "()Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OffsetModifierElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final float y;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rtlAware;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final float x;

    public /* synthetic */ OffsetModifierElement(float f13, float f14, boolean z13, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, z13, draadjrbmkVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        OffsetModifierElement offsetModifierElement = other instanceof OffsetModifierElement ? (OffsetModifierElement) other : null;
        if (offsetModifierElement == null) {
            return false;
        }
        return w0.nufgyqmvbu.dxjokdxxww(this.x, offsetModifierElement.x) && w0.nufgyqmvbu.dxjokdxxww(this.y, offsetModifierElement.y) && this.rtlAware == offsetModifierElement.rtlAware;
    }

    public int hashCode() {
        return (((w0.nufgyqmvbu.btonecajqb(this.x) * 31) + w0.nufgyqmvbu.btonecajqb(this.y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(jyumaefscl node) {
        node.J0(this.x, this.y, this.rtlAware);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.x)) + ", y=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public jyumaefscl btonecajqb() {
        return new jyumaefscl(this.x, this.y, this.rtlAware, null);
    }

    private OffsetModifierElement(float f13, float f14, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        this.x = f13;
        this.y = f14;
        this.rtlAware = z13;
        this.inspectorInfo = draadjrbmkVar;
    }
}
