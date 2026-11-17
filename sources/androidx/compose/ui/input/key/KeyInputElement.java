package androidx.compose.ui.input.key;

import kotlin.Metadata;
import tg.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/input/key/zoijcleaow;", "Lkotlin/Function1;", "Lr/zoijcleaow;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Ltg/draadjrbmk;Ltg/draadjrbmk;)V", "wflxmlrfwp", "()Landroidx/compose/ui/input/key/zoijcleaow;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/input/key/zoijcleaow;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/draadjrbmk;", "getOnKeyEvent", "()Ltg/draadjrbmk;", "ppxfxbqfkf", "getOnPreKeyEvent", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class KeyInputElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onPreKeyEvent;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onKeyEvent;

    public KeyInputElement(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        this.onKeyEvent = draadjrbmkVar;
        this.onPreKeyEvent = draadjrbmkVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) other;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    public int hashCode() {
        draadjrbmk draadjrbmkVar = this.onKeyEvent;
        int iHashCode = (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0) * 31;
        draadjrbmk draadjrbmkVar2 = this.onPreKeyEvent;
        return iHashCode + (draadjrbmkVar2 != null ? draadjrbmkVar2.hashCode() : 0);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(zoijcleaow node) {
        node.H0(this.onKeyEvent);
        node.I0(this.onPreKeyEvent);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb() {
        return new zoijcleaow(this.onKeyEvent, this.onPreKeyEvent);
    }
}
