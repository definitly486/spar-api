package androidx.compose.material;

import igdgnonuha.lqeggnwhkg;
import jztzpxfvev.jlmebxxoox;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Lz/ribwqtqdhb;", "Landroidx/compose/material/wkgbmnqykc;", "Ligdgnonuha/lqeggnwhkg;", "state", "Lkotlin/Function2;", "Lw0/oxmwwwfdhm;", "Lw0/zoijcleaow;", "Lgg/vdvldrhtss;", "Ligdgnonuha/lrnfpwlwnk;", "anchors", "Ljztzpxfvev/jlmebxxoox;", "orientation", "<init>", "(Ligdgnonuha/lqeggnwhkg;Ltg/rgvfuqvkyq;Ljztzpxfvev/jlmebxxoox;)V", "wflxmlrfwp", "()Landroidx/compose/material/wkgbmnqykc;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/material/wkgbmnqykc;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ligdgnonuha/lqeggnwhkg;", "ppxfxbqfkf", "Ltg/rgvfuqvkyq;", "wkgbmnqykc", "Ljztzpxfvev/jlmebxxoox;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final rgvfuqvkyq anchors;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final jlmebxxoox orientation;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final lqeggnwhkg state;

    public DraggableAnchorsElement(lqeggnwhkg lqeggnwhkgVar, rgvfuqvkyq rgvfuqvkyqVar, jlmebxxoox jlmebxxooxVar) {
        this.state = lqeggnwhkgVar;
        this.anchors = rgvfuqvkyqVar;
        this.orientation = jlmebxxooxVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) other;
        return zdlpuopuiu.eablkybsjg(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(wkgbmnqykc node) {
        node.L0(this.state);
        node.J0(this.anchors);
        node.K0(this.orientation);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc btonecajqb() {
        return new wkgbmnqykc(this.state, this.anchors, this.orientation);
    }
}
