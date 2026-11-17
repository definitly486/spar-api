package androidx.compose.foundation.gestures;

import ikoacuggdj.xrmfcynszj;
import jztzpxfvev.bfopjjpdmp;
import jztzpxfvev.eablkybsjg;
import jztzpxfvev.hkdspvbjdz;
import jztzpxfvev.jlmebxxoox;
import jztzpxfvev.opjhrmiecq;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import metgxyhuhe.draadjrbmk;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lz/ribwqtqdhb;", "Ljztzpxfvev/bfopjjpdmp;", "Ljztzpxfvev/opjhrmiecq;", "state", "Ljztzpxfvev/jlmebxxoox;", "orientation", "Likoacuggdj/xrmfcynszj;", "overscrollEffect", "", "enabled", "reverseDirection", "Ljztzpxfvev/hkdspvbjdz;", "flingBehavior", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "Ljztzpxfvev/eablkybsjg;", "bringIntoViewSpec", "<init>", "(Ljztzpxfvev/opjhrmiecq;Ljztzpxfvev/jlmebxxoox;Likoacuggdj/xrmfcynszj;ZZLjztzpxfvev/hkdspvbjdz;Lmetgxyhuhe/draadjrbmk;Ljztzpxfvev/eablkybsjg;)V", "wflxmlrfwp", "()Ljztzpxfvev/bfopjjpdmp;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Ljztzpxfvev/bfopjjpdmp;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Ljztzpxfvev/opjhrmiecq;", "getState", "()Ljztzpxfvev/opjhrmiecq;", "ppxfxbqfkf", "Ljztzpxfvev/jlmebxxoox;", "getOrientation", "()Ljztzpxfvev/jlmebxxoox;", "wkgbmnqykc", "Likoacuggdj/xrmfcynszj;", "getOverscrollEffect", "()Likoacuggdj/xrmfcynszj;", "eablkybsjg", "Z", "getEnabled", "()Z", "gxszxtbevo", "getReverseDirection", "lqeggnwhkg", "Ljztzpxfvev/hkdspvbjdz;", "getFlingBehavior", "()Ljztzpxfvev/hkdspvbjdz;", "nufgyqmvbu", "Lmetgxyhuhe/draadjrbmk;", "getInteractionSource", "()Lmetgxyhuhe/draadjrbmk;", "dxjokdxxww", "Ljztzpxfvev/eablkybsjg;", "getBringIntoViewSpec", "()Ljztzpxfvev/eablkybsjg;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata */
    private final eablkybsjg bringIntoViewSpec;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final hkdspvbjdz flingBehavior;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk interactionSource;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final jlmebxxoox orientation;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final xrmfcynszj overscrollEffect;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final opjhrmiecq state;

    public ScrollableElement(opjhrmiecq opjhrmiecqVar, jlmebxxoox jlmebxxooxVar, xrmfcynszj xrmfcynszjVar, boolean z13, boolean z14, hkdspvbjdz hkdspvbjdzVar, draadjrbmk draadjrbmkVar, eablkybsjg eablkybsjgVar) {
        this.state = opjhrmiecqVar;
        this.orientation = jlmebxxooxVar;
        this.overscrollEffect = xrmfcynszjVar;
        this.enabled = z13;
        this.reverseDirection = z14;
        this.flingBehavior = hkdspvbjdzVar;
        this.interactionSource = draadjrbmkVar;
        this.bringIntoViewSpec = eablkybsjgVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return zdlpuopuiu.eablkybsjg(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && zdlpuopuiu.eablkybsjg(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && zdlpuopuiu.eablkybsjg(this.flingBehavior, scrollableElement.flingBehavior) && zdlpuopuiu.eablkybsjg(this.interactionSource, scrollableElement.interactionSource) && zdlpuopuiu.eablkybsjg(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        xrmfcynszj xrmfcynszjVar = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (xrmfcynszjVar != null ? xrmfcynszjVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        hkdspvbjdz hkdspvbjdzVar = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (hkdspvbjdzVar != null ? hkdspvbjdzVar.hashCode() : 0)) * 31;
        draadjrbmk draadjrbmkVar = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0)) * 31;
        eablkybsjg eablkybsjgVar = this.bringIntoViewSpec;
        return iHashCode4 + (eablkybsjgVar != null ? eablkybsjgVar.hashCode() : 0);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(bfopjjpdmp node) {
        node.z1(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public bfopjjpdmp btonecajqb() {
        return new bfopjjpdmp(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }
}
