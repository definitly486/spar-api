package androidx.compose.foundation;

import h.e;
import h.jztzpxfvev;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lz/ribwqtqdhb;", "Likoacuggdj/rgvfuqvkyq;", "Lw0/nufgyqmvbu;", "width", "Lh/jztzpxfvev;", "brush", "Lh/e;", "shape", "<init>", "(FLh/jztzpxfvev;Lh/e;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Likoacuggdj/rgvfuqvkyq;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Likoacuggdj/rgvfuqvkyq;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "F", "getWidth-D9Ej5fM", "()F", "ppxfxbqfkf", "Lh/jztzpxfvev;", "getBrush", "()Lh/jztzpxfvev;", "wkgbmnqykc", "Lh/e;", "getShape", "()Lh/e;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final jztzpxfvev brush;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final e shape;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f13, jztzpxfvev jztzpxfvevVar, e eVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, jztzpxfvevVar, eVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return w0.nufgyqmvbu.dxjokdxxww(this.width, borderModifierNodeElement.width) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.brush, borderModifierNodeElement.brush) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.shape, borderModifierNodeElement.shape);
    }

    public int hashCode() {
        return (((w0.nufgyqmvbu.btonecajqb(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ikoacuggdj.rgvfuqvkyq node) {
        node.a1(this.width);
        node.Z0(this.brush);
        node.weqkydbzbr(this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj.rgvfuqvkyq btonecajqb() {
        return new ikoacuggdj.rgvfuqvkyq(this.width, this.brush, this.shape, null);
    }

    private BorderModifierNodeElement(float f13, jztzpxfvev jztzpxfvevVar, e eVar) {
        this.width = f13;
        this.brush = jztzpxfvevVar;
        this.shape = eVar;
    }
}
