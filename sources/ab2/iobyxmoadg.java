package ab2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import oa0.btonecajqb;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final h00.iobyxmoadg f1302eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final at.iobyxmoadg f1303gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final i20.iobyxmoadg f1304ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f1305wkgbmnqykc;

    /* JADX INFO: renamed from: ab2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0026iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1307zdlpuopuiu;

        C0026iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C0026iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1307zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                btonecajqb btonecajqbVar = iobyxmoadg.this.f1305wkgbmnqykc;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f1307zdlpuopuiu = 1;
                obj = btonecajqbVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            iobyxmoadg.this.xrmfcynszj(zBooleanValue);
            iobyxmoadg.this.uwvvkdfqfp(zBooleanValue);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0026iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1309zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1309zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                at.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f1303gxszxtbevo;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f1309zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(name, "android.permission.CAMERA", this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            at.ppxfxbqfkf ppxfxbqfkfVar = (at.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.ydmasvzmpa();
            } else {
                if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.crxdokpmqz(eablkybsjg.zoijcleaow.f1297iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(i20.iobyxmoadg getChatOrderFullLinkUseCase, btonecajqb isChatOrderFeatureEnabledUseCase, h00.iobyxmoadg fileUtil, at.iobyxmoadg permissionManager, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getChatOrderFullLinkUseCase, "getChatOrderFullLinkUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isChatOrderFeatureEnabledUseCase, "isChatOrderFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f1304ppxfxbqfkf = getChatOrderFullLinkUseCase;
        this.f1305wkgbmnqykc = isChatOrderFeatureEnabledUseCase;
        this.f1302eablkybsjg = fileUtil;
        this.f1303gxszxtbevo = permissionManager;
    }

    private final void czzsidtyhn() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0026iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(boolean z13) {
        if (z13) {
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg.zoijcleaow((String) this.f1304ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj(boolean z13) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg.C0025iobyxmoadg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa() {
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(this.f1302eablkybsjg.iobyxmoadg()));
    }

    private final void yfnezrywwk() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f1310iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f1311iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f1294iobyxmoadg);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f1312iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.ppxfxbqfkf.f1295iobyxmoadg);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f1313iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk();
        }
    }
}
