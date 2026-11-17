package androidx.compose.foundation;

import ikoacuggdj.lxfrhoxuzk;
import ikoacuggdj.uawqvzlxes;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lz/ribwqtqdhb;", "Likoacuggdj/uawqvzlxes;", "Likoacuggdj/lxfrhoxuzk;", "scrollState", "", "reverseScrolling", "isVertical", "<init>", "(Likoacuggdj/lxfrhoxuzk;ZZ)V", "wflxmlrfwp", "()Likoacuggdj/uawqvzlxes;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Likoacuggdj/uawqvzlxes;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Likoacuggdj/lxfrhoxuzk;", "getScrollState", "()Likoacuggdj/lxfrhoxuzk;", "ppxfxbqfkf", "Z", "getReverseScrolling", "()Z", "wkgbmnqykc", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollingLayoutElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final lxfrhoxuzk scrollState;

    public ScrollingLayoutElement(lxfrhoxuzk lxfrhoxuzkVar, boolean z13, boolean z14) {
        this.scrollState = lxfrhoxuzkVar;
        this.reverseScrolling = z13;
        this.isVertical = z14;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.scrollState, scrollingLayoutElement.scrollState) && this.reverseScrolling == scrollingLayoutElement.reverseScrolling && this.isVertical == scrollingLayoutElement.isVertical;
    }

    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(uawqvzlxes node) {
        node.Q0(this.scrollState);
        node.P0(this.reverseScrolling);
        node.R0(this.isVertical);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public uawqvzlxes btonecajqb() {
        return new uawqvzlxes(this.scrollState, this.reverseScrolling, this.isVertical);
    }
}
