package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/lazy/layout/sflfametgt;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/zynmafqrjb;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/xrmfcynszj;", "state", "Ljztzpxfvev/jlmebxxoox;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Ltg/iobyxmoadg;Landroidx/compose/foundation/lazy/layout/xrmfcynszj;Ljztzpxfvev/jlmebxxoox;ZZ)V", "wflxmlrfwp", "()Landroidx/compose/foundation/lazy/layout/sflfametgt;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/lazy/layout/sflfametgt;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/iobyxmoadg;", "getItemProviderLambda", "()Ltg/iobyxmoadg;", "ppxfxbqfkf", "Landroidx/compose/foundation/lazy/layout/xrmfcynszj;", "getState", "()Landroidx/compose/foundation/lazy/layout/xrmfcynszj;", "wkgbmnqykc", "Ljztzpxfvev/jlmebxxoox;", "getOrientation", "()Ljztzpxfvev/jlmebxxoox;", "eablkybsjg", "Z", "getUserScrollEnabled", "()Z", "gxszxtbevo", "getReverseScrolling", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends z.ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final boolean userScrollEnabled;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final xrmfcynszj state;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final jztzpxfvev.jlmebxxoox orientation;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final tg.iobyxmoadg itemProviderLambda;

    public LazyLayoutSemanticsModifier(tg.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14) {
        this.itemProviderLambda = iobyxmoadgVar;
        this.state = xrmfcynszjVar;
        this.orientation = jlmebxxooxVar;
        this.userScrollEnabled = z13;
        this.reverseScrolling = z14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) other;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled && this.reverseScrolling == lazyLayoutSemanticsModifier.reverseScrolling;
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(sflfametgt node) {
        node.R0(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public sflfametgt btonecajqb() {
        return new sflfametgt(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }
}
