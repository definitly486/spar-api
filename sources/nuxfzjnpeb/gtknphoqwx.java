package nuxfzjnpeb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx implements roivzttewh.btonecajqb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Runnable f71150dxjokdxxww;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f71153iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ActionMode f71155nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.iobyxmoadg f71156ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f71158zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ikoacuggdj.vipkmwdibw f71157wkgbmnqykc = new ikoacuggdj.vipkmwdibw();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.gtknphoqwx f71151eablkybsjg = new androidx.compose.runtime.snapshots.gtknphoqwx(new tg.draadjrbmk() { // from class: nuxfzjnpeb.iobyxmoadg
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return gtknphoqwx.yadqdtsiqt(this.f71170zdlpuopuiu, (tg.iobyxmoadg) obj);
        }
    });

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.draadjrbmk f71152gxszxtbevo = new tg.draadjrbmk() { // from class: nuxfzjnpeb.zoijcleaow
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return gtknphoqwx.istkbnxepw(this.f71257zdlpuopuiu, obj);
        }
    };

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final tg.draadjrbmk f71154lqeggnwhkg = new tg.draadjrbmk() { // from class: nuxfzjnpeb.ppxfxbqfkf
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return gtknphoqwx.cdpycssgdh(this.f71228zdlpuopuiu, obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg implements hcddaimhww {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private lrnfpwlwnk.ppxfxbqfkf f71159eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lrnfpwlwnk.lqeggnwhkg f71160iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private tg.iobyxmoadg f71161ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final View f71162wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tg.iobyxmoadg f71163zoijcleaow;

        public iobyxmoadg(lrnfpwlwnk.lqeggnwhkg lqeggnwhkgVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, View view) {
            this.f71160iobyxmoadg = lqeggnwhkgVar;
            this.f71163zoijcleaow = iobyxmoadgVar;
            this.f71161ppxfxbqfkf = iobyxmoadgVar2;
            this.f71162wkgbmnqykc = view;
        }

        private final boolean ppxfxbqfkf(Menu menu) {
            lrnfpwlwnk.ppxfxbqfkf ppxfxbqfkfVar = (lrnfpwlwnk.ppxfxbqfkf) this.f71163zoijcleaow.invoke();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, this.f71159eablkybsjg)) {
                return false;
            }
            menu.clear();
            List listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            int size = listZoijcleaow.size();
            int i13 = 1;
            int i14 = 1;
            for (int i15 = 0; i15 < size; i15++) {
                final lrnfpwlwnk.zoijcleaow zoijcleaowVar = (lrnfpwlwnk.zoijcleaow) listZoijcleaow.get(i15);
                if (zoijcleaowVar instanceof lrnfpwlwnk.wkgbmnqykc) {
                    int i16 = i13 + 1;
                    MenuItem menuItemAdd = menu.add(i14, i13, i13, ((lrnfpwlwnk.wkgbmnqykc) zoijcleaowVar).zoijcleaow());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: nuxfzjnpeb.btonecajqb
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return gtknphoqwx.iobyxmoadg.wkgbmnqykc(zoijcleaowVar, this, menuItem);
                        }
                    });
                    i13 = i16;
                } else if (zoijcleaowVar instanceof lrnfpwlwnk.nufgyqmvbu) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        lrnfpwlwnk.nufgyqmvbu nufgyqmvbuVar = (lrnfpwlwnk.nufgyqmvbu) zoijcleaowVar;
                        ikoacuggdj.f71169iobyxmoadg.eablkybsjg(menu, i13, this.f71162wkgbmnqykc.getContext(), nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.zoijcleaow());
                        i13++;
                    }
                } else if (zoijcleaowVar instanceof lrnfpwlwnk.gxszxtbevo) {
                    i14++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean wkgbmnqykc(lrnfpwlwnk.zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar, MenuItem menuItem) {
            ((lrnfpwlwnk.wkgbmnqykc) zoijcleaowVar).wkgbmnqykc().invoke(iobyxmoadgVar.f71160iobyxmoadg);
            return true;
        }

        @Override // nuxfzjnpeb.hcddaimhww
        public g.lqeggnwhkg iobyxmoadg(ActionMode actionMode, View view) {
            return (g.lqeggnwhkg) this.f71161ppxfxbqfkf.invoke();
        }

        @Override // nuxfzjnpeb.hcddaimhww
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // nuxfzjnpeb.hcddaimhww
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ppxfxbqfkf(menu);
            return menu.size() > 0;
        }

        @Override // nuxfzjnpeb.hcddaimhww
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f71160iobyxmoadg.close();
        }

        @Override // nuxfzjnpeb.hcddaimhww
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return ppxfxbqfkf(menu);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ roivzttewh.dxjokdxxww f71164jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f71166zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(roivzttewh.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f71164jyumaefscl = dxjokdxxwwVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(gtknphoqwx gtknphoqwxVar, hcddaimhww hcddaimhwwVar, zoijcleaow zoijcleaowVar) {
            ActionMode actionModeZoijcleaow = jlmebxxoox.f71184iobyxmoadg.zoijcleaow(gtknphoqwxVar.f71153iobyxmoadg, hcddaimhwwVar);
            kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gtknphoqwxVar.f71155nufgyqmvbu, actionModeZoijcleaow);
            if (actionModeZoijcleaow == null) {
                zoijcleaowVar.close();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return gtknphoqwx.this.new ppxfxbqfkf(this.f71164jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f71166zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    final zoijcleaow zoijcleaowVar = new zoijcleaow();
                    final hcddaimhww hcddaimhwwVarKcexrzcfyt = gtknphoqwx.this.kcexrzcfyt(zoijcleaowVar, this.f71164jyumaefscl);
                    Looper looperMyLooper = Looper.myLooper();
                    Handler handler = gtknphoqwx.this.f71153iobyxmoadg.getHandler();
                    if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = gtknphoqwx.this.f71150dxjokdxxww;
                        if (runnable == null) {
                            final gtknphoqwx gtknphoqwxVar = gtknphoqwx.this;
                            Runnable runnable2 = new Runnable() { // from class: nuxfzjnpeb.draadjrbmk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    gtknphoqwx.ppxfxbqfkf.kcexrzcfyt(gtknphoqwxVar, hcddaimhwwVarKcexrzcfyt, zoijcleaowVar);
                                }
                            };
                            gtknphoqwx.this.f71150dxjokdxxww = runnable2;
                            runnable = runnable2;
                        }
                        kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(gtknphoqwx.this.f71153iobyxmoadg.post(runnable));
                    } else {
                        gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.this;
                        ActionMode actionModeZoijcleaow = jlmebxxoox.f71184iobyxmoadg.zoijcleaow(gtknphoqwxVar2.f71153iobyxmoadg, hcddaimhwwVarKcexrzcfyt);
                        if (actionModeZoijcleaow == null) {
                            return gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                        gtknphoqwxVar2.f71155nufgyqmvbu = actionModeZoijcleaow;
                    }
                    this.f71166zdlpuopuiu = 1;
                    if (zoijcleaowVar.iobyxmoadg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                gtknphoqwx.this.f71151eablkybsjg.gxszxtbevo();
                ActionMode actionMode = gtknphoqwx.this.f71155nufgyqmvbu;
                if (actionMode != null) {
                    actionMode.finish();
                }
                Runnable runnable3 = gtknphoqwx.this.f71150dxjokdxxww;
                if (runnable3 != null) {
                    kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(gtknphoqwx.this.f71153iobyxmoadg.removeCallbacks(runnable3));
                }
                gtknphoqwx.this.f71155nufgyqmvbu = null;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                gtknphoqwx.this.f71151eablkybsjg.gxszxtbevo();
                ActionMode actionMode2 = gtknphoqwx.this.f71155nufgyqmvbu;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
                Runnable runnable4 = gtknphoqwx.this.f71150dxjokdxxww;
                if (runnable4 != null) {
                    kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(gtknphoqwx.this.f71153iobyxmoadg.removeCallbacks(runnable4));
                }
                gtknphoqwx.this.f71155nufgyqmvbu = null;
                throw th2;
            }
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow implements lrnfpwlwnk.lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rj.lqeggnwhkg f71167iobyxmoadg = rj.btonecajqb.zoijcleaow(0, null, null, 7, null);

        @Override // lrnfpwlwnk.lqeggnwhkg
        public void close() {
            this.f71167iobyxmoadg.eablkybsjg(gg.wwaezpbzkn.f37140iobyxmoadg);
        }

        public final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            Object objPpxfxbqfkf = this.f71167iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public gtknphoqwx(View view, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f71153iobyxmoadg = view;
        this.f71158zoijcleaow = draadjrbmkVar;
        this.f71156ppxfxbqfkf = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn cdpycssgdh(gtknphoqwx gtknphoqwxVar, Object obj) {
        ActionMode actionMode = gtknphoqwxVar.f71155nufgyqmvbu;
        if (actionMode != null) {
            jlmebxxoox.f71184iobyxmoadg.iobyxmoadg(actionMode);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.lqeggnwhkg cqumvgiudr(gtknphoqwx gtknphoqwxVar, roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return gtknphoqwxVar.oxmwwwfdhm(dxjokdxxwwVar);
    }

    private final lrnfpwlwnk.ppxfxbqfkf esjtqupxsv(final roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return (lrnfpwlwnk.ppxfxbqfkf) pmvmpeiblj("dataBuilder", this.f71152gxszxtbevo, new tg.iobyxmoadg() { // from class: nuxfzjnpeb.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.lereixgezr(dxjokdxxwwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn istkbnxepw(gtknphoqwx gtknphoqwxVar, Object obj) {
        ActionMode actionMode = gtknphoqwxVar.f71155nufgyqmvbu;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final g.lqeggnwhkg iwizpuwonk(final roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return (g.lqeggnwhkg) pmvmpeiblj("positioner", this.f71154lqeggnwhkg, new tg.iobyxmoadg() { // from class: nuxfzjnpeb.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.cqumvgiudr(this.f71210zdlpuopuiu, dxjokdxxwwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hcddaimhww kcexrzcfyt(zoijcleaow zoijcleaowVar, final roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        hcddaimhww hcddaimhwwVar;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(zoijcleaowVar, new tg.iobyxmoadg() { // from class: nuxfzjnpeb.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.zdlpuopuiu(this.f71244zdlpuopuiu, dxjokdxxwwVar);
            }
        }, new tg.iobyxmoadg() { // from class: nuxfzjnpeb.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.yggfygwlhe(this.f71147zdlpuopuiu, dxjokdxxwwVar);
            }
        }, this.f71153iobyxmoadg);
        tg.draadjrbmk draadjrbmkVar = this.f71158zoijcleaow;
        return (draadjrbmkVar == null || (hcddaimhwwVar = (hcddaimhww) draadjrbmkVar.invoke(iobyxmoadgVar)) == null) ? iobyxmoadgVar : hcddaimhwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lrnfpwlwnk.ppxfxbqfkf lereixgezr(roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return dxjokdxxwwVar.sflfametgt();
    }

    private final g.lqeggnwhkg oxmwwwfdhm(roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        x.rgvfuqvkyq rgvfuqvkyqVar = (x.rgvfuqvkyq) this.f71156ppxfxbqfkf.invoke();
        return dxjokdxxwwVar.f(rgvfuqvkyqVar).oxmwwwfdhm(x.vdvldrhtss.eablkybsjg(rgvfuqvkyqVar));
    }

    private final Object pmvmpeiblj(Object obj, tg.draadjrbmk draadjrbmkVar, final tg.iobyxmoadg iobyxmoadgVar) {
        final kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        this.f71151eablkybsjg.gtknphoqwx(obj, draadjrbmkVar, new tg.iobyxmoadg() { // from class: nuxfzjnpeb.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.zynmafqrjb(hkdspvbjdzVar, iobyxmoadgVar);
            }
        });
        Object obj2 = hkdspvbjdzVar.f60015zdlpuopuiu;
        if (obj2 != null) {
            return obj2;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("result");
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yadqdtsiqt(gtknphoqwx gtknphoqwxVar, final tg.iobyxmoadg iobyxmoadgVar) {
        Handler handler = gtknphoqwxVar.f71153iobyxmoadg.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            iobyxmoadgVar.invoke();
        } else {
            Handler handler2 = gtknphoqwxVar.f71153iobyxmoadg.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: nuxfzjnpeb.gxszxtbevo
                    @Override // java.lang.Runnable
                    public final void run() {
                        gtknphoqwx.iozdgvuglv(iobyxmoadgVar);
                    }
                });
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.lqeggnwhkg yggfygwlhe(gtknphoqwx gtknphoqwxVar, roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return gtknphoqwxVar.iwizpuwonk(dxjokdxxwwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lrnfpwlwnk.ppxfxbqfkf zdlpuopuiu(gtknphoqwx gtknphoqwxVar, roivzttewh.dxjokdxxww dxjokdxxwwVar) {
        return gtknphoqwxVar.esjtqupxsv(dxjokdxxwwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zynmafqrjb(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, tg.iobyxmoadg iobyxmoadgVar) {
        hkdspvbjdzVar.f60015zdlpuopuiu = iobyxmoadgVar.invoke();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // roivzttewh.btonecajqb
    public Object iobyxmoadg(roivzttewh.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEablkybsjg = ikoacuggdj.vipkmwdibw.eablkybsjg(this.f71157wkgbmnqykc, null, new ppxfxbqfkf(dxjokdxxwwVar, null), gxszxtbevoVar, 1, null);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void jyumaefscl() {
        this.f71151eablkybsjg.oxmwwwfdhm();
        this.f71151eablkybsjg.gxszxtbevo();
        ActionMode actionMode = this.f71155nufgyqmvbu;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f71155nufgyqmvbu = null;
    }

    public final void lmojexxdyd() {
        this.f71151eablkybsjg.vdvldrhtss();
    }
}
