package androidx.compose.ui.layout;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/layout/pmvmpeiblj;", "Landroidx/compose/ui/layout/gxszxtbevo;", "insetsListener", "<init>", "(Landroidx/compose/ui/layout/gxszxtbevo;)V", "wflxmlrfwp", "()Landroidx/compose/ui/layout/pmvmpeiblj;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/layout/pmvmpeiblj;)V", "zoijcleaow", "Landroidx/compose/ui/layout/gxszxtbevo;", "getInsetsListener", "()Landroidx/compose/ui/layout/gxszxtbevo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
final class RulerProviderModifierElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final gxszxtbevo insetsListener;

    public RulerProviderModifierElement(gxszxtbevo gxszxtbevoVar) {
        this.insetsListener = gxszxtbevoVar;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = other instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) other : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.insetsListener : null) == this.insetsListener;
    }

    public int hashCode() {
        return this.insetsListener.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(pmvmpeiblj node) {
        node.L0(this.insetsListener);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj btonecajqb() {
        return new pmvmpeiblj(this.insetsListener);
    }
}
