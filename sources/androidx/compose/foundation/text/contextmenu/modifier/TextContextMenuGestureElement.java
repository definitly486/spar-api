package androidx.compose.foundation.text.contextmenu.modifier;

import kotlin.Metadata;
import tg.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\u0007\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u0007\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/text/contextmenu/modifier/ppxfxbqfkf;", "Lkotlin/Function1;", "Llg/gxszxtbevo;", "Lgg/wwaezpbzkn;", "", "onPreShowContextMenu", "<init>", "(Ltg/draadjrbmk;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/text/contextmenu/modifier/ppxfxbqfkf;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/text/contextmenu/modifier/ppxfxbqfkf;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/draadjrbmk;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextContextMenuGestureElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onPreShowContextMenu;

    public TextContextMenuGestureElement(draadjrbmk draadjrbmkVar) {
        this.onPreShowContextMenu = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextContextMenuGestureElement) && this.onPreShowContextMenu == ((TextContextMenuGestureElement) other).onPreShowContextMenu;
    }

    public int hashCode() {
        draadjrbmk draadjrbmkVar = this.onPreShowContextMenu;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.hashCode();
        }
        return 0;
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ppxfxbqfkf node) {
        node.T0(this.onPreShowContextMenu);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf btonecajqb() {
        return new ppxfxbqfkf(this.onPreShowContextMenu);
    }
}
