package androidx.compose.foundation.layout;

import czzsidtyhn.ydmasvzmpa;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/layout/istkbnxepw;", "Lczzsidtyhn/ydmasvzmpa;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "inspectorInfo", "<init>", "(Lczzsidtyhn/ydmasvzmpa;Ltg/draadjrbmk;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/layout/istkbnxepw;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/layout/istkbnxepw;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lczzsidtyhn/ydmasvzmpa;", "getPaddingValues", "()Lczzsidtyhn/ydmasvzmpa;", "ppxfxbqfkf", "Ltg/draadjrbmk;", "getInspectorInfo", "()Ltg/draadjrbmk;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingValuesElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final tg.draadjrbmk inspectorInfo;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final ydmasvzmpa paddingValues;

    public PaddingValuesElement(ydmasvzmpa ydmasvzmpaVar, tg.draadjrbmk draadjrbmkVar) {
        this.paddingValues = ydmasvzmpaVar;
        this.inspectorInfo = draadjrbmkVar;
    }

    public boolean equals(Object other) {
        PaddingValuesElement paddingValuesElement = other instanceof PaddingValuesElement ? (PaddingValuesElement) other : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.paddingValues, paddingValuesElement.paddingValues);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(istkbnxepw node) {
        node.J0(this.paddingValues);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public istkbnxepw btonecajqb() {
        return new istkbnxepw(this.paddingValues);
    }
}
