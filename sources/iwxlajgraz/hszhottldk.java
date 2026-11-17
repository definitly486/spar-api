package iwxlajgraz;

import androidx.compose.ui.platform.m;
import androidx.compose.ui.platform.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class hszhottldk implements p0.jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private iobyxmoadg f49863iobyxmoadg;

    public interface iobyxmoadg {
        opjhrmiecq.igdgnonuha Y();

        m getSoftwareKeyboardController();

        w getViewConfiguration();

        skhdrjzrfn.skhdrjzrfn r();

        x.rgvfuqvkyq skhdrjzrfn();

        pj.auzgnhcxok z(tg.rgvfuqvkyq rgvfuqvkyqVar);
    }

    public final void btonecajqb(iobyxmoadg iobyxmoadgVar) {
        if (!(this.f49863iobyxmoadg == null)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("Expected textInputModifierNode to be null");
        }
        this.f49863iobyxmoadg = iobyxmoadgVar;
    }

    public final void draadjrbmk(iobyxmoadg iobyxmoadgVar) {
        if (!(this.f49863iobyxmoadg == iobyxmoadgVar)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("Expected textInputModifierNode to be " + iobyxmoadgVar + " but was " + this.f49863iobyxmoadg);
        }
        this.f49863iobyxmoadg = null;
    }

    protected final iobyxmoadg dxjokdxxww() {
        return this.f49863iobyxmoadg;
    }

    @Override // p0.jpowsppfya
    public final void eablkybsjg() {
        m softwareKeyboardController;
        iobyxmoadg iobyxmoadgVar = this.f49863iobyxmoadg;
        if (iobyxmoadgVar == null || (softwareKeyboardController = iobyxmoadgVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.zoijcleaow();
    }

    public abstract void gtknphoqwx();

    @Override // p0.jpowsppfya
    public final void lqeggnwhkg() {
        m softwareKeyboardController;
        iobyxmoadg iobyxmoadgVar = this.f49863iobyxmoadg;
        if (iobyxmoadgVar == null || (softwareKeyboardController = iobyxmoadgVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.iobyxmoadg();
    }
}
