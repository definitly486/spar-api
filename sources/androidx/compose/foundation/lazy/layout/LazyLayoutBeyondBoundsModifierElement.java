package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/lazy/layout/wflxmlrfwp;", "Landroidx/compose/foundation/lazy/layout/agtfadlqog;", "state", "Landroidx/compose/foundation/lazy/layout/btonecajqb;", "beyondBoundsInfo", "", "reverseLayout", "Ljztzpxfvev/jlmebxxoox;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/agtfadlqog;Landroidx/compose/foundation/lazy/layout/btonecajqb;ZLjztzpxfvev/jlmebxxoox;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/lazy/layout/wflxmlrfwp;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/lazy/layout/wflxmlrfwp;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Landroidx/compose/foundation/lazy/layout/agtfadlqog;", "getState", "()Landroidx/compose/foundation/lazy/layout/agtfadlqog;", "ppxfxbqfkf", "Landroidx/compose/foundation/lazy/layout/btonecajqb;", "getBeyondBoundsInfo", "()Landroidx/compose/foundation/lazy/layout/btonecajqb;", "wkgbmnqykc", "Z", "getReverseLayout", "()Z", "eablkybsjg", "Ljztzpxfvev/jlmebxxoox;", "getOrientation", "()Ljztzpxfvev/jlmebxxoox;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutBeyondBoundsModifierElement extends z.ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final jztzpxfvev.jlmebxxoox orientation;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final btonecajqb beyondBoundsInfo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final agtfadlqog state;

    public LazyLayoutBeyondBoundsModifierElement(agtfadlqog agtfadlqogVar, btonecajqb btonecajqbVar, boolean z13, jztzpxfvev.jlmebxxoox jlmebxxooxVar) {
        this.state = agtfadlqogVar;
        this.beyondBoundsInfo = btonecajqbVar;
        this.reverseLayout = z13;
        this.orientation = jlmebxxooxVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.state, lazyLayoutBeyondBoundsModifierElement.state) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.reverseLayout == lazyLayoutBeyondBoundsModifierElement.reverseLayout && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(wflxmlrfwp node) {
        node.O0(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp btonecajqb() {
        return new wflxmlrfwp(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }
}
