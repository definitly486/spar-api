package androidx.compose.ui.semantics;

import g0.oxmwwwfdhm;
import g0.ppxfxbqfkf;
import g0.wflxmlrfwp;
import kotlin.Metadata;
import tg.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lz/ribwqtqdhb;", "Lg0/ppxfxbqfkf;", "Lg0/oxmwwwfdhm;", "", "mergeDescendants", "Lkotlin/Function1;", "Lg0/yadqdtsiqt;", "Lgg/wwaezpbzkn;", "properties", "<init>", "(ZLtg/draadjrbmk;)V", "wflxmlrfwp", "()Lg0/ppxfxbqfkf;", "node", "ojitshcjhn", "(Lg0/ppxfxbqfkf;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Z", "getMergeDescendants", "()Z", "ppxfxbqfkf", "Ltg/draadjrbmk;", "getProperties", "()Ltg/draadjrbmk;", "Lg0/wflxmlrfwp;", "wkgbmnqykc", "()Lg0/wflxmlrfwp;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppendedSemanticsElement extends ribwqtqdhb implements oxmwwwfdhm {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk properties;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeDescendants;

    public AppendedSemanticsElement(boolean z13, draadjrbmk draadjrbmkVar) {
        this.mergeDescendants = z13;
        this.properties = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) other;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && this.properties == appendedSemanticsElement.properties;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ppxfxbqfkf node) {
        node.H0(this.mergeDescendants);
        node.I0(this.properties);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf btonecajqb() {
        return new ppxfxbqfkf(this.mergeDescendants, false, this.properties);
    }

    @Override // g0.oxmwwwfdhm
    public wflxmlrfwp wkgbmnqykc() {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        wflxmlrfwpVar.vdvldrhtss(this.mergeDescendants);
        this.properties.invoke(wflxmlrfwpVar);
        return wflxmlrfwpVar;
    }
}
