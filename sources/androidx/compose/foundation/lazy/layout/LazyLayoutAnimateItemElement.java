package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/lazy/layout/dxjokdxxww;", "Lvipkmwdibw/wwaezpbzkn;", "", "fadeInSpec", "Lw0/agtfadlqog;", "placementSpec", "fadeOutSpec", "<init>", "(Lvipkmwdibw/wwaezpbzkn;Lvipkmwdibw/wwaezpbzkn;Lvipkmwdibw/wwaezpbzkn;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/lazy/layout/dxjokdxxww;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/lazy/layout/dxjokdxxww;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lvipkmwdibw/wwaezpbzkn;", "ppxfxbqfkf", "wkgbmnqykc", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends z.ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final vipkmwdibw.wwaezpbzkn placementSpec;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final vipkmwdibw.wwaezpbzkn fadeOutSpec;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final vipkmwdibw.wwaezpbzkn fadeInSpec;

    public LazyLayoutAnimateItemElement(vipkmwdibw.wwaezpbzkn wwaezpbzknVar, vipkmwdibw.wwaezpbzkn wwaezpbzknVar2, vipkmwdibw.wwaezpbzkn wwaezpbzknVar3) {
        this.fadeInSpec = wwaezpbzknVar;
        this.placementSpec = wwaezpbzknVar2;
        this.fadeOutSpec = wwaezpbzknVar3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    public int hashCode() {
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.fadeInSpec;
        int iHashCode = (wwaezpbzknVar == null ? 0 : wwaezpbzknVar.hashCode()) * 31;
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (wwaezpbzknVar2 == null ? 0 : wwaezpbzknVar2.hashCode())) * 31;
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar3 = this.fadeOutSpec;
        return iHashCode2 + (wwaezpbzknVar3 != null ? wwaezpbzknVar3.hashCode() : 0);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(dxjokdxxww node) {
        node.K0(this.fadeInSpec);
        node.M0(this.placementSpec);
        node.L0(this.fadeOutSpec);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww btonecajqb() {
        return new dxjokdxxww(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }
}
