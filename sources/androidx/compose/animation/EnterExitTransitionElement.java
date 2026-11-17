package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ribwqtqdhb.agtfadlqog;
import vipkmwdibw.skhdrjzrfn;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b\u0013\u0010F\"\u0004\bG\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/animation/ppxfxbqfkf;", "Lvipkmwdibw/skhdrjzrfn;", "Lribwqtqdhb/dxjokdxxww;", "transition", "Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;", "Lw0/oxmwwwfdhm;", "Lvipkmwdibw/rgvfuqvkyq;", "sizeAnimation", "Lw0/agtfadlqog;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/wkgbmnqykc;", "enter", "Landroidx/compose/animation/gxszxtbevo;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lribwqtqdhb/agtfadlqog;", "graphicsLayerBlock", "<init>", "(Lvipkmwdibw/skhdrjzrfn;Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;Landroidx/compose/animation/wkgbmnqykc;Landroidx/compose/animation/gxszxtbevo;Ltg/iobyxmoadg;Lribwqtqdhb/agtfadlqog;)V", "wflxmlrfwp", "()Landroidx/compose/animation/ppxfxbqfkf;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/animation/ppxfxbqfkf;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lvipkmwdibw/skhdrjzrfn;", "getTransition", "()Lvipkmwdibw/skhdrjzrfn;", "ppxfxbqfkf", "Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;", "getSizeAnimation", "()Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;", "setSizeAnimation", "(Lvipkmwdibw/skhdrjzrfn$iobyxmoadg;)V", "wkgbmnqykc", "getOffsetAnimation", "setOffsetAnimation", "eablkybsjg", "getSlideAnimation", "setSlideAnimation", "gxszxtbevo", "Landroidx/compose/animation/wkgbmnqykc;", "getEnter", "()Landroidx/compose/animation/wkgbmnqykc;", "setEnter", "(Landroidx/compose/animation/wkgbmnqykc;)V", "lqeggnwhkg", "Landroidx/compose/animation/gxszxtbevo;", "getExit", "()Landroidx/compose/animation/gxszxtbevo;", "setExit", "(Landroidx/compose/animation/gxszxtbevo;)V", "nufgyqmvbu", "Ltg/iobyxmoadg;", "()Ltg/iobyxmoadg;", "setEnabled", "(Ltg/iobyxmoadg;)V", "dxjokdxxww", "Lribwqtqdhb/agtfadlqog;", "getGraphicsLayerBlock", "()Lribwqtqdhb/agtfadlqog;", "setGraphicsLayerBlock", "(Lribwqtqdhb/agtfadlqog;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata and from toString */
    private agtfadlqog graphicsLayerBlock;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private skhdrjzrfn.iobyxmoadg slideAnimation;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private wkgbmnqykc enter;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private gxszxtbevo exit;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata and from toString */
    private tg.iobyxmoadg isEnabled;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private skhdrjzrfn.iobyxmoadg sizeAnimation;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private skhdrjzrfn.iobyxmoadg offsetAnimation;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final skhdrjzrfn transition;

    public EnterExitTransitionElement(skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn.iobyxmoadg iobyxmoadgVar, skhdrjzrfn.iobyxmoadg iobyxmoadgVar2, skhdrjzrfn.iobyxmoadg iobyxmoadgVar3, wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar4, agtfadlqog agtfadlqogVar) {
        this.transition = skhdrjzrfnVar;
        this.sizeAnimation = iobyxmoadgVar;
        this.offsetAnimation = iobyxmoadgVar2;
        this.slideAnimation = iobyxmoadgVar3;
        this.enter = wkgbmnqykcVar;
        this.exit = gxszxtbevoVar;
        this.isEnabled = iobyxmoadgVar4;
        this.graphicsLayerBlock = agtfadlqogVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return zdlpuopuiu.eablkybsjg(this.transition, enterExitTransitionElement.transition) && zdlpuopuiu.eablkybsjg(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && zdlpuopuiu.eablkybsjg(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && zdlpuopuiu.eablkybsjg(this.slideAnimation, enterExitTransitionElement.slideAnimation) && zdlpuopuiu.eablkybsjg(this.enter, enterExitTransitionElement.enter) && zdlpuopuiu.eablkybsjg(this.exit, enterExitTransitionElement.exit) && zdlpuopuiu.eablkybsjg(this.isEnabled, enterExitTransitionElement.isEnabled) && zdlpuopuiu.eablkybsjg(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        skhdrjzrfn.iobyxmoadg iobyxmoadgVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31;
        skhdrjzrfn.iobyxmoadg iobyxmoadgVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (iobyxmoadgVar2 == null ? 0 : iobyxmoadgVar2.hashCode())) * 31;
        skhdrjzrfn.iobyxmoadg iobyxmoadgVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (iobyxmoadgVar3 != null ? iobyxmoadgVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(ppxfxbqfkf node) {
        node.S0(this.transition);
        node.Q0(this.sizeAnimation);
        node.P0(this.offsetAnimation);
        node.R0(this.slideAnimation);
        node.L0(this.enter);
        node.M0(this.exit);
        node.K0(this.isEnabled);
        node.N0(this.graphicsLayerBlock);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf btonecajqb() {
        return new ppxfxbqfkf(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }
}
