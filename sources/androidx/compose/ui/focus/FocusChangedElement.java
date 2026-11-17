package androidx.compose.ui.focus;

import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/focus/ppxfxbqfkf;", "Lkotlin/Function1;", "Lf/ojitshcjhn;", "Lgg/wwaezpbzkn;", "onFocusChanged", "<init>", "(Ltg/draadjrbmk;)V", "wflxmlrfwp", "()Landroidx/compose/ui/focus/ppxfxbqfkf;", "node", "ojitshcjhn", "(Landroidx/compose/ui/focus/ppxfxbqfkf;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/draadjrbmk;", "getOnFocusChanged", "()Ltg/draadjrbmk;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusChangedElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk onFocusChanged;

    public FocusChangedElement(tg.draadjrbmk draadjrbmkVar) {
        this.onFocusChanged = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusChangedElement) && this.onFocusChanged == ((FocusChangedElement) other).onFocusChanged;
    }

    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ppxfxbqfkf node) {
        node.H0(this.onFocusChanged);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf btonecajqb() {
        return new ppxfxbqfkf(this.onFocusChanged);
    }
}
