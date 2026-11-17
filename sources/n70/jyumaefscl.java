package n70;

import android.content.Context;
import android.widget.Toast;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.ageimvtcrz;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final cllcsxoeiz f69240jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f69241yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zv.iobyxmoadg f69242zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, jyumaefscl.class, "onExpandedItemSelected", "onExpandedItemSelected(Lru/myspar/domain/feature/debugpanel/model/PushTokenManagerContract;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((o70.eablkybsjg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(o70.eablkybsjg p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            ((jyumaefscl) this.receiver).btonecajqb(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ jyumaefscl f69243jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ o70.eablkybsjg f69244yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69245zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f69246jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ jyumaefscl f69247yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f69248zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(jyumaefscl jyumaefsclVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f69247yggfygwlhe = jyumaefsclVar;
                this.f69246jyumaefscl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f69247yggfygwlhe, this.f69246jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f69248zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                c60.zoijcleaow.zoijcleaow(this.f69247yggfygwlhe.gxszxtbevo(), null, this.f69246jyumaefscl, 1, null);
                jyumaefscl jyumaefsclVar = this.f69247yggfygwlhe;
                jyumaefsclVar.gtknphoqwx(jyumaefsclVar.gxszxtbevo(), "Push-токен скопирован");
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(o70.eablkybsjg eablkybsjgVar, jyumaefscl jyumaefsclVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69244yggfygwlhe = eablkybsjgVar;
            this.f69243jyumaefscl = jyumaefsclVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f69244yggfygwlhe, this.f69243jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf;
            iobyxmoadg iobyxmoadgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69245zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
                        iobyxmoadgVar = new iobyxmoadg(this.f69243jyumaefscl, (String) obj, null);
                        this.f69245zdlpuopuiu = 3;
                        if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, iobyxmoadgVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                gg.zdlpuopuiu.zoijcleaow(obj);
                o70.eablkybsjg eablkybsjgVar = this.f69244yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, o70.eablkybsjg.ppxfxbqfkf.f72230zoijcleaow)) {
                    zv.iobyxmoadg iobyxmoadgVar2 = this.f69243jyumaefscl.f69242zdlpuopuiu;
                    this.f69245zdlpuopuiu = 1;
                    if (iobyxmoadgVar2.eablkybsjg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, o70.eablkybsjg.iobyxmoadg.f72229zoijcleaow)) {
                    this.f69243jyumaefscl.f69242zdlpuopuiu.zoijcleaow();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, o70.eablkybsjg.wkgbmnqykc.f72231zoijcleaow)) {
                    this.f69243jyumaefscl.f69242zdlpuopuiu.wkgbmnqykc(true);
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, o70.eablkybsjg.zoijcleaow.f72232zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zv.iobyxmoadg iobyxmoadgVar3 = this.f69243jyumaefscl.f69242zdlpuopuiu;
                    this.f69245zdlpuopuiu = 2;
                    obj = iobyxmoadgVar3.nufgyqmvbu(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
                    iobyxmoadgVar = new iobyxmoadg(this.f69243jyumaefscl, (String) obj, null);
                    this.f69245zdlpuopuiu = 3;
                    if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public jyumaefscl(zv.iobyxmoadg notificationsRepository, Context context, cllcsxoeiz coroutineScope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        this.f69242zdlpuopuiu = notificationsRepository;
        this.f69241yggfygwlhe = context;
        this.f69240jyumaefscl = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(o70.eablkybsjg eablkybsjgVar) {
        pj.gtknphoqwx.wkgbmnqykc(this.f69240jyumaefscl, null, null, new zoijcleaow(eablkybsjgVar, this, null), 3, null);
    }

    private final List eablkybsjg() {
        return hg.jyumaefscl.rgvfuqvkyq(o70.eablkybsjg.ppxfxbqfkf.f72230zoijcleaow, o70.eablkybsjg.iobyxmoadg.f72229zoijcleaow, o70.eablkybsjg.wkgbmnqykc.f72231zoijcleaow, o70.eablkybsjg.zoijcleaow.f72232zoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gtknphoqwx(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    public final Context gxszxtbevo() {
        return this.f69241yggfygwlhe;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public jf.iobyxmoadg invoke(String title) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        return new nf.nufgyqmvbu(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(title), eablkybsjg(), false, null, new iobyxmoadg(this), 12, null);
    }
}
