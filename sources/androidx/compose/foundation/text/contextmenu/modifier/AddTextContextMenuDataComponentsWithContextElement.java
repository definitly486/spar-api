package androidx.compose.foundation.text.contextmenu.modifier;

import kotlin.Metadata;
import tg.rgvfuqvkyq;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/text/contextmenu/modifier/zoijcleaow;", "Lkotlin/Function2;", "Lweqkydbzbr/iobyxmoadg;", "Landroid/content/Context;", "Lgg/wwaezpbzkn;", "builder", "<init>", "(Ltg/rgvfuqvkyq;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/text/contextmenu/modifier/zoijcleaow;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/text/contextmenu/modifier/zoijcleaow;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ltg/rgvfuqvkyq;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AddTextContextMenuDataComponentsWithContextElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final rgvfuqvkyq builder;

    public AddTextContextMenuDataComponentsWithContextElement(rgvfuqvkyq rgvfuqvkyqVar) {
        this.builder = rgvfuqvkyqVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddTextContextMenuDataComponentsWithContextElement) && this.builder == ((AddTextContextMenuDataComponentsWithContextElement) other).builder;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(zoijcleaow node) {
        node.P0(this.builder);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb() {
        return new zoijcleaow(this.builder);
    }
}
