package androidx.compose.foundation.text.handwriting;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Lz/ribwqtqdhb;", "Luawqvzlxes/iobyxmoadg;", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "onHandwritingSlopExceeded", "<init>", "(Ltg/iobyxmoadg;)V", "wflxmlrfwp", "()Luawqvzlxes/iobyxmoadg;", "node", "ojitshcjhn", "(Luawqvzlxes/iobyxmoadg;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/iobyxmoadg;", "getOnHandwritingSlopExceeded", "()Ltg/iobyxmoadg;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StylusHandwritingElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final tg.iobyxmoadg onHandwritingSlopExceeded;

    public StylusHandwritingElement(tg.iobyxmoadg iobyxmoadgVar) {
        this.onHandwritingSlopExceeded = iobyxmoadgVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StylusHandwritingElement) && this.onHandwritingSlopExceeded == ((StylusHandwritingElement) other).onHandwritingSlopExceeded;
    }

    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(uawqvzlxes.iobyxmoadg node) {
        node.P0(this.onHandwritingSlopExceeded);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public uawqvzlxes.iobyxmoadg btonecajqb() {
        return new uawqvzlxes.iobyxmoadg(this.onHandwritingSlopExceeded);
    }
}
