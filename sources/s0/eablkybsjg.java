package s0;

import android.graphics.Typeface;
import androidx.compose.runtime.i1;
import j0.iozdgvuglv;
import j0.jrbgnlbqoe;
import j0.n;
import java.util.ArrayList;
import java.util.List;
import k0.pkzmftpjix;
import n0.ikoacuggdj;
import n0.lereixgezr;
import n0.pmvmpeiblj;
import n0.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements iozdgvuglv {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private jyumaefscl f105119btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f105120draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final pkzmftpjix f105121dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n0.wflxmlrfwp.zoijcleaow f105122eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f105123gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final w0.wkgbmnqykc f105124gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105125iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dxjokdxxww f105126lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final CharSequence f105127nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f105128ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f105129wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n f105130zoijcleaow;

    public eablkybsjg(String str, n nVar, List list, List list2, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, w0.wkgbmnqykc wkgbmnqykcVar) {
        Object obj;
        List list3;
        this.f105125iobyxmoadg = str;
        this.f105130zoijcleaow = nVar;
        this.f105128ppxfxbqfkf = list;
        this.f105129wkgbmnqykc = list2;
        this.f105122eablkybsjg = zoijcleaowVar;
        this.f105124gxszxtbevo = wkgbmnqykcVar;
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(1, wkgbmnqykcVar.getDensity());
        this.f105126lqeggnwhkg = dxjokdxxwwVar;
        this.f105123gtknphoqwx = !gxszxtbevo.ppxfxbqfkf(nVar) ? false : ((Boolean) vdvldrhtss.f105143iobyxmoadg.iobyxmoadg().getValue()).booleanValue();
        this.f105120draadjrbmk = gxszxtbevo.wkgbmnqykc(nVar.zynmafqrjb(), nVar.yggfygwlhe());
        tg.oxmwwwfdhm oxmwwwfdhmVar = new tg.oxmwwwfdhm() { // from class: s0.wkgbmnqykc
            @Override // tg.oxmwwwfdhm
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                return eablkybsjg.eablkybsjg(this.f105147zdlpuopuiu, (n0.wflxmlrfwp) obj2, (yadqdtsiqt) obj3, (lereixgezr) obj4, (pmvmpeiblj) obj5);
            }
        };
        t0.eablkybsjg.eablkybsjg(dxjokdxxwwVar, nVar.yadqdtsiqt());
        jrbgnlbqoe jrbgnlbqoeVarCllcsxoeiz = nVar.cllcsxoeiz();
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (((j0.eablkybsjg.wkgbmnqykc) obj).lqeggnwhkg() instanceof jrbgnlbqoe) {
                break;
            } else {
                i13++;
            }
        }
        jrbgnlbqoe jrbgnlbqoeVarIobyxmoadg = t0.eablkybsjg.iobyxmoadg(dxjokdxxwwVar, jrbgnlbqoeVarCllcsxoeiz, oxmwwwfdhmVar, wkgbmnqykcVar, obj != null);
        if (jrbgnlbqoeVarIobyxmoadg != null) {
            int size2 = this.f105128ppxfxbqfkf.size() + 1;
            ArrayList arrayList = new ArrayList(size2);
            int i14 = 0;
            while (i14 < size2) {
                arrayList.add(i14 == 0 ? new j0.eablkybsjg.wkgbmnqykc(jrbgnlbqoeVarIobyxmoadg, 0, this.f105125iobyxmoadg.length()) : (j0.eablkybsjg.wkgbmnqykc) this.f105128ppxfxbqfkf.get(i14 - 1));
                i14++;
            }
            list3 = arrayList;
        } else {
            list3 = this.f105128ppxfxbqfkf;
        }
        CharSequence charSequenceIobyxmoadg = ppxfxbqfkf.iobyxmoadg(this.f105125iobyxmoadg, this.f105126lqeggnwhkg.getTextSize(), this.f105130zoijcleaow, list3, this.f105129wkgbmnqykc, this.f105124gxszxtbevo, oxmwwwfdhmVar, this.f105123gtknphoqwx);
        this.f105127nufgyqmvbu = charSequenceIobyxmoadg;
        this.f105121dxjokdxxww = new pkzmftpjix(charSequenceIobyxmoadg, this.f105126lqeggnwhkg, this.f105120draadjrbmk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface eablkybsjg(eablkybsjg eablkybsjgVar, n0.wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, lereixgezr lereixgezrVar, pmvmpeiblj pmvmpeibljVar) {
        i1 i1VarZoijcleaow = eablkybsjgVar.f105122eablkybsjg.zoijcleaow(wflxmlrfwpVar, yadqdtsiqtVar, lereixgezrVar.dxjokdxxww(), pmvmpeibljVar.wflxmlrfwp());
        if (i1VarZoijcleaow instanceof ikoacuggdj.zoijcleaow) {
            Object value = ((ikoacuggdj.zoijcleaow) i1VarZoijcleaow).getValue();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        jyumaefscl jyumaefsclVar = new jyumaefscl(i1VarZoijcleaow, eablkybsjgVar.f105119btonecajqb);
        eablkybsjgVar.f105119btonecajqb = jyumaefsclVar;
        return jyumaefsclVar.iobyxmoadg();
    }

    public final dxjokdxxww btonecajqb() {
        return this.f105126lqeggnwhkg;
    }

    public final int dxjokdxxww() {
        return this.f105120draadjrbmk;
    }

    public final CharSequence gxszxtbevo() {
        return this.f105127nufgyqmvbu;
    }

    @Override // j0.iozdgvuglv
    public float iobyxmoadg() {
        return this.f105121dxjokdxxww.dxjokdxxww();
    }

    public final pkzmftpjix lqeggnwhkg() {
        return this.f105121dxjokdxxww;
    }

    public final n nufgyqmvbu() {
        return this.f105130zoijcleaow;
    }

    @Override // j0.iozdgvuglv
    public boolean ppxfxbqfkf() {
        jyumaefscl jyumaefsclVar = this.f105119btonecajqb;
        return (jyumaefsclVar != null ? jyumaefsclVar.zoijcleaow() : false) || (!this.f105123gtknphoqwx && gxszxtbevo.ppxfxbqfkf(this.f105130zoijcleaow) && ((Boolean) vdvldrhtss.f105143iobyxmoadg.iobyxmoadg().getValue()).booleanValue());
    }

    @Override // j0.iozdgvuglv
    public float zoijcleaow() {
        return this.f105121dxjokdxxww.btonecajqb();
    }
}
