package androidx.compose.ui.focus;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/focus/rgvfuqvkyq;", "Landroidx/compose/ui/focus/wflxmlrfwp;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/wflxmlrfwp;)V", "wflxmlrfwp", "()Landroidx/compose/ui/focus/rgvfuqvkyq;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/focus/rgvfuqvkyq;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Landroidx/compose/ui/focus/wflxmlrfwp;", "getFocusRequester", "()Landroidx/compose/ui/focus/wflxmlrfwp;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusRequesterElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final wflxmlrfwp focusRequester;

    public FocusRequesterElement(wflxmlrfwp wflxmlrfwpVar) {
        this.focusRequester = wflxmlrfwpVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusRequesterElement) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.focusRequester, ((FocusRequesterElement) other).focusRequester);
    }

    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(rgvfuqvkyq node) {
        node.H0().eablkybsjg().rgvfuqvkyq(node);
        node.I0(this.focusRequester);
        node.H0().eablkybsjg().zoijcleaow(node);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq btonecajqb() {
        return new rgvfuqvkyq(this.focusRequester);
    }
}
