package c20;

import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f18522ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f18523zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18524jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f18525yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f18526zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (User) obj2, (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f18526zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f18525yggfygwlhe;
            User user = (User) this.f18524jyumaefscl;
            Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
            String xmlId = user != null ? user.getXmlId() : null;
            if (xmlId == null) {
                xmlId = "";
            }
            return cqumvgiudr.iobyxmoadg(boolIobyxmoadg, xmlId);
        }

        public final Object ojitshcjhn(boolean z13, User user, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f18525yggfygwlhe = z13;
            iobyxmoadgVar.f18524jyumaefscl = user;
            return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(ca2.ppxfxbqfkf userRepository, ca2.wkgbmnqykc userSharedPreferences, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18523zoijcleaow = userRepository;
        this.f18522ppxfxbqfkf = userSharedPreferences;
    }

    public final sj.lqeggnwhkg eablkybsjg() {
        return this.f18523zoijcleaow.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return this.f18522ppxfxbqfkf.eablkybsjg();
    }

    public final sj.lqeggnwhkg wkgbmnqykc() {
        return sj.dxjokdxxww.wflxmlrfwp(this.f18522ppxfxbqfkf.eablkybsjg(), this.f18523zoijcleaow.zoijcleaow(), new iobyxmoadg(null));
    }
}
