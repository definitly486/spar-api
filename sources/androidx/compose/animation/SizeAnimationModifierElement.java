package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import vipkmwdibw.wwaezpbzkn;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/animation/nufgyqmvbu;", "Lvipkmwdibw/wwaezpbzkn;", "Lw0/oxmwwwfdhm;", "animationSpec", "La/eablkybsjg;", "alignment", "Lkotlin/Function2;", "Lgg/wwaezpbzkn;", "finishedListener", "<init>", "(Lvipkmwdibw/wwaezpbzkn;La/eablkybsjg;Ltg/rgvfuqvkyq;)V", "wflxmlrfwp", "()Landroidx/compose/animation/nufgyqmvbu;", "node", "ojitshcjhn", "(Landroidx/compose/animation/nufgyqmvbu;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lvipkmwdibw/wwaezpbzkn;", "getAnimationSpec", "()Lvipkmwdibw/wwaezpbzkn;", "ppxfxbqfkf", "La/eablkybsjg;", "getAlignment", "()La/eablkybsjg;", "wkgbmnqykc", "Ltg/rgvfuqvkyq;", "getFinishedListener", "()Ltg/rgvfuqvkyq;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class SizeAnimationModifierElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.eablkybsjg alignment;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final rgvfuqvkyq finishedListener;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final wwaezpbzkn animationSpec;

    public SizeAnimationModifierElement(wwaezpbzkn wwaezpbzknVar, a.eablkybsjg eablkybsjgVar, rgvfuqvkyq rgvfuqvkyqVar) {
        this.animationSpec = wwaezpbzknVar;
        this.alignment = eablkybsjgVar;
        this.finishedListener = rgvfuqvkyqVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) other;
        return zdlpuopuiu.eablkybsjg(this.animationSpec, sizeAnimationModifierElement.animationSpec) && zdlpuopuiu.eablkybsjg(this.alignment, sizeAnimationModifierElement.alignment) && zdlpuopuiu.eablkybsjg(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        rgvfuqvkyq rgvfuqvkyqVar = this.finishedListener;
        return iHashCode + (rgvfuqvkyqVar == null ? 0 : rgvfuqvkyqVar.hashCode());
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(nufgyqmvbu node) {
        node.O0(this.animationSpec);
        node.P0(this.finishedListener);
        node.M0(this.alignment);
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu btonecajqb() {
        return new nufgyqmvbu(this.animationSpec, this.alignment, this.finishedListener);
    }
}
