package androidx.compose.foundation.selection;

import g0.nufgyqmvbu;
import ikoacuggdj.tzroggbefp;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/selection/gxszxtbevo;", "", "value", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "Likoacuggdj/tzroggbefp;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lg0/nufgyqmvbu;", "role", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "onValueChange", "<init>", "(ZLmetgxyhuhe/draadjrbmk;Likoacuggdj/tzroggbefp;ZZLg0/nufgyqmvbu;Ltg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/selection/gxszxtbevo;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/selection/gxszxtbevo;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Z", "ppxfxbqfkf", "Lmetgxyhuhe/draadjrbmk;", "wkgbmnqykc", "Likoacuggdj/tzroggbefp;", "eablkybsjg", "gxszxtbevo", "lqeggnwhkg", "Lg0/nufgyqmvbu;", "nufgyqmvbu", "Ltg/draadjrbmk;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ToggleableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final nufgyqmvbu role;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onValueChange;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final metgxyhuhe.draadjrbmk interactionSource;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final tzroggbefp indicationNodeFactory;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    public /* synthetic */ ToggleableElement(boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar2, gtknphoqwx gtknphoqwxVar) {
        this(z13, draadjrbmkVar, tzroggbefpVar, z14, z15, nufgyqmvbuVar, draadjrbmkVar2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ToggleableElement.class != other.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) other;
        return this.value == toggleableElement.value && zdlpuopuiu.eablkybsjg(this.interactionSource, toggleableElement.interactionSource) && zdlpuopuiu.eablkybsjg(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.useLocalIndication == toggleableElement.useLocalIndication && this.enabled == toggleableElement.enabled && zdlpuopuiu.eablkybsjg(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        metgxyhuhe.draadjrbmk draadjrbmkVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0)) * 31;
        tzroggbefp tzroggbefpVar = this.indicationNodeFactory;
        int iHashCode3 = (((((iHashCode2 + (tzroggbefpVar != null ? tzroggbefpVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        nufgyqmvbu nufgyqmvbuVar = this.role;
        return ((iHashCode3 + (nufgyqmvbuVar != null ? nufgyqmvbu.agtfadlqog(nufgyqmvbuVar.rgvfuqvkyq()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(gxszxtbevo node) {
        node.A1(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo btonecajqb() {
        return new gxszxtbevo(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange, null);
    }

    private ToggleableElement(boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar2) {
        this.value = z13;
        this.interactionSource = draadjrbmkVar;
        this.indicationNodeFactory = tzroggbefpVar;
        this.useLocalIndication = z14;
        this.enabled = z15;
        this.role = nufgyqmvbuVar;
        this.onValueChange = draadjrbmkVar2;
    }
}
