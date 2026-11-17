package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import t.jyumaefscl;
import t.kegysxyocb;
import z.kcexrzcfyt;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Lz/ribwqtqdhb;", "Lt/kegysxyocb;", "Lt/jyumaefscl;", "icon", "", "overrideDescendants", "Lz/kcexrzcfyt;", "touchBoundsExpansion", "<init>", "(Lt/jyumaefscl;ZLz/kcexrzcfyt;)V", "wflxmlrfwp", "()Lt/kegysxyocb;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Lt/kegysxyocb;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lt/jyumaefscl;", "getIcon", "()Lt/jyumaefscl;", "ppxfxbqfkf", "Z", "getOverrideDescendants", "()Z", "wkgbmnqykc", "Lz/kcexrzcfyt;", "getTouchBoundsExpansion", "()Lz/kcexrzcfyt;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean overrideDescendants;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final kcexrzcfyt touchBoundsExpansion;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final jyumaefscl icon;

    public StylusHoverIconModifierElement(jyumaefscl jyumaefsclVar, boolean z13, kcexrzcfyt kcexrzcfytVar) {
        this.icon = jyumaefsclVar;
        this.overrideDescendants = z13;
        this.touchBoundsExpansion = kcexrzcfytVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) other;
        return zdlpuopuiu.eablkybsjg(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && zdlpuopuiu.eablkybsjg(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        kcexrzcfyt kcexrzcfytVar = this.touchBoundsExpansion;
        return iHashCode + (kcexrzcfytVar == null ? 0 : kcexrzcfytVar.hashCode());
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(kegysxyocb node) {
        node.V0(this.icon);
        node.W0(this.overrideDescendants);
        node.U0(this.touchBoundsExpansion);
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public kegysxyocb btonecajqb() {
        return new kegysxyocb(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }
}
