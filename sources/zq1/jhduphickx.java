package zq1;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.concurrent.CancellationException;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jhduphickx {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof sr1.wflxmlrfwp);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f130968jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f130969yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130970zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f130968jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f130968jyumaefscl, gxszxtbevoVar);
            ppxfxbqfkfVar.f130969yggfygwlhe = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f130970zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((Throwable) this.f130969yggfygwlhe) instanceof CancellationException)) {
                this.f130968jyumaefscl.invoke();
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(th2, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ uq1.lereixgezr f130971jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f130972yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130973zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ef.iobyxmoadg iobyxmoadgVar, uq1.lereixgezr lereixgezrVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f130972yggfygwlhe = iobyxmoadgVar;
            this.f130971jyumaefscl = lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f130972yggfygwlhe, this.f130971jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f130973zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f130971jyumaefscl.f114184wkgbmnqykc.setText(q11.btonecajqb.zoijcleaow(((sr1.wflxmlrfwp) this.f130972yggfygwlhe.eablkybsjg()).wkgbmnqykc() - (SystemClock.elapsedRealtime() / 1000), (542 & 2) != 0, (542 & 4) != 0, (542 & 8) != 0, (542 & 16) != 0, (542 & 32) != 0 ? -1 : vk0.lqeggnwhkg.proloyalty_special_banner_timer_days, (542 & 64) != 0 ? -1 : vk0.lqeggnwhkg.proloyalty_special_banner_timer_hours, (542 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? -1 : vk0.lqeggnwhkg.proloyalty_special_banner_timer_minutes, (542 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? -1 : vk0.lqeggnwhkg.proloyalty_special_banner_timer_seconds, (542 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? " : " : null, this.f130972yggfygwlhe.wkgbmnqykc()));
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f130974zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean btonecajqb(ef.iobyxmoadg iobyxmoadgVar) {
        return ((sr1.wflxmlrfwp) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() - (SystemClock.elapsedRealtime() / 1000) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(uq1.lereixgezr lereixgezrVar, ef.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ImageView ivIcon = lereixgezrVar.f114185zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.ppxfxbqfkf(ivIcon, ((sr1.wflxmlrfwp) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), b31.gxszxtbevo.placeholder);
        lereixgezrVar.f114183ppxfxbqfkf.setText(((sr1.wflxmlrfwp) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        gtknphoqwx(gtknphoqwxVar).start();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final auzgnhcxok dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar, final ef.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, uq1.lereixgezr lereixgezrVar) {
        return q11.btonecajqb.wkgbmnqykc((pj.cllcsxoeiz) iobyxmoadgVar.invoke(), (104 & 2) != 0 ? 0L : 0L, (104 & 4) != 0 ? 1000L : 0L, (104 & 8) != 0 ? null : new tg.iobyxmoadg() { // from class: zq1.vipkmwdibw
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Boolean.valueOf(jhduphickx.btonecajqb(iobyxmoadgVar2));
            }
        }, 0, (104 & 32) != 0 ? new q11.btonecajqb.iobyxmoadg(null) : null, (104 & 64) != 0 ? new q11.btonecajqb.zoijcleaow(null) : null, (104 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new q11.btonecajqb.ppxfxbqfkf(null) : new ppxfxbqfkf(iobyxmoadgVar3, null), (104 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new q11.btonecajqb.wkgbmnqykc(null) : new wkgbmnqykc(iobyxmoadgVar2, lereixgezrVar, null));
    }

    private static final auzgnhcxok gtknphoqwx(gg.gtknphoqwx gtknphoqwxVar) {
        return (auzgnhcxok) gtknphoqwxVar.getValue();
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.iobyxmoadg coroutineScope, final tg.iobyxmoadg onCompletionAction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCompletionAction, "onCompletionAction");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: zq1.sopmlzcsov
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return jhduphickx.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: zq1.crxdokpmqz
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return jhduphickx.nufgyqmvbu(coroutineScope, onCompletionAction, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f130974zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq1.lereixgezr lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.lereixgezr lereixgezrVarPpxfxbqfkf = uq1.lereixgezr.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lereixgezrVarPpxfxbqfkf, "inflate(...)");
        return lereixgezrVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(final tg.iobyxmoadg iobyxmoadgVar, final tg.iobyxmoadg iobyxmoadgVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.lereixgezr lereixgezrVar = (uq1.lereixgezr) adapterDelegateViewBinding.ppxfxbqfkf();
        final gg.gtknphoqwx gtknphoqwxVarZoijcleaow = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: zq1.jlmebxxoox
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return jhduphickx.dxjokdxxww(iobyxmoadgVar, adapterDelegateViewBinding, iobyxmoadgVar2, lereixgezrVar);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: zq1.ribwqtqdhb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return jhduphickx.draadjrbmk(lereixgezrVar, adapterDelegateViewBinding, gtknphoqwxVarZoijcleaow, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
