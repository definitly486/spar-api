package androidx.compose.foundation.text.input.internal;

import iwxlajgraz.hszhottldk;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import opjhrmiecq.igdgnonuha;
import skhdrjzrfn.skhdrjzrfn;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lz/ribwqtqdhb;", "Liwxlajgraz/igdgnonuha;", "Liwxlajgraz/hszhottldk;", "serviceAdapter", "Lopjhrmiecq/igdgnonuha;", "legacyTextFieldState", "Lskhdrjzrfn/skhdrjzrfn;", "textFieldSelectionManager", "<init>", "(Liwxlajgraz/hszhottldk;Lopjhrmiecq/igdgnonuha;Lskhdrjzrfn/skhdrjzrfn;)V", "wflxmlrfwp", "()Liwxlajgraz/igdgnonuha;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Liwxlajgraz/igdgnonuha;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Liwxlajgraz/hszhottldk;", "getServiceAdapter", "()Liwxlajgraz/hszhottldk;", "ppxfxbqfkf", "Lopjhrmiecq/igdgnonuha;", "getLegacyTextFieldState", "()Lopjhrmiecq/igdgnonuha;", "wkgbmnqykc", "Lskhdrjzrfn/skhdrjzrfn;", "getTextFieldSelectionManager", "()Lskhdrjzrfn/skhdrjzrfn;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final igdgnonuha legacyTextFieldState;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final skhdrjzrfn textFieldSelectionManager;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final hszhottldk serviceAdapter;

    public LegacyAdaptingPlatformTextInputModifier(hszhottldk hszhottldkVar, igdgnonuha igdgnonuhaVar, skhdrjzrfn skhdrjzrfnVar) {
        this.serviceAdapter = hszhottldkVar;
        this.legacyTextFieldState = igdgnonuhaVar;
        this.textFieldSelectionManager = skhdrjzrfnVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) other;
        return zdlpuopuiu.eablkybsjg(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && zdlpuopuiu.eablkybsjg(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && zdlpuopuiu.eablkybsjg(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(iwxlajgraz.igdgnonuha node) {
        node.J0(this.serviceAdapter);
        node.I0(this.legacyTextFieldState);
        node.K0(this.textFieldSelectionManager);
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public iwxlajgraz.igdgnonuha btonecajqb() {
        return new iwxlajgraz.igdgnonuha(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }
}
