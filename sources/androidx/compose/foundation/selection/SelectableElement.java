package androidx.compose.foundation.selection;

import g0.nufgyqmvbu;
import ikoacuggdj.tzroggbefp;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import metgxyhuhe.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/selection/zoijcleaow;", "", "selected", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "Likoacuggdj/tzroggbefp;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lg0/nufgyqmvbu;", "role", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "onClick", "<init>", "(ZLmetgxyhuhe/draadjrbmk;Likoacuggdj/tzroggbefp;ZZLg0/nufgyqmvbu;Ltg/iobyxmoadg;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/selection/zoijcleaow;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/selection/zoijcleaow;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Z", "ppxfxbqfkf", "Lmetgxyhuhe/draadjrbmk;", "wkgbmnqykc", "Likoacuggdj/tzroggbefp;", "eablkybsjg", "gxszxtbevo", "lqeggnwhkg", "Lg0/nufgyqmvbu;", "nufgyqmvbu", "Ltg/iobyxmoadg;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SelectableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final nufgyqmvbu role;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final tg.iobyxmoadg onClick;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk interactionSource;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final tzroggbefp indicationNodeFactory;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final boolean selected;

    public /* synthetic */ SelectableElement(boolean z13, draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
        this(z13, draadjrbmkVar, tzroggbefpVar, z14, z15, nufgyqmvbuVar, iobyxmoadgVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || SelectableElement.class != other.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) other;
        return this.selected == selectableElement.selected && zdlpuopuiu.eablkybsjg(this.interactionSource, selectableElement.interactionSource) && zdlpuopuiu.eablkybsjg(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.useLocalIndication == selectableElement.useLocalIndication && this.enabled == selectableElement.enabled && zdlpuopuiu.eablkybsjg(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.selected) * 31;
        draadjrbmk draadjrbmkVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0)) * 31;
        tzroggbefp tzroggbefpVar = this.indicationNodeFactory;
        int iHashCode3 = (((((iHashCode2 + (tzroggbefpVar != null ? tzroggbefpVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        nufgyqmvbu nufgyqmvbuVar = this.role;
        return ((iHashCode3 + (nufgyqmvbuVar != null ? nufgyqmvbu.agtfadlqog(nufgyqmvbuVar.rgvfuqvkyq()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(zoijcleaow node) {
        node.w1(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb() {
        return new zoijcleaow(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick, null);
    }

    private SelectableElement(boolean z13, draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.selected = z13;
        this.interactionSource = draadjrbmkVar;
        this.indicationNodeFactory = tzroggbefpVar;
        this.useLocalIndication = z14;
        this.enabled = z15;
        this.role = nufgyqmvbuVar;
        this.onClick = iobyxmoadgVar;
    }
}
