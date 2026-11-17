package dg0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f28096ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f28097wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f28098zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f28099jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f28101zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28101zdlpuopuiu = obj;
            this.f28099jyumaefscl |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(v10.zoijcleaow sharedPreferencesRepository, ca2.wkgbmnqykc userSharedPreferences, ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f28098zoijcleaow = sharedPreferencesRepository;
        this.f28096ppxfxbqfkf = userSharedPreferences;
        this.f28097wkgbmnqykc = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        UserCard userCard;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f28099jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f28099jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f28101zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f28099jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            if (this.f28096ppxfxbqfkf.nufgyqmvbu() && this.f28098zoijcleaow.btonecajqb()) {
                ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f28097wkgbmnqykc;
                iobyxmoadgVar.f28099jyumaefscl = 1;
                objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(iobyxmoadgVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        User user = (User) objLqeggnwhkg;
        String number = (user == null || (userCard = user.getUserCard()) == null) ? null : userCard.getNumber();
        boolean z13 = (number == null || kcexrzcfyt.zfvoamnweg(number)) ? false : true;
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
