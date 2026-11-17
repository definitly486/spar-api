package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/wwaezpbzkn;", "Lw0/nufgyqmvbu;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/wwaezpbzkn;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/layout/wwaezpbzkn;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "F", "getMinWidth-D9Ej5fM", "()F", "ppxfxbqfkf", "getMinHeight-D9Ej5fM", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f13, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14);
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) other;
        return w0.nufgyqmvbu.dxjokdxxww(this.minWidth, unspecifiedConstraintsElement.minWidth) && w0.nufgyqmvbu.dxjokdxxww(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    public int hashCode() {
        return (w0.nufgyqmvbu.btonecajqb(this.minWidth) * 31) + w0.nufgyqmvbu.btonecajqb(this.minHeight);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(wwaezpbzkn node) {
        node.K0(this.minWidth);
        node.J0(this.minHeight);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public wwaezpbzkn btonecajqb() {
        return new wwaezpbzkn(this.minWidth, this.minHeight, null);
    }

    private UnspecifiedConstraintsElement(float f13, float f14) {
        this.minWidth = f13;
        this.minHeight = f14;
    }
}
