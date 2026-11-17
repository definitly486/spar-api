package androidx.compose.foundation;

import ikoacuggdj.tzroggbefp;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/kcexrzcfyt;", "Lmetgxyhuhe/btonecajqb;", "interactionSource", "Likoacuggdj/tzroggbefp;", "indication", "<init>", "(Lmetgxyhuhe/btonecajqb;Likoacuggdj/tzroggbefp;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/kcexrzcfyt;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/kcexrzcfyt;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lmetgxyhuhe/btonecajqb;", "ppxfxbqfkf", "Likoacuggdj/tzroggbefp;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndicationModifierElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final tzroggbefp indication;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final metgxyhuhe.btonecajqb interactionSource;

    public IndicationModifierElement(metgxyhuhe.btonecajqb btonecajqbVar, tzroggbefp tzroggbefpVar) {
        this.interactionSource = btonecajqbVar;
        this.indication = tzroggbefpVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.interactionSource, indicationModifierElement.interactionSource) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.indication, indicationModifierElement.indication);
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(kcexrzcfyt node) {
        node.N0(this.indication.zoijcleaow(this.interactionSource));
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt btonecajqb() {
        return new kcexrzcfyt(this.indication.zoijcleaow(this.interactionSource));
    }
}
