package n70;

import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.dsvhmnatus;
import pj.ikoacuggdj;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final f30.zoijcleaow f69257yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final v10.zoijcleaow f69258zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f69259jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69261zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69259jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new iobyxmoadg(this.f69259jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69261zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            wkgbmnqykc.this.f69258zdlpuopuiu.ojitshcjhn(this.f69259jyumaefscl);
            this.f69261zdlpuopuiu = 1;
            if (crxdokpmqz.zoijcleaow(100L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            f30.zoijcleaow zoijcleaowVar = wkgbmnqykc.this.f69257yggfygwlhe;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            this.f69261zdlpuopuiu = 2;
            if (zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, wkgbmnqykc.class, "titleProvider", "titleProvider(Lcom/pandulapeter/beagle/common/contracts/BeagleListItemContract;)Lcom/pandulapeter/beagle/common/configuration/Text;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Text invoke(p002if.zoijcleaow zoijcleaowVar) {
            return ((wkgbmnqykc) this.receiver).wflxmlrfwp(zoijcleaowVar);
        }
    }

    public wkgbmnqykc(v10.zoijcleaow sharedPreferencesRepository, f30.zoijcleaow restartAppUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restartAppUseCase, "restartAppUseCase");
        this.f69258zdlpuopuiu = sharedPreferencesRepository;
        this.f69257yggfygwlhe = restartAppUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, o70.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            wkgbmnqykcVar.gxszxtbevo(zoijcleaowVar);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void gxszxtbevo(o70.zoijcleaow zoijcleaowVar) {
        String strLqeggnwhkg;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, o70.zoijcleaow.iobyxmoadg.f72262zoijcleaow)) {
            strLqeggnwhkg = j40.iobyxmoadg.BITRIX_NEW.lqeggnwhkg();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, o70.zoijcleaow.C1562zoijcleaow.f72263zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            strLqeggnwhkg = j40.iobyxmoadg.BITRIX_OLD.lqeggnwhkg();
        }
        pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(ikoacuggdj.zoijcleaow()), null, null, new iobyxmoadg(strLqeggnwhkg, null), 3, null);
    }

    private final String lqeggnwhkg() {
        return j40.iobyxmoadg.f50684yggfygwlhe.iobyxmoadg(this.f69258zdlpuopuiu.kegysxyocb()).lqeggnwhkg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Text wflxmlrfwp(p002if.zoijcleaow zoijcleaowVar) {
        Text title;
        Text textZoijcleaow;
        return (zoijcleaowVar == null || (title = zoijcleaowVar.getTitle()) == null || (textZoijcleaow = title.zoijcleaow("")) == null) ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Неизвестно") : textZoijcleaow;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public jf.iobyxmoadg invoke() {
        return new nf.agtfadlqog(new zoijcleaow(this), hg.jyumaefscl.rgvfuqvkyq(o70.zoijcleaow.iobyxmoadg.f72262zoijcleaow, o70.zoijcleaow.C1562zoijcleaow.f72263zoijcleaow), lqeggnwhkg(), false, false, true, false, null, new tg.draadjrbmk() { // from class: n70.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gtknphoqwx(this.f69253zdlpuopuiu, (o70.zoijcleaow) obj);
            }
        }, 216, null);
    }
}
