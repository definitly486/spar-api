package roivzttewh;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import ikoacuggdj.vipkmwdibw;
import tg.kcexrzcfyt;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f83234iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vipkmwdibw f83236zoijcleaow = new vipkmwdibw();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iwxlajgraz f83235ppxfxbqfkf = c1.ppxfxbqfkf(null, null, 2, null);

    private final class iobyxmoadg implements lrnfpwlwnk.lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dxjokdxxww f83237iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final rj.lqeggnwhkg f83239zoijcleaow = rj.btonecajqb.zoijcleaow(0, null, null, 7, null);

        public iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
            this.f83237iobyxmoadg = dxjokdxxwwVar;
        }

        @Override // lrnfpwlwnk.lqeggnwhkg
        public void close() {
            this.f83239zoijcleaow.eablkybsjg(wwaezpbzkn.f37140iobyxmoadg);
        }

        public final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            Object objPpxfxbqfkf = this.f83239zoijcleaow.ppxfxbqfkf(gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
        }

        public final dxjokdxxww zoijcleaow() {
            return this.f83237iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f83240jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83242zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f83240jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new zoijcleaow(this.f83240jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83242zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ppxfxbqfkf.this.btonecajqb(this.f83240jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = this.f83240jyumaefscl;
                    this.f83242zdlpuopuiu = 1;
                    if (iobyxmoadgVar.iobyxmoadg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                ppxfxbqfkf.this.btonecajqb(null);
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                ppxfxbqfkf.this.btonecajqb(null);
                throw th2;
            }
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(kcexrzcfyt kcexrzcfytVar) {
        this.f83234iobyxmoadg = kcexrzcfytVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(iobyxmoadg iobyxmoadgVar) {
        this.f83235ppxfxbqfkf.setValue(iobyxmoadgVar);
    }

    private final iobyxmoadg dxjokdxxww() {
        return (iobyxmoadg) this.f83235ppxfxbqfkf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkfVar.wkgbmnqykc(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkfVar.wkgbmnqykc(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // roivzttewh.btonecajqb
    public Object iobyxmoadg(dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEablkybsjg = vipkmwdibw.eablkybsjg(this.f83236zoijcleaow, null, new zoijcleaow(new iobyxmoadg(dxjokdxxwwVar), null), gxszxtbevoVar, 1, null);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void nufgyqmvbu() {
        iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww();
        if (iobyxmoadgVarDxjokdxxww != null) {
            iobyxmoadgVarDxjokdxxww.close();
        }
    }

    public final void wkgbmnqykc(final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(723898654);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(723898654, i14, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww();
            if (iobyxmoadgVarDxjokdxxww == null) {
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: roivzttewh.iobyxmoadg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ppxfxbqfkf.eablkybsjg(this.f83227zdlpuopuiu, iobyxmoadgVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            this.f83234iobyxmoadg.invoke(iobyxmoadgVarDxjokdxxww, iobyxmoadgVarDxjokdxxww.zoijcleaow(), iobyxmoadgVar, draadjrbmkVarBtonecajqb, Integer.valueOf((i14 << 6) & 896));
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp2 = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp2 != null) {
            a0VarWflxmlrfwp2.iobyxmoadg(new rgvfuqvkyq() { // from class: roivzttewh.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.gxszxtbevo(this.f83248zdlpuopuiu, iobyxmoadgVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
