package androidx.compose.foundation;

import ikoacuggdj.lmojexxdyd;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lz/ribwqtqdhb;", "Likoacuggdj/lmojexxdyd;", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "<init>", "(Lmetgxyhuhe/draadjrbmk;)V", "wflxmlrfwp", "()Likoacuggdj/lmojexxdyd;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Likoacuggdj/lmojexxdyd;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lmetgxyhuhe/draadjrbmk;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final metgxyhuhe.draadjrbmk interactionSource;

    public FocusableElement(metgxyhuhe.draadjrbmk draadjrbmkVar) {
        this.interactionSource = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusableElement) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.interactionSource, ((FocusableElement) other).interactionSource);
    }

    public int hashCode() {
        metgxyhuhe.draadjrbmk draadjrbmkVar = this.interactionSource;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.hashCode();
        }
        return 0;
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(lmojexxdyd node) {
        node.a1(this.interactionSource);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public lmojexxdyd btonecajqb() {
        return new lmojexxdyd(this.interactionSource, 0, null, 6, null);
    }
}
