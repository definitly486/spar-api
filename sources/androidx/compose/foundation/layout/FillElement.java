package androidx.compose.foundation.layout;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/ojitshcjhn;", "Lczzsidtyhn/yggfygwlhe;", "direction", "", "fraction", "", "inspectorName", "<init>", "(Lczzsidtyhn/yggfygwlhe;FLjava/lang/String;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/ojitshcjhn;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/layout/ojitshcjhn;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lczzsidtyhn/yggfygwlhe;", "ppxfxbqfkf", "F", "wkgbmnqykc", "Ljava/lang/String;", "eablkybsjg", "iobyxmoadg", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FillElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final czzsidtyhn.yggfygwlhe direction;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FillElement$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final FillElement iobyxmoadg(float f13) {
            return new FillElement(czzsidtyhn.yggfygwlhe.Vertical, f13, "fillMaxHeight");
        }

        public final FillElement ppxfxbqfkf(float f13) {
            return new FillElement(czzsidtyhn.yggfygwlhe.Horizontal, f13, "fillMaxWidth");
        }

        public final FillElement zoijcleaow(float f13) {
            return new FillElement(czzsidtyhn.yggfygwlhe.Both, f13, "fillMaxSize");
        }

        private Companion() {
        }
    }

    public FillElement(czzsidtyhn.yggfygwlhe yggfygwlheVar, float f13, String str) {
        this.direction = yggfygwlheVar;
        this.fraction = f13;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) other;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ojitshcjhn node) {
        node.J0(this.direction);
        node.K0(this.fraction);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn btonecajqb() {
        return new ojitshcjhn(this.direction, this.fraction);
    }
}
