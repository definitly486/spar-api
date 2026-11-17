package g21;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.fragment.app.jyumaefscl;
import androidx.fragment.app.oxmwwwfdhm;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k21.vdvldrhtss;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.nufgyqmvbu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends m9.zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final draadjrbmk f35873gxszxtbevo;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar, int i13, FragmentManager fragmentManager, jyumaefscl jyumaefsclVar, draadjrbmk draadjrbmkVar, int i14, gtknphoqwx gtknphoqwxVar) {
        FragmentManager supportFragmentManager = (i14 & 4) != 0 ? oxmwwwfdhmVar.getSupportFragmentManager() : fragmentManager;
        this(oxmwwwfdhmVar, i13, supportFragmentManager, (i14 & 8) != 0 ? supportFragmentManager.dvvnrvtcbc() : jyumaefsclVar, (i14 & 16) != 0 ? new draadjrbmk() { // from class: g21.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wflxmlrfwp(((Boolean) obj).booleanValue());
            }
        } : draadjrbmkVar);
    }

    private final boolean iwizpuwonk() {
        return dxjokdxxww().ezmngbhpjk() || dxjokdxxww().d();
    }

    private final void kcexrzcfyt(m9.iobyxmoadg iobyxmoadgVar) {
        Intent intentPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(gxszxtbevo());
        try {
            gxszxtbevo().startActivity(intentPpxfxbqfkf, iobyxmoadgVar.zoijcleaow());
        } catch (ActivityNotFoundException unused) {
            gtknphoqwx(iobyxmoadgVar, intentPpxfxbqfkf);
        }
    }

    private final void ojitshcjhn(eablkybsjg eablkybsjgVar) {
        if (iwizpuwonk()) {
            return;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
            if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
            rgvfuqvkyq(new l9.zoijcleaow(iobyxmoadgVar.iobyxmoadg()), iobyxmoadgVar.zoijcleaow());
            return;
        }
        eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
        if (!(zoijcleaowVar.zoijcleaow() instanceof m9.wkgbmnqykc) || zdlpuopuiu.eablkybsjg(hg.jyumaefscl.lxfrhoxuzk(btonecajqb()), zoijcleaowVar.zoijcleaow().wkgbmnqykc())) {
            return;
        }
        zdlpuopuiu((m9.wkgbmnqykc) zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
    }

    private final void oxmwwwfdhm() {
        Object objPrevious;
        if (iwizpuwonk()) {
            return;
        }
        FragmentManager fragmentManagerDxjokdxxww = dxjokdxxww();
        if (btonecajqb().isEmpty()) {
            zoijcleaow();
            return;
        }
        List listIgdgnonuha = fragmentManagerDxjokdxxww.igdgnonuha();
        zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        ListIterator listIterator = listIgdgnonuha.listIterator(listIgdgnonuha.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Fragment fragment = (Fragment) objPrevious;
            zdlpuopuiu.lqeggnwhkg(fragment);
            if (vdvldrhtss.zoijcleaow(fragment) && fragment.isVisible()) {
                break;
            }
        }
        Fragment fragment2 = (Fragment) objPrevious;
        fragmentManagerDxjokdxxww.r();
        if (fragment2 != null && !(fragment2 instanceof k21.oxmwwwfdhm)) {
            jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManagerDxjokdxxww.kcexrzcfyt();
            jpowsppfyaVarKcexrzcfyt.rgvfuqvkyq(fragment2);
            jpowsppfyaVarKcexrzcfyt.draadjrbmk();
        }
        btonecajqb().remove(hg.jyumaefscl.ojitshcjhn(btonecajqb()));
    }

    private final void ppxfxbqfkf() {
        if (iwizpuwonk()) {
            return;
        }
        btonecajqb().clear();
        dxjokdxxww().u(null, 1);
    }

    private final void rgvfuqvkyq(l9.zoijcleaow zoijcleaowVar, boolean z13) {
        if (iwizpuwonk()) {
            return;
        }
        l9.vdvldrhtss vdvldrhtssVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        if (vdvldrhtssVarIobyxmoadg == null) {
            ppxfxbqfkf();
            return;
        }
        String strWkgbmnqykc = vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
        Iterator it = btonecajqb().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (zdlpuopuiu.eablkybsjg((String) it.next(), strWkgbmnqykc)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1) {
            wkgbmnqykc(vdvldrhtssVarIobyxmoadg);
            return;
        }
        dxjokdxxww().u(strWkgbmnqykc, z13 ? 1 : 0);
        if (i13 == 0 && z13) {
            btonecajqb().clear();
        } else {
            btonecajqb().subList(i13 + 1, btonecajqb().size()).clear();
        }
    }

    static /* synthetic */ void vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, l9.zoijcleaow zoijcleaowVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        ppxfxbqfkfVar.rgvfuqvkyq(zoijcleaowVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(boolean z13) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yggfygwlhe() {
        btonecajqb().clear();
        int iRoivzttewh = dxjokdxxww().roivzttewh();
        for (int i13 = 0; i13 < iRoivzttewh; i13++) {
            List listBtonecajqb = btonecajqb();
            String name = dxjokdxxww().tbqsvytpvh(i13).getName();
            if (name == null) {
                name = "";
            }
            listBtonecajqb.add(name);
        }
    }

    protected void agtfadlqog(l9.eablkybsjg command) {
        zdlpuopuiu.btonecajqb(command, "command");
        if (command instanceof eablkybsjg) {
            ojitshcjhn((eablkybsjg) command);
        } else if (command instanceof l9.zoijcleaow) {
            vdvldrhtss(this, (l9.zoijcleaow) command, false, 2, null);
        } else if (command instanceof l9.iobyxmoadg) {
            oxmwwwfdhm();
        } else if (command instanceof nufgyqmvbu) {
            jyumaefscl((nufgyqmvbu) command);
        } else if (command instanceof l9.gtknphoqwx) {
            cqumvgiudr((l9.gtknphoqwx) command);
        }
        this.f35873gxszxtbevo.invoke(Boolean.valueOf(btonecajqb().isEmpty()));
    }

    protected void cqumvgiudr(l9.gtknphoqwx command) {
        zdlpuopuiu.btonecajqb(command, "command");
        l9.vdvldrhtss vdvldrhtssVarIobyxmoadg = command.iobyxmoadg();
        if (vdvldrhtssVarIobyxmoadg instanceof m9.iobyxmoadg) {
            kcexrzcfyt((m9.iobyxmoadg) vdvldrhtssVarIobyxmoadg);
            gxszxtbevo().finish();
        } else {
            if (!(vdvldrhtssVarIobyxmoadg instanceof m9.wkgbmnqykc) || iwizpuwonk()) {
                return;
            }
            if (btonecajqb().isEmpty()) {
                zdlpuopuiu((m9.wkgbmnqykc) vdvldrhtssVarIobyxmoadg, false);
                return;
            }
            dxjokdxxww().r();
            btonecajqb().remove(hg.jyumaefscl.ojitshcjhn(btonecajqb()));
            zdlpuopuiu((m9.wkgbmnqykc) vdvldrhtssVarIobyxmoadg, true);
        }
    }

    protected void esjtqupxsv(m9.wkgbmnqykc screen, jpowsppfya fragmentTransaction, Fragment fragment, Fragment nextFragment) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        zdlpuopuiu.btonecajqb(fragmentTransaction, "fragmentTransaction");
        zdlpuopuiu.btonecajqb(nextFragment, "nextFragment");
        Bundle arguments = nextFragment.getArguments();
        if (arguments == null || arguments.getBoolean("BUNDLE_ANIMATION_ENABLED")) {
            fragmentTransaction.yggfygwlhe(b31.iobyxmoadg.slide_in, b31.iobyxmoadg.fade_out, b31.iobyxmoadg.fade_in, b31.iobyxmoadg.slide_out);
        }
    }

    @Override // l9.dxjokdxxww
    public void iobyxmoadg(l9.eablkybsjg[] commands) {
        zdlpuopuiu.btonecajqb(commands, "commands");
        if (iwizpuwonk()) {
            return;
        }
        dxjokdxxww().yfnezrywwk();
        yggfygwlhe();
        for (l9.eablkybsjg eablkybsjgVar : commands) {
            try {
                agtfadlqog(eablkybsjgVar);
            } catch (RuntimeException e13) {
                eablkybsjg(eablkybsjgVar, e13);
            }
        }
    }

    protected void jyumaefscl(nufgyqmvbu command) {
        zdlpuopuiu.btonecajqb(command, "command");
        l9.vdvldrhtss vdvldrhtssVarIobyxmoadg = command.iobyxmoadg();
        if (vdvldrhtssVarIobyxmoadg instanceof m9.iobyxmoadg) {
            kcexrzcfyt((m9.iobyxmoadg) vdvldrhtssVarIobyxmoadg);
        } else if (vdvldrhtssVarIobyxmoadg instanceof m9.wkgbmnqykc) {
            zdlpuopuiu((m9.wkgbmnqykc) vdvldrhtssVarIobyxmoadg, true);
        }
    }

    protected void zdlpuopuiu(m9.wkgbmnqykc screen, boolean z13) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        if (iwizpuwonk()) {
            return;
        }
        Fragment fragmentIobyxmoadg = screen.iobyxmoadg(nufgyqmvbu());
        jpowsppfya jpowsppfyaVarKcexrzcfyt = dxjokdxxww().kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction(...)");
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        esjtqupxsv(screen, jpowsppfyaVarKcexrzcfyt, dxjokdxxww().zfvoamnweg(lqeggnwhkg()), fragmentIobyxmoadg);
        if (screen.eablkybsjg()) {
            jpowsppfyaVarKcexrzcfyt.oxmwwwfdhm(lqeggnwhkg(), fragmentIobyxmoadg, screen.wkgbmnqykc());
        } else {
            jpowsppfyaVarKcexrzcfyt.ppxfxbqfkf(lqeggnwhkg(), fragmentIobyxmoadg, screen.wkgbmnqykc());
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if (z13) {
                jpowsppfyaVarKcexrzcfyt.nufgyqmvbu(screen.wkgbmnqykc());
                btonecajqb().add(screen.wkgbmnqykc());
            }
            kcexrzcfyt.wkgbmnqykc(Integer.valueOf(jpowsppfyaVarKcexrzcfyt.dxjokdxxww()));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(oxmwwwfdhm activity, int i13, FragmentManager fragmentManager, jyumaefscl fragmentFactory, draadjrbmk onFinishCommand) {
        super(activity, i13, fragmentManager, fragmentFactory);
        zdlpuopuiu.btonecajqb(activity, "activity");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        zdlpuopuiu.btonecajqb(fragmentFactory, "fragmentFactory");
        zdlpuopuiu.btonecajqb(onFinishCommand, "onFinishCommand");
        this.f35873gxszxtbevo = onFinishCommand;
    }
}
